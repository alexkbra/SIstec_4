package co.com.sistec_v4.sql;

/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */
public class SqlUsuario {
    
    public static String registrar = "INSERT INTO Usuario (Nombre,Clave,Rol_id_Roles,Estado) VALUES (?,?,?,?)";
    public static String estado = "UPDATE Usuario SET Estado=? WHERE id_Usuario=?";
    public static String actualizar = "UPDATE Usuario SET Nombre=?,Clave=?,Rol_id_Roles=?,Estado=? WHERE id_Rol=?";
    public static String ver = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado FROM Usuario";
    public static String buscar = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado Usuario WHERE id_Usuario=? ";
    public static String like = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado FROM Usuario WHERE Nombre LIKE %?%,Clave LIKE %?%,Rol_id_Roles LIKE %?%,Estado LIKE %?%";
    public static String login = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado FROM Usuario WHERE Nombre = ?, Clave = ?";
}
