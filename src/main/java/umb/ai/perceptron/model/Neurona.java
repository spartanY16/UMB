package umb.ai.perceptron.model;

public class Neurona {

    double x1, x2, x3, x4, w1, w2, w3, w4, eR, fA, yR;

    Neurona(double w1, double w2, double eR, double fA) {
        this.w1 = w1;
        this.w2 = w2;
        this.eR = eR;
        this.fA = fA;
    }

    Neurona(double w1, double w2, double w3, double w4, double eR, double fA) {
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;
        this.eR = eR;
        this.fA = fA;
    }

    public double funcionDePropagacion(double x1, double x2) {
        double wx;
        wx = (x1 * w1) + (x2 * w2) - eR; // Función propagación
        yR = wx;// Math.tanh(wx); // Salida
        return yR;

    }

    public double funcionDePropagacion(double x1, double x2, double x3, double x4) {
        double wx;
        wx = (x1 * w1) + (x2 * w2) + (x3 * w3) - (x4 * w4) - eR; // Función propagación
        yR = wx;// Math.tanh(wx); // Salida
        return yR;

    }

    public double verResultadoDe(double x1, double x2) {
        double res = funcionDePropagacion(x1, x2);

        if (res >= 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public double verResultadoDe(double x1, double x2, double x3, double x4) {
        double res = funcionDePropagacion(x1, x2, x3, x4);

        if (res >= 0) {
            return 1;
        } else {
            return 0;
        }

    }
    
    public double verResultadoDePib(double x1, double x2, double x3, double x4) {
        double res = funcionDePropagacion(x1, x2, x3, x4);
        res=res/1000000000;
        res=res/1000;
        
        return res;

    }

    public void funcionDeReaprendizaje(int yE, int yR, int x1, int x2) {

        double nw1, nw2, neR;
        double DY = (yE - yR);
        double Dx1 = fA * DY * x1;
        double Dx2 = fA * DY * x2;

        nw1 = w1 + Dx1;
        nw2 = w2 + Dx2;
        neR = eR - (fA * DY);

        w1 = nw1;
        w2 = nw2;
        eR = neR;

    }

    public void funcionDeReaprendizaje(int yE, int yR, int x1, int x2, int x3, int x4) {

        double nw1, nw2, nw3, nw4, neR;
        double DY = (yE - yR);
        double Dx1 = fA * DY * x1;
        double Dx2 = fA * DY * x2;
        double Dx3 = fA * DY * x3;
        double Dx4 = fA * DY * x4;

        nw1 = w1 + Dx1;
        nw2 = w2 + Dx2;
        nw3 = w3 + Dx3;
        nw4 = w4 + Dx4;
        neR = eR - (fA * DY);

        w1 = nw1;
        w2 = nw2;
        w3 = nw3;
        w4 = nw4;
        eR = neR;

    }

    @Override
    public String toString() {
        return "Neurona{" + "w1=" + w1 + ", w2=" + w2 + ", w3=" + w3 + ", w4=" + w4 + ", eR=" + eR + ", fA=" + fA + ", yR=" + yR + '}';
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

    public double geteR() {
        return eR;
    }

    public void seteR(double eR) {
        this.eR = eR;
    }

    public double getfA() {
        return fA;
    }

    public void setfA(double fA) {
        this.fA = fA;
    }

    public double getyR() {
        return yR;
    }

    public void setyR(double yR) {
        this.yR = yR;
    }

}
