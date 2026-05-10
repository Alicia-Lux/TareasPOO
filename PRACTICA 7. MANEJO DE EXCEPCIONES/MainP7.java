import java.util.Scanner;

public class MainP7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OperacionesDivision op = new OperacionesDivision();

        int num1, num2;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Ingresa el primer número: ");
                num1 = sc.nextInt();

                System.out.print("Ingresa el segundo número: ");
                num2 = sc.nextInt();

                op.agregarOperacion(num1, num2);

                valido = true; // solo se vuelve true si NO hay error

            } catch (ValorFueraDeRango e) {
                System.out.println(e.getMessage());
                System.out.println("Intenta de nuevo...\n");
            }
        }

        op.mostrarResultados();
            sc.close();
    }

}