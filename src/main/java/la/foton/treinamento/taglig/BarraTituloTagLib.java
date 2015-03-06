package la.foton.treinamento.taglig;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class BarraTituloTagLib extends TagSupport {

	private static final long serialVersionUID = 1L;

	private String valor;

	public void setValor(String valor) {
		this.valor = valor;
	}

	private static final String HTML
	= "<div style=\"padding: 10px; color: #fff; background: #000;\">" +
	"<h1>{0}</h1>" +
	"</div>";
	
	@Override
	public int doStartTag() throws JspException {
		String valorCompleto = MessageFormat.format(HTML, valor);
		try {
			pageContext.getOut().write(valorCompleto);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
	
}
