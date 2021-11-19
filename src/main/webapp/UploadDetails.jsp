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
	<jsp:useBean id="book1" class="com.schema.book.Details" scope="request"></jsp:useBean>
	<jsp:setProperty property="*" name="book1" />
	<p>
		Successfully uploaded
		<jsp:getProperty name="book1" property="bookName"></jsp:getProperty>
		!
	</p>
</body>
</html>