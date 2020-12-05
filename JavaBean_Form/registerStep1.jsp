<%@ page language="java" contentType="text/html; charset=utf-8"

    pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="utf-8">

<title>注册第一步</title>

</head>

<body background="img/Beach.jpg" style="font-family:arial;color:black;font-size:27px">

<h2 align="center">用户注册第一步</h2>

<form action="registerStep2.jsp" method="post">

    <table border="1" width="50%" align="center">

        <tr>

            <td>用户名：</td>

            <td><input type="text" name="username"></td>

        </tr>

        <tr>

            <td>密码：</td>

            <td><input type="password" name="password"></td>

        </tr>

        <tr>

            <td colspan="2" align="center"><input type="submit" value="下一步"></td>

        </tr>

    </table>

</form>



</body>

</html>

