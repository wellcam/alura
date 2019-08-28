<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/novaEmpresa" var="urlNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="${urlNovaEmpresa}" method="post">

Nome: <input type="text" name="nome">
Data abertura: <input type="text" name="data">
<input type="submit">

</form>

</body>
</html>