package hcl208;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class request
 */
@WebServlet("/Test_Request")
public class Test_Request extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test_Request() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	 this.doPost(request,response);
    	response.setContentType("text/html;charset=utf-8");

        request.setAttribute("people", new People("何小龙",22));

        request.setAttribute("msg", "request请求域中的string属性");

        People people=(People)request.getAttribute("people");

        String msg=(String)request.getAttribute("msg");

        PrintWriter out =response.getWriter();
        out.print("<body background=\"image/10.jpg\" style=\"color:black;font-family:arial;font-size:24px\">");

        out.println("<p>request.getAttribute(\"people\")的值："+people+"</p>");

        out.println("<p>request.getAttribute(\"msg\")的值："+msg+"</p>");

        Enumeration<String>names=request.getAttributeNames();

        out.println("<p>request请求域中的属性有：");

        while(names.hasMoreElements()){

        out.println(names.nextElement()+"&nbsp");

        }

        out.println("</p>");

        request.removeAttribute("people");

        out.println("<p>执行request.removeAttribute(\"people\")后request请求域中的属性有：");

        names=request.getAttributeNames();

        while(names.hasMoreElements())

        {

        out.println(names.nextElement()+"&nbsp");

        }

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    @SuppressWarnings("deprecation")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
//        doGet(request, response);
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("refresh", "1");
        PrintWriter out = response.getWriter();
        out.println("现在时间是：");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        out.println(sdf.format(new Date()));
        Date date =new Date();
        out.println("<br>"+date.toLocaleString());
    }

}
