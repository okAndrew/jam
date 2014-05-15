<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="/jam/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/jam/resources/css/style.css">
<script type="text/javascript">
	var description = document.getElementById("description");

	function chooseStep(step) {
		var elements = document.getElementsByClassName("list-group-item");
		for (var i = 0; i < elements.length; i++) {
			elements[i].classList.remove('active');
		}
		step.classList.add("active");
	}

	function isDescriptionValid(el) {
		if (el.length < 5) {
			return "Less than 5";
		}
	}

	function getElementByXPath(path) {
		return document.evaluate(path, document, null, 9, null).singleNodeValue;
	};
</script>
</head>
<body>
	<jsp:include page="../components/menu.jsp"></jsp:include>
	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body">

				<div class="row">
					<div class="col-md-3">
						<div class="list-group">
							<a class="list-group-item general" onClick="chooseStep(this)">General info</a>
							<a class="list-group-item ingredients" onClick="chooseStep(this)">Ingredients</a>
							<a class="list-group-item">Steps</a>
							<a class="list-group-item">Tags</a>
							<a class="list-group-item" onClick="chooseStep(this)">Photos</a>
						</div>
					</div>
					<div class="col-md-9">
						<div class="panel panel-default">
							<div class="panel-body">
								<div class="step general">
									1
								</div>
								<div class="step ingredients">
									2
								</div>
								<div class="step steps">
									3
								</div>
								<div class="step tags">
									4
								</div>
								<div class="step photos">
									5
								</div>
								<div class="step finish">
									6
								</div>
							</div>
						</div>
					</div>
				</div>

			</div>
			<!-- 
				<div class="row">
					<div class="col-md-6">
						<div class="panel panel-default">
							<div class="panel-body">
								<h4>Description</h4>
								<div class="form-group has-error">
									<input id="description" type="text" class="form-control" placeholder="Title" onfocusout="checkDescription(this)" />
								</div>
								<div class="form-group">
									<textarea class="form-control" rows="5" placeholder="Description"></textarea>
								</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-body">
								<h4>Ingredients</h4>
								<div class="row" id="addIngredientRow">
									<div class="col-xs-6">
										<input type="text" class="form-control input-sm" placeholder="Food" />
									</div>
									<div class="col-xs-3">
										<input type="text" class="form-control input-sm" placeholder="Quantity" />
									</div>
									<div class="col-xs-3">
										<button id="add_new_recipe" type="button" class="btn btn-default btn-sm btn-block" onClick="addNewIngredient()">Add</button>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<table class="table table-striped table-hover ">
											<thead>
												<tr>
													<th class="col-md-1">#</th>
													<th class="col-md-6">Food</th>
													<th class="col-md-3">Quantity</th>
													<th class="col-md-2"></th>
												</tr>
											</thead>
											<tbody>
											</tbody>
										</table>
									</div>
								</div>

							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-body">
								<h4>Steps</h4>
								<div class="row" id="addIngredientRow">
									<div class="col-xs-9">
										<div class="form-group">
											<textarea class="form-control" rows="3" id="textArea" placeholder="Step"></textarea>
										</div>
									</div>
									<div class="col-xs-3">
										<button id="add_new_recipe" type="button" class="btn btn-default btn-sm btn-block" onClick="addNewIngredient()">Add</button>
									</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<table class="table table-striped table-hover ">
											<thead>
												<tr>
													<th class="col-md-1">#</th>
													<th class="col-md-9">Step description</th>
													<th class="col-md-2"></th>
												</tr>
											</thead>
											<tbody>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<div class="panel panel-default">
							<div class="panel-body">
								<h4>Tags</h4>
								<div class="form-group">
									<input type="text" class="form-control" id="inputDefault" placeholder="Tag" />
								</div>
								<div class="form-group"></div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-body">
								<h4>Photos</h4>
								<div class="row">
									<div class="col-xs-8">
										<input type="text" class="form-control input-sm" id="" placeholder="Food" />
									</div>
									<div class="col-xs-4">
										<button type="button" class="btn btn-default btn-sm btn-block" onClick="addNewIngredient()">Select photo</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			 </div>-->
			<jsp:include page="../components/footer.jsp"></jsp:include>
		</div>
	</div>
	<script type="text/javascript" src="https://code.jquery.com/jquery.min.js"></script>
	<script type="text/javascript" src="http://getbootstrap.com/2.3.2/assets/js/bootstrap.js"></script>
</body>
</html>