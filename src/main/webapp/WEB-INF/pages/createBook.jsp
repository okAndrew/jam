<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="/jam/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="/jam/resources/css/style.css" />
<title>Create book</title>
</head>
<body>
	<jsp:include page="components/menu.jsp"></jsp:include>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<form:form id="createBook" method="post" action="create-book"
					modelAttribute="book" role="form">
					<div id="titleDiv" class="form-group profile-field">
						<label class="control-label" for="title">Title: </label>
						<form:input id="title" type="text" validation="false"
							class="form-control" path="title" />
					</div>
					<div id="descriptionDiv" class="form-group profile-field">
						<label class="control-label" for="title">Description: </label>
						<form:input id="description" type="text" validation="false"
							class="form-control" path="description" />
					</div>
					
					
					<input type="submit" id="CreateBook"
								class="btn btn-primary pull-right" value="Create" />
				</form:form>
			</div>
			<jsp:include page="components/footer.jsp"></jsp:include>
		</div>

	</div>

</body>
</html>