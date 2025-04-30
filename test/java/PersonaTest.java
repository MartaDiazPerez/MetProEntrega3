import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PersonaTest {

    //Comprobamos que la funcion nombre lo devuelve correctamente
    @Test
    void getNombre() {
        Persona persona = new Persona("Isabela", 20);
        assertEquals("Isabela", persona.getNombre());
    }
    //Comprobamos que se pueda modificar un nombre y que lo devuelva correctamente
    @Test
    void setNombre() {
        Persona persona = new Persona("Isabela", 20);
        persona.setNombre("Juana");
        assertEquals("Juana", persona.getNombre());
    }
    //Comprobamos que la funcion edad lo devuelve correctamente
    @Test
    void getEdad() {
        Persona persona = new Persona("Isabela", 20);
        assertEquals(20, persona.getEdad());
    }
    //Comprobamos que se pueda modificar la edad y que lo devuelva correctamente
    @Test
    void setEdad() {
        Persona persona = new Persona("Isabela", 20);
        persona.setEdad(23);
        assertEquals(23, persona.getEdad());
    }
}