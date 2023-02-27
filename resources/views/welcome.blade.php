<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crud com Laravel</title>
    <link rel="stylesheet" href="{{url('assets/bootstrap/css/bootstrap.min.css')}}">
</head>
<body>
  <h1 class="text-center">crud</h1>
<div class="text-center mt-3 mb-4">

          <button class="btn btn-success">Cadastrar</button>
        </a>
</div>

 <div class="col-8 m-auto">
    @csrf
<table class="table">
  <thead class="table-dark">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Nome</th>
      <th scope="col">CEP</th>
      <th scope="col">Pessoa</th>
      <th scope="col">Action</th>

    </tr>
  </thead>
  <tbody>
  
    <tr>
      <th scope="row">01</th>
      <td>Tarefa 1</td>
      <td>20552415697</td>
      <td>Isabely</td>
      <td>
       
          <button class="btn btn-dark">Vizualizar</button>
        </a>
       
          <button class="btn btn-primary">Editar</button>
        </a>
        
          <button class="btn btn-danger">Deltar</button>
        </a>
      </td>

  </tr>

    
  </tbody>
</table>
<div>
  
</body>
</html>