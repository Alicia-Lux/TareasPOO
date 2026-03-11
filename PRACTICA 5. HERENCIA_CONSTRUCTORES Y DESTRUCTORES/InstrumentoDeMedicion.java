public abstract class InstrumentoDeMedicion {
    private String nombre;
    private String unidadMedida;
    private double valorActual;
    
    public InstrumentoDeMedicion(){

    }

    public InstrumentoDeMedicion(String nombre, String unidadMedida, double valorActual){
    }

    public String getnombre(){
        return nombre;
    }
    public void setnombre(String nombre){
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public String getunidadMedida(){
        return unidadMedida;
    }
    public void setunidadMedida(String unidadMedida){
        this.unidadMedida = unidadMedida;
    }

    public double getvalorActual(){
        return valorActual;
    }
    public void setvalorActual(double valorActual){
        if (valorActual >= 0) {
            this.valorActual = valorActual;
        }
    }
    public abstract void medir();
}
