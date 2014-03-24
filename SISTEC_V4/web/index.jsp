<%-- 
    Document   : index
    Created on : 6/01/2014, 12:21:22 AM
    Author     : Cindy Tatiana Montoya Leal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Menú Menú </title>
        <link rel="stylesheet" href="css/themes/default/jquery.mobile-1.4.2.min.css">
        <link rel="stylesheet" href="css/sistec/style.css">
        <script src="js/jquery.js"></script>
        <script src="js/jquery.mobile-1.4.2.min.js"></script>
    </head>
    <body>
        <div class="contenedor">
            <div id="ui-bar-form" class="ui-bar ui-bar-a">
                <form action="./ServletUsuario" method="post">
                    <label for="text-1">Usuario:</label>
                    <input type="text" name="usuario" value="" />
                    <label for="text-3">Contraseña</label>
                    <input type="password" name="clave" value="" />
                    <input type="submit" data-inline="true" value="Ingresar" />
                    <div class="ui-input-btn ui-btn ui-btn-inline">
                        ¿Olvido su contraseña?
                        <input type="button" data-enhanced="true" value="Olvido">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>