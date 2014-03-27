package co.com.sistec_v4.utilidades;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */
public class Conexion {

    private static Connection con = null;

    public static Connection getCon() {
        String usuario = "root";
//        String clave = "alex";
        String clave = "root";
        String url = "jdbc:mysql://localhost/SISTEC_V3";
        String driver = "com.mysql.jdbc.Driver";
        return getCon(usuario, clave, url, driver);
    }

    public static Connection getCon(String usuario, String clave, String url, String driver) {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            return con;
        }
    }
}
