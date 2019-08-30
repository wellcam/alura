<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/entrada" var="urlNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:import url="logout-template.jsp"></c:import>
<form action="${urlNovaEmpresa}" method="post">

Nome: <input type="text" name="nome">
Data abertura: <input type="text" name="data">
<input type="submit">
<input type="hidden" name="acao" value="CriarEmpresa">

</form>

</body>
</html>