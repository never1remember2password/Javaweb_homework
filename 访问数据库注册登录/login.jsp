<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">

<title>Insert title here</title>

</head>

<body background="img/5.jpg">

<center >

<h2 style="font-family:verdana;color:red;">用户登录 Sign in</h2>

<hr>

<form action="Login" method="post" style="font-family:arial;font-size:25px;">

<table border="2">

<tr><td>

用户:<input type="text" name="username"><br>

</td></tr>

<tr><td>

密码:  <input type="password" name="pwd"><br>

</td></tr>

<tr><td>

<input type="submit" value ="登录">

<input type="button" value ="注册" onclick="location='regist.jsp'">

</td></tr>

</table>

</form>

</center>

</body>

</html>