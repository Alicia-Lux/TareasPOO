public class Circulo extends FiguraGeometrica {
    
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        //Código para dibujar un circulo
        System.out.println("Dibujando un círculo");
    }
    
    public double calcularArea() {
        //Codigo para calcular el área de un circulo
        return Math.PI * radio * radio;
    }
    
    public double calcularPerimetro() {
        //Código para calcular el perímetro de un circulo
        return 2 * radio * Math.PI;
    }
    
}