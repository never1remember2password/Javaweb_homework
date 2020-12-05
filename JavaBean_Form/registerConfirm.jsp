<%@ page language="java" contentType="text/html; charset=utf-8"

    pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="utf-8">

<title>Insert title here</title>

</head>

<body background="img/13.jpeg" style="font-family:arial;color:black;font-size:27px">

 <% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="user" class="hcl46208.UserBean" scope="session"/>

<jsp:setProperty name="user" property="*"/>

<h2 align="center">用户信息确认</h2>

<form>

    <table border="1" width="50%" align="center">

        <tr>

            <td>用户名：</td>

            <td><jsp:getProperty name="user" property="username"/></td>

        </tr>

        <tr>

            <td>密码：</td>

            <td><jsp:getProperty name="user" property="password"/></td>

        </tr>

        <tr>

            <td>性别：</td>

            <td><jsp:getProperty name="user" property="sex"/></td>

        </tr>

        <tr>

            <td>年龄：</td>

            <td><jsp:getProperty name="user" property="age"/></td>

        </tr>

        <tr>

            <td>邮箱：</td>

            <td><jsp:getProperty name="user" property="email"/></td>

        </tr>

        <tr>

            <td>电话：</td>

            <td><jsp:getProperty name="user" property="phoneNumber"/></td>

        </tr>

        <tr>

            <td colspan="2" align="center"><input type="submit" value="确认提交"></td>

        </tr>

    </table>

</form>



</body>

</html>