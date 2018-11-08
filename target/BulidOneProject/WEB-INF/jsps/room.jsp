<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7 0007
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%--jstl标签--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Room</title>
</head>
<body>
    <%--逐条显示数据--%>
    <%--查询--%>
    <table>
        <c:forEach
            items="${allRoom}" var="room">
            <tr>
                <td>${room.roomid}</td>
                <td>${room.description}</td>
                <td>${room.bednum}</td>
                <td>${room.guestnum}</td>
                <td>${room.roomstateid}</td>
                <td>${room.roomtypeid}</td>
            </tr>
        </c:forEach>
    </table>
    <%--显示隐藏选项--%>
    <%--按钮插入数据--%>
    <a href="/room/getaddroom">新增房间</a>
    <div>
        <form:form action="/room/addroom" method="put">
            <input type="text" name="roomid">
            <input type="text" name="description">
            <input type="text" name="bednum">
            <input type="text" name="guestnum">
            <input type="text" name="roomstateid">
            <input type="text" name="roomtypeid">
            <input type="submit"/>
        </form:form>
    </div>
    <%--删除数据--%>
    <a href="/room/getdeleteroom">删除数据</a>
    <div>
        <form:form action="/room/deleteroom" method="delete">
            <input type="text" name="roomid"/>
            <input type="submit"/>
        </form:form>
    </div>


</body>
</html>
