<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="/jam/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="/jam/resources/css/style.css" />
<title>Cook books</title>
</head>
<body>
	<jsp:include page="components/menu.jsp"></jsp:include>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<h3 class="text-center">Cook books</h3>
				<div>
					<a class="btn btn-default" href="#" role="button">Create new</a>
				</div>
				<form:form action="cookbooks" method="POST">

					<div class="row">
						<div class="col-lg-4">
							<img class="img-circle"
								src="/jam/resources/img/default-avatar.jpg"
								alt="Generic placeholder image">
							<h2>Heading</h2>
							<p>Donec sed odio dui. Etiam porta sem malesuada magna mollis
								euismod. Nullam id dolor id nibh ultricies vehicula ut id elit.
								Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
								Praesent commodo cursus magna.</p>
							<p>
								<a class="btn btn-default" href="#" role="button">View
									details &raquo;</a>
								<a class="btn btn-default" href="#" role="button">Delete</a>	
							</p>
						</div>
						<!-- /.col-lg-4 -->
						<div class="col-lg-4">
							<img class="img-circle"
								src="/jam/resources/img/default-avatar.jpg"
								alt="Generic placeholder image">
							<h2>Heading</h2>
							<p>Duis mollis, est non commodo luctus, nisi erat porttitor
								ligula, eget lacinia odio sem nec elit. Cras mattis consectetur
								purus sit amet fermentum. Fusce dapibus, tellus ac cursus
								commodo, tortor mauris condimentum nibh.</p>
							<p>
								<a class="btn btn-default" href="#" role="button">View
									details &raquo;</a>
								<a class="btn btn-default" href="#" role="button">Delete</a>
							</p>
						</div>
						<!-- /.col-lg-4 -->
						<div class="col-lg-4">
							<img class="img-circle"
								src="/jam/resources/img/default-avatar.jpg"
								alt="Generic placeholder image">
							<h2>Heading</h2>
							<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis
								in, egestas eget quam. Vestibulum id ligula porta felis euismod
								semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
								condimentum nibh, ut fermentum massa justo sit amet risus.</p>
							<p>
								<a class="btn btn-default" href="#" role="button">View
									details &raquo;</a>
								<a class="btn btn-default" href="#" role="button">Delete</a>	
							</p>
						</div>

						<!-- /.col-lg-4 -->
					</div>
					<!-- /.row -->

					<!--/row-->
				</form:form>
			</div>
			<jsp:include page="components/footer.jsp"></jsp:include>
		</div>

	</div>





</body>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
</html>