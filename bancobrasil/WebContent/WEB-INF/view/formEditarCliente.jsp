<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <title>Banco Brasil | Atualizar de Cliente</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
</head>

<body>
	<c:import url="header-template.jsp"></c:import>
  <div class="py-5 text-center" style="background-image: url('https://static.pingendo.com/cover-bubble-dark.svg');background-size:cover;">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-md-6 col-10 bg-white p-5">
          <h1 class="mb-4">Atualizar de Cliente</h1>
          <form action="/bancobrasil/in?acao=SalvarCliente" method="post">
            <div class="form-group"><h5 > <b>Nome</b> </h5> <input type="text" class="form-control" placeholder="Nome" value="${cliente.nome}"name ="nome" id="form9"> </div>
            <div class="form-group">
            	<h5 > <b>Profissão</b> </h5>
				<select class="form-control" name="profissao">
					<option value="${cliente.profissao.id}">${cliente.profissao.nome}</option>
					<c:forEach items="${profissoes}" var="profissao">
				    	<option value="${profissao.id}">${profissao.nome}</option>
				    </c:forEach>
				</select>
            </div>
            <div class="form-group">
            <h5 > <b>Nascimento</b> </h5>
			<select class="form-control" name="dia">
				<option value="${dia}">${dia}</option>
				<c:forEach var="i" begin="1" end="31" step="1" >
			    	<option value="${i}">${i}</option>
				</c:forEach>
			</select>
			<select class="form-control" name="mes">
				<option value="${mes}">${mes}</option>
				<c:forEach var="i" begin="1" end="12" step="1" >
			    	<option value="${i}">${i}</option>
				</c:forEach>
			</select>
			<select class="form-control" name="ano">
				<option value="${ano}">${ano}</option>
				<c:forEach var="i" begin="1930" end="2015" step="1" >
			    	<option value="${i}">${i}</option>
				</c:forEach>
			</select>
            </div>
            <div><button type="submit" class="btn btn-primary">Salvar</button></div>
          </form>
          <div class="form-group"></div><a href="/bancobrasil/in?acao=Home"> Voltar para Home</a></div>
        </div>
      </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>
</body>

</html>