package AlumnoApp;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionAlumno {
    // Comprueba que se hayan pasado exactamente 2 argumentos al programa
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java -jar Proyecto.jar <init|show> <ruta_fichero.json>");
            return;  // Sale del programa si los argumentos no son válidos
        }
        // Extrae los argumentos: tipo de operación y ruta del archivo JSON
        String operacion = args[0];
        String rutaFichero = args[1];

        // Estructura de control para decidir la operación a realizar
        switch (operacion) {
            // Crea un objeto Alumno con valores por defecto
            case "init":
                Alumno alumnoPorDefecto = new Alumno("Marta Pérez", 19, "Matemáticas y computación", 8.3);
                // Guarda el objeto en el archivo especificado
                guardarEnArchivo(rutaFichero, alumnoPorDefecto);
                System.out.println("Archivo creado con valores por defecto en: " + rutaFichero);
                break;

            case "show":
                // Lee el objeto Alumno desde el archivo especificado
                Alumno alumno = leerDesdeArchivo(rutaFichero);
                if (alumno != null) { // Muestra la información del alumno por pantalla
                    System.out.println("Alumno leído desde el archivo:");
                    System.out.println(alumno);
                } else {    // Si ocurre un error, muestra un mensaje de fallo
                    System.out.println("No se pudo leer el archivo.");
                }
                break;

            default: // Maneja el caso en que se introduzca una operación no reconocida
                System.out.println("Operación no reconocida. Usa 'init' o 'show'.");
        }
    }

    // Metodo que guarda un objeto Alumno en formato JSON en un archivo
    public static void guardarEnArchivo(String ruta, Alumno alumno) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(ruta)) {
            //Escribe en el archivo el objeto alumno
            gson.toJson(alumno, writer);
        } catch (IOException e) { //Muestra los detalles del error ante una excepción
            e.printStackTrace();
        }
    }

    // Metodo que lee un objeto Alumno desde un archivo JSON
    public static Alumno leerDesdeArchivo(String ruta) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(ruta)) {
            //Lee y devuelve el contenido del archivo del objeto alumno
            return gson.fromJson(reader, Alumno.class);
        } catch (IOException e) { //Muestra los detalles del error ante una excepción
            e.printStackTrace();
            return null;
        }
    }
}
