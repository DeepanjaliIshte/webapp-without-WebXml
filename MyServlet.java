import java.io.IOException;
import java.rmi.ServerException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet ("/ddd")
public class MyServlet  extends HttpServlet{
	@Override 
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServerException, IOException
	{
		System.out.println("I'm in service() method ");
	}
}
