import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Register extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		try
		{
		String name = request.getParameter("name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		Model m = new Model();
		m.setName(name);
		m.setUsername(username);
		m.setPassword(password);
		
		boolean status = m.register();
		if(status==true)
		{
			response.sendRedirect("/MVC2/RegisterSucecssful.jsp");
		}
		else
		{
			response.sendRedirect("/MVC2/registerFailure.jsp");
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
