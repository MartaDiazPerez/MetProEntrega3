public class Persona {
    /**ATRIBUTOS*/
    private String nombre = "John Doe";
    private int edad = 18;

    /**MÉTODOS*/
    // Constructor que inicializa los atributos con los parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    //Metodo que devuelve el nombre
    public String getNombre() {
        return nombre;
    }
    //Metodo que asigna un nuevo valor del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Metodo que devuelve la edad
    public int getEdad() {
        return edad;
    }
    //Metodo que asigna un nuevo valor de la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
