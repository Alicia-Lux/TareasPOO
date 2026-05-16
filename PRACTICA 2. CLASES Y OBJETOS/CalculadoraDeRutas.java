public class CalculadoraDeRutas {

    public double calcularCosto(double distancia) {
        // costo base por km
        return distancia * 5;
    }

    //Método que calcula el costo con distancia y peso
    public double calcularCosto(double distancia, double peso) {
        // costo por km + costo por peso
        return (distancia * 5) + (peso * 2);
    }

    //Método que calcula el costo con distancia, peso y tipo de combustible
    public double calcularCosto(double distancia, double peso, String combustible) {

        double costoBase = (distancia * 5) + (peso * 2);

        if (combustible == null || combustible.isEmpty()) {
            return costoBase;
        }

        combustible = combustible.toLowerCase();

        switch (combustible) {
            case "diesel":
                return costoBase + 50;
            case "gasolina":
                return costoBase + 70;
            case "electrico":
                return costoBase + 30;
            default:
                return costoBase;
        }
    }
}