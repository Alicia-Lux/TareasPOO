public abstract class InstrumentoDeMedicion {
    protected String nombre;
    protected String unidadMedida;
    protected double valorActual;
    
    public InstrumentoDeMedicion(){
    }

    public InstrumentoDeMedicion(String nombre, String unidadMedida, double valorActual){
        setNombre(nombre);
        setvalorActual(valorActual);
        setunidadMedida(unidadMedida);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
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