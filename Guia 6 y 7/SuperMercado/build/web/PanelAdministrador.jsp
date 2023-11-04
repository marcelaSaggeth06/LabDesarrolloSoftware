<%-- 
    Document   : PanelAdministrador
    Created on : 5 oct 2023, 10:46:12
    Author     : A22-PC-17
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PanelAdministrador</title>
    </head>
    <body>
        <div><h1>Sistema de SuperMercado</h1></div>
        <%-- Directiva Page --%>
      
        
        <%-- Directiva Include --%>
        <br>
    <div><h3>Menu de Opciones</h3></div>
    <div>
        <%@include file="MenuAdministrador.jsp" %>
    </div>
    <div>
        <%@include file="Footer.html" %>
    </div>
    </body>
</html>
