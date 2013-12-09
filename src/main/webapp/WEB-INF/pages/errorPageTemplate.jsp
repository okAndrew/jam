<%--
  Created by IntelliJ IDEA.
  User: sergiy
  Date: 11/21/13
  Time: 12:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="/spring_test5/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="/spring_test5/resources/css/bootstrap.css">
</head>
<body>
<div id="wrap">
    <jsp:include page="menu.jsp"></jsp:include>

    <div class="container">
        <div class="panel panel-default">
            <div class="panel-body">
                ERROR: ${errorCode}
            </div>
        </div>
    </div>

    <jsp:include page="footer.jsp"></jsp:include>

</div>

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/spring_test5/resources/js/bootstrap.js"></script>
</body>
</html>