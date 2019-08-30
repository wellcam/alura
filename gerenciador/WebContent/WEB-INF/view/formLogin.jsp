<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:url value="/entrada" var="urlLogin"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="${urlLogin}" method="post">

Login: <input type="text" name="login">
Senha: <input type="password" name="senha">
<input type="submit">
<input type="hidden" name="acao" value="Login">

</form>

</body>
</html>