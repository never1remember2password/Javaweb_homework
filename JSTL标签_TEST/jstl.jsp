<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body background="img/13.jpeg">

<h2 style="color:red">通用标签，条件标签，迭代标签，url标签的学习</h2>
<%String Anime="剑光如我，斩尽牛杂！！！";
request.setAttribute("Anime", Anime);%>
<h2><br>-----通用标签-------<br></h2>
<p>c:out输出数据标签,dafault会输出默认值：Anime</p>
<c:out value="${Anime }" default="Anime"></c:out><br>
<c:out value="${a }" default="Anime"></c:out>
<p>b标签是字体变粗：</p>
<c:out value="<b>bilibili，干杯！</b>" escapeXml="false"></c:out>
<p>c:set 设置各种范围域的属性,默认page：</p>
<c:set var="dio" value="迪奥娜"></c:set>
${dio }
<c:remove var="dio"/>
<p>这里进行了一次删除属性操作，再次使用EL表达式输出了变量：</p>
${dio }
<c:catch var="m">
<%=99/0 %>
</c:catch>
<p>使用c:catch捕捉异常：</p>
${m }

<h2><br>-----条件标签-------</h2><br>
<c:if test="${empty session.username }">
嘿，兄弟！我们好久不见你在哪里</c:if><br>
<p>使用c:choose+c:when判断：你当前的分数判定为</p>
<c:set var="sore" value="66"></c:set>
<c:choose>
<c:when test="${sore>90 }">优秀</c:when>
<c:when test="${sore>60 }">合格</c:when>
<c:otherwise>不及格</c:otherwise>
</c:choose>


<h2><br>-----迭代标签-------<br></h2>
<%String k[]={"a","b","c","d"};
request.setAttribute("k", k);%>
<p>循环遍历函数</p>
<c:forEach  var="y" items="${k }">
${y }</c:forEach>
<br>----九九乘法表---<br>
<c:forEach begin="1" end="9" var="i">
<c:forEach begin="1" end="${i }" var="j">
${j }*${i }=${i*j }&nbsp&nbsp&nbsp&nbsp
</c:forEach><br>
</c:forEach>

<p><b>分隔符测试：</b></p>
<%String v="迪卢克:;在此,;宣判;!";
request.setAttribute("v", v);%>
<c:forTokens items="${v }" delims=";" var="p">${p }</c:forTokens>



<h2><br>-----使用JSTL将字符串反向输出-------<br></h2>
<c:set var="str" value ="abcdefg" />
<c:out value="${str }"></c:out>
<c:set var="strlen" value="${fn:length(str) }" />
<c:forEach var="i" begin="0" end="${strlen}" step="1">
<c:set var = "newstr" value="${fn:substring(str,i,i+1)}${newstr}" />
</c:forEach><br>
<b><c:out value="反转输出的结果为${newstr }"></c:out></b>


<h2><br>------url标签-------<br></h2>
<c:url var ="y" value="https://www.bilibili.com/">
<c:param name="k" value="1234"></c:param>
</c:url>
<a href="${y }">click me!</a>
<p>这里c：import是导入内容，但是页面太多导入不好看就省略了</p>

</body>
</html>