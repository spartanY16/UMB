/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umb.ai.sistemaexperto.model;

import java.util.ArrayList;

/**
 *
 * @author davin
 */
public class MotorInferencia {
    



    private static ArrayList<Nodo> nodo = new ArrayList<Nodo>();
    private static int siguiente = 0;

    public static void data() {

    }

    public static void NodoSiguiente(int idnodo, String respuesta) {



    }

    public static String Tipo(int idnodo) {

        return nodo.get(idnodo).getCompetencia();
    }

    public static String MostrarNodo(int idnodo) {
        return nodo.get(idnodo).getRespuesta();
    }


    public static int getSiguiente() {
        return siguiente;
    }

    public static void setSiguiente(int siguiente) {
        MotorInferencia.siguiente = siguiente;
    }

   
}
