<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            ${message}
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </div>
</div>

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/jam/resources/js/bootstrap.js"></script>
</body>
</html>