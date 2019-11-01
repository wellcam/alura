<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>
<a href="/bancobrasil/in?acao=Login">Login</a>
<h2>Cadastro de Usuário</h2>
<form action="/bancobrasil/in?acao=AdicionarUsuario" method="post">
	<table>
		<tr><td>Nome:</td><td><input type="text" name="nome"></td></tr>
		<tr><td>Empresa:</td><td><input type="text" name="empresa"></td></tr>
		<tr><td>Login:</td><td><input type="text" name="login"></td></tr>
		<tr><td>Senha:</td><td><input type="password" name="password"></td></tr>
		<tr><td><input type="submit" value="Cadastrar"></td></tr>
	</table>
</form>
</body>
</html>