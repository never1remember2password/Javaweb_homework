package hcl46208;



import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;



import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;



/**

 * Servlet implementation class Login

 */

@WebServlet("/Login")

public class Login extends HttpServlet {

private static final long serialVersionUID = 1L;



    /**

     * Default constructor. 

     */

    public Login() {

        // TODO Auto-generated constructor stub

    }



/**

* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

*/

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

//response.getWriter().append("Served at: ").append(request.getContextPath());

doPost(request, response);

}



/**

* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

*/

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

// TODO Auto-generated method stub

//doGet(request, response);

response.setContentType("text/html;charset=utf-8");

PrintWriter out = response.getWriter();

String username = request.getParameter("username");

String pwd  = request.getParameter("pwd");

try {

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//这里应该是加载你数据库的版本驱动，这些都在我外部导入的SQL的jar包里的接口，前面声明可以看到,我用的是sqlserver

Connection con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databasename=dk", "hcl", "hcl001011");//连接本地数据库，一般IP是这个可以去数据库管理软件查看IP和端口，注意数据库名字和表名匹配

Statement stmt= con.createStatement();

String sql="select pwd from Student where username='"+username+"'";

ResultSet rs =stmt.executeQuery(sql);

if(rs.next()){

          if(rs.getString("pwd").equals(pwd))

          {

          request.setAttribute("username", username);

          request.getRequestDispatcher("welcome.jsp").forward(request, response);

          }

else{

         out.print("用户名或者密码有误请重新登录！");

         response.setHeader("refresh", "3,url=login.jsp");

}

          }

else

{

out.print("用户名不存在，请先注册！");

response.setHeader("refresh","3,url=regist.jsp");

}

stmt.close();

con.close();

} catch (Exception e) {

// TODO: handle exception


}

}



}

