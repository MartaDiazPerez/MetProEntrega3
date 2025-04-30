import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

class LeerUsuarioSoloTest {

    @Test
    void main() {
        // No vamos a probar "main" directamente porque depende de archivos.
        // Pero podemos comprobar indirectamente cargando un archivo y verificando los datos.

        // Crear un archivo temporal con datos de usuario
        String rutaTemporal = "test_usuario.json";
        LeerUsuarioSolo.Usuario usuarioOriginal = new LeerUsuarioSolo.Usuario("Ana", 30, "ana@email.com");

        try (FileWriter writer = new FileWriter(rutaTemporal)) {
            Gson gson = new Gson();
            gson.toJson(usuarioOriginal, writer);
        } catch (IOException e) {
            fail("No se pudo crear archivo de prueba: " + e.getMessage());
        }

        // Cargar el archivo usando el método que main utiliza
        LeerUsuarioSolo.Usuario usuarioCargado = LeerUsuarioSolo.cargarObjetoDesdeArchivo(rutaTemporal, LeerUsuarioSolo.Usuario.class);

        assertNotNull(usuarioCargado);
        assertEquals("Ana", usuarioCargado.nombre);
        assertEquals(30, usuarioCargado.edad);
        assertEquals("ana@email.com", usuarioCargado.correo);

        // Elimina el archivo de prueba después
        new File(rutaTemporal).delete();
    }

    @Test
    void cargarObjetoDesdeArchivo() {
        // Crear archivo JSON de prueba
        String rutaTemporal = "test_usuario.json";
        String contenidoJSON = """
                {
                  "nombre": "Luis",
                  "edad": 25,
                  "correo": "luis@email.com"
                }
                """;

        try (FileWriter writer = new FileWriter(rutaTemporal)) {
            writer.write(contenidoJSON);
        } catch (IOException e) {
            fail("No se pudo escribir archivo JSON de prueba: " + e.getMessage());
        }

        // Testear la carga del archivo
        LeerUsuarioSolo.Usuario usuario = LeerUsuarioSolo.cargarObjetoDesdeArchivo(rutaTemporal, LeerUsuarioSolo.Usuario.class);

        assertNotNull(usuario, "El objeto usuario no debería ser nulo");
        assertEquals("Luis", usuario.nombre);
        assertEquals(25, usuario.edad);
        assertEquals("luis@email.com", usuario.correo);

        // Borrar el archivo de prueba
        new File(rutaTemporal).delete();
    }
}