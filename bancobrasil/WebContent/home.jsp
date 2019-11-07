<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.bancobrasil.model.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<table>
	<tr><td>Logado:</td><td>${usuario.login}</td>
	<td><a href="/bancobrasil/in?acao=Logout">Sair</a></td></tr>
</table>
<h2>Home</h2>

<h2>CLIENTE</h2>
<p><a href="/bancobrasil/in?acao=FormCliente">Cadastro de Clientes</a>
<p><a href="/bancobrasil/in?acao=ListarClientes">Lista de Clientes</a>
<h2>CATEGORIAS</h2>
<p><a href="/bancobrasil/in?acao=FormCategoria">Cadastro de Categorias</a>
<p><a href="/bancobrasil/in?acao=ListarCategorias">Lista de Categorias</a>
<h2>PROFISSOES</h2>
<p><a href="/bancobrasil/in?acao=FormProfissao">Cadastro de Profissoes</a>
<p><a href="/bancobrasil/in?acao=ListarProfissoes">Lista de Profissoes</a>

</body>
</html>