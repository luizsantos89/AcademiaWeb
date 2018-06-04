<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Página Principal</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="sticky-footer.css" rel="stylesheet">
  </head>

  <body>

    <!-- Begin page content -->
    <main role="main" class="container">        
        
        <%
            String usuario = null;
            if (session.getAttribute("usuario") == null){
                response.sendRedirect("login.jsp");
            } else { 
                usuario = "Olá <b>"+(String) session.getAttribute("usuario")+"</b>, você logou com êxito";
            }
        %>
        
        <img class="mb-4" src="imagens/logo2.png">
        <h1 class="mt-5"><%=usuario %></h1>
        <p class="lead">Em construção</p>
        
        <form action="ServletControllerWeb" method="get">
            <button type="submit">Sair</button>
        </form>
    </main>

  </body>
</html>