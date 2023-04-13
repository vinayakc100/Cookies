package cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookie
 */
@WebServlet("/set")
public class SetCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=request.getParameter("Book1");
		String s2=request.getParameter("Book2");
		String s3=request.getParameter("Book3");
		if (s1!=null) 
		{
			Cookie c1=new Cookie("b1",s1); 
			response.addCookie(c1);
		}
		if (s2!=null) 
		{
			Cookie c2=new Cookie("b2",s2);
			response.addCookie(c2);
		}
		if (s3!=null) 
		{
			Cookie c3=new Cookie("b3",s3);
			response.addCookie(c3);
		}
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=red text green>");
		pw.println("<h1>Your Books are added to card Successfully</h1>");
		pw.println("<a href=get>next</a>");
		pw.println("</html></body>");
		
		
		
		
		}
		}
