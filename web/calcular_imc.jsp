<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Avaliar Aluno :: Aplicação Teste Easymock</title>
    </head>
    <body>
        <font face="tahoma">
            <h1>Inserir dados para o IMC</h1>
            <form action="ServletControllerWeb" method="post" name="frmIMC">
                <table>
                    <tr>
                        <td>Sexo:</td><td><input type="text" name="vSexo" size="40"></td>
                    </tr>         
                    <tr>
                        <td>Peso:</td><td><input type="text" name="vPeso" size="40"></td>
                    </tr>            
                    <tr>
                        <td>Altura:</td><td><input type="text" name="vAltura" size="40"></td>
                    </tr>            
                    <tr>
                        <td></td><td><input type="submit" name="Enviar" value="Enviar"></td>
                    </tr>               
                </table>
            </form>
            <br><br> <br><a href="index.jsp" >Voltar</a><br>
        </font>  
    </body>
</html>
