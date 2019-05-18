<%--
  Created by IntelliJ IDEA.
  User: ko
  Date: 18/05/2019
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    .contain {
        height: 180px;
        width: 300px;
        margin: 0;
        padding: 10px;
        border: 1px #CCC solid;
    }

    .contain input {
        padding: 5px;
        margin: 5px
    }
</style>
<body>
<form method="post" action="/discount">
    <div class="contain">
        <input type="text" name="description" placeholder="Product Description"><br>
        <input type="text" name="price" placeholder="List Price"><br>
        <input type="text" name="percent" placeholder="Discount Percent"><br>
        <input type="submit" value="Save">
    </div>
</form>
</body>
</html>
