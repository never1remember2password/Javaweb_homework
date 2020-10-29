package hcl208;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Acquisition_times_and_time
 */
@WebServlet("/Acquisition_times_and_time")
public class Acquisition_times_and_time extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Acquisition_times_and_time() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    ServletContext context = getServletContext();
	    Integer counter = (Integer)context.getAttribute("counter");
	    out.print("<body background=\"image/3.jpeg\" style=\"color:black;font-size:24px\">");
	    if(counter==null)
	    {
	    	counter=1;
	    	context.setAttribute("counter", counter);
	    }
	    else
	    {
	    	counter++;
	    }
	    context.setAttribute("counter", counter);
	    out.print("当前页面已有:"+counter+"位访问<br>");
	    out.print(new SimpleDateFormat("yyyy年 MM月 dd日 HH：mm：ss").format(new Date()));
//	    String name = context.getServletContextName();
	    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
