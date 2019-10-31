<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="br.com.bancobrasil.model.Cliente"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista Clientes</title>
</head>
<body>
<a href="home.jsp">Home</a>
<h2>Lista de Clientes</h2>
<table>
	<c:forEach items="${clientes}" var="cliente">
		<tr>
			<td>Nome: ${cliente.nome}</td><td>Idade: ${cliente.idade}</td>
			<td><a href="/bancobrasil/editarCliente?id=${cliente.id}">Editar</a></td>
			<td><a href="/bancobrasil/excluirCliente?id=${cliente.id}">Excluir</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>