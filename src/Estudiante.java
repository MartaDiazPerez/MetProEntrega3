public class Estudiante {
   /**ATRIBUTOS*/
    private String nombre;
    private int edad;

    /**METODOS*/
    //Metodo constructor que inicializa un objeto Estudiante con nombre y edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Metodo toString que devuelve la cadena de texto con la edad y el nombre del estudiante
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
