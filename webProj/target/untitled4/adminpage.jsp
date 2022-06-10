<%@ page import="conter.DAO" %>
<%@ page import="conter.User" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%-- Created by IntelliJ IDEA.
 User: HP
 Date: 24.12.2021
 Time: 16:59
 To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="styleadminpage.css">
</head>
<body>

<form id="login" method="post" action="Login">
    <h1>Welcome admin<br> users table:</h1>
    <table>
                        <colgroup>
                            <col span="2" style="background:Khaki"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->
                            <col style="background-color:#ff564f">
                            <col style="background-color:#33d1ff">
                            <col style="background-color:#2cff23">
                            <col style="background-color:#d94cff">
                        </colgroup>
        <tr>
            <th>ID</th>
            <th>FIRST_NAME
            </td>
            <th>LAST_NAME
            </td>
            <th>COUNTRY
            </td>
            <th>LOGIN
            </td>
            <th>PASSWORD
            </td>
        </tr>


            <c:forEach items="${users}" var="d">
            <tr>
                <td>${d.getId()}</td>
                <td>${d.getName()}</td>
                <td>${d.getSurname()}</td>
                <td>${d.getCountry()}</td>
                <td>${d.getLogin()}</td>
                <td>${d.getPass()}</td><br>
            </tr>
            </c:forEach>

    </table>
    <fieldset id="actions">
        <a href="index.jsp">Logout</a>
    </fieldset>
</form>

</body>
</html>
