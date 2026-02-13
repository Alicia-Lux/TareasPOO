import java.util.ArrayList;
import java.util.Random;

public class TermometroDigital {
    private String marca;
    private boolean encendido;
    private double temperaturaActual;
    private String unidad;
    private ArrayList<Double> historialTemperaturas;

    public TermometroDigital (String marca) {
        this.marca = marca;
        this.encendido = false;
        this.unidad = "C";
        historialTemperaturas = new ArrayList<>();
    }
     public TermometroDigital(){
        this.marca = "";
        this.encendido = false;
        this.unidad = "C";
        historialTemperaturas = new ArrayList<>();
     }

     public String getMarca() {return marca;}
     public void setMarca(String marca){this.marca = marca;}
    
     public String getUnidad() {return unidad;}
     public void setUnidad(String unidad){this.unidad = unidad;}
     
    
}