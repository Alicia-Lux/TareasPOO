public class Camion extends VehiculoLogistico {
    private int numeroEjes;

    public Camion(String placa, double capacidadCarga, double velocidadPromedio, int numeroEjes) {
        super(placa, capacidadCarga, velocidadPromedio);
        this.numeroEjes = numeroEjes;
    }
    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * numeroEjes * 5;
    }
}
