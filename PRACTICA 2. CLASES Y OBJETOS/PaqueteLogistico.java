public class PaqueteLogistico {
    //Atributos
    private int idPaquete;
    private double peso;
    private String destino;
    private String destinatario;
    private String etiquetaUnica;

    //Constructor
    public PaqueteLogistico(int idPaquete, double peso, String destino, String destinatario) {
        this.idPaquete = idPaquete;
        setPeso(peso);
        setDestino(destino);
        setDestinatario(destinatario);
        this.etiquetaUnica = "ETQ" + idPaquete;
    }

    //getters
    public int getIdPaquete(){
        return idPaquete;
    }
    public double getPeso(){
        return peso;
    }
    public String getDestino(){
        return destino;
    }
    public String getDestinatario() {
    return destinatario;
    }
    public String getEtiquetaUnica(){
        return etiquetaUnica;
    }

    //Validacion 
    public void setPeso (double peso) {
        if (peso >= 0.1 && peso <= 500) {
        this.peso = peso;
    } else {
        System.out.println("Peso inválido. Se asigna valor seguro.");
        this.peso = 0.1;
    }
    }
    public void setDestino (String destino) {
        if (destino == null || destino.trim().isEmpty()) {
        System.out.println("Destino inválido");
        this.destino = "SIN DESTINO";
    } else {
        this.destino = destino;
    }
    }
    public void setDestinatario (String destinatario) {
        if (destinatario == null || destinatario.trim().isEmpty()) {
            System.out.println("Destinatario inválido");
            this.destinatario = "DESCONOCIDO";
        } else {
            this.destinatario = destinatario;
        }
    }
}
