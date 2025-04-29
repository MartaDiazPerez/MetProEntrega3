import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {

    //Comprobar que se devuelve la cadena de texto correctamente
    @Test
    void testToString() {
        Estudiante estudiante = new Estudiante("Laura", 25);
        assertEquals("Estudiante{nombre='Laura', edad=22}", estudiante.toString());
    }
}