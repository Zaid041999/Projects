<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{background-color: black;
}
.container {
margin-top:1%;
height:100vh;
	
	background-position: center;
	color: #A7D2CB;
}

h1 {
	color: green;
}
</style>
</head>
<body>
	<%!String uname;
	String email;
	String dob;
    String city;   %>

	<%
	String uname = (String) session.getAttribute("SessionUser");
	String pass = (String) session.getAttribute("SessionPass");
	
	//Not letting this page to be cache
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		String query = "select * from college.collegerecord where uname=? and pass=?";
		PreparedStatement pts1 = con.prepareStatement(query);
		pts1.setString(1, uname);
		pts1.setString(2, pass);
		ResultSet rss = pts1.executeQuery();

		while (rss.next()) {
			uname = rss.getString("uname");
			email = rss.getString("email");
			dob = rss.getString("dob");
			city = rss.getString("city");
			
		}
	} catch (Exception e) {
		System.out.println("EXCEPTION AYA");
		e.printStackTrace();
	}
	%>
	
	<div class="container">
		<center>
		<br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
			<h1>You are logged</h1>
			<h4>
				Username :<%= uname%></h4>
			<h4>
				Email:<%=email %></h4>
			<h4>
				DOB :<%= dob%></h4>
			<h4>
				City :<%= city%></h4>
			<br>
			<button>
				<a href="logout" style="text-decoration: none;">LOGOUT</a>
			</button>
			<button>
				<a href="privatemsg" style="text-decoration: none;">PRIVATE MSG</a>
			</button>
		</center>
	</div>

</body>
</html>