<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navigator.html"></jsp:include>
	<%
	String emailId = request.getParameter("email");
	String password = request.getParameter("password");
	%>
	<jsp:forward page=""></jsp:forward>

</body>
</html>