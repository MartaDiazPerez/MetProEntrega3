import java.util.List;

public class Asignatura {
    private String nombreAsignatura;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombreAsignatura, List<Estudiante> estudiantes) {
        this.nombreAsignatura = nombreAsignatura;
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombreAsignatura='" + nombreAsignatura + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}
