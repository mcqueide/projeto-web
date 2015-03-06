<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="${pageContext.request.contextPath}/login" method="post">
		
		<label for="login">Login</label>
		<input type="text" name="login" id="login">
		
		<label for="senha">Senha</label>
		<input type="password" name="senha" id="senha">
		
		<input type="submit" value="Logar">
	</form>

</body>
</html>