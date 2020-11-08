package hcl446208;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie_preserve
 */
@WebServlet("/Cookie_preserve")
public class Cookie_preserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie_preserve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("test/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Cookie[] cs = request.getCookies();
		String v1="",v2="";//不初始化就不好使用equals方法
		if(cs!=null)
		{
			for(Cookie c:cs) {
				if("username".equals(c.getName()))
					v1=c.getValue();
				if("pwd".equals(c.getName()))
					v2=c.getName();			
			}
			if("admin".equals(v1)&&"123".equals(v2))
			{
				out.print("Good to see you,my master");
				response.setHeader("refresh", "3;url='welcome.jsp'");
			}
			else {
				response.sendRedirect("login.jsp");
			}
		}
		else
		{
			out.print("You're not logged in, my baron");
			response.setHeader("refresh", "3;url='login.jsp'");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		String check = request.getParameter("check");
		if(!"admin".equals(username)||!"123".equals(pwd))
		{
			request.setAttribute("msg", "账号密码不对！");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}else
		{
			
			if("check".equals(check)) {
				Cookie c1= new Cookie("username",username);
				Cookie c2 = new Cookie("pwd",pwd);
				c1.setMaxAge(60);
				c2.setMaxAge(60);
				response.addCookie(c1);
				response.addCookie(c2);
			}
			request.setAttribute("username", username);
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		
	}

}
