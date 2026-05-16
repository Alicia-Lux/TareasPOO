public class PaqueteLogistico {

    // Atributos privados
    private double peso;
    private String destino;

    // Constructor que recibe el destino
    public PaqueteLogistico(String destino) {
        if (destino != null && !destino.isEmpty()) {
            this.destino = destino;
        } else {
            System.out.println("Error: El destino no puede ser nulo o vacío.");
        }
    }

    // Getter de peso
    public double getPeso() {
        return peso;
    }

    // Setter de peso con programación defensiva
    public void setPeso(double peso) {
        if (peso >= 1 && peso <= 500) {
            this.peso = peso;
        } else {
            System.out.println("Error: El peso debe estar entre 0.1 y 500 kg.");
        }
    }

    // Getter de destino
    public String getDestino() {
        return destino;
    }

    // Setter de destino con validación
    public void setDestino(String destino) {
        if (destino != null && !destino.isEmpty()) {
            this.destino = destino;
        } else {
            System.out.println("Error: El destino no puede estar vacío.");
        }
    }

    // Método que calcula el costo extra según la prioridad
    public double calcularCostoExtra(String prioridad) {

        if (prioridad == null || prioridad.trim().isEmpty()) {
            System.out.println("Error: La prioridad no puede ser nula o vacía.");
            return 0;
        }

        prioridad = prioridad.toLowerCase();

        switch (prioridad) {
            case "alta":
                return 150.0;
            case "media":
                return 80.0;
            case "baja":
                return 30.0;
            default:
                System.out.println("Error: Prioridad no válida. Use Alta, Media o Baja.");
                return 0;
        }
    }
}