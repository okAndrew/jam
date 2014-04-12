<%@ page language="java" contentType="text/html; charset=utf8" pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<c:set var="myPageContext" value="${pageContext.servletContext.contextPath}"></c:set>

<div class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${myPageContext}/">Jam</a>
			<button class="navbar-toggle" type="button" data-toggle="collapse" data-target="#navbar-main">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse" id="navbar-main">
			<ul class="nav navbar-nav">
				<li><a href="${myPageContext}/home">Home</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="${myPageContext}/sign-up">Registration</a></li>
				<li><a href="${myPageContext}/signin">Sign in</a></li>
			</ul>
		</div>
	</div>
</div>