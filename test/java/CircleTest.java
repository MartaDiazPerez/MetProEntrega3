import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    //creo el circulo por defecto  con radio 1 y compruebo que el getRadius de c1 es igual que el 1
    void getRadius() {
        Circle c1 = new Circle();
        assertEquals(c1.getRadius(),1);
    }
    //cambio el radio del circulo 1 que era radio=1 y le doy valor radio =2 , ahora compruebo que 2 es igual
    //a c1.getRadius que me devuelve el radio de c1 despues de haber hecho el set
    @Test
    void setRadius() {
        Circle c1=new Circle();
        c1.setRadius(2);
        assertEquals(c1.getRadius(),2);
    }
    //compruebo que el getArea para el circulo 1 con radio =1 sea igual a 1*1*Math.PI
    @Test
    void getArea() {
        Circle c1=new Circle();
        assertEquals(c1.getArea(),Math.PI);
    }
    //compruebo que el getCircumference sea igual a 2*Math.PI*1 ya que el radio del circulo c1 es 1 ya que
    //esta creado por defecto
    @Test
    void getCircumference() {
        Circle c1=new Circle();
        assertEquals(c1.getCircumference(),2*Math.PI);
    }
    //pruebo que el toString me devuelva lo que me deberia de devolver
    @Test
    void testToString() {
        Circle c1=new Circle();
        assertEquals(c1.toString(),"Circle[radius=" + c1.getRadius() + "]");
    }
}