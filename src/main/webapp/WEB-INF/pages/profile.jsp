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
				<div class="pull-left avatar-block">
					<img src="/jam/resources/img/default-avatar.jpg" alt="..."
						class="img-thumbnail">
					<div>
						<button type="button" class="btn btn-default">Change
							avatar</button>
					</div>
				</div>
				<div class="pull-right info-block">
					<form:form id="profile" method="post" action="profile"
						modelAttribute="user" role="form">
						<div id="profile-email" class="form-group profile-field">
							<label class="control-label" for="email">Your email: </label>
							<form:input id="email" type="email" validation="false"
								class="form-control last" path="email" />
						</div>
						<div id="profile-rating" class="form-group profile-field">
							<label class="control-label" for="raiting">Your rating: </label>
							<form:input id="raiting" type="text" class="form-control last"
								path="raiting" />

						</div>
						<div id="profile-password-new" class="form-group profile-field">
							<label class="control-label">Your new password: </label>
							<form:input id="password-new" type="password"
								class="form-control last" path="password" />
						</div>
						<div id="profile-password-new" class="form-group profile-field">
							<label class="control-label">Restore password: </label>
							<form:input id="password-new" type="password"
								class="form-control last" path="password" />
						</div>

						<input type="submit" id="changeDataUser" class="btn btn-primary"
							value="Save change" />
					</form:form>
				</div>

			</div>
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
</body>
</html>