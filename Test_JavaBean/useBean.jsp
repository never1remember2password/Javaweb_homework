<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "hcl46208.BookOrderBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" >
<title>Insert title here</title>
</head>
<body background="image/ye!.jpg" style="font-family:arial;color:white;font-size:27px">

<jsp:useBean id="s" class="hcl46208.BookOrderBean" scope="page"></jsp:useBean>

<jsp:setProperty property="orderId" name="s" value="576344967"/>
<jsp:setProperty property="userName" name="s"  value="Ethanhe"/>
<jsp:setProperty property="bookName" name="s" value="人间失格"/>
<jsp:setProperty property="price" name="s" value="40"/>
<jsp:setProperty property="num" name="s" value="1000"/>
<jsp:setProperty property="zipcode" name="s" param="4399"/>
<jsp:setProperty property="phone" name="s" />
<% String a= "6221092473892";%>
<jsp:setProperty property="creditcard" name="s" value="<%=a %>"/>
<jsp:setProperty property="total" name="s" />
<!-- This is to set multiple properties for assignment -->
<!-- <jsp:setProperty property="*" name="s"/> -->
<h1 style="font-family:arial;font-size:30px;color:red">图书数据库books订单表bookOrder结构如下：</h1>
<p>订单ID:<jsp:getProperty property="orderId" name="s"/>
<p>用户名：<jsp:getProperty property="userName" name="s"/>
<p>书名：<jsp:getProperty property="bookName" name="s"/>
<p>价格：<jsp:getProperty property="price" name="s"/>
<p>数量：<jsp:getProperty property="num" name="s"/>
<p>邮编：<jsp:getProperty property="zipcode" name="s"/>
<p>电话：<jsp:getProperty property="phone" name="s"/>
<p>卡号：<jsp:getProperty property="creditcard" name="s"/>
<p>金额：<jsp:getProperty property="total" name="s"/>
<%
BookOrderBean book1=new BookOrderBean();
book1.setTotal(250.41);
%>


</body>
</html>