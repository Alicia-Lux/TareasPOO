public class Main {
    public static void main(String[] args) {

        TermometroDigital t1 = new TermometroDigital();
        TermometroDigital t2 = new TermometroDigital("LG");
        
        t1.prender();
        t2.prender();

        t1.medirTemperatura();
        t1.medirTemperatura(25.5);

        t1.convertirUnidad("F");
        
        System.out.println("Unidad: " + t1.getUnidad());
        System.out.println("Temperatura actual: " + t1.getTemperaturaActual());
        System.out.println("Promedio: " + t1.calcularPromedio());
        System.out.println("Máxima: " + t1.obtenerMaxima());
        System.out.println("Mínima: " + t1.obtenerMinima());
    }
}
