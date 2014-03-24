<%-- 
    Document   : index
    Created on : 6/01/2014, 12:21:22 AM
    Author     : Cindy Tatiana Montoya Leal, Jhon Alexander Muñoz Duque
--%>

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
                    <label for="usuario">Usuario:</label>
                    <input type="text" id="usuario" name="usuario" value="" />
                    <label for="password">Contraseña: </label>
                    <input type="password" id="password" name="clave" value="" />
                    <input type="submit" value="Ingresar" />
                    <input type="button" value="¿Olvido su contraseña?">
                </form>
            </div>
        </div>
    </body>
</html>