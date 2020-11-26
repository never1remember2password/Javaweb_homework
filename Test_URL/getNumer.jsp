<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="image/7.jpg"  style="color:black;font-size:27px">
<%session.setAttribute("message", "请猜数");
int randomNumber = (int)(Math.random()*100)+1;
session.setAttribute("saveNumber", new Integer(randomNumber));
%>
<p>访问或刷新该页面可以随机得到一个1，到100之间的数字
<br>单击下面链接可以玩猜数字小游戏
</p>
<a href="inputNumber.jsp">猜猜猜数字</a>
</body>
</html>