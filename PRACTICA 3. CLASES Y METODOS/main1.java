public class main1 {
    public static void main(String[] args) {

        // Crear una instancia del termómetro
        TermometroDigital termometro = new TermometroDigital();

        // Mostrar marca
        System.out.println("Marca del termómetro: " + termometro.getMarca());

        // Encender el termómetro
        termometro.prender();

        // Medir temperatura
        termometro.medirTemperatura();

        // Cambiar unidad de Celsius a Fahrenheit
        termometro.convertirUnidad("F");
        System.out.println("Unidad actual: " + termometro.getUnidad());
        System.out.println("Temperatura convertida: " + termometro.getTemperaturaActual());

        // Medir temperatura manual usando el método sobrecargado
        termometro.medirTemperatura(37.5);

        // Apagar termómetro
        termometro.apagar();
    }
}