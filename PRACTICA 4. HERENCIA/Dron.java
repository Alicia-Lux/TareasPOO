public class Dron extends VehiculoLogistico {
    private double bateria;

    public Dron(String placa, double capacidadCarga, double valocidadPromedio, double bateria){
        super(placa, capacidadCarga, valocidadPromedio);
        this.bateria = bateria;
    }
    @Override
    public double calcularCostoViaje(double distancia){
        return distancia * (100 - bateria) * 0.2;
    }

}
