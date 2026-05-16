public class Main {

    public static void main(String[] args) {
    FiguraGeometrica figura = new Circulo(10);
    figura.dibujar();
    figura.calcularArea();
    figura.calcularPerimetro();
    
    System.out.println("-----------------------------");
    System.out.println(figura.calcularArea());
    System.out.println(figura.calcularPerimetro());
    System.out.println("-----------------------------");
    }
}
