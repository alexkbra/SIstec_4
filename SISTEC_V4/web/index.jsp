<%-- 
    Document   : index
    Created on : 6/01/2014, 12:21:22 AM
    Author     : Cindy Tatiana Montoya Leal
--%>

<%@page import="co.com.sistec_v3.diccionario.Constantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/themes/default/jquery.mobile-1.4.2.min.css">
        <link rel="stylesheet" href="css/sistec/style.css">
        <script src="js/jquery.js"></script>
        <script src="js/jquery.mobile-1.4.2.min.js"></script>
    </head>
    <body>
        <!--table>
            <tr>
                <td>
                    <label for="txtUsuario" name="lblUsuario"><%= Constantes.usuario%></label>
                </td>
                <td>
                    <input type="text" size="15" maxlength="30" name="txtUsuario">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="password" name="pswClave">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Submit">
                </td>
            </tr>
        </table-->
        <div class="contenedor">
            <div id="ui-bar-form" class="ui-bar ui-bar-a">
                <form>

                    <label for="text-1">Usuario:</label>
                    <input type="text" name="text-1" id="text-1" value="">
                    <label for="text-3">Contraseña</label>
                    <input type="password" name="text-3" value="">

                    <input type="button" data-inline="true" value="Ingresar">
                    <div class="ui-input-btn ui-btn ui-btn-inline">
                        ¿Olvido su contraseña?
                        <input type="button" data-enhanced="true" value="Olvido">
                    </div>
                </form>
            </div>

        </div>
    </body>
</html>