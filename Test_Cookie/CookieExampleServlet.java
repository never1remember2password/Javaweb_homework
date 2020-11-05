package hcl208;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieExampleServlet
 */
@WebServlet("/CookieExampleServlet")
public class CookieExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CookieExampleServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, H/home/ethanhe/Pictures/素材/11.jpgttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String nowTime =sdf.format(new Date());
		out.print("<body background=\"image/11.jpg\"   style=\"font-family:arial;color:black;font-size:27px\" >");
		String lastVistTime ="";
		int vistedCount = 0;
		
		Cookie[] cookies = request.getCookies();
		if(cookies!=null)
		{
			for(Cookie cookie:cookies)
			{
				if("lastVistTime".equals(cookie.getName()))
				{
					lastVistTime = cookie.getValue();				
				}
				if("vistedCount".equals(cookie.getName()))
				{
					vistedCount = Integer.valueOf(cookie.getValue());
				}
			}
		}
		out.print("<h1  style=\"font-family:verdana;color:red;\">Hello World!</h1>");
	
		if(!"".equals(lastVistTime))
		{
			out.println("您上一次访问的时间是："+lastVistTime);
			out.print("<br>");
		}
		out.println("您是第"+(vistedCount+1)+"次访问本网站");
		Cookie lastVisTimeC = new Cookie("lastVistTime",nowTime);
		lastVisTimeC.setMaxAge(365*24*60*60);
		Cookie VisitCountC = new Cookie("vistedCount",String.valueOf(vistedCount+1));
		VisitCountC.setMaxAge(365*24*60*60);
		response.addCookie(lastVisTimeC);
		response.addCookie(VisitCountC);
	} 
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
