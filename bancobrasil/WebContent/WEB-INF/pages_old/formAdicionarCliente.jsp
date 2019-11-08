<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Cliente</title>
</head>
<body>
<table>
	<tr><td>Logado:</td><td>${usuario.login}</td>
	<td><a href="/bancobrasil/in?acao=Logout">Sair</a></td></tr>
</table>
<a href="/bancobrasil/in?acao=Home">Home</a>
<h2>Cadastro de Cliente</h2>
<a href="/bancobrasil/in?acao=ListarClientes">Lista de Clientes</a>
<br>
<form action="/bancobrasil/in?acao=AdicionarCliente" method="post">
	<table>
		<tr><td>Nome:</td><td><input type="text" name="nome"></td></tr>
		<tr><td>Profissão:</td><td>
			<select name="profissao">
				<option value="">-- Selecione uma profissao --</option>
				<c:forEach items="${profissoes}" var="profissao">
			    	<option value="${profissao.id}">${profissao.nome}</option>
			    </c:forEach>
			</select>
		</td></tr>
		<tr></tr>
		<tr><td>Data de nascimento:</td>
		<td>
			<select name="dia">
				<option value="">-- Dia --</option>
				<c:forEach var="i" begin="1" end="31" step="1" >
			    	<option value="${i}">${i}</option>
				</c:forEach>
			</select>
			<select name="mes">
				<option value="">-- Mês --</option>
				<c:forEach var="i" begin="1" end="12" step="1" >
			    	<option value="${i}">${i}</option>
				</c:forEach>
			</select>
			<select name="ano">
				<option value="">-- Ano --</option>
				<c:forEach var="i" begin="1930" end="2015" step="1" >
			    	<option value="${i}">${i}</option>
				</c:forEach>
			</select>
		</td></tr>

		
		<tr><td><input type="submit" value="Cadastrar"></td></tr>
	</table>
</form>
</body>
</html>