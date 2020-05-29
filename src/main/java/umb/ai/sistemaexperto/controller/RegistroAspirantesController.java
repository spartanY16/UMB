/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umb.ai.sistemaexperto.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class RegistroAspirantesController implements Serializable {

    private static final long serialVersionUID = 1L;
    //datos Aspirante
    private int identificacion;
    private String nombre;
    private int areaExperiencia;
    private int areaAspiracion;

    public void registrarAspirante() {

    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAreaExperiencia() {
        return areaExperiencia;
    }

    public void setAreaExperiencia(int areaExperiencia) {
        this.areaExperiencia = areaExperiencia;
    }

    public int getAreaAspiracion() {
        return areaAspiracion;
    }

    public void setAreaAspiracion(int areaAspiracion) {
        this.areaAspiracion = areaAspiracion;
    }
    
    
}
