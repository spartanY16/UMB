package umb.ai.perceptron.model;

public class Perceptron {
    
    Neurona n= null;

    public static int nextIndice(int index) {
        if (index >= 15) {
            return 0;
        } else {
            return ++index;
        }

    }

    public String entrenar(double w1, double w2, double eR, double fA, String tabla) {
      
        String retorno= null;
        double yR;

        int[] x1 = {1, 1, 0, 0};
        int[] x2 = {1, 0, 1, 0};
        int[] yf = new int[4];
        
        int[] and = {1, 0, 0, 0}; // and
        int[] or = { -1, 1, 1, 1 }; //or
        
        if(tabla.equals("AND")){
            yf = and;
            
        } else {
            yf = or;
        }

        int iteracionR = 0;
        int iteracionT = 0;
        int indice = 0;
        int exitos = 0;
        n = new Neurona(w1, w2, eR, fA);

        // bucle de sumatoria
        for (;;) {

            iteracionT++;
            System.out.println(n.toString() + " iteración total= " + iteracionT + " iteración reaprendizaje = " + iteracionR + " indice = " + indice);

            if (iteracionT == 10000) {
                System.out.println("Se sobrepasaron las 1000 iteraciones..");
                break;
            }

            if (exitos == 4) {
                System.out.println("Exito completo con " + n);
                retorno = "perceptron_entrenado.xhtml";
                break;
            }

            yR = n.funcionDePropagacion(x1[indice], x2[indice]);

            if (yR >= 0) {// 1

                if (1 == yf[indice]) {
                    exitos++;
                    indice = nextIndice(indice);
                    continue;

                } else {
                    n.funcionDeReaprendizaje(yf[indice], 1, x1[indice], x2[indice]);
                    exitos = 0;
                    iteracionR++;
                }

            } else {// 0

                if (0 == yf[indice]) {
                    exitos++;
                    indice = nextIndice(indice);
                    continue;
                } else {
                    n.funcionDeReaprendizaje(yf[indice], 0, x1[indice], x2[indice]);
                    exitos = 0;
                    iteracionR++;
                }
            }

        }

        System.out.println("w1 = " + n.getW1());
        System.out.println("w2 = " + n.getW2());
        System.out.println("eR = " + n.geteR());
        System.out.println("fA = " + n.getfA());

        System.out.println("Se realizaron " + iteracionR + " iteraciones de re-aprendizajes");
        System.out.println("Se realizaron " + (iteracionT - 1) + " iteraciones totales");
        System.out.println(n);

        System.out.println("0 y 0 =>" + n.verResultadoDe(0, 0));
        System.out.println("0 y 1 =>" + n.verResultadoDe(0, 1));
        System.out.println("1 y 0 =>" + n.verResultadoDe(1, 0));
        System.out.println("1 y 1 =>" + n.verResultadoDe(1, 1));

        return retorno;
    }
    
    public String entrenar(double w1, double w2, double w3, double w4, double eR, double fA, String tabla) {
      
        String retorno= null;
        double yR;

        int[] x1 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] x2 = {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        int[] x3 = {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        int[] x4 = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        int[] yf = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1};

        int iteracionR = 0;
        int iteracionT = 0;
        int indice = 0;
        int exitos = 0;
        n = new Neurona(w1, w2, w3, w4, eR, fA);

        // bucle de sumatoria
        for (;;) {

            iteracionT++;
            System.out.println("w1 = " + n.getW1() + " w2 = " + n.getW2() + " w3 = " + n.getW3() + " w4 = " + n.getW4() + " iteración total= " + iteracionT + " iteración reaprendizaje = " + iteracionR + " indice = " + indice);

            if (iteracionT == 10000) {
                System.out.println("Se sobrepasaron las 1000 iteraciones..");
                break;
            }

            if (exitos == 16) {
                System.out.println("Exito completo con " + n);
                retorno = "perceptron_entrenado.xhtml";
                break;
            }

            yR = n.funcionDePropagacion(x1[indice], x2[indice], x3[indice], x4[indice]);

            if (yR >= 0) {// 1

                if (1 == yf[indice]) {
                    exitos++;
                    indice = nextIndice(indice);
                    continue;

                } else {
                    n.funcionDeReaprendizaje(yf[indice], 1, x1[indice], x2[indice], x3[indice], x4[indice]);
                    exitos = 0;
                    iteracionR++;
                }

            } else {// 0

                if (0 == yf[indice]) {
                    exitos++;
                    indice = nextIndice(indice);
                    continue;
                } else {
                    n.funcionDeReaprendizaje(yf[indice], 0, x1[indice], x2[indice], x3[indice], x4[indice]);
                    exitos = 0;
                    iteracionR++;
                }
            }

        }

        System.out.println("w1 = " + n.getW1());
        System.out.println("w2 = " + n.getW2());
        System.out.println("w3 = " + n.getW3());
        System.out.println("w4 = " + n.getW4());
        System.out.println("eR = " + n.geteR());
        System.out.println("fA = " + n.getfA());

        System.out.println("Se realizaron " + iteracionR + " iteraciones de re-aprendizajes");
        System.out.println("Se realizaron " + (iteracionT - 1) + " iteraciones totales");
        System.out.println(n);

        System.out.println("0 - 0 - 0 - 0 => " + n.verResultadoDe(0, 0, 0, 0));
        System.out.println("0 - 0 - 0 - 1 => " + n.verResultadoDe(0, 0, 0, 1));
        System.out.println("0 - 0 - 1 - 0 => " + n.verResultadoDe(0, 0, 1, 0));
        System.out.println("0 - 0 - 1 - 1 => " + n.verResultadoDe(0, 0, 1, 1));
        System.out.println("0 - 1 - 0 - 0 => " + n.verResultadoDe(0, 1, 0, 0));
        System.out.println("0 - 1 - 0 - 1 => " + n.verResultadoDe(0, 1, 0, 1));
        System.out.println("0 - 1 - 1 - 0 => " + n.verResultadoDe(0, 1, 1, 0));
        System.out.println("0 - 1 - 1 - 1 => " + n.verResultadoDe(0, 1, 1, 1));
        System.out.println("1 - 0 - 0 - 0 => " + n.verResultadoDe(1, 0, 0, 0));
        System.out.println("1 - 0 - 0 - 1 => " + n.verResultadoDe(1, 0, 0, 1));
        System.out.println("1 - 0 - 1 - 0 => " + n.verResultadoDe(1, 0, 1, 0));
        System.out.println("1 - 0 - 1 - 1 => " + n.verResultadoDe(1, 0, 1, 1));
        System.out.println("1 - 1 - 0 - 0 => " + n.verResultadoDe(1, 1, 0, 0));
        System.out.println("1 - 1 - 0 - 1 => " + n.verResultadoDe(1, 1, 0, 1));
        System.out.println("1 - 1 - 1 - 0 => " + n.verResultadoDe(1, 1, 1, 0));
        System.out.println("1 - 1 - 1 - 1 => " + n.verResultadoDe(1, 1, 1, 1));

        return retorno;
    }

    public double verResultadoDe(double x1, double x2) {
        
        return this.n.verResultadoDe(x1, x2);
        
    }
    public double verResultadoDe(double x1, double x2, double x3, double x4) {
        
        return this.n.verResultadoDe(x1, x2, x3, x4);
        
    }

}
