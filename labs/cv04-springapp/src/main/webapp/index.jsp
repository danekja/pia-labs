<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title></title>
</head>
<body>

<c:if test="${not empty requestScope.err}">
    <p>
        Error: ${requestScope.err}
    </p>
</c:if>

<h1>Login</h1>
<!-- Note that we dont have /login URL mapped anywhere in our application, Spring automatically
    creates the controller -->
<form action="login" method="post">
    <!-- Part of Spring security mechanism of protection against CSRF attacks, we will
        talk more about this during the respective lab -->
    <sec:csrfInput/>
    <sec:csrfMetaTags/>
    <label for="username">Login:&nbsp;</label>
    <input type="text" id="username" name="username">
    <label for="pwd">Password:&nbsp;</label>
    <input type="password" id="pwd" name="password">
    <input type="submit" value="Login">
</form>

<p>
    <a href="register">Register</a>
</p>

</body>
</html>
