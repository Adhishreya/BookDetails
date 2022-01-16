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
	<jsp:include page="navigator.html"></jsp:include>
	<jsp:useBean id="books" class="com.operations.book.Find"></jsp:useBean>
	<%
	List<Details> details = books.findAllBooks();
	%>



	<div class="container ">
		<div class="row">
			<%
			for (Details det : details) {
			%>
			<div class="col-md-4 mt-2">
				<div class="card" style="width: 300px;">
					<img style="width: 100%; height: 50%" src="<%=det.getImage()%>"
						class="card-img-top mx-auto d-block img-fluid " alt="...">
					<div class="card-body">
						<h5 class="card-title"><%=det.getBookName()%></h5>
						<div class="d-flex flex-inline">
							<p class="card-text">
								<b><fmt:formatNumber value="<%=det.getPrice()%>"
										type="currency" currencySymbol="" /> </b><%=det.getPrice()%></p>
							<a href="#" class="btn btn-primary mx-auto">Add to Reading
								List</a>
						</div>
					</div>
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