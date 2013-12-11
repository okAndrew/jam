<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="myPageContext" value="${pageContext.servletContext.contextPath}"></c:set>

<nav class="navbar navbar-default" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="${myPageContext}/">Jam</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-left">
                <li><a href="${myPageContext}/home">Home</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${myPageContext}/registration">Registration</a></li>
                <li><a href="${myPageContext}/signin">Sign in</a></li>
            </ul>
        </div>
    </div>
</nav>

<script>
    function HeaderController($scope, $location) {
        $scope.isActive = function (viewLocation) {
            return viewLocation === $location.path();
        };
    }
</script>