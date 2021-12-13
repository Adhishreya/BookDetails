<%@page import="com.schema.book.Details"%>
<%@page import="java.util.List"%>
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
	<jsp:useBean id="books" class="com.operations.book.Find"></jsp:useBean>
	<%
	List<Details> details = books.findAllBooks();
	%>



	<div class="container overflow-hidden">
		<div class="card-group">
			<%
			for (Details det : details) {
			%>
			<div class="card" style="width: 18rem;">
				<img style="width: 80%;height:50%" src="<%=det.getImage() %>" class="card-img-top" alt="...">
				<div class="card-body">
					<h5 class="card-title"><%=det.getBookName()%></h5>
					<p class="card-text"><%=det.getPublisher()%></p>
					<a href="#" class="btn btn-primary">Add to Reading List</a>
				</div>
			</div>

			<%
			}
			%>
		</div>

	</div>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>