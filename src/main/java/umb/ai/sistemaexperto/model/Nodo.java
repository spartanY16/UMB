/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umb.ai.sistemaexperto.model;


public class Nodo {
   private int id;
   private String competencia;
   private String respuesta;
   private int nsi;
   private int nno;
   private int peso;

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public Nodo(int id, String competencia, String respuesta, int nsi, int nno, int peso) {
        this.id = id;
        this.competencia = competencia;
        this.respuesta = respuesta;
        this.nsi = nsi;
        this.nno = nno;
        this.peso = peso;
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getNsi() {
        return nsi;
    }

    public void setNsi(int nsi) {
        this.nsi = nsi;
    }

    public int getNno() {
        return nno;
    }

    public void setNno(int nno) {
        this.nno = nno;
    }
   
   
   
   
           
}
