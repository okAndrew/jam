<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="/jam/resources/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="/jam/resources/css/style.css"/>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>

<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">

            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 reg-header">
                    <h2>Registration</h2>
                </div>
                <div class="col-xs-12 col-sm-4 col-md-4 col-lg-4">
                    <h3>Term of use</h3>
                    <p>Fusce laoreet lectus ac massa laoreet vulputate. Suspendisse vulputate aliquet pharetra. Curabitur tempus metus nulla, nec viverra elit faucibus non. Sed consectetur consectetur eros, in facilisis urna consectetur sed. Aliquam congue ornare quam eget interdum. Vivamus adipiscing tortor a euismod auctor. Cras a tellus quis nisl blandit consectetur nec in dui. Nunc ut urna fermentum, sollicitudin sem in, porttitor mauris. Nam leo leo, lacinia nec euismod eget, dapibus eget nulla. Nam laoreet gravida pulvinar. Etiam a purus orci. Curabitur aliquam, enim id posuere luctus, nibh quam porta orci, ac ornare libero lectus a purus. Lorem ipsum dolor sit amet, consectetur adipiscing elit.<p>
                </div>
                <div class="col-xs-12 col-sm-8 col-md-4 col-lg-4">
                    <form role="form">
                        <div class="form-group">
                            <label for="regEmail">Email address</label>
                            <input type="email" class="form-control" id="regEmail" placeholder="Enter email">
                        </div>
                        <div class="form-group">
                            <label for="regPassword">Password</label>
                            <input type="password" class="form-control" id="regPassword" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <label for="regLogin">Login</label>
                            <input type="password" class="form-control" id="regLogin" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <label for="regSex">Sex</label>
                            <select id="regSex" class="form-control">
                                <option value=""></option>
                                <option value="male">male</option>
                                <option value="female">female</option>
                            </select>
                        </div>
                        <button type="submit" class="btn btn-custom btn-block">Submit</button>
                    </form>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</div>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
</body>
</html>