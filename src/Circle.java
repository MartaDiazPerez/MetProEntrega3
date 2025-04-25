//declaro la clase Circulo
public class Circle {
    //declaro los atributos privados que luego usare para las funciones
    private double radius;

    /** METODOS **/

    //declaro el metodo circulo con los valores por defecto
    public Circle(){
        radius = 1.0;
    }
    //con este metodo puedo crear un nuevo circulo de la forma circle nombre= new Circle(radius)
    //declarando el radio que yo quiera
    public Circle(double radius){
        this.radius = radius;

    }
    // con este metodo puedo obtener el radio de mi circulo de la forma c1.getRadius()
    public double getRadius(){
        return radius;
    }

    //con este metodo puedo obtener el radio de mi circulo de la forma c1.setRadius()
    public void setRadius(double radius){

        this.radius = radius;
    }

    //con este metodo calculo el area de mi circulo a a traves de la formula
    public double getArea(){

        return Math.PI * radius * radius;
    }

    //con este metodo obtengo el perimetro de la circunferencia
    public double getCircumference(){

        return 2 * Math.PI * radius;
    }

    //me imprime el circulo con su radio lo puedo llamar de forma implicita o explicita
    @Override
    public String toString() {

        return "Circle[radius=" + radius + "]";
    }

}
