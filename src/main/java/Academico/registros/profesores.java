/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Academico.registros;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author oym-dev06
 */
@ManagedBean
public class profesores {

    @Size(min = 2, max = 5)
    private String nombre;

    @Min(18)
    @Max(50)
    private int edad;

    private int sueldo;
    private String apellido;
     private String facultad;
     
    private List<String> facultades; 
    

    private UploadedFile documento;

     @PostConstruct
    public void init() {
        facultades = new ArrayList<String>();
        facultades.add("UNA");
        facultades.add("UCA");
        facultades.add("UNINORTE");
        facultades.add("UCSA");
        facultades.add("UAA");
        facultades.add("AMERICANA");
        facultades.add("NIHON GAKKO");
        facultades.add("UPAP");
        facultades.add("UNISAL");
        facultades.add("OTROS");
    }

    public List<String> getFacultades() {
        return facultades;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

  
    
    public UploadedFile getDocumento() {
        return documento;
    }

    public void setDocumento(UploadedFile documento) {
        this.documento = documento;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
