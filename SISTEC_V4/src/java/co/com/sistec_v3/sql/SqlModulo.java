package co.com.sistec_v3.sql;

/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */
public class SqlModulo {

    public String registrar = "INSERT INTO Modulo (Nombre,Descripcion,Estado) VALUES (?,?,?)";
    public String estado = "UPDATE Modulo SET Estado=? WHERE id_Modulo=?";
    public String actualizar = "UPDATE Modulo SET Nombre=?,Descripcion=? WHERE id_Modulo=?";
    public String ver = "SELECT id_Modulo,Nombre,Descripcion FROM Modulo";
    public String buscar = "SELECT id_modulo,Nombre,Descripcion FROM Modulo WHERE id_Modulo=? ";
    public String like = "SELECT id_Modulo,Nombre,Descripcion,Estado FROM Modulo WHERE Nombre LIKE %?%, Descripcion LIKE %?%, Estado LIKE %?%";
}
