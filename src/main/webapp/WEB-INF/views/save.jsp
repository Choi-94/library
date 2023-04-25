<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오전 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/" ;>index로 가기</a>
<form action="/save-param" method="post">
    <input type="text" name="bookName"><br>
    <input type="text" name="bookPublisher"><br>
    <input type="text" name="bookAuthor"><br>
    <input type="text" name="bookPrice">
    <input type="submit" value="전송">
</form>
</body>
</html>
