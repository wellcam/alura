<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.projeto.gerenciador.modelo.Empresa"%>
<%@ page import="br.com.projeto.gerenciador.modelo.Usuario"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:url value="/entrada?acao=RemoverEmpresa" var="urlRemoverEmpresa"/>
<c:url value="/entrada?acao=ExibirEmpresa" var="urlEditarEmpresa"/>
<c:url value="/entrada?acao=Logout" var="urlLogout"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:import url="logout-template.jsp"></c:import>
<p>Usuario logado: ${usuario.login }</p>
Lista de Empresas: </br>
<ul>
	<c:forEach items="${listaEmpresas}" var="empresa">
		<li>
			${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yy"/>
			<a href="${urlRemoverEmpresa}&id=${empresa.id}">remover</a>
			<a href="${urlEditarEmpresa }&id=${empresa.id}">editar</a>
		</li>
	</c:forEach>
</ul>

</body>
</html>