<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="/spring_test5/resources/css/style.css" />
    <link rel="stylesheet" type="text/css" href="/spring_test5/resources/css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="/spring_test5/resources/css/social-buttons.css" />
    <link href="//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">
</head>
<body>
<div id="wrap">
<jsp:include page="menu.jsp"></jsp:include>

<div class="container">
    <div class="panel panel-default">
        <div class="panel-body">
            ${message}
        </div>
    </div>
</div>

<jsp:include page="footer.jsp"></jsp:include>

</div>

<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="/spring_test5/resources/js/bootstrap.js"></script>
</body>
</html>