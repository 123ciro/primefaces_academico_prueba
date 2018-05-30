/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico.registros;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;




/**
 *
 * @author oym-dev06
 */

@ManagedBean


public class personas implements Serializable {
    private static final long serialVersionUID = 1L;
 
    // Persistent Fields:
    @Id @GeneratedValue
    Long idpersona;
 
    
    @Min(100000) @Max(9999999)
    private int cedula;
    
    @AssertTrue( message = "Debe Aceptar los terminos y condiciones.")
    private boolean terminoscondicion;
    
    private String nombre;

    private String nacimiento;
    
    private String apellido;
   
    private String telefono;
    private String correo;
    private String estadocivil;
    private String sexualidad;
    private String nacionalidad;
    private String direccion;

    
    public personas() {
    }

    public personas(Long idpersona, int cedula, boolean terminoscondicion, String nombre, String nacimiento, String apellido, String telefono, String correo, String estadocivil, String sexualidad, String nacionalidad, String direccion) {
        this.idpersona = idpersona;
        this.cedula = cedula;
        this.terminoscondicion = terminoscondicion;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.estadocivil = estadocivil;
        this.sexualidad = sexualidad;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
    }

    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public boolean isTerminoscondicion() {
        return terminoscondicion;
    }

    public void setTerminoscondicion(boolean terminoscondicion) {
        this.terminoscondicion = terminoscondicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getSexualidad() {
        return sexualidad;
    }

    public void setSexualidad(String sexualidad) {
        this.sexualidad = sexualidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

 
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Welcome " + nombre + " " + apellido));
    }
    
    
}
