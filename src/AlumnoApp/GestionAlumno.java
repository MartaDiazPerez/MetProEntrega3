package AlumnoApp;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestionAlumno {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Uso: java -jar Proyecto.jar <init|show> <ruta_fichero.json>");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        switch (operacion) {
            case "init":
                Alumno alumnoPorDefecto = new Alumno("Carlos Pérez", 21, "Ingeniería Informática", 8.3);
                guardarEnArchivo(rutaFichero, alumnoPorDefecto);
                System.out.println("Archivo creado con valores por defecto en: " + rutaFichero);
                break;

            case "show":
                Alumno alumno = leerDesdeArchivo(rutaFichero);
                if (alumno != null) {
                    System.out.println("Alumno leído desde el archivo:");
                    System.out.println(alumno);
                } else {
                    System.out.println("No se pudo leer el archivo.");
                }
                break;

            default:
                System.out.println("Operación no reconocida. Usa 'init' o 'show'.");
        }
    }

    public static void guardarEnArchivo(String ruta, Alumno alumno) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(ruta)) {
            gson.toJson(alumno, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Alumno leerDesdeArchivo(String ruta) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(ruta)) {
            return gson.fromJson(reader, Alumno.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
