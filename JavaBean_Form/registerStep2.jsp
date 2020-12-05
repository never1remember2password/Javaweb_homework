
<%@ page language="java" contentType="text/html; charset=utf-8"

    pageEncoding="utf-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="utf-8">

<title>Insert title here</title>

</head>

<body background="img/12.jpeg" style="font-family:arial;color:black;font-size:27px">

  <% request.setCharacterEncoding("UTF-8"); %>

    <jsp:useBean id="user" class="hcl46208.UserBean" scope="session">

        <jsp:setProperty name="user" property="username"/>

        <jsp:setProperty name="user" property="password"/>

    </jsp:useBean>

<h2 align="center">用户注册第二步</h2>

<form action="registerConfirm.jsp" method="post">

    <table border="1" width="50%" align="center">

        <tr>

            <td>性别：</td>

            <td><input type="radio" name="sex" checked="checked" value="男">男

                <input type="radio" name="sex" value="女">女</td>

        </tr>

        <tr>

            <td>年龄：</td>

            <td><input type="text" name="age"></td>

        </tr>

        <tr>

            <td>邮箱：</td>

            <td><input type="text" name="email"></td>

        </tr>

        <tr>

            <td>电话：</td>

            <td><input type="text" name="phoneNumber"></td>

        </tr>

        <tr>

            <td colspan="2" align="center"><input type="submit" value="完成"></td>

        </tr>



    </table>

</form>



</body>

</html>