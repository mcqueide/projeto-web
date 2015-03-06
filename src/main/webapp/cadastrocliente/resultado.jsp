<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado</title>
</head>
<body>
	
	<div style="padding:10px;color:#fff; background:#000;">
		<h1>Título</h1>
	</div>

	<%
		String nome = (String) request.getAttribute("nomeModifica");
		String idade = (String) request.getAttribute("idadeModifica");
		String mensagem = (String) request.getAttribute("mensagem");

		if (mensagem != null) {
	%>

	<div style="background-color: red; font-size: 20px; color: white">
		<c:out value="${mensagem}" />
	</div>

	<%
		}
	%>
	
	
	<p>O resultado do cadastro é:</p>
	<span>Nome: <%=nome%></span>
	<span>Idade: <%=idade%></span>



</body>
</html>