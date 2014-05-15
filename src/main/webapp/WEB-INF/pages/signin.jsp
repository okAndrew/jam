<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="/jam/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/jam/resources/css/style.css">
</head>
<body>
	<jsp:include page="components/menu.jsp"></jsp:include>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-5"></div>
					<div class="col-md-2">
						<form method="post" action='<c:url value='j_spring_security_check'/>'>
							<input type="text" name="email" id="email" size="30" maxlength="40" />
							<input type="password" name="password" id="password" size="30" maxlength="32" />
							<input type="submit" value="Sign in" />
						</form>
					</div>
					<div class="col-md-5"></div>
				</div>
			</div>
			<jsp:include page="components/footer.jsp"></jsp:include>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
	<script type="text/javascript" src="/jam/resources/js/validation/sign-up-validation.js"></script>
</body>
</html>