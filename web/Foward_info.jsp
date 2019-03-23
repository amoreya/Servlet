<%--
  Created by IntelliJ IDEA.
  User: yqh
  Date: 2019/3/23
  Time: 17:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>接收服务器端跳转的内容</title>
    <% request.setCharacterEncoding("GBK");%>
</head>
<body>
<h2>session属性：<%=session.getAttribute("session")%></h2>
<h2>request属性：<%=request.getAttribute("request")%></h2>
<h2>application属性：<%=application.getAttribute("application")%></h2>
</body>
</html>
