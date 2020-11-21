<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>九九乘法表</h1>
    <hr>
<p>
          <%
           for(int i=1;i<=9;i++)
           {
             for(int j=1;j<=i;j++)
             {
           %>
            	 
          <%=i+"*"+j+"="+(i*j)%>
           <%
            }
            %>
            <br>
            <%
            }
            %>
   </p>       
          
    

    
  </body>

</html>