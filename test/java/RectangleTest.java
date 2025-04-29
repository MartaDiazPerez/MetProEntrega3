import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    //pruebo que r1.getLength sea igual a 1 que es el valor por defecto del rectangulo r1
    @Test
    void getLength() {
        Rectangle r1 = new Rectangle();
        assertEquals(r1.getLength(), 1);
    }
    //compruebo que el setLength funciona dandole valor 2 a length y probando que 2 es igual a
    //el valor que me devuelve getLength
    @Test
    void setLength() {
        Rectangle r1 = new Rectangle();
        r1.setLength(2);
        assertEquals(r1.getLength(), 2);
    }
    //compruebo que el getWidth funciona comprobando que el valor de width del rectangle (que en este caso es tres )
    //que sea igual a 3 con el assertEquals
    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(r1.getWidth(), 3);
    }
    //compruebo que el setWidth funciona dandole un valor al ancho del rectangulo en este caso
    //le doy valor 16 y pruebo que 16 sea igual a r1.getWidth que me devuelve el valor de Width despues del set
    @Test
    void setWidth() {
        Rectangle r1 = new Rectangle();
        r1.setWidth(16);
        assertEquals(r1.getWidth(), 16);
    }
    //compruebo que el metodo getArea me devuelva length*width que es 2*3 en este caso
    @Test
    void getArea() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(r1.getArea(), 2*3);
    }
    //compruebo que el metodo getPerimeter me devuelva 2*length+2*width, esto lo hago con el assertEquals
    @Test
    void getPerimeter() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(r1.getPerimeter(), 2*2+2*3);
    }
    //pruebo que el metodo toString me devuelva lo mismo que deberia
    @Test
    void testToString() {
        Rectangle r1 = new Rectangle(2,3);
        assertEquals(r1.toString(), "Rectangle [length=" + r1.getLength() + ", width=" + r1.getWidth() + "]");
    }
}