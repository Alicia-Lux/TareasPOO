public class Dron extends VehiculoLogistico {

    private double altitudMaxima;
    private double autonomiaVuelo;
    private String tipoCamara;

    public Dron(String placa, double capacidadCarga, double altitudMaxima, double autonomiaVuelo, String tipoCamara) {
        super(placa, capacidadCarga);
        this.altitudMaxima = altitudMaxima;
        this.autonomiaVuelo = autonomiaVuelo;
        this.tipoCamara = tipoCamara;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public double getAutonomiaVuelo() {
        return autonomiaVuelo;
    }

    public void setAutonomiaVuelo(double autonomiaVuelo) {
        this.autonomiaVuelo = autonomiaVuelo;
    }

    public String getTipoCamara() {
        return tipoCamara;
    }

    public void setTipoCamara(String tipoCamara) {
        this.tipoCamara = tipoCamara;
    }

    // Override
    @Override
    public double calcularAutonomia() {
        return autonomiaVuelo;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * 1.5;
    }
}