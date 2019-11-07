<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="br.com.bancobrasil.model.CategoriaProfissao"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Categorias</title>
</head>
<body>
<table>
	<tr><td><a href="/bancobrasil/in?acao=Logout">Sair</a></td></tr>
	<tr><td><a href="/bancobrasil/in?acao=Home">Home</a></td></tr>
	<tr><td><a href="/bancobrasil/in?acao=FormCategoria">Cadastrar Nova Categoria</a></td></tr>
</table>
<h2>Lista de Clientes</h2>
<table>
	<c:forEach items="${categorias}" var="categoria">
		<tr>
			<td>Nome: ${categoria.nome}</td>
			<td><a href="/bancobrasil/in?acao=ExcluirCategoria&id=${categoria.id}">Excluir</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>