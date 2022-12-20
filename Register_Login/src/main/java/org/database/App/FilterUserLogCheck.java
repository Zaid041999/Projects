package org.database.App;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/loginSuccessfull.jsp", "/privatemsg"})
public class FilterUserLogCheck implements Filter{

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest httpreq=(HttpServletRequest) req;
		
		HttpSession session =httpreq.getSession();
		String username=(String)session.getAttribute("SessionUser");
		
		PrintWriter out =res.getWriter();
		
		
		if (username==null) 
		{
			
			out.print("<html><body bgcolor=red><h1>ERROR!</h1><h3>Cannot reach this page , "
					+ "you are not logged in</h3></body></html>");
		}else {
			chain.doFilter(req, res);
		}
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}
	
	@Override
	public void destroy() {
		
	}
}