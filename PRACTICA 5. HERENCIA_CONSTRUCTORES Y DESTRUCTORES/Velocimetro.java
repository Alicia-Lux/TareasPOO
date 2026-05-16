public class Velocimetro extends InstrumentoDeMedicion {

    private String marca;

    public Velocimetro(String nombre, String marca){
        super(nombre, "Km/h",0);
        setMarca(marca);
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        }
    }

    @Override
    public void medir() {
        System.out.println("Velocidad actual: " + valorActual + " " + unidadMedida);
    }
}