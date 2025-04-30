import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EstudianteTest {

    @Test
    void testToString() {
        Estudiante estudiante = new Estudiante("Laura", 22);
        assertEquals("Estudiante{nombre='Laura', edad=22}", estudiante.toString());
    }
}