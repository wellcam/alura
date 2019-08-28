<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/formNovaEmpresa.jsp" var="urlFormNovaEmpresa"/>
<c:url value="/listaEmpresa" var="urlListaEmpresa"/>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Gerenciador</title>
</head>
<body>
<button type="button" value="Cadastrar Nova Empres" onclick="" />
<button type="button" value="Cadastrar Nova Empres" onclick="window.location=${urlListaEmpresa}" />

</body>
</html>