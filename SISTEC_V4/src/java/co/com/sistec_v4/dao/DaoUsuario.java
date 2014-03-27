package co.com.sistec_v4.dao;

import co.com.sistec_v4.bean.BeanUsuario;
import co.com.sistec_v4.sql.SqlUsuario;
import co.com.sistec_v4.utilidades.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jhon Alexander Muños Duque.
 * @version 003
 */
public class DaoUsuario {

    public BeanUsuario login(BeanUsuario beanUsuario) {
        BeanUsuario resBeanUsuario = null;
        Connection con = Conexion.getCon();
        try {
            PreparedStatement preparedStatement = con.prepareStatement(SqlUsuario.login);
            preparedStatement.setObject(1, beanUsuario.getNombre());
            preparedStatement.setObject(2, beanUsuario.getClave());
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()){
                resBeanUsuario = new BeanUsuario();
                resBeanUsuario.setNombre(rs.getString("Nombre"));
                resBeanUsuario.setClave(rs.getString("Clave"));
                resBeanUsuario.setRolIdRoles(Integer.parseInt(rs.getString("Rol_id_Roles")));
                resBeanUsuario.setEstado(Boolean.parseBoolean(rs.getString("Estado")));
            }
        } catch (Exception ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
            return resBeanUsuario;
        }
    }
}
