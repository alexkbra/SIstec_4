<%-- 
    Document   : menu
    Created on : 16-mar-2014, 18:56:22
    Author     : AleXkbra
--%>

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
        <table>
            <tr>
                <td>
                    <div class="menu">
                        <fieldset data-role="controlgroup" data-mini="true">
                            <label for="select-custom-8">Seguridad</label>
                            <select name="select-custom-8" id="select-custom-8" data-native-menu="false" data-iconpos="left">
                                <option value="#">Usuarios</option>
                                <option value="#">Perfiles</option>
                                <option value="#">Rol</option>
                            </select>
                            <label for="select-custom-9">Select B</label>
                            <select name="select-custom-9" id="select-custom-9" data-native-menu="false" data-iconpos="left">
                                <option value="#">One</option>
                                <option value="#">Two</option>
                                <option value="#">Three</option>
                            </select>
                            <label for="select-custom-10">Select C</label>
                            <select name="select-custom-10" id="select-custom-10" data-native-menu="false" data-iconpos="left">
                                <option value="#">One</option>
                                <option value="#">Two</option>
                                <option value="#">Three</option>
                            </select>
                        </fieldset>
                    </div>
                </td>
                <td>
                    <div>
                        
                    </div>
                </td>
            </tr>
        </table>


    </body>
</html>
