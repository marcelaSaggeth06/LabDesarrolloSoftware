<%-- 
    Document   : GestionarEmpleados
    Created on : 3 nov 2023, 21:20:50
    Author     : fancu
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Empleados</title>
    </head>
    <body>
        <h1>Gestion de Empleados</h1>
        <h2>Listado de Empleados</h2>
        <br>
        <h1>Conexion: ${mensaje_conexion}</h1>
        
         <table border="1">
            <thead>
                <tr>
                    <th>idEmpleado</th>
                    <th>DUI_Empleado</th>
                    <th>ISSS_Empleado</th>
                    <th>NombresEmpleado</th>
                    <th>ApellidosEmpleado</th>
                    <th>FechaNacEmpleado</th>
                    <th>Telefono</th>
                    <th>Correo</th>
                    <th>idCargo</th>
                    <th>idDireccion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listaEmpleados}" var="item">
                    <tr>
                        <td><c:out value="${item.idEmpleado}" /></td>
                        <td><c:out value="${item.DUI}" /></td>
                        <td><c:out value="${item.ISSS}" /></td>                        
                        <td><c:out value="${item.nombresEmpleado}" /></td>
                        <td><c:out value="${item.apellidosEmpleado}" /></td>
                        <td><c:out value="${item.fechaNac}" /></td>
                        <td><c:out value="${item.telefono}" /></td>
                        <td><c:out value="${item.email}" /></td>                        
                        <td><c:out value="${item.idCargo}" /></td>
                        <td><c:out value="${item.idDireccion}" /></td>
                    </tr>
                </c:forEach>
            </tbody>            
        </table>
        
    </body>
</html>
