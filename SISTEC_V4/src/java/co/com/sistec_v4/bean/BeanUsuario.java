package co.com.sistec_v4.bean;
/*
 *
 * @author Jhon Alexander Muñoz Duque
 * @date 05-01-2014
 * @version 003
 *
 */

public class BeanUsuario {

    public String _nombre;
    public String _clave;
    public Integer _rolIdRoles;
    public Boolean _estado;

    public BeanUsuario() {
    }
    
    public BeanUsuario(String _nombre, String _clave, Integer _rolIdRoles, Boolean _estado) {
        this._nombre = _nombre;
        this._clave = _clave;
        this._rolIdRoles = _rolIdRoles;
        this._estado = _estado;
    }
    
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getClave() {
        return _clave;
    }

    public void setClave(String _clave) {
        this._clave = _clave;
    }

    public Integer getRolIdRoles() {
        return _rolIdRoles;
    }

    public void setRolIdRoles(Integer _rolIdRoles) {
        this._rolIdRoles = _rolIdRoles;
    }

    public Boolean getEstado() {
        return _estado;
    }

    public void setEstado(Boolean _estado) {
        this._estado = _estado;
    }
    
    
    
}
