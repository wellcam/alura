<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<a href="/bancobrasil/in?acao=Home">Home</a>
<form action="/bancobrasil/in?acao=Login" method="post">
	<table>
		<tr><td>Login:</td><td><input type="text" name="login"></td></tr>
		<tr><td>Senha:</td><td><input type="password" name="password"></td></tr>
		<tr><td><input type="submit" value="Entrar"></td></tr>
	</table>
</form>
<a href="/bancobrasil/in?acao=FormUsuario">Cadastrar usuário</a>
</body>
</html>