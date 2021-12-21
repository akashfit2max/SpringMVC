<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Page</title>
</head>
<body>
	<h1 style="color: green;">${msg }</h1>
	<h1 class="text-center">${title }</h1>
	<p class="text-center">${desc }</p>
	<hr>
	<h1>Hi ${user.userName }</h1>
	<h1>your email id is ${user.emial } and your password is ${user.userPassword }</h1>

</body>
</html>