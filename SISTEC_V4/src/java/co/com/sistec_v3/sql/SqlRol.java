package co.com.sistec_v3.sql;

/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */
public class SqlRol {
    
    public String registrar = "INSERT INTO Rol (Nombre,Descripcion,Estado) VALUES (?,?,?)";
    public String estado = "UPDATE Rol SET Estado=? WHERE id_Rol=?";
    public String actualizar = "UPDATE Rol SET Nombre=?,Descripcion=? WHERE id_Rol=?";
    public String ver = "SELECT id_Rol,Nombre,Descripcion FROM Rol";
    public String buscar = "SELECT id_Rol,Nombre,Descripcion FROM Rol WHERE id_Rol=? ";
    public String like = "SELECT id_Rol,Nombre,Descripcion,Estado FROM Rol WHERE Nombre LIKE %?%, Descripcion LIKE %?%, Estado LIKE %?%";
}
