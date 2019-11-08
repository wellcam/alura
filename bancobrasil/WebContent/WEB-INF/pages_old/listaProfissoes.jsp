<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="br.com.bancobrasil.model.CategoriaProfissao"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Profissoes</title>
</head>
<body>
<table>
	<tr><td><a href="/bancobrasil/in?acao=Logout">Sair</a></td></tr>
	<tr><td><a href="/bancobrasil/in?acao=Home">Home</a></td></tr>
	<tr><td><a href="/bancobrasil/in?acao=FormProfissao">Cadastrar Nova Profissao</a></td></tr>
</table>
<h2>Lista de Profissoes</h2>
<table>
	<c:forEach items="${profissoes}" var="profissao">
		<tr>
			<td>Nome: ${profissao.nome}</td>
			<td>Categoria: ${profissao.categoria.nome}</td>
			<td><a href="/bancobrasil/in?acao=ExcluirProfissao&id=${profissao.id}">Excluir</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>