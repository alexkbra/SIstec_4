<%-- 
    Document   : index
    Created on : 6/01/2014, 12:21:22 AM
    Author     : Cindy Tatiana Montoya Leal, Jhon Alexander Muñoz Duque
--%>

<%@page import="co.com.sistec_v4.diccionario.Constantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <div class="contenedor">
            <div>
                <form action="./ServletUsuario" method="post">
                    <label for="usuario"><%=Constantes.usuario%></label>
                    <input type="text" id="usuario" name="usuario" value="" />
                    <label for="clave"><%=Constantes.clave%></label>
                    <input type="clave" id="clave" name="clave" value="" />
                    <input type="submit" value="<%= Constantes.ingresar %>" />
                    <input type="button" value="<%= Constantes.olvido %>">
                </form>
            </div>
        </div>
    </body>
</html>