<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 22.12.2021
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<form id="registr" method="post" action="Registr">
    <h1>Registration form</h1>
    <fieldset id="inputs">
        <input id="username" type="text" placeholder="username" name="username" autofocus required>
        <input id="usersurname" type="text" placeholder="usersurname" name="usersurname" required>
        <input id="country" type="text" placeholder="country" name="country"  required>
        <input id="log" type="text" placeholder="login" name="login"  required>
        <input id="password" type="text" placeholder="password" name="pass" required>
    </fieldset>
    <fieldset id="actions">
        <input type="submit" id="submit" value="registr">
        <a href="index.jsp">To login form</a>
    </fieldset>
</form>
