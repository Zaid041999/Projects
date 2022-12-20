package org.database.App;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/privatemsg")
public class MessageServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String uname = (String) session.getAttribute("SessionUser");
		
		PrintWriter out= resp.getWriter();
		
		resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		
		out.print("<html><body bgcolor=#FFE9A0><center><h3>Hello "+uname+" ,I'm creator of this website my name is Zaid Khan "
				+ "nice to see you come here to visit this webpage"
				+ " this is an extermely private message and  you are seeing this message because you "
				+ "are a qualified logged user and gone through the my servlet filtering  "
				+ "process of my website, Once you are logged out you cannot see this page through copy paste"
				+ " URL because I have used servlet filters and checked Whether you are present in session attribute or not "
				+ "and also to avoid backbutton hack by not maintaining private pages into cache of the browser <h3>"
				+ "<button>"
				+ "	<a href=\"logout\" style=\"text-decoration: none;\">LOGOUT</a>"
				+ "	</button></center></body></html>");
	}
}
