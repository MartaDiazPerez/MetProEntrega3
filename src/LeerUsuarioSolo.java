import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class LeerUsuarioSolo {

    public static void main(String[] args) {
        String rutaArchivo = "usuario.json"; // Asegúrate de que esta ruta sea correcta
        Usuario usuario = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        if (usuario != null) {
            System.out.println("Datos cargados desde JSON:");
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Edad: " + usuario.edad);
            System.out.println("Correo: " + usuario.correo);
        } else {
            System.out.println("No se pudo leer el archivo.");
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}