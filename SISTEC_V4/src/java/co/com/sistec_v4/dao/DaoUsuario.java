/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.sistec_v4.dao;

import co.com.sistec_v4.bean.BeanUsuario;
import co.com.sistec_v4.sql.SqlUsuario;
import co.com.sistec_v4.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author AleXkbra
 */
public class DaoUsuario {

    public BeanUsuario login(BeanUsuario beanUsuario) {
        BeanUsuario resBeanUsuario = null;
        try {
            Connection con = Conexion.getCon();
            PreparedStatement preparedStatement = con.prepareStatement(SqlUsuario.login);
            preparedStatement.setObject(1, con);
            preparedStatement.setObject(2, con);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                resBeanUsuario = new BeanUsuario();
                resBeanUsuario.setNombre(rs.getString("Nombre"));
                resBeanUsuario.setClave(rs.getString("Clave"));
                resBeanUsuario.setRolIdRoles(Integer.parseInt(rs.getString("Rol_id_Roles")));
                resBeanUsuario.setEstado(Boolean.parseBoolean(rs.getString("Estado")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return resBeanUsuario;
        }
    }
}
