<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar Cliente</title>
</head>
<body>
<table>
	<tr><td>Logado:</td><td>${usuario.login}</td>
	<td><a href="/bancobrasil/in?acao=Logout">Sair</a></td></tr>
</table>
<a href="/bancobrasil/in?acao=Home">Home</a>
<h2>Atualizar Cliente</h2>
<a href="/bancobrasil/in?acao=ListarClientes">Lista de Clientes</a>
<br>
${cliente.id}
<form action="/bancobrasil/in?acao=SalvarCliente" method="post">
	<table>
		<tr><td>Nome:</td><td><input type="text" name="nome" value="${cliente.nome}"></td></tr>
		<tr><td>Profissão:</td><td>
			<select name="profissao">
				<option value="${cliente.profissao.id}">${cliente.profissao.nome}</option>
				<c:forEach items="${profissoes}" var="profissao">
			    	<option value="${profissao.id}">${profissao.nome}</option>
			    </c:forEach>
			</select>
		</td></tr>
<%-- 		<tr><td>Data de nascimento:</td><td><input type="text" name="dataNascimento" value="${cliente.dataNascimento}"></td></tr> --%>
		
		<tr><td><input type="submit" value="Atualizar"></td></tr>
	</table>
	<input type="hidden" value="${cliente.id}" name="id">
</form>
</body>
</html>