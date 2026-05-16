public class Main5 {

    public static void main(String[] args) {

        Velocimetro v1 = new Velocimetro("Velocimetro Digital", "Toyota");
        v1.setvalorActual(120);
        v1.medir();

        Tacometro t1 = new Tacometro("Tacometro Digital", "Nissan");
        t1.setvalorActual(2500);
        t1.medir();

        Termometro term1 = new Termometro("Termometro Motor", "Bosch");
        term1.setColor("Negro");
        term1.setBotonOnOff(true);
        term1.setvalorActual(90);
        term1.medir();

    }
}