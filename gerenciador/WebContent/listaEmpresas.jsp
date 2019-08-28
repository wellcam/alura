<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="br.com.projeto.gerenciador.servlet.Empresa"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<ul>
<%
	List<Empresa> listaEmpresas = (List<Empresa>) request.getAttribute("listaEmpresas");
	for(Empresa e : listaEmpresas){
%>		
	<li><%= e.getNome() %></li>
<%		
	}		
%>
</ul>

</body>
</html>