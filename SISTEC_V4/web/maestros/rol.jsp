<%-- 
    Document   : rol
    Created on : 24-mar-2014, 15:16:34
    Author     : Cindy Tatiana Montoya Leal
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="co.com.sistec_v4.bean.BeanRol"%>
<%@page import="co.com.sistec_v4.diccionario.Constantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>SISTEC - Rol</title>
        <script src="../js/javaScript.js" type="text/javascript" ></script>
        <link rel="stylesheet" type="text/css" href="../css/style.css" />
    </head>
    <body onload="iniciarRol();">
        <div class="contenedor">
            <form action="../ServletRol" method="post">
                <div id="divAcciones">
                    <table>
                        <tr>
                            <td>
                                <table>
                                    <tr>
                                        <td>
                                            <label><%=Constantes.agregar%></label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a onClick="mostrarRol();">
                                                <img src="../imagenes/agreg.png" width="40" height="40"/>
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td>
                                <table>
                                    <tr>
                                        <td>
                                            <label><%=Constantes.buscar%></label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a  onClick="mostrarRol();">
                                                <img src="../imagenes/buscar.png" width="40" height="40"/>
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                            <td>
                                <table>
                                    <tr>
                                        <td>
                                            <label><%=Constantes.cancelar%></label>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a  onClick="mostrarRol();">
                                                <img src="../imagenes/cancelar.png" width="40" height="40"/>
                                            </a>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
                <div id="frmRol" >

                    <div id="divRegistroRol">
                        <table>
                            <tr>
                                <td colspan="2">
                                    <label><%=Constantes.rol%></label>
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2">
                                    <label><%=Constantes.requerido%></label>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label>*</label>
                                    <label for="txtNombre"><%=Constantes.nombre%></label>
                                </td>
                                <td>
                                    <input type="text" id="txtNombre" name="txtNombre" value=""/>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <label for="txtDescripcion"><%=Constantes.descripcion%></label>
                                </td>
                                <td>
                                    <textarea id="txtDescripcion" name="txtDescripcion" rows="3" cols="30"></textarea>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="submit" value="<%=Constantes.guardar%>" name="<%=Constantes.accion%>"/>
                                    <input type="submit" value="<%=Constantes.actualizar%>" name="<%=Constantes.accion%>" hidden="true"/>
                                </td>
                            </tr>
                        </table>
                    </div>

                    <div id="divBuscarRol"> 
                        <h1>Buscar</h1>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>
<%--
                            if (listaRol != null) {
                                out.print("<table>"
                                        + "<tr>"
                                        + "<td>"
                                        + "<input name='nombre' value='' />"
                                        + "</td>"
                                        + "<td>"
                                        + "<input name='descripcion' value='' />"
                                        + "</td>"
                                        + "<td>"
                                        + "<select name='estado'>"
                                        + "<option name='vacio'></option>"
                                        + "<option name='activo'>Activo</option>"
                                        + "<option name='inactivo'>Inactivo</option>"
                                        + "</select>"
                                        + "</td>"
                                        + "<td colspan='2'>"
                                        + "<input type='Button' value='Buscar'	>"
                                        + "</td>"
                                        + "</tr>"
                                        + "<tr>"
                                        + "<td>"
                                        + "Nombre"
                                        + "</td>"
                                        + "<td>"
                                        + "Descripci&oacute;n"
                                        + "</td>"
                                        + "<td>"
                                        + "Estado"
                                        + "</td>"
                                        + "<td>"
                                        + "Editar"
                                        + "</td>"
                                        + "<td>"
                                        + "Eliminar"
                                        + "</td>"
                                        + "</tr>");
                                for (int i = 0; i < listaRol.size(); i++) {
                                    out.print("<tr>");
                                    out.print("<td>");
                                    out.print("<label>" + listaRol.get(i).getNombre() + "</label>");
                                    out.print("</td>");
                                    out.print("<td>");
                                    out.print("<label>" + listaRol.get(i).getDescripcion() + "</label>");
                                    out.print("</td>");
                                    out.print("<td>");
                                    if (listaRol.get(i).isEstado()) {
                                        out.print("<label>Activo</label>");
                                    } else {
                                        out.print("<label>Inactivo</label>");
                                    }
                                    out.print("</td>");
                                    out.print("<td>");
                                    out.print("<a href='#' onClick='EditarRol(" + listaRol.get(i).getIdRol().toString() + ")' ><img src='../imagenes/' /></a>");
                                    out.print("</td>");
                                    out.print("<td>");
                                    out.print("<a href='#' onClick='EliminarRol(" + listaRol.get(i).getIdRol().toString() + ")'><img src='../imagenes/' /></a>");
                                    out.print("</td>");
                                    out.print("</tr>");
                                }
                                out.print("</table>");
                            }
                        --%>