package la.foton.treinamento.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/cadastroCliente")
public class CadastroClienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setAttribute("dataAtual", new Date());
		req.getRequestDispatcher("/cadastrocliente/cadastro.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		int idade = Integer.parseInt(req.getParameter("idade"));
		
		if (idade<18) {
			req.setAttribute("mensagem", "Cliente de menor idade");
		}
		
		req.setAttribute("nomeModifica", nome.toUpperCase());
		req.setAttribute("idadeModifica", "0"+idade);
		
		req.getRequestDispatcher("/cadastrocliente/resultado.jsp").forward(req, resp);
		
		
		
	}
	
	

}
