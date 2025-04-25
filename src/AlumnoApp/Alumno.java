package AlumnoApp;

public class Alumno {
    String nombre;
    int edad;
    String carrera;
    double notaMedia;

    public Alumno(String nombre, int edad, String carrera, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.notaMedia = notaMedia;
    }

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
