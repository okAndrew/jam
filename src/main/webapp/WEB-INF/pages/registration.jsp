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
                <div class="col-xs-12 col-xs-offset-0 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4 col-lg-4 col-lg-offset-4">
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
    </div>
</div>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
</body>
</html>