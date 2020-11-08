<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="img/12.jpeg" style="color:black;font-size:24px">


<center>
<form action="Cookie_preserve" method="POST" >
 <h4 style="font-family:verdana;color:red;">用户登录</h4>
<table border="3">

<tr>
<td>用户名:<input type="text" name="username"><br></td>
</tr>

<tr><td>密码:<input type="password" name="pwd"><br></td></tr>

<tr><td>自动登录<input type="checkbox" name="check" value="check"></td></tr>
<tr>
<td><input type="submit" value="登录"> <input type="reset" value="重置" ></td>
</tr>

</table>
</form>
</center>
</body>
</html>