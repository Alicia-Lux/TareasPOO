public class VehiculoLogistico {

    protected String placa;
    protected double capacidadCarga;
    protected double velocidadPromedio;
    protected boolean activo;

    // Constructor
    public VehiculoLogistico(String placa, double capacidadCarga) {
        this.placa = placa;
        this.capacidadCarga = capacidadCarga;
        this.activo = false;
    }

    // GETTERS Y SETTERS
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    // Activar o desactivar
    public void activarVehiculo() {
        activo = true;
    }

    public void desactivarVehiculo() {
        activo = false;
    }

    // Métodos genéricos
    public double calcularAutonomia() {
        return velocidadPromedio * 5;
    }

    public double calcularCostoViaje(double distancia) {
        return distancia * 2;
    }

    public double calcularDistanciaMaxima() {
        return velocidadPromedio * 8;
    }
}