/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico.registros;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author oym-dev06
 */
@ManagedBean
public class semestres {
    
    
    private int idsemestre;
    private int idcarrera;
    private String nombre;
    private String descripcion;

    public semestres() {
    }

    public semestres(int idsemestre, int idcarrera, String nombre, String descripcion) {
        this.idsemestre = idsemestre;
        this.idcarrera = idcarrera;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdsemestre() {
        return idsemestre;
    }

    public void setIdsemestre(int idsemestre) {
        this.idsemestre = idsemestre;
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
    
    
    
    
    
    
}
