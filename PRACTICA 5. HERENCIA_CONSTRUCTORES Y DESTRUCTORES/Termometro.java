public class Termometro extends InstrumentoDeMedicion {

    private String marca;
    private String color;     
    private boolean botonOnOff;

    public Termometro(String nombre, String marca) {
        super(nombre, "°C",0);
        setMarca(marca);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca){
        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        }
    }

      public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

        public boolean getBotonOnOff() {
        return botonOnOff;
    }
    public void setBotonOnOff(boolean botonOnOff) {
        this.botonOnOff = botonOnOff;
    }

    @Override
    public void medir() {
         if (botonOnOff) {
            System.out.println("Temperatura actual: " + valorActual + " " + unidadMedida);
        } else {
            System.out.println("El termómetro está apagado");
        }
    }
    }