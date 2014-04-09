<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/jam/resources/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="/jam/resources/css/style.css" />
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<form:form id="signUp" method="post" action="sign-up" modelAttribute="user">
					<div class="modal-header">
						<h3>Please enter your info</h3>
					</div>

					<div class="navbar-collapse collapse">
						<table class="table">
							<tbody>
								<tr>
									<td>Email</td>
									<td><form:input id="email" class="form-control last" path="email"
											placeholder="Email" onkeyup="validateEmail();"/></td>
								</tr>

								<tr>
									<td>Login</td>
									<td><form:input id="login" class="form-control last" path="login"
											placeholder="Login (min length 5 symbols)" onkeyup="validateLogin();"/></td>
								</tr>

								<tr>
									<td>Password</td>
									<td><form:input id="password" class="form-control last" path="password"
											placeholder="Password (min length 6 symbols)" onkeyup="validatePassword();"/></td>
								</tr>
								<tr>
									<td>Repeat password</td>
									<td><input id="passwordRepeat" class="form-control last"
											placeholder="Password (min length 6 symbols)" onkeyup="validatePassword();"/></td>
								</tr>
							</tbody>
						</table>
						<input type="submit" id="signUpButton" class="btn btn-success" disabled="disabled" value="Sign Up" />
						<a href="${myPageContext}/home" class="btn btn-warning">Cancel</a>
					</div>

				</form:form>
			</div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
	<script type="text/javascript" src="/jam/resources/js/validation/sign-up-validation.js"></script>
</body>
</html>