public class Main {

    public static void main(String[] args) {

        // 1. Instancia de la clase base
        VehiculoLogistico vehiculo = new VehiculoLogistico("BASE001", 500);

        // 2. Instancias de clases derivadas
        Camion camion = new Camion("CAM123", 10000, 6, "Diesel");
        Dron drone = new Dron("DRN001", 50, 500, 120, "4K");
        Motocicleta moto = new Motocicleta("MOTO01", 200, 250, 0.8, "Integral");

        // 3. Llamar métodos de cálculo

        System.out.println("=== Vehiculo Base ===");
        System.out.println("Autonomia: " + vehiculo.calcularAutonomia());
        System.out.println("Costo de viaje (100 km): " + vehiculo.calcularCostoViaje(100));

        System.out.println("\n=== Camion ===");
        System.out.println("Autonomia: " + camion.calcularAutonomia());
        System.out.println("Costo de viaje (100 km): " + camion.calcularCostoViaje(100));

        System.out.println("\n=== Drone ===");
        System.out.println("Autonomia: " + drone.calcularAutonomia());
        System.out.println("Costo de viaje (100 km): " + drone.calcularCostoViaje(100));

        System.out.println("\n=== Motocicleta ===");
        System.out.println("Autonomia: " + moto.calcularAutonomia());
        System.out.println("Costo de viaje (100 km): " + moto.calcularCostoViaje(100));

    }
}