import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class AsignaturaTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        // Se crean los objetos Estudiante con nombre y apellido
        Estudiante e1 = new Estudiante("María", 18);
        Estudiante e2 = new Estudiante("Marta", 19);
        List<Estudiante> estudiantes = Arrays.asList(e1, e2);

        // Se crea la Asignatura con un nombre y la lista de estudiantes
        Asignatura asignatura = new Asignatura("Matemáticas", estudiantes);

        assertEquals("Asignatura{nombreAsignatura='Matemáticas', estudiantes=[Estudiante{nombre='María', edad=18}, Estudiante{nombre='Marta', edad=19}]}", asignatura.toString());

    }
}