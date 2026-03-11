public class Main {
    public static void main(String[] args) {
        Velocimetro v = new Velocimetro("Velocimetro Digital", "Toyota");
        v.setvalorActual(120);
        v.medir();

        Tacometro t = new Tacometro("Tacometro Digital", "Nissan");
        t.setvalorActual(3500);
        t.medir();

        Termometro term = new Termometro("Termometro Motor", "Bosch");
        term.setColor("Negro");
        term.setBotonOnOff(true);
        term.setvalorActual(90);
        term.medir();
    }
}
