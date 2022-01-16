<%@page import="javax.crypto.spec.PBEKeySpec"%>
<%@page import="javax.crypto.SecretKeyFactory"%>
<%@page import="java.security.spec.KeySpec"%>
<%@page import="java.security.SecureRandom"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page errorPage="errors.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="navigator.html"></jsp:include>
	<jsp:useBean id="user" class="com.schema.book.Users"></jsp:useBean>
	<jsp:useBean id="insertUser" class="com.operations.book.Insert"></jsp:useBean>

	<%
	String password = request.getParameter("password");
	System.out.println("password = " + password);

	//SecureRandom class is used to introduce salting
	SecureRandom random = new SecureRandom();
	byte[] salt = new byte[16];
	random.nextBytes(salt);

	//third parameter is the strength parameter - indicates number of times algorithm is run for
	KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
	SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");

	byte[] hash = factory.generateSecret(spec).getEncoded();
	System.out.println("hash = " + hash);
	System.out.println("salt = " + salt);
	%>
	<jsp:setProperty property="email" param="email" name="user" />
	<jsp:setProperty property="name" name="user" param="name" />
	<jsp:setProperty property="hash" name="user" value="<%=hash%>" />
	<jsp:setProperty property="salt" name="user" value="<%=salt%>" />


	<%
	insertUser.addUsers(user);
	%>
</body>
</html>