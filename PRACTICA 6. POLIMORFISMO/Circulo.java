public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo con radio: " + radio);
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
