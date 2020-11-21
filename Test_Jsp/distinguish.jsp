<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>distinguish</title>
</head>
<body>
<%!
int a=1;
public void check()
{
	System.out.print("Let's go");
}
%>
<%
int b=1;
a++;
b++;

%>
a=<%=a %>
<p>b=<%=b %>
</body>
</html>