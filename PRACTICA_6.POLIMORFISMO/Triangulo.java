public class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    public Triangulo(double lado1, double lado2, double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        //Código para dibujar un triángulo
        System.out.println("Dibujando un Triángulo");
    }
    
    public double calcularArea() {
        //Codigo para calcular el área de un triángulo
        return (base * altura) / 2;
    }
    
    public double calcularPerimetro() {
        //Código para calcular el perímetro de un triángulo
        return lado1 + lado2 + base;
    }
    
}
