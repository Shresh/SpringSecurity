<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello from public page!  
</h1>
<form action="${pageContext.request.contextPath}/j_spring_security_check" method="POST">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="text" name="j_username" placeholder="username"/>
        <input type="password" name="j_password" placeholder="password  "/>
        <input type="submit" value="Login"/>

    </form>
</body>
</html>
