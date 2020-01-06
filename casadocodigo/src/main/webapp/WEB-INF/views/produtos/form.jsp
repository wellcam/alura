<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Livros de Java, Android, Iphone, Ruby, PHP e muito mais - Casa do Codigo</title>
</head>
<body>

   <form:form action= "${s:mvcUrl('PC#cadastrar').build()}" method="POST" commandName="produto" enctype="multipart/form-data">
		<div>
			<label>Titulo</label>
<!-- 			<input type="text" name="titulo"> -->
			<form:input path="titulo"/>
			<form:errors path="titulo"></form:errors>
		</div>
		<div>
			<label>Descrição</label>
<!-- 			<textarea rows="10" cols="20" name="descricao"></textarea> -->
			<form:textarea path="descricao" rows="10" cols="20"/>
           <form:errors path="descricao"></form:errors>
		</div>
		<div>
			<label>Páginas</label>
<!-- 			<input type="text" name="paginas"> -->
			<form:input path="paginas"/>
           <form:errors path="paginas"></form:errors>
		</div>
		<div>
			<label>Data de lançamento</label>
<!-- 			<input type="text" name="dataLacamento"> -->
			<form:input path="dataLacamento"/>
			<form:errors path="dataLacamento"></form:errors>
		</div>
		<c:forEach items="${tipos}" var="tipoPreco" varStatus="status">
			<div>
				<label>${tipoPreco}</label>
<%-- 				<input type="text" name="precos[${status.index}].valor"> --%>
<%-- 				<input type="hidden" name="precos[${status.index}].tipo" value="${tipoPreco}"> --%>
				<form:input path="precos[${status.index}].valor"/>
				<form:hidden path="precos[${status.index}].tipo" value="${tipoPreco}"/>
			</div>
		</c:forEach>
		<div>
		    <label>Sumário</label>
		    <input name="sumario" type="file" />
		</div>
		<button type="submit">Cadastrar</button>
	</form:form>

</body>
</html>