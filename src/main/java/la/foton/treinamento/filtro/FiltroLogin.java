package la.foton.treinamento.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(value="*")
public class FiltroLogin implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest)request;
		
		String uri = httpRequest.getRequestURI();
		
		String usuarioLogado = (String)httpRequest.getSession().getAttribute("usuarioLogado");
		String paginaLogin = httpRequest.getContextPath() + "/login.jsp";
		String submitLogin = httpRequest.getContextPath() + "/login";
		
		if (!uri.equals(paginaLogin)&& !uri.equals(submitLogin) &&usuarioLogado==null) {
			((HttpServletResponse)response).sendRedirect(paginaLogin);
		}else{
			chain.doFilter(request, response);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
