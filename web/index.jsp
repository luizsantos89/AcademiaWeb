<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<c:if test="${mensagem==null}">
    <c:set var="mensagem" value="Não Aplicavel." />   
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operações :: Aplicação Teste Easymock</title>
    </head>
    <body>
        <%
            String usuario = null;
            if (session.getAttribute("usuario") == null){
                usuario = "Ocorreu um erro";
            } else { 
                usuario = "Olá "+(String) session.getAttribute("usuario")+", você logou com êxito";
            }
        %>
        <h3><%=usuario %></h3>
    </body>
</html>
