<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<c:if test="${not empty nomeEmpresa}">
		Empresa ${nomeEmpresa} criada com sucesso!
	</c:if>
	
	<c:if test="${empty nomeEmpresa}">
		Nenhuma empresa criada!
	</c:if>	
</body>
</html>