import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
public class GsonUtilEjemplo {
    // Metodo para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Convierte el objeto a JSON y lo escribe en el archivo
            gson.toJson(objeto, writer);
        } catch (IOException e) { // Muestra los detalles del error si ocurre una excepción
            e.printStackTrace();
        }
    }
    // Metodo para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            // Devuelve el contenido del archivo y lo convierte en un objeto del tipo especificado
            return gson.fromJson(reader, clase);
        } catch (IOException e) { // Muestra los detalles del error si ocurre una excepción
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        // Crear una instancia del objeto Usuario
        Usuario usuario = new Usuario("Juan", 30, "juan@example.com");
        // Ruta del archivo donde se guardará el objeto
        String rutaArchivo = "usuario.json";
        // Guardar el objeto Usuario en un archivo JSON
        guardarObjetoEnArchivo(rutaArchivo, usuario);
        // Cargar el objeto Usuario desde el archivo JSON y en caso de funcionar correctamente, imprime
        //el nombre por pantalla
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }
    // Clase interna Usuario para los ejemplos
    static class Usuario {
        /**ATRIBUTOS*/
        String nombre;
        int edad;
        String correo;

        /**METODOS*/
        //Metodo constructor  para inicializar el objeto Usuario con los datos proporcionados
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}
