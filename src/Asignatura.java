import java.util.List;

public class Asignatura {
    /**ATRIBUTOS*/
    private String nombreAsignatura;
    private List<Estudiante> estudiantes; //Crea una lista con los estudiantes asociados

    /**METODOS*/
    //Metodo constructor que inicializa una Asignatura con su nombre y lista de estudiantes
    public Asignatura(String nombreAsignatura, List<Estudiante> estudiantes) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = estudiantes;
    }
    //Metodo toString que devuelve una cadena de texto con el nombre y el listado de alumnos de la asignatura
    @Override
    public String toString() {
        return "Asignatura{" +
                "nombreAsignatura='" + nombreAsignatura + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
