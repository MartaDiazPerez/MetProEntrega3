import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GsonUtilEjemploTest {

    @Test
    void guardarObjetoEnArchivo() {
        // Creamos un usuario de prueba
        GsonUtilEjemplo.Usuario usuario = new GsonUtilEjemplo.Usuario("Carlos", 28, "carlos@test.com");
        String rutaArchivo = "test_usuario.json";

        // Guardamos el objeto
        GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, usuario);

        // Comprobamos que el archivo se haya creado
        File archivo = new File(rutaArchivo);
        assertTrue(archivo.exists(), "El archivo JSON debería haberse creado");

        // Limpieza: eliminar archivo de prueba
        archivo.delete();
    }

    @Test
    void cargarObjetoDesdeArchivo() {
        // Crear un archivo JSON de prueba
        String rutaArchivo = "test_usuario.json";
        String contenidoJSON = """
                {
                  "nombre": "Laura",
                  "edad": 22,
                  "correo": "laura@test.com"
                }
                """;

        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            writer.write(contenidoJSON);
        } catch (IOException e) {
            fail("No se pudo escribir archivo JSON de prueba: " + e.getMessage());
        }

        // Cargamos el objeto desde el archivo
        GsonUtilEjemplo.Usuario usuario = GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);

        // Verificamos que no sea null y que los datos sean correctos
        assertNotNull(usuario, "El objeto cargado no debería ser null");
        assertEquals("Laura", usuario.nombre);
        assertEquals(22, usuario.edad);
        assertEquals("laura@test.com", usuario.correo);

        // Limpieza: eliminar archivo de prueba
        new File(rutaArchivo).delete();
    }

    @Test
    void main() {
        // Probamos el flujo principal: guardar y luego cargar
        String rutaArchivo = "test_usuario_main.json";
        GsonUtilEjemplo.Usuario usuario = new GsonUtilEjemplo.Usuario("Pepe", 45, "pepe@test.com");

        // Guardamos el objeto
        GsonUtilEjemplo.guardarObjetoEnArchivo(rutaArchivo, usuario);

        // Cargamos el objeto
        GsonUtilEjemplo.Usuario usuarioCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);

        // Verificamos que los datos coincidan
        assertNotNull(usuarioCargado);
        assertEquals(usuario.nombre, usuarioCargado.nombre);
        assertEquals(usuario.edad, usuarioCargado.edad);
        assertEquals(usuario.correo, usuarioCargado.correo);

        // Limpieza: eliminar archivo de prueba
        new File(rutaArchivo).delete();
    }
}