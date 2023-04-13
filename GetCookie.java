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
 * Servlet implementation class GetCookie
 */
@WebServlet("/get")
public class GetCookie extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=cyan text=red>");
		pw.println("<h1> Selected books are added to cart </h1>");
		Cookie c1 []=request.getCookies();
		for (Cookie c2 : c1)
		{
			String s=c2.getValue();
			pw.println(s+"<br>");
		}

		pw.println("<a href=pay>click here to procced to payment<a>");
		pw.println("</body></html>");
	
	
	}
}
