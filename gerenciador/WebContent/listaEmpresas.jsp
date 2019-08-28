<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.projeto.gerenciador.servlet.Empresa"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:url value="/removerEmpresa" var="urlRemoverEmpresa"/>
<c:url value="/exibirEmpresa" var="urlEditarEmpresa"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Lista de Empresas:
<ul>
	<c:forEach items="${listaEmpresas}" var="empresa">
		<li>
			${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yy"/>
			<a href="${urlRemoverEmpresa}?id=${empresa.id}">remover</a>
			<a href="${urlEditarEmpresa }?id=${empresa.id}">editar</a>
		</li>
	</c:forEach>
</ul>

</body>
</html>