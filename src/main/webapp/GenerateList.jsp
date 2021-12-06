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
		<div class="row gy-5">
			<div class="col-6">
				<div class="p-3 border bg-light">Custom column padding</div>
			</div>
			<div class="col-6">
				<div class="p-3 border bg-light">Custom column padding</div>
			</div>
			<div class="col-6">
				<div class="p-3 border bg-light">Custom column padding</div>
			</div>
			<div class="col-6">
				<div class="p-3 border bg-light">Custom column padding</div>
			</div>
		</div>
	</div>



	<table>
		<thead>
			<th>Name</th>
			<th>Publisher</th>
			<th>Edition</th>
		</thead>
		<!-- 	<tr> -->
		<%
		for (Details det : details) {
		%>

		<div class="card" style="width: 18rem;">
			<img src="..." class="card-img-top" alt="...">
			<div class="card-body">
				<h5 class="card-title">Card title</h5>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			</div>
		</div>

		<tr>
			<td><%=det.getBookName()%></td>
			<td><%=det.getPublisher()%></td>
			<td><%=det.getEdition()%></td>
		</tr>
		<%
		}
		%>

		<!-- 	</tr> -->
	</table>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>