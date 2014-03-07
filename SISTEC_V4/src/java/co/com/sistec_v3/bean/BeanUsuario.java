package co.com.sistec_v3.bean;
/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */

public class BeanUsuario {

    public String nombre;
    public String clave;
    public Integer rolIdRoles;
    public Boolean estado;

    public BeanUsuario() {
    }

    public BeanUsuario(String nombre, String clave, Integer rolIdRoles, Boolean estado) {
        this.nombre = nombre;
        this.clave = clave;
        this.rolIdRoles = rolIdRoles;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getRolIdRoles() {
        return rolIdRoles;
    }

    public void setRolIdRoles(Integer rolIdRoles) {
        this.rolIdRoles = rolIdRoles;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
