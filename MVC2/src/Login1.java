

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Login1 extends HttpServlet
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
	 try 
	  {
	    String temp = request.getParameter("usn");
	    String temp1 = request.getParameter("pwd");
	    Model2 m = new Model2();
	    m.setUsn(temp);
	    m.setPassword(temp1);
	    boolean us=m.getResult();
	    String nam = m.getName();
	    HttpSession session = request.getSession(true);
	    session.setAttribute("Name", nam);
	   if(us==true)
	   {
		   response.sendRedirect("/MVC2/loginSuccessful.jsp");
	   }
	   else
	   {
		   response.sendRedirect("/MVC2/loginFailed.jsp");
	   }
	  }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	}
}
