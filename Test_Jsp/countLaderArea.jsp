<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>计算梯形面积</title>
</head>
<body>

<% 
double upper= Double.parseDouble(request.getParameter("upper"));
double base= Double.parseDouble(request.getParameter("base"));
double height= Double.parseDouble(request.getParameter("height"));
double area=(upper+base)*height/2;
out.print("梯形的面积是:"+area);
%>
</body>
</html>