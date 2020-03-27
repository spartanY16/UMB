package umb.ai.pib;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import umb.ai.perceptron.model.Perceptron;

@ManagedBean
@SessionScoped
public class ProductoInternoBruto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    public ProductoInternoBruto(){
        
    }

    //VARIABLES DEL PIB
    private final static List<String> anios;
    private final static List<String> consumoFinal;
    private final static List<String> formacionBruta;
    private final static List<String> exportaciones;
    private final static List<String> importaciones;
    private final static List<String> pib;



    static {
        anios = new ArrayList<>();
        consumoFinal = new ArrayList<>();
        formacionBruta = new ArrayList<>();
        exportaciones = new ArrayList<>();
        importaciones = new ArrayList<>();
        pib = new ArrayList<>();
 
        anios.add("2005");
        anios.add("2006");
        anios.add("2007");
        anios.add("2008");
        anios.add("2009");
        anios.add("2010");
        anios.add("2011");
        anios.add("2012");
        anios.add("2013");
        anios.add("2014");
        anios.add("2015");
        anios.add("2016");
        anios.add("2017");
        anios.add("2018");
        anios.add("2019");
        
        consumoFinal.add("419.077");
        consumoFinal.add("444.943");
        consumoFinal.add("472.591");
        consumoFinal.add("492.507");
        consumoFinal.add("503.416");
        consumoFinal.add("529.002");
        consumoFinal.add("558.993");
        consumoFinal.add("589.694");
        consumoFinal.add("621.266");
        consumoFinal.add("648.134");
        consumoFinal.add("670.201");
        consumoFinal.add("681.101");
        consumoFinal.add("696.973");
        consumoFinal.add("722.941");
        consumoFinal.add("755.975");
        
        formacionBruta.add("86.720");
        formacionBruta.add("101.405");
        formacionBruta.add("117.424");
        formacionBruta.add("128.090");
        formacionBruta.add("120.026");
        formacionBruta.add("131.503");
        formacionBruta.add("155.852");
        formacionBruta.add("160.351");
        formacionBruta.add("172.869");
        formacionBruta.add("193.533");
        formacionBruta.add("191.305");
        formacionBruta.add("190.994");
        formacionBruta.add("184.828");
        formacionBruta.add("188.643");
        formacionBruta.add("196.673");
        
        exportaciones.add("88.125");
        exportaciones.add("96.513");
        exportaciones.add("102.516");
        exportaciones.add("104.604");
        exportaciones.add("99.158");
        exportaciones.add("101.203");
        exportaciones.add("113.608");
        exportaciones.add("118.690 ");
        exportaciones.add("124.241");
        exportaciones.add("123.882");
        exportaciones.add("125.936 ");
        exportaciones.add("125.673");
        exportaciones.add("128.902");
        exportaciones.add("129.998");
        exportaciones.add("134.072");
        
        importaciones.add("78.708");
        importaciones.add("92.625");
        importaciones.add("105.461");
        importaciones.add("118.656");
        importaciones.add("108.395");
        importaciones.add("120.134");
        importaciones.add("144.436");
        importaciones.add("157.977");
        importaciones.add("171.443");
        importaciones.add("184.747");
        importaciones.add("182.750");
        importaciones.add("176.279");
        importaciones.add("178.075");
        importaciones.add("188.389");
        importaciones.add("205.677");
        
        pib.add("514.853");
        pib.add("549.435");
        pib.add("586.457");
        pib.add("605.713");
        pib.add("612.616");
        pib.add("640.151");
        pib.add("684.628");
        pib.add("711.415");
        pib.add("747.939");
        pib.add("781.589");
        pib.add("804.692");
        pib.add("821.489");
        pib.add("832.656");
        pib.add("853.600");
        pib.add("881.958");

    }

    public List<String> getAnios() {
        return anios;
    }

    public List<String> getConsumoFinal() {
        return consumoFinal;
    }

    public List<String> getFormacionBruta() {
        return formacionBruta;
    }

    public List<String> getExportaciones() {
        return exportaciones;
    }

    public List<String> getImportaciones() {
        return importaciones;
    }

    public List<String> getPib() {
        return pib;
    }

}
