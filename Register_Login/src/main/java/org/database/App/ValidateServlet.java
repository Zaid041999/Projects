package org.database.App;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/validateServlet")
public class ValidateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		PrintWriter pr=resp.getWriter();
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			String query="select * from college.collegerecord where uname=? and pass=?";
			PreparedStatement pts1=con.prepareStatement(query);
			pts1.setString(1, uname);
			pts1.setString(2, pass);
			ResultSet rs=pts1.executeQuery();
			
			HttpSession session=req.getSession();
			
			
			if(rs.next()) // This method moves one row forward
			{	
				session.setAttribute("SessionUser", uname);
				session.setAttribute("SessionPass", pass);
				resp.sendRedirect("loginSuccessful.jsp");
			}
			else {
				
				resp.setContentType("text/html");
				String stylecss="\"color:red\"";
				pr.println("<center><h3 style="+stylecss+">Username or Password is Incorrect !!</h3></center>");
				
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.include(req, resp);
			}
		} catch (Exception e) {

		}
	}
}
