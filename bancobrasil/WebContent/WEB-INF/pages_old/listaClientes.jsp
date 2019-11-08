<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page import="br.com.bancobrasil.model.Cliente"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Clientes</title>
</head>
<body>
<table>
	<tr><td>Logado: ${usuario.login}</td>
	<td><a href="/bancobrasil/in?acao=Logout">Sair</a></td></tr>
	<tr><td><a href="/bancobrasil/in?acao=Home">Home</a></td></tr>
	<tr><td><a href="/bancobrasil/in?acao=FormCliente">Cadastrar Novo Cliente</a></td></tr>
</table>
<h2>Lista de Clientes</h2>
<table>
	<c:forEach items="${clientes}" var="cliente">
		<tr>
			<td>Nome: ${cliente.nome}</td>
			<td>Profissao: ${cliente.profissao.nome}</td>
<%-- 			<td>Nascimento: <fmt:formatDate value=""/> ${cliente.dataNascimento}</td> --%>
			<td><a href="/bancobrasil/in?acao=EditarCliente&id=${cliente.id}">Editar</a></td>
			<td><a href="/bancobrasil/in?acao=ExcluirCliente&id=${cliente.id}">Excluir</a></td>
		</tr>
	</c:forEach>
</table>
</body>

</html>