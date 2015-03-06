package la.foton.treinamento.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
	
		if (login.equals("admin")&&senha.equals("admin")) {
			req.getSession().setAttribute("usuarioLogado", login);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
		
	}
	
}
