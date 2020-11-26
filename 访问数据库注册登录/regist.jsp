<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UFT-8">

<title>Insert title here</title>

</head>

<script type="text/javascript">

function Check()

{

var username=document.getElenmentById("username");

var pwd=document.getElementById("pwd");

if(username.value=="")

{

   alert("用户名不能为空！");

   return false;

}

if(pwd.value.length<2)

{

   alert("密码长度不能少于3");

   return false;

}

}

</script>

<body background="img/4.jpg">

<center> 

<h3 style="font-family:verdana;color:green;">用户注册</h3>

<hr>

<form action="Regist" method="post" onsubmit="return Check()">

用户名：<input type="text" name="username" id="username"><br>

密码:<input type="password" name="pwd" id="pwd"><br>

<input type="submit" value ="注册">

<input type="reset" value ="重置">

</form>

</center>

</body>

</html>