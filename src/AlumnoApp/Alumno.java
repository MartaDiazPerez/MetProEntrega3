package AlumnoApp;

public class Alumno {
    /**ATRIBUTOS*/
    String nombre;
    int edad;
    String carrera;
    double notaMedia;
    /**METODOS*/
    //Metodo constructor que inicializa el objeto alumno con los datos proporcionados
    public Alumno(String nombre, int edad, String carrera, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.notaMedia = notaMedia;
    }

    //Metodo toString que devuelve una cadena de texto con el nombre, edad
    // carrera y nota media del alumno
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", notaMedia=" + notaMedia +
                '}';
    }
}
