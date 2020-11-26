package hcl46208;



import java.io.IOException;

import java.io.PrintWriter;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

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

@WebServlet("/Regist")

public class Regist extends HttpServlet {

private static final long serialVersionUID = 1L;



    /**

     * Default constructor. 

     */

    public Regist() {

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

Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

Connection con = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1:1433;databasename=dk", "hcl", "hcl001011");

Statement stmt= con.createStatement();

String sql="select * from Student where username='"+username+"'";

ResultSet rs =stmt.executeQuery(sql);

if(rs.next()){

        

out.print("用户名已存在请重新选择用户名！");

response.setHeader("refresh", "2,regist.jsp");

          }

else{

   PreparedStatement ps = con.prepareStatement("insert into Student values(?,?)");

   ps.setString(1, username);

   ps.setString(2, pwd);

   ps.executeUpdate();

         out.print("注册成功，请登录");

         response.setHeader("refresh", "3,url=login.jsp");

}

stmt.close();

con.close();

} catch (Exception e) {

// TODO: handle exception

}

}



}