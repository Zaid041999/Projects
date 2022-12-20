package org.database.App;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/studentRegistration")
public class StudentRegistration extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select uname from college.collegerecord");
			
			//Getting existing username from Database and storing into ArrayList named "arrayli"
			ArrayList<String> arrayli=new ArrayList<>();
			while(rs.next()) {
				arrayli.add(rs.getString(1));
			}
			

			String username=req.getParameter("uname");
			String password=req.getParameter("pass");
			String email=req.getParameter("email");
			String dob=req.getParameter("dob");
			String gender=req.getParameter("gen");
			String city=req.getParameter("city");
			
			
			PrintWriter pr=resp.getWriter();
			
			resp.setContentType("text/html");
			String style12="\"color:red\"";
			//Cheaking if user entered username exist in arraylist or not
			if(arrayli.contains(username)) 
			{
				
				pr.print("<center><h3 style="+style12+">username already exist, please try again with unique username</h3></center>");
				RequestDispatcher rd=req.getRequestDispatcher("Register.html");
				rd.include(req, resp);
			}
			else 
			{
				String Query1="insert into college.collegerecord values(?,?,?,?,?,?)";
				PreparedStatement pts1=con.prepareStatement(Query1);
				pts1.setString(1, username);
				pts1.setString(2, password);
				pts1.setString(3, email);
				pts1.setString(4, dob);
				pts1.setString(5, gender);
				pts1.setString(6, city);
				
				pts1.executeUpdate();
				
				String stylee="\"color:green\"";
				pr.print("<h1 style="+stylee+">REGISTRATION SUCCESSFULL PLEASE LOGIN</h1><br><br>");
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.include(req, resp);
			}
			
			
		} catch (Exception e) {
			System.out.println("===== EXCEPTION AYA =======");
			e.printStackTrace();
		}
	}

}
