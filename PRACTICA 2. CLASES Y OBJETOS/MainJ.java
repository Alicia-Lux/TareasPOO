public class MainJ {
    public static void main(String[] args) {

        // Crear instancia del paquete
        PaqueteLogistico paquete = new PaqueteLogistico("Merida");

        // Intentar asignar un peso inválido
        paquete.setPeso(-50);

        // Intentar asignar un destino vacío
        paquete.setDestino("");

        // Mostrar estado actual del objeto
        System.out.println("Peso actual del paquete: " + paquete.getPeso());
        System.out.println("Destino actual del paquete: " + paquete.getDestino());

    }
}