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
    </head>
    <body>
        <table>
            <tr>
                <td>
                    <label for="txtUsuario" name="lblUsuario"><%= Constantes.usuario %></label>
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
        </table>
    </body>
</html>