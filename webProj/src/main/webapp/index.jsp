<%@ page import="java.util.Date" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%--для любых действий необходима эта строчка (выше), без нее будет плохо--%>
<html>
<head>
    <link rel="stylesheet" href="stylesign.css">
</head>
<body>

<form id="login" method="post" action="Login">
    <h1>logIn form</h1>
    <fieldset id="inputs">
        <input id="username" type="text" placeholder="login" name="login" autofocus required>
        <input id="password" type="text" placeholder="password" name="pass" required>
    </fieldset>
    <fieldset id="actions">
        <input type="submit" id="submit" value="login">
        <a href="Registration.jsp">To registration form</a>
        <a href="adminpage.jsp">test</a>
    </fieldset>
</form>

<%--<c:out value="this not work? "/><br>--%>
<%--Sum 10 and 20 = <c:out value="${10+20}"/> <br><br>--%>
<%--<c:set var="anotherWeb" value="sfdghm,gyfgh"/>--%>
<%--<c:out value="${anotherWeb}"/><br><br>--%>
<%--<c:remove var="anotherWeb"/>--%>
<%--after removing value:<c:out value="${anotherWeb}"/>--%>
<%--<br><br><br>--%>
<%--<c:set var="num" value="100"/>--%>
<%--<c:if test="${num>0}">--%>
<%--    Num = <c:out value="${num}"/>--%>
<%--</c:if>--%>
<%--<br><br>--%>
<%--<c:choose>--%>
<%--    <c:when test="${num>10}">--%>
<%--        number is >10--%>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
<%--        < 10--%>
<%--    </c:otherwise>--%>
<%--</c:choose><br><br>--%>
<%--<c:forEach var="i" begin="1" end="10">--%>
<%--    <c:out value="${i*2}"/><br>--%>
<%--</c:forEach>--%>
<%--<br>--%>
<%--<c:url value="/Registration.jsp" var="helloUrl">--%>
<%--<c:param name="UserName" value = "jai"></c:param>--%>
<%--</c:url>--%>
<%--<h4><a href="${helloUrl}">Click hear</a> </h4>--%>

<%--&lt;%&ndash;<c:redirect url="Login.jsp"/>&ndash;%&gt;--%>
<%--<h2>Hello World!</h2>--%>
<%--<%--%>
<%--//    Date date= java.util.Date;--%>
<%--%>--%>
</body>
</html>
