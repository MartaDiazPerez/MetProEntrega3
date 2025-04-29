package AlumnoApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void testToString() {
        // Crear un objeto Alumno con datos de ejemplo
        Alumno alumno = new Alumno("Laura Rubio", 18, "Enfermería", 9.1);
        // Verificar que la cadena resultante contenga los valores esperados
        assertEquals("Alumno{Laura Rubio, 18, Enfermería, 9.1}", alumno.toString());
    }
}