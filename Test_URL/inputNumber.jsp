<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="image/5.jpg"  style="color:black;font-size:27px"">
    <%
       String message=(String)session.getAttribute("message");
     %>
      <h2>随机得到一个1，到100之间的数字
<br>请你猜一猜这个数字到底是什么
</h2>
     <form  action="HandleGuess" method="post">
         <input type="text" name="guessnumber" size=8>
         <%=message %>
          <input type="submit" value="提交">
          </form>
          <form action="getNumber.jsp" method="post">
          <input type="submit" value="重新得到新的随机数">
          </form>
</body>
</html>
