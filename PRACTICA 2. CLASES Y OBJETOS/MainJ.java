public class MainJ {
    public static void main(String[] args) {

        PaqueteLogistico paquete = new PaqueteLogistico("Merida");

        paquete.setPeso(50);
        paquete.setDestino("Ciudad de México");

        System.out.println("Peso actual del paquete: " + paquete.getPeso());
        System.out.println("Destino actual del paquete: " + paquete.getDestino());

        CalculadoraDeRutas calculadora = new CalculadoraDeRutas();

        double costo1 = calculadora.calcularCosto(100);
        System.out.println("Costo solo con distancia: " + costo1);

        double costo2 = calculadora.calcularCosto(100, 20);
        System.out.println("Costo con distancia y peso: " + costo2);

        double costo3 = calculadora.calcularCosto(100, 20, "diesel");
        System.out.println("Costo con distancia, peso y combustible: " + costo3);

    }
}