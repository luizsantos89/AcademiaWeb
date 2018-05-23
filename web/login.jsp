
<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta name="robots" content="noindex, nofollow">
        <title>Login</title>
    </head>

    <body>
        <form action="ServletUsuario" method="post">
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
