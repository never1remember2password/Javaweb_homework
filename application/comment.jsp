<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
 <p>页面留言板</p>
    <form action="liuyanban.jsp" method="post">
        用户名：<input type="text" name="username"><br>
        留言内容<textarea name="message" cols="50" rows="3"></textarea><br>
        <input type="submit" value="提交留言">
    </form><br/>
    留言内容
    <%
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String message = request.getParameter("message");
        Vector<String> book = (Vector<String>)application.getAttribute("messageBook");
        if(book == null)
            book = new Vector<String>();
        if(username!=null && message!=null) {
            String info = username + "说：" + message;
            book.add(info);
            application.setAttribute("messageBook", book);
        }
        if(book.size()>0){
            for (String mess:book) {
                String[] arr = mess.split("说：");
                out.print("姓名："+arr[0]+"<br/>留言："+arr[1]);
            }
        }else {
            out.print("还没有留言");
        }
    %>
</body>
</html>