<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Categoria</title>
</head>
<body>
<a href="/bancobrasil/in?acao=Home">Home</a>
<a href="/bancobrasil/in?acao=ListarCategorias">Lista de Categorias</a>
<h2>Cadastro de Categoria</h2>
<form action="/bancobrasil/in?acao=AdicionarCategoria" method="post">
	<table>
		<tr><td>Nome da Categoria para Profissão:</td><td><input type="text" name="nome"></td></tr>
		<tr><td><input type="submit" value="Cadastrar"></td></tr>
	</table>
</form>
</body>
</html>