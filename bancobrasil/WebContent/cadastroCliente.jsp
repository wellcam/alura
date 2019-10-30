<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Cleintee</title>
</head>
<body>

<h2>Cadastro de Cliente</h2>
<a href="listaClientes.jsp">Lista de Clientes</a>
<br>
<form action="/bancobrasil/addCliente" method="post">
	<table>
		<tr><td>Nome:</td><td><input type="text" name="nome"></td></tr>
		<tr><td>Profissão:</td><td><input type="text" name="profissao"></td></tr>
		<tr><td>Data de nascimento:</td><td><input type="text" name="dataNascimento"></td></tr>
		<tr><td>Idade:</td><td><input type="text" name="idade"></td></tr>
		
		<tr><td><input type="submit" value="Enviar"></td></tr>
	</table>
</form>
</body>
</html>