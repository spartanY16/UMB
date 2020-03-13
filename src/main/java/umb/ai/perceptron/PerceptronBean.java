package umb.ai.perceptron;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import umb.ai.perceptron.model.Perceptron;

@ManagedBean
@SessionScoped
public class PerceptronBean implements Serializable {

    private static final long serialVersionUID = 1L;

    //VARIABLES DEL INDEX
    private double theta;
    private double aprendizaje;
    private double numDeEntradas;
    private String tabla; //AND /OR

    //VARIABLES PARA PERTEPTRON ENTRENADO
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double w1;
    private double w2;
    private double w3;
    private double w4;
    private double salida;

    //OBJETOS CON LOGICA DE NEGOCIO
    Perceptron perceptron;

    //VARIABLES PARA CONTROLAR LA VISTAS
    private boolean simple = false;
    private boolean entrenar = false;

    public String ejecutarEntrenamiento() {
        System.out.println("se está entrenando...");
        this.perceptron = new Perceptron();
        String sigPag = null;

        if (simple) {
            sigPag = this.perceptron.entrenar(w1, w2, theta, aprendizaje, tabla);
        } else {
            sigPag = this.perceptron.entrenar(w1, w2, w3, w4, theta, aprendizaje, tabla);
        }

        return sigPag;
    }

    public void calcular() {
   
        if (simple) {
            this.salida = this.perceptron.verResultadoDe(this.x1, this.x2);
        } else {
            this.salida = this.perceptron.verResultadoDe(this.x1, this.x2, this.x3, this.x4);
        }

    }

    public void generarWi() {
        
        this.simple = numDeEntradas == 2;
        this.entrenar = true;
        
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public double getAprendizaje() {
        return aprendizaje;
    }

    public void setAprendizaje(double aprendizaje) {
        this.aprendizaje = aprendizaje;
    }

    public double getNumDeEntradas() {
        return numDeEntradas;
    }

    public void setNumDeEntradas(double numDeEntradas) {
        this.numDeEntradas = numDeEntradas;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getW1() {
        return w1;
    }

    public void setW1(double w1) {
        this.w1 = w1;
    }

    public double getW2() {
        return w2;
    }

    public void setW2(double w2) {
        this.w2 = w2;
    }

    public double getW3() {
        return w3;
    }

    public void setW3(double w3) {
        this.w3 = w3;
    }

    public double getW4() {
        return w4;
    }

    public void setW4(double w4) {
        this.w4 = w4;
    }

    public double getSalida() {
        return salida;
    }

    public void setSalida(double salida) {
        this.salida = salida;
    }

    public Perceptron getPerceptron() {
        return perceptron;
    }

    public void setPerceptron(Perceptron perceptron) {
        this.perceptron = perceptron;
    }

    public boolean isSimple() {
        return simple;
    }

    public void setSimple(boolean simple) {
        this.simple = simple;
    }

    public boolean isEntrenar() {
        return entrenar;
    }

    public void setEntrenar(boolean entrenar) {
        this.entrenar = entrenar;
    }

}
