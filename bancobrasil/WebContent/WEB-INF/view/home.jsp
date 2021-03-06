<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" type="text/css">
  <link rel="stylesheet" href="https://static.pingendo.com/bootstrap/bootstrap-4.3.1.css">
</head>

<body>
	<title>Banco Brasil | Home Page</title>
	<c:import url="header-template.jsp"></c:import>
  <div class="py-5">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <ul class="nav nav-pills">
            <li class="nav-item"> <a href="" class="nav-link active" data-toggle="pill" data-target="#tabone">Clientes</a> </li>
            <li class="nav-item"> <a class="nav-link" href="" data-toggle="pill" data-target="#tabtwo">Categorias</a> </li>
            <li class="nav-item"> <a href="" class="nav-link" data-toggle="pill" data-target="#tabthree">Profissões</a> </li>
          </ul>
        </div>
      </div>
    </div>
  </div>
  <div class="py-5 text-center">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-md-12 fade show active" role="tabpanel" id="tabone">
          <h1 class="mb-4">O que deseja fazer?</h1>
          <a class="btn btn-outline-primary" href="/bancobrasil/in?acao=FormCliente">Cadastrar Novo Cliente</a>
          <a class="btn btn-outline-primary" href="/bancobrasil/in?acao=ListarClientes">Listar Clientes</a>
        </div>
      </div>
    </div>
  </div>
  <div class="py-5 text-center">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-md-12 fade" role="tabpanel" id="tabtwo">
          <h1 class="mb-4">O que deseja fazer?</h1>
          <a class="btn btn-outline-primary" href="/bancobrasil/in?acao=FormCategoria">Cadastrar Nova Categoria</a>
          <a class="btn btn-outline-primary" href="/bancobrasil/in?acao=ListarCategorias">Listar Categorias</a>
        </div>
      </div>
    </div>
  </div>
  <div class="py-5 text-center">
    <div class="container">
      <div class="row">
        <div class="mx-auto col-md-12 fade" role="tabpanel" id="tabthree">
          <h1 class="mb-4">O que deseja fazer?</h1>
          <a class="btn btn-outline-primary" href="/bancobrasil/in?acao=FormProfissao">Cadastrar Nova Profiss�o</a>
          <a class="btn btn-outline-primary" href="/bancobrasil/in?acao=ListarProfissoes">Listar Profiss�es</a>
        </div>
      </div>
    </div>
  </div>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <pingendo onclick="window.open('https://pingendo.com/', '_blank')" style="cursor:pointer;position: fixed;bottom: 20px;right:20px;padding:4px;background-color: #00b0eb;border-radius: 8px; width:220px;display:flex;flex-direction:row;align-items:center;justify-content:center;font-size:14px;color:white">Made with Pingendo Free&nbsp;&nbsp;<img src="https://pingendo.com/site-assets/Pingendo_logo_big.png" class="d-block" alt="Pingendo logo" height="16"></pingendo>
</body>

</html>