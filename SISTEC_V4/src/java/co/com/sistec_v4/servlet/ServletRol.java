package co.com.sistec_v4.servlet;

import co.com.sistec_v4.bean.BeanRol;
import co.com.sistec_v4.dao.DaoRol;
import co.com.sistec_v4.diccionario.Constantes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Cindy Tatiana Montoya Leal.
 * @version 003
 */
@WebServlet(name = "ServletRol", urlPatterns = {"/ServletRol"})
public class ServletRol extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml");
        PrintWriter out = response.getWriter();
        try {

            String accion = request.getParameter(Constantes.accion);
            BeanRol beanRol = new BeanRol();
            DaoRol daoRol = new DaoRol();
            if (accion.equals(Constantes.guardar)) {

                beanRol.setNombre(request.getParameter("txtNombre"));
                beanRol.setDescripcion(request.getParameter("txtDescripcion"));
                beanRol.setEstado(Boolean.TRUE);

                request.setAttribute("RespuestaGuardar", daoRol.guardar(beanRol));
                request.getRequestDispatcher("../maestro/rol.jsp");
            }
            if (accion.equals(Constantes.inicio)) {
                try {
                    Boolean sw = daoRol.validarRegistros();

                    if (sw) {
                        List<BeanRol> listRol = daoRol.getListRegistros();
                       
                        request.setAttribute("listaRol", listRol);
                        response.setContentType("text/xml");
                        String XML = "<rol>";
                        for (int i = 0; i < listRol.size(); i++) {
                            XML += "<sw>" + sw + "</sw>";
                            XML += "<Nombre>" + listRol.get(i).getNombre() + "</Nombre>";
                            XML += "<Descripcion>" + listRol.get(i).getDescripcion() + "</Descripcion>";
                            XML += "<Estado>" + listRol.get(i).isEstado() + "</Estado>";
                        }
                        XML += "</rol>";
                        response.getWriter().write(XML);
                    }

                    //request.setAttribute("inicio", sw);
                    //request.getRequestDispatcher("../maestro/rol.jsp");
                } catch (Exception ex) {
                    Logger.getLogger(ServletRol.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
