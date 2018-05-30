/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico.registros;

import javax.faces.bean.ManagedBean;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author oym-dev06
 */
@ManagedBean
public class usuarios {
    
    @Min(1)
    private int idusuario=1;
    
    @Size(min=5,max=20)
    private String nombre;
    @Size(min=5,max=20)
    private String apellido;
    @Size(min=5,max=20)
    private String usuario;
    
    
    private String password;

    
    
    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
