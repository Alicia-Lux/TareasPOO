import java.util.ArrayList;

public class OperacionesDivision {

    private ArrayList<Integer> numeros1;
    private ArrayList<Integer> numeros2;
    private ArrayList<Double> resultados;

    // Constructor
    public OperacionesDivision() {
        numeros1 = new ArrayList<>();
        numeros2 = new ArrayList<>();
        resultados = new ArrayList<>();
    }

    // GETTERS
    public ArrayList<Integer> getNumeros1() {
        return numeros1;
    }

    public ArrayList<Integer> getNumeros2() {
        return numeros2;
    }

    public ArrayList<Double> getResultados() {
        return resultados;
    }

    // SETTERS
    public void setNumeros1(ArrayList<Integer> numeros1) {
        this.numeros1 = numeros1;
    }

    public void setNumeros2(ArrayList<Integer> numeros2) {
        this.numeros2 = numeros2;
    }

    public void setResultados(ArrayList<Double> resultados) {
        this.resultados = resultados;
    }

    // Método completo con TODAS las excepciones
    public void agregarOperacion(int num1, int num2) throws ValorFueraDeRango {

        // Validación (b)
        if (num1 > 100 || num2 > 100) {
            throw new ValorFueraDeRango("Error: Los números no deben ser mayores a 100");
        }

        try {
            double resultado = num1 / num2;

            numeros1.add(num1);
            numeros2.add(num2);
            resultados.add(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
            e.printStackTrace();

        } catch (NullPointerException e) {
            System.out.println("Error: Problema al almacenar datos.");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Error inesperado.");
            e.printStackTrace();

        } finally {
            System.out.println("Operación procesada.\n");
        }
    }

    // Mostrar resultados
    public void mostrarResultados() {
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < resultados.size(); i++) {
            System.out.println(numeros1.get(i) + " / " + numeros2.get(i) + " = " + resultados.get(i));
        }
    }
}