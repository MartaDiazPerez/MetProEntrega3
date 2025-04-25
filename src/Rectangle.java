
//creo la clase rectangle con sus metodos y atributos
public class Rectangle {
    /**ATRIBUTOS**/
    //creo los atributos privados largo(lenght) y ancho(width)
    private float length;
    private float width;
    /**METODOS**/
    //crea un rectangulo con los valores por defecto
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }
    //crea un rectangulo con los valores que yo le introduzca al crearlo de la forma : Rectangle r1= new Rectangle(largo,ancho)
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    //GETTERS Y SETTERS
    //me devuelve el largo del rectangulo
    public float getLength() {
        return length;
    }
    //establece el valor del largo del rectangulo
    public void setLength(float length) {
        this.length = length;
    }
    //devuelve el ancho del rectangulo
    public float getWidth() {
        return width;
    }
    //establece el ancho del rectangulo
    public void setWidth(float width) {
        this.width = width;
    }
    //calcula el area atraves de la forma y me la devuelve
    public double getArea() {
        return length * width;
    }
    //calcula el perimetro con la formula y me le devuelve
    public double getPerimeter(){
        return 2*length+2*width;
    }
    //imprime el rectangulo con sus medidas de largo y ancho
    @Override
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + "]";
    }

}
