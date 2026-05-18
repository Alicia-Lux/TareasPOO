public class Triangulo extends FiguraGeometrica {
    //Es para un triangulo Rectangulo.
    // Atributos
    private int lado1;
    private int lado2;
    private int base;
    private int altura;

    // Constructor
    public Triangulo(int lado1, int lado2, int base, int altura) {
        setLado1(lado1);
        setLado2(lado2);
        setBase(base);
        setAltura(altura);
    }
    // Getters y Setters
    public int getLado1() {
        return lado1;
    }
    public void setLado1(int lado1) {
        if(lado1 <= 0) {
            throw new IllegalArgumentException("El lado debe ser un número positivo.");
        }
        this.lado1 =lado1;
    }

    public int getLado2() {
        return lado2;
    }
    public void setLado2(int lado2) {
        if(lado2 <= 0) {
            throw new IllegalArgumentException("EL lado debe ser un numero positivo.");
        }
        this.lado2 = lado2;
    }

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        if(base <= 0) {
            throw new IllegalArgumentException("La base debe ser un numero positivo.");
        }
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("La altura debe ser un numero positivo.");
        }
        this.altura = altura;
    }
    // Metodos abstractos
    @Override
    public void dibujar(){
        System.out.println("Dibujando un triangulo.");
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + base;
    }
}
