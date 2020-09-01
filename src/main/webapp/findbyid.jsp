<%--
  Created by IntelliJ IDEA.
  User: wanto
  Date: 30.08.2020
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find laptop by ID</title>
</head>
<body>
<div>
<h1>List of laptops by ID</h1>
<table border="2" width="70%" cellpadding="2">
<c:forEach items="${listLaptops}" var="laptop">
    ${laptop}
</c:forEach>
    <tr><th>Id</th><th>Model</th><th>Manufacturer</th><th>CPU</th><th>Memory</th><th>Used sign</th><th>Type of shell</th><th>Price</th><th>Year</th></tr>
    <c:forEach items="${listLaptops}" var="laptop">
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
</body>
</html>