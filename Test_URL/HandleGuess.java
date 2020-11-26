

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HandleGuess
 */
@WebServlet("/HandleGuess")
public class HandleGuess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleGuess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			   throws ServletException,IOException{
		   request.setCharacterEncoding("utf-8");
		   response.setContentType("text/html;charset=utf-8");
		   PrintWriter out=response.getWriter();	  
		 //获取客户猜测提交的数
		   int guessNumber=Integer.parseInt(request.getParameter("guessnumber"));
		   //获取客户的会话对象
		   HttpSession session=request.getSession();
		   Integer integer=(Integer)session.getAttribute("saveNumber");
		   int realNumber=integer.intValue();
		   System.out.println(realNumber);
		   System.out.println(guessNumber);
		   if(guessNumber>realNumber){
			   session.setAttribute("message", "猜的数为"+guessNumber+"您猜大了");
			   System.out.println("您猜大了---no");
			   response.sendRedirect("inputNumber.jsp");
		   }
		   else if(guessNumber<realNumber){
			   session.setAttribute("message", "猜的数为"+guessNumber+"您猜小了");
			   System.out.println("您猜小了---no");
			   response.sendRedirect("inputNumber.jsp");
		   }
		   else{
			   session.setAttribute("message", "猜的数为"+guessNumber+"您猜对了");
			   System.out.println("您猜对了");
			   response.sendRedirect("inputNumber.jsp");
		   }
	   }

}