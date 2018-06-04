<!--
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta name="robots" content="noindex, nofollow">
        <title>Login</title>
    </head>

    <body>
        <form action="ServletControllerWeb" method="post">
            <h1>Acesse o sistema:</h1>
            <table>
                <tr>
                    <th>Usuário: </th>
                    <td><input type="text" name="usuario" /></td>
                </tr>
                <tr>
                    <th>Senha: </th>
                    <td><input type="password" name="senha" /></td>
                </tr>
                <tr>
                    <td colspan="2"><button type="submit">Entrar</button></td>
                </tr>
            </table>
        </form>
    </body>
</html>
-->
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Página de Login</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
    <form class="form-signin" action="ServletControllerWeb" method="post">
        <img class="mb-4" src="imagens/logo2.png">
        <label for="inputEmail" class="sr-only">Usuário</label>
        <input type="" id="" class="form-control" name="usuario" placeholder="Usuario" required autofocus>
        <label for="inputPassword" class="sr-only">Senha</label>
        <input type="password" id="" class="form-control" name="senha" placeholder="Senha" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Acessar o sistema</button>
    </form>
  </body>
</html>

