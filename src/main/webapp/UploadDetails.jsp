<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<jsp:useBean id="book1" class="com.schema.book.Details" scope="session"></jsp:useBean>
	<jsp:useBean id="entity" class="com.operations.book.Insert"
		scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="book1" />
	<p>
		Successfully uploaded
		<jsp:getProperty name="book1" property="bookName"></jsp:getProperty>
		!
	</p>
	<%
// 	entity.addBook(book1);
	String category = request.getParameter("category");
	String author = request.getParameter("authors");
	entity.addBook(book1, category,author);
// 	System.out.println(category+" "+author);
	%>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>