<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/8 0008
  Time: 9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除数据</title>
</head>
<body>
    ${result}<br>
    <form:form action="/room/deleteroom" method="delete">
        <input type="text" name="roomid"/>
        <input type="submit"/>
    </form:form>
</body>
</html>
