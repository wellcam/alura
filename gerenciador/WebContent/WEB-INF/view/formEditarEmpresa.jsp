<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:url value="/entrada" var="urlEditarEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-template.jsp"></c:import>
<form action="${urlEditarEmpresa}?id=${empresa.id}" method="post">

Nome: <input type="text" name="nome" value="${empresa.nome }">
Data abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>">
<input type="submit">
<input type="hidden" name="acao" value="EditarEmpresa">

</form>

</body>
</html>