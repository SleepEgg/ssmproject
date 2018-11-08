<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8 0008
  Time: 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增房间</title>
</head>
<body>
    ${flag}<br>
    <form:form action="/room/addroom" method="put">
        <input type="text" name="roomid">
        <input type="text" name="description">
        <input type="text" name="bednum">
        <input type="text" name="guestnum">
        <input type="text" name="roomstateid">
        <input type="text" name="roomtypeid">
        <input type="submit"/>
    </form:form>
</body>
</html>
