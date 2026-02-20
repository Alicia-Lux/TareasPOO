public class VehiculoLogistico {
    
    protected String placa;
    protected double capacidadCarga;
    protected double velocidadPromedio;
    protected boolean activo;

    public VehiculoLogistico(String placa, double capacidadCarga, double velocidadPromedio){
        this.placa = placa;
        this.capacidadCarga = capacidadCarga;
        this.velocidadPromedio = velocidadPromedio;
        this.activo = false;
    }
    //Getters y setters 
    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public double getCapacidadCarga(){
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
    }

    public double getVelocidadPromedio(){
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio){
        this.velocidadPromedio = velocidadPromedio;
    }

    public void activarVehiculo(){
        activo = true;
    }

    public void desactivarVehiculo(){
        activo = false;
    }

    public double calcularDiatanciaMaxima(){
        return velocidadPromedio * 8;
    }

    public double calcularCostoViaje(double distancia){
        return distancia * 10;
    }
}
