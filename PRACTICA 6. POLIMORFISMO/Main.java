import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("--------------MENU DE FIGURAS GEOMETRICAS--------------");
            System.out.println("1. Círculo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Salir");

            opcion = sc.nextInt();

            FiguraGeometrica figura = null;

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = sc.nextDouble();
                        figura = new Circulo(radio);
                        break;
                    case 2:
                        System.out.print("Ingrese la base del rectángulo: ");
                        int base = sc.nextInt();
                        System.out.print("Ingrese la altura del rectángulo: ");
                        int altura = sc.nextInt();
                        figura = new Rectangulo(base, altura);
                        break;
                    case 3:
                        System.out.print("Ingrese la base del triángulo: ");
                        int baseTriangulo = sc.nextInt();
                        System.out.print("Ingrese el lado 1 del triángulo: ");
                        int lado1 = sc.nextInt();
                        System.out.print("Ingrese el lado 2 del triángulo: ");
                        int lado2 = sc.nextInt();
                        System.out.print("Ingrese la altura del triángulo: ");
                        int alturaTriangulo = sc.nextInt();
                        figura = new Triangulo(baseTriangulo, lado1, lado2, alturaTriangulo);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción correcta.");
                    }
                    // Polimorfismo: Llamada a los métodos de la figura geométrica seleccionada
                    if (figura != null) {
                        System.out.println();
                        figura.dibujar();
                        System.out.println("Área: " + figura.calcularArea());
                        System.out.println("Perímetro: " + figura.calcularPerimetro()); 
                        } 
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Ocurrió un error inesperado: " + e.getMessage());
                    sc.nextLine(); // Limpiar el buffer de entrada
                }
        } while (opcion != 4); 
                sc.close();
    }
}
