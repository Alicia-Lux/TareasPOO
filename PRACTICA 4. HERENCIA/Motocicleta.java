public class Motocicleta extends VehiculoLogistico {
    private int cilindrada;

    public Motocicleta(String placa, double capacidadCarga, double velocidadPromedio, int cilindrada){
        super(placa, capacidadCarga, velocidadPromedio);
        this.cilindrada = cilindrada;
    }
    
    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * cilindrada * 0.05;
    }
}
