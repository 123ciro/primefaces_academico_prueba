/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico.registros;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


/**
 *
 * @author oym-dev06
 */
@ManagedBean
public class carreras {
 
    @Id
    @Min(value = 1,message = "EL codigo debe ser mayor o igual a 1") 
    private int idcarrera;
    
    
    private String nombre;
    
    private String descripcion;
    @Min(value = 4,message = "La carrera tiene una duracion de como minimo 4 años") @Max(value = 5,message = "La carrera tiene una duracion de como maximo 5 años") 
    private int duracion;

    public carreras() {
    }

    public carreras(int idcarrera, String nombre, String descripcion, int duracion) {
        this.idcarrera = idcarrera;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
        
    
     
    public void save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Carrera Guardada: -->  " + nombre + "  Duracion de la carrera: "+ duracion));
    }
 
    
}
