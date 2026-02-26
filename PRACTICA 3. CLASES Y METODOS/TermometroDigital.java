public class TermometroDigital {

    //Atributos
    private String marca;
    private String color;
    private double valor;      
    private boolean botonOnOff;

    //Constructor
    public TermometroDigital(String marca) {
        this.marca = marca;
        this.color = "Blanco";     
        this.valor = 0.0;
        this.botonOnOff = false;   
    }

    //Métodos GET y SET
    // Marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    // Color
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Valor (temperatura)
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Botón On/Off
    public void setBotonOnOff(boolean botonOnOff) {
        this.botonOnOff = botonOnOff;
    }

    public boolean getBotonOnOff() {
        return botonOnOff;
    }
}