public class TermometroDigital {

    private String marca;
    private boolean encendido;
    private double temperaturaActual;
    private String unidad;
    private double[] historialTemperaturas;

    // Constructor
    public TermometroDigital(String marca) {
        this.marca = marca;
        this.encendido = false;
        this.temperaturaActual = 0.0;
        this.unidad = "C";
        this.historialTemperaturas = new double[10];
    }
    // Constructor por defecto
    public TermometroDigital() {
     marca = "Samsung";
     encendido = false;
     unidad = "C";
     historialTemperaturas = new double[10];
}

    // Métodos GET
    public String getMarca() {
        return marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public double getTemperaturaActual() {
        return temperaturaActual;
    }

    public String getUnidad() {
        return unidad;
    }

    public double[] getHistorialTemperaturas() {
        return historialTemperaturas;
    }

    // Métodos SET
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setTemperaturaActual(double temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setHistorialTemperaturas(double[] historialTemperaturas) {
        this.historialTemperaturas = historialTemperaturas;
    }

    // Comportamientos
    public void prender() {
        encendido = true;
        System.out.println("El termómetro está encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El termómetro está apagado.");
    }

    public void medirTemperatura() {
        if (encendido) {
            temperaturaActual = 35 + (Math.random() * 5);
            System.out.println("Temperatura medida: " + temperaturaActual + " " + unidad);
        } else {
            System.out.println("El termómetro está apagado.");
        }
    }

      // Método sobrecargado
    public void medirTemperatura(double temperaturaManual) {
        if (encendido) {
            temperaturaActual = temperaturaManual;
            System.out.println("Temperatura ingresada manualmente: " + temperaturaActual + " " + unidad);
        } else {
            System.out.println("El termómetro está apagado.");
        }
    }

    public void convertirUnidad(String nuevaUnidad) {
        if (unidad.equals("C") && nuevaUnidad.equals("F")) {
            temperaturaActual = (temperaturaActual * 9 / 5) + 32;
            unidad = "F";
        } else if (unidad.equals("F") && nuevaUnidad.equals("C")) {
            temperaturaActual = (temperaturaActual - 32) * 5 / 9;
            unidad = "C";
        }
    }

    public void calcularEstadisticas() {
        double suma = 0;

        for (double temp : historialTemperaturas) {
            suma += temp;
        }

        double promedio = suma / historialTemperaturas.length;

        System.out.println("Promedio de temperaturas: " + promedio);
    }
}