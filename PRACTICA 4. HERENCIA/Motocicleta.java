public class Motocicleta extends VehiculoLogistico {

    private int cilindraje;
    private double consumoGasolina;
    private String tipoCasco;

    public Motocicleta(String placa, double capacidadCarga, int cilindraje, double consumoGasolina, String tipoCasco) {
        super(placa, capacidadCarga);
        this.cilindraje = cilindraje;
        this.consumoGasolina = consumoGasolina;
        this.tipoCasco = tipoCasco;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getConsumoGasolina() {
        return consumoGasolina;
    }

    public void setConsumoGasolina(double consumoGasolina) {
        this.consumoGasolina = consumoGasolina;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        this.tipoCasco = tipoCasco;
    }

    // Override
    @Override
    public double calcularAutonomia() {
        return cilindraje * 0.3;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * consumoGasolina;
    }
}