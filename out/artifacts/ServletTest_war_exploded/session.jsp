<%--
  Created by IntelliJ IDEA.
  User: yqh
  Date: 2019/3/27
  Time: 23:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Login.LoginUser" %>
<html>
<head>
    <title>seeion</title>
</head>
<body>

<%
LoginUser user=new LoginUser("yqh");
session.setAttribute("login",user);
%>
</body>
</html>
