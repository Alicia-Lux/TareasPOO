public class Rectangulo extends FiguraGeometrica {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        setBase(base);
        setAltura(altura);
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}