public class OperadorLogistico {

    // Atributos de la clase
    private String nombre;
    private int edad;

    // Constructor
    public OperadorLogistico(String nombre, int edad) {
        /*
        Cuando se crea un objeto con la palabra new:
        OperadorLogistico operador = new OperadorLogistico("Luis", 25);

         Java reserva espacio en memoria para el objeto, el constructor se ejecuta automáticamente y asi se inicializan los
         atributos para que el objeto tenga datos válidos desde el momento en que "nace".
        */

        // "this" se refiere al objeto actual que se está creando.
        // Permite diferenciar entre el atributo de la clase y el parámetro recibido.
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método que simula el crecimiento del operador
    public void crecer() {
        /*
        Este método modifica el estado del objeto.
        Cada vez que se llama, la edad aumenta en 1 año.
        Se usa "this.edad" para indicar que estamos modificando
        el atributo del objeto actual.
        */
        this.edad++;
    }

    // Getter de nombre
    public String getNombre() {
        return nombre;
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }
}