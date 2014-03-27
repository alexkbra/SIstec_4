package co.com.sistec_v4.dao;

import co.com.sistec_v4.bean.BeanRol;
import co.com.sistec_v4.sql.SqlRol;
import co.com.sistec_v4.utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cindy Tatiana Montoya Leal.
 * @version 003
 */
public class DaoRol {

    public Integer guardar(BeanRol beanRol) {
        Integer registrosInsertados = 0;
        Connection con = Conexion.getCon();
        try {

            PreparedStatement preparedStatement = con.prepareStatement(SqlRol.guardar);
            preparedStatement.setObject(1, beanRol.getNombre());
            preparedStatement.setObject(2, beanRol.getDescripcion());
            preparedStatement.setObject(3, beanRol.isEstado());
            registrosInsertados = preparedStatement.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(DaoRol.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoRol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return registrosInsertados;
    }

    public Boolean validarRegistros() {
        Boolean respusta = false;
        Connection con = Conexion.getCon();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SqlRol.ver);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                respusta = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(DaoRol.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoRol.class.getName()).log(Level.SEVERE, null, ex);
            }
            return respusta;
        }
    }

    public List<BeanRol> getListRegistros() {
        List<BeanRol> respusta = new ArrayList<BeanRol>();
        Connection con = Conexion.getCon();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SqlRol.ver);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                respusta.add(new BeanRol(Integer.parseInt(rs.getString("id_Rol")), rs.getString("Nombre"), rs.getString("Descripcion"), Boolean.parseBoolean(rs.getString("Estado"))));
            }
        } catch (Exception ex) {
            Logger.getLogger(DaoRol.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoRol.class.getName()).log(Level.SEVERE, null, ex);
            }
            return respusta;
        }
    }
}
