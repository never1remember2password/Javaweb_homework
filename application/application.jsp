<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
        int pageCount = 1;
        int sessionCount = 1;
        int applicationCount = 1;
        if(pageContext.getAttribute("pageCount")!=null) {
            pageCount = Integer.parseInt(pageContext.getAttribute("pageCount").toString());
            pageCount++;
        }
        pageContext.setAttribute("pageCount", pageCount);
        if(session.getAttribute("sessionCount")!=null) {
            sessionCount = Integer.parseInt(session.getAttribute("sessionCount").toString());
            sessionCount++;
        }
        session.setAttribute("sessionCount", sessionCount);
        if(application.getAttribute("applicationCount")!=null) {
            applicationCount = Integer.parseInt(application.getAttribute("applicationCount").toString());
            applicationCount++;
        }
        application.setAttribute("applicationCount", applicationCount);
    %>
    页面域计数：<%=pageCount%><br/>
    会话域计数：<%=sessionCount%><br/>
    应用域计数：<%=applicationCount%><br/>
</body>
</html>