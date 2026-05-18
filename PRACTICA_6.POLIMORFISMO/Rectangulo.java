public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        //Código para dibujar un rectángulo
        System.out.println("Dibujando un Rectángulo");
    }
    
    public double calcularArea() {
        //Codigo para calcular el área de un rectángulo
        return base * altura;
    }
    
    public double calcularPerimetro() {
        //Código para calcular el perímetro de un rectángulo
        return 2 * (base + altura);
    }
    
}
