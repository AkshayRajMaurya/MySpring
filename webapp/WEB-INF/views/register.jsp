<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
		<title>Registration Form</title>
		<meta name="generator" content="Bootply" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link href="../css/bootstrap.min.css" rel="stylesheet">
		<link href="../css/styles.css" rel="stylesheet">
		<script src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<script src='https://www.google.com/recaptcha/api.js'></script>
	</head>
	<body>
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h1 class="text-center">Register</h1>
      </div>
      <div class="modal-body">
       <form:form id="registerForm" class="form col-md-12 center-block" modelAttribute="employee" method="post"
   action="register">
		  <div class="form-group">
              <input type="text" id="username" class="form-control input-lg" placeholder="Username">
            </div>
            <div class="form-group">
              <input type="text" id="email" class="form-control input-lg" placeholder="Email">
            </div>
            <div class="form-group">
              <input type="password" id="password" class="form-control input-lg" placeholder="Password">
            </div>
			<div class="form-group">
              <input type="password" id="cpassword" class="form-control input-lg" placeholder="Confirm Password">
            </div>
			<div class="form-group">
			  <div class="g-recaptcha" data-sitekey="6Le9_SYTAAAAANZUPccYUPpW8SmXDU9e9RHFnAaL"></div>
			</div>
            <div class="form-group">
              <button class="btn btn-primary btn-lg btn-block">Sign Up</button>
              <span><a href="#">Register</a></span>
            </div>
          </form:form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
		  </div>	
      </div>
  </div>
  </div>
</div>
	</body>
</html>