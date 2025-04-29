import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class LeerUsuarioSolo {
    public static void main(String[] args) {
        //Ruta del archivo JSON a leer
        String rutaArchivo = "usuario.json";
        //Llama al metodo cargarObjetoDesdeArchivo para obtener un objeto Usuario desde el archivo
        Usuario usuario = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        //Comprueba si se ha cargado el objeto correctamente
        if (usuario != null) {
            //Imprime por pantalla los datos del usuario desde el archivo JSON
            System.out.println("Datos cargados desde JSON:");
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Edad: " + usuario.edad);
            System.out.println("Correo: " + usuario.correo);
        } else {
            //Si no se han cargado correctamente, imprime un mensaje de error
            System.out.println("No se pudo leer el archivo.");
        }
    }

    // Metodo para leer y convertir un archivo JSON en un objeto de tipo T
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
           //Convierte el contenido del archivo JSON al tipo de objeto especificado
            // return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace(); //Imprime los detalles del error en caso de fallo
            return null;
        }
    }

    //Clase interna que representa la estructura del objeto Usuario que se espera en el JSON
    static class Usuario {
        /**ATRIBUTOS*/
        String nombre;
        int edad;
        String correo;
        /**METODOS*/
        //Inicializa la clase usuario con los datos proporcionados
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}