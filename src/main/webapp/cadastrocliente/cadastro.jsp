<%@page import="java.util.Date"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.foton.la/treinamento.tld" prefix="treinamento" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Cliente</title>
</head>
<body>

	<treinamento:titulo valor="Cadastro de cliente"></treinamento:titulo>
	<h1>Título</h1>

	<%
		Date dataAtual = (Date) request.getAttribute("dataAtual");
	%>
	
	<span>Olá, o horário do servidor é: 
		<c:out value="${dataAtual}" />
	</span>
	
	<form action="<%=request.getContextPath()%>/cadastroCliente" method="post">
	
		<label for="nome">Nome do cliente:</label>
		<input type="text" name="nome" id="nome">
		
		<label for="idade">Idade:</label>
		<input type="text" name="idade" id="idade">
		
		<input type="submit" value="Salvar">
	
	</form>

</body>
</html>