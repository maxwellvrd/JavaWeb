<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Java Web</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container">
		<div class="row">
			<nav class="col-md-8 col-md-offset-2" style="margin-top: 15%">
				<ul class="nav nav-pills">
					<li role="presentation" class="active"><a href="#">Home</a></li>
					<li role="presentation"><a href="#form1">Formulário</a></li>
					<li role="presentation"><a href="#list1">Lista</a></li>
				</ul>
			</nav>
		</div>
		<section id="form1">
			<div class="col-md-8 col-md-offset-2" style="margin-top: 5%">
				<fieldset>
					<legend>Cadastro de Alunos</legend>
					<form id="formulario" action="salvar" method="post">
						<div class="form-group">
							<label for="id_nome">Nome</label> <input type="text"
								class="form-control" id="id_nome" name="nome"
								 required>
						</div>
						<div class="form-group">
							<label for="id_email">Email</label> <input type="email"
								class="form-control" id="id_email" name="email"
								 required>
						</div>
						<div class="form-group">
							<label for="id_tel">Telefone</label> <input type="tel"
								class="form-control" id="id_tel" name="tel"
								 required>
						</div>
						<div class="form-group">
							<label for="id_dtNasc">Data Nascimento</label> 
							<input type="date" class="form-control" id="id_dtNasc" 
							name="dtNasc" required>
						</div>
						<button form="formulario" type="submit"
							class="btn btn-primary pull-right">Enviar</button>
					</form>
				</fieldset>
			</div>
		</section>
		<section id="list1">
			<div class=" col-md-8 col-md-offset-2">
				<div class="panel panel-primary" style="margin-top: 5%">
					<div class="panel-heading">Listagem de Alunos</div>
					<div class="panel-body">
						<p>Gerencie aqui os alunos cadastrados no sistema</p>
					</div>

					<!-- Table -->
					<table class="table table-striped table-hover">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Email</th>
								<th>Telefone</th>
								<th>Data Nascimento</th>
								<th>Editar</th>
								<th>Excluir</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Teste</td>
								<td>Teste</td>
								<td>Teste</td>
								<td>Teste</td>
								<td><a href="#">
									<span class="glyphicon glyphicon-pencil" 
									aria-hidden="true"></span></a></td>
								<td>
									<a href="#">
									<span class="glyphicon glyphicon-trash" 
									aria-hidden="true"></span></a></td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</section>
	</div>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
</body>
</html>