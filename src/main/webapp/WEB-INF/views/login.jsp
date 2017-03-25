<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<a href="index">Index</a>
	<h1>Login here</h1>
	<form action="${pageContext.request.contextPath}/j_spring_security_check" method="POST">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type="text" name="j_username"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="j_password"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>