<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar Cliente</title>
</head>
<body>
<a href="/bancobrasil/in?acao=Home">Home</a>
<h2>Atualizar Cliente</h2>
<a href="/bancobrasil/in?acao=ListarClientes">Lista de Clientes</a>
<br>
${cliente.id}
<form action="/bancobrasil/in?acao=SalvarCliente" method="post">
	<table>
		<tr><td>Nome:</td><td><input type="text" name="nome" value="${cliente.nome}"></td></tr>
		<tr><td>Profissão:</td><td><input type="text" name="profissao" value="${cliente.profissao}"></td></tr>
		<tr><td>Data de nascimento:</td><td><input type="text" name="dataNascimento" value="${cliente.dataNascimento}"></td></tr>
		<tr><td>Idade:</td><td><input type="text" name="idade" value="${cliente.idade}"></td></tr>
		
		<tr><td><input type="submit" value="Atualizar"></td></tr>
	</table>
	<input type="hidden" value="${cliente.id}" name="id">
</form>
</body>
</html>