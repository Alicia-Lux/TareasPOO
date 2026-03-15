public class PaqueteLogistico {

    // Atributos privados
    private double peso;
    private String destino;

    // Constructor que recibe el destino
    public PaqueteLogistico(String destino) {
        this.destino = destino;
    }

    // Getter de peso
    public double getPeso() {
        return peso;
    }

    // Setter de peso con programación defensiva
    public void setPeso(double peso) {
        if (peso >= 0.1 && peso <= 500) {
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
}