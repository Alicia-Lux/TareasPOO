public class Camion extends VehiculoLogistico {

    private int numeroEjes;
    private String tipoCombustible;

    public Camion(String placa, double capacidadCarga, int numeroEjes, String tipoCombustible) {
        super(placa, capacidadCarga);
        this.numeroEjes = numeroEjes;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    // Override
    @Override
    public double calcularAutonomia() {
        return capacidadCarga * 0.5;
    }

    @Override
    public double calcularCostoViaje(double distancia) {
        return distancia * 5;
    }
}