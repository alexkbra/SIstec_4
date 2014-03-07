package co.com.sistec_v3.sql;

/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */
public class SqlUsuario {

    public String registrar = "INSERT INTO Usuario (Nombre,Clave,Rol_id_Roles,Estado) VALUES (?,?,?,?)";
    public String estado = "UPDATE Usuario SET Estado=? WHERE id_Usuario=?";
    public String actualizar = "UPDATE Usuario SET Nombre=?,Clave=?,Rol_id_Roles=?,Estado=? WHERE id_Rol=?";
    public String ver = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado FROM Usuario";
    public String buscar = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado Usuario WHERE id_Usuario=? ";
    public String like = "SELECT id_Usuario,Nombre,Clave,Rol_id_Roles,Estado FROM Usuario WHERE Nombre LIKE %?%,Clave LIKE %?%,Rol_id_Roles LIKE %?%,Estado LIKE %?%";
}
