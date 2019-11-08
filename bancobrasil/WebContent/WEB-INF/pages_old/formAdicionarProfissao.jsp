<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Profissão</title>
</head>
<body>
<a href="/bancobrasil/in?acao=Home">Home</a>
<a href="/bancobrasil/in?acao=ListarProfissoes">Lista de Profissões</a>
<h2>Cadastro de Profissão<</h2>
<form action="/bancobrasil/in?acao=AdicionarProfissao" method="post">
	<table>
		<tr><td>Nome do cargo:</td><td><input type="text" name="nome"></td></tr>
		<tr><td>Categoria:</td><td>
			<select name="categoria">
					<option value="">-- Selecione uma categoria --</option>
				<c:forEach items="${categorias}" var="categoria">
			    	<option value="${categoria.id}">${categoria.nome}</option>
			    </c:forEach>
			</select>
		</td></tr>
		<tr><td><input type="submit" value="Cadastrar"></td></tr>
	</table>
</form>
<a href="/bancobrasil/in?acao=FormCategoria">Cadastrar Nova Categoria</a>
</body>
</html>