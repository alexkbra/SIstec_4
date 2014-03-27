package co.com.sistec_v4.sql;

/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */
public class SqlRol {
    
    public static String guardar = "INSERT INTO Rol (Nombre,Descripcion,Estado) VALUES (?,?,?)";
    public static String eliminar = "UPDATE Rol SET Estado=? WHERE id_Rol=?";
    public static String actualizar = "UPDATE Rol SET Nombre=?,Descripcion=? WHERE id_Rol=?";
    public static String ver = "SELECT id_Rol,Nombre,Descripcion,Estado FROM Rol";
    public static String buscar = "SELECT id_Rol,Nombre,Descripcion FROM Rol WHERE id_Rol=? ";
    public static String like = "SELECT id_Rol,Nombre,Descripcion,Estado FROM Rol WHERE Nombre LIKE %?%, Descripcion LIKE %?%, Estado LIKE %?%";
}
