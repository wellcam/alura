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
<br>
<h3><a href="/bancobrasil/in?acao=FormCliente">Cadastro de Cliente</a></h3>
<h3><a href="/bancobrasil/in?acao=ListarClientes">Lista de Clientes</a></h3>

</body>
</html>