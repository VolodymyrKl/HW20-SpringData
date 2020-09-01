<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>All laptops</title>
</head>
<body>
<div>
    <h1>List of laptops</h1>
    <table border="2" cellpadding="2" width="70%">
        <tr><th>Id</th><th>Model</th><th>Manufacturer</th><th>CPU</th><th>Memory</th><th>Used sign</th><th>Type of shell</th><th>Price</th><th>Year</th></tr>
        <c:forEach items="${laptops}" var="laptop">
            <tr>
                <td>${laptop.id}</td>
                <td>${laptop.model}</td>
                <td>${laptop.manufacturer}</td>
                <td>${laptop.cpu}</td>
                <td>${laptop.memory}</td>
                <td>${laptop.signOfUsed}</td>
                <td>${laptop.price}</td>
                <td>${laptop.year}</td>
            </tr>
        </c:forEach>
    </table>
    <br/>
    <a href="save.jsp">Add new laptop</a>
    <p><a href="index.jsp">Menu</a></p>
</div>
    <h1>List of laptops</h1>
    <c:forEach items="${laptops}" var="lap">
        <c:out value="${lap}"/>
    </c:forEach>
    <table>
        <c:forEach items="${laptops}" var="lap">
            <tr>
                <td><c:out value="${lap.id}"/></td>
                <td><c:out value="${lap.model}"/></td>
                <td><c:out value="${lap.manufacturer}"/></td>
                <td><c:out value="${lap.cpu}"/></td>
                <td><c:out value="${lap.memory}"/></td>
                <td><c:out value="${lap.signOfUsed}"/></td>
                <td><c:out value="${lap.typeOfShell}"/></td>
                <td><c:out value="${lap.price}"/></td>
                <td><c:out value="${lap.year}"/></td>
            </tr>

        </c:forEach>
    </table>
    <table>
        <tbody>
        <tr> "laptops : ${laptops}">
            <th>${laptops.model}"></th>
            <td>${laptops.manufacturer}"></td>
            <td>${laptops.cpu}"></td>
        </tr>
        </tbody>
    </table>

<div>

</div>
</body>
</html>
