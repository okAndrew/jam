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
	<jsp:include page="components/menu.jsp"></jsp:include>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="pull-left avatar-block">
					<c:if test="${userAvatar != null}">
						<img src="${userAvatar}" alt="..." class="img-thumbnail">
					</c:if>
					<c:if test="${userAvatar == null}">
						<img src="/jam/resources/img/default-avatar.jpg" alt="..."
							class="img-thumbnail">
					</c:if>
					<div>
						<button type="button" class="btn btn-default btn-block"
							data-toggle="modal" data-target="#uploadFile">Change
							avatar</button>
					</div>
				</div>
				<div class="pull-right info-block">
					<div class="pull-left block">
						<form:form id="profile" method="post" action="profile"
							modelAttribute="user" role="form">
							<div id="profileId" class="form-group profile-field"
								style="display: none; visibility: hidden;">
								<label class="control-label" for="email">Your id: </label>
								<form:input id="id" type="id" validation="false"
									class="form-control last" path="id" disabled="disabled" />
							</div>

							<div id="profileRole" class="form-group profile-field">
								<label class="control-label" for="role">Role: </label>
								<form:input id="role" type="text" validation="false"
									class="form-control last" path="role" readonly="readonly" />
							</div>
							<div id="profileRating" class="form-group profile-field">
								<label class="control-label" for="raiting">Your rating:
								</label>
								<form:input id="raiting" type="text" class="form-control last"
									path="raiting" disabled="disabled" />

							</div>
							<div id="profileEmail" class="form-group profile-field">
								<label class="control-label" for="email">Your email: </label>
								<form:input id="email" type="email" validation="false"
									class="form-control last" path="email"
									onfocusout="validateEmail();" />
							</div>
							<div id="profileFirstName" class="form-group profile-field">
								<label class="control-label" for="firstName">First name:
								</label>
								<form:input id="firstName" type="text" class="form-control last"
									path="firstName"
									onfocusout="validateTextField('profileFirstName', 'firstName');" />
							</div>
							<div id="profileLastName" class="form-group profile-field">
								<label class="control-label" for="lastName">Last name: </label>
								<form:input id="lastName" type="text" class="form-control last"
									path="lastName"
									onfocusout="validateTextField('profileLastName', 'lastName');" />
							</div>
							<div id="profileSex" class="form-group profile-field">
								<label class="control-label" for="sex">Sex: </label>
								<form:select path="sex" id="sex" class="form-control last"
									onfocusout="validateGender();">
									<form:option value="MALE">Male</form:option>
									<form:option value="FEMALE">Female</form:option>
								</form:select>
							</div>

							<div class="date-form">
								<div id="profileAge"
									class="control-group form-group profile-field">
									<label for="date-picker-2" class="control-label">Birthday:</label>
									<div class="controls">
										<div class="input-group">
											<form:input id="age" type="text" path="birthday"
												class="date-picker form-control" />
											<label for="age" class="input-group-addon btn"><i
												class="glyphicon glyphicon-calendar"></i> </label>
										</div>
									</div>
								</div>
							</div>

							<div id="profilePasswordNew" class="form-group profile-field">
								<label class="control-label">New password: </label>
								<form:input id="passwordNew" type="password"
									class="form-control last" path="password"
									placeholder="New password" onfocusout="validatePassword();" />
							</div>
							<div id="profilePasswordRestore" class="form-group profile-field">
								<label class="control-label">Restore password: </label> <input
									id="passwordRestore" type="password" class="form-control last"
									placeholder="Restore password" onfocusout="validatePassword();" />
							</div>

							<input type="submit" id="changeDataUser"
								class="btn btn-primary pull-right" value="Save change" />
						</form:form>
					</div>
					<div class="pull-right block">
						<h2 class="text-center">Statistics</h2>
						<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit.
							Aenean commodo ligula eget dolor. Aenean massa. Cum sociis
							natoque penatibus et magnis dis parturient montes, nascetur
							ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu,
							pretium quis, sem. Nulla consequat massa quis enim. Donec pede
							justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim
							justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam
							dictum felis eu pede mollis pretium. Integer tincidunt. Cras
							dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend
							tellus. Aenean leo ligula, porttitor eu, consequat vitae,
							eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis,
							feugiat a, tellus. Phasellus viverra nulla ut metus varius
							laoreet. Quisque rutrum. Aenean imperdiet.</p>
					</div>
				</div>

			</div>
			<jsp:include page="components/footer.jsp"></jsp:include>
		</div>
	</div>
	<jsp:include page="components/uploadFile.jsp"></jsp:include>

	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
	<script type="text/javascript"
		src="/jam/resources/js/validation/profile-validation.js"></script>
	<script type="text/javascript"
		src="/jam/resources/js/jquery-ui-1.9.2.js"></script>
	<script>
		$(".date-picker").datepicker({
			format : 'dd/mm/yyyy'
		});

		$(".date-picker").on("change", function() {
			var id = $(this).attr("id");
			var val = $("label[for='" + id + "']").text();
			$("#msg").text(val + " changed");
		});
	</script>

</body>
</html>
