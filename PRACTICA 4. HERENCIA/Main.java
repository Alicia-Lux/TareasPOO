public class Main {
    public static void main(String[] args) {
        VehiculoLogistico v1 = new VehiculoLogistico("placa", 0, 0);
        VehiculoLogistico v2 = new Camion("placa", 0, 0, 0);
        VehiculoLogistico v3 = new Dron("placa", 0, 0, 0);
        VehiculoLogistico v4 = new Motocicleta("placa", 0, 0, 0);

        System.out.println("Base: " + v1.calcularCostoViaje(100));
        System.out.println("Camion: " + v2.calcularCostoViaje(200));
        System.out.println("Drone: "+ v3.calcularCostoViaje(125));
        System.out.println("Motocicleta: " + v4.calcularCostoViaje(160));
    }
}
