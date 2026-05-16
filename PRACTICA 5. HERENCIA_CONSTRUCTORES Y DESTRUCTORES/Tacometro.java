public class Tacometro extends InstrumentoDeMedicion {

    private String marca;

    public Tacometro (String nombre, String marca){
        super(nombre, "RPM",0);
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
        System.out.println("Revoluciones del motor: " + valorActual + " " + unidadMedida);;
    }
}
