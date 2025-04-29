import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Crear estudiantes e1 y e2 con nombre y edad
        Estudiante e1 = new Estudiante("Lucía", 20);
        Estudiante e2 = new Estudiante("Carlos", 22);

        // Crear asignatura con estudiantes que se les añade a una lista (e1 y e2)
        Asignatura matematicas = new Asignatura("Matemáticas", Arrays.asList(e1, e2));

        // Guardar en JSON
        try (FileWriter writer = new FileWriter("asignatura.json")) {
            Gson gson = new Gson();
            gson.toJson(matematicas, writer);
            System.out.println("Asignatura guardada en JSON.");
        } catch (IOException e) { //En caso de error se muestran los detalles del mismo
            e.printStackTrace();
        }

        // Leer desde JSON
        try (FileReader reader = new FileReader("asignatura.json")) {
            Gson gson = new Gson();
            Asignatura asignaturaLeida = gson.fromJson(reader, Asignatura.class);
            System.out.println("Asignatura leída desde JSON:\n" + asignaturaLeida);
        } catch (IOException e) { //En caso de error se muestran los detalles del mismo
            e.printStackTrace();
        }
    }
}