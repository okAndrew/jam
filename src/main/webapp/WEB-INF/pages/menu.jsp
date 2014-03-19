<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="myPageContext" value="${pageContext.servletContext.contextPath}"></c:set>

<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${myPageContext}/">Jam</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-left">
                <li id="nav_home"><a href="${myPageContext}/home">Home</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li id="nav_registration"><a href="${myPageContext}/registration">Registration</a></li>
                <li id="nav_signin"><a href="${myPageContext}/signin">Sign in</a></li>
            </ul>
        </div>
    </div>
</nav>