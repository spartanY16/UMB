package umb.ai.sistemaexperto.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SistemaExpertoController implements Serializable {

    private static final long serialVersionUID = 1L;
    //datos Aspirante
    private int identificacion;
 
    public void ValidarIdentificacion() {
        System.out.println(identificacion);
    }
 

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

   

}
