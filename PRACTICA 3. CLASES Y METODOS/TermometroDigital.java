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

     public double getTemperaturaActual() {return temperaturaActual;}

     public void prender() {encendido = true;}
     public void apagar() {encendido = false;}

        public double medirTemperatura() {
    if (!encendido) {
        throw new IllegalStateException("El termómetro está apagado");
    }

    Random r = new Random();
    temperaturaActual = -10 + (60 * r.nextDouble());
    historialTemperaturas.add(temperaturaActual);
    return temperaturaActual;   
    }
    public double medirTemperatura(double valorManual){
        if (!encendido){
            throw new IllegalStateException("El termometro esta apagado");
        }
        temperaturaActual = valorManual;
        historialTemperaturas.add(temperaturaActual);
        return temperaturaActual;
    }
    public void convertirUnidad(String nuevaUnidad){
        if(!nuevaUnidad.equals("C") && !nuevaUnidad.equals("F")){
            throw new IllegalArgumentException("Unidad invalida. Use 'C' o 'F'");
        }
        if (unidad.equals("C") && !nuevaUnidad.equals("F")){
            temperaturaActual = (temperaturaActual - 32) * 5.0 / 9.0;
        }
        unidad = nuevaUnidad;
    }
    public double calcularPromedio() {
        if (historialTemperaturas.isEmpty()) {
            throw new IllegalStateException("No hay temperaturas registradas");
        }
        double suma = 0;
        for (double t : historialTemperaturas) {
            suma += t;
        }
        return suma / historialTemperaturas.size();
    }
    public double obtenerMaxima() {
        if (historialTemperaturas.isEmpty()){
            throw new IllegalStateException("No hay temperaturas registradas");
        }
        double max = historialTemperaturas.get(0);
        for (double t : historialTemperaturas){
            if (t > max){
                max = t;
            }
        }
        return max;
    }
    public double obtenerMinima() {
        if (historialTemperaturas.isEmpty()) {
            throw new IllegalStateException("No hay temperaturas registradas");
        }
        double min = historialTemperaturas.get(0);
        for (double t : historialTemperaturas){
            if (t < min){
                min = t;
            }
        }
        return min;
    }
}