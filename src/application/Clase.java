package application;
import java.util.Scanner;
import java.util.Map;


class Clase {
    public static void verInformesActividades(Scanner scanner, Map<String, Instructor> deportesInstructores) {
        do {
            System.out.println("\n--- Ver Informes de Actividades ---");
            System.out.print("Ingrese el nombre del deporte para ver el informe (o 'volver' para regresar): ");
            String deporteSeleccionado = scanner.nextLine();

            if (deporteSeleccionado.equalsIgnoreCase("volver")) {
                break;
            }

            if (deportesInstructores.containsKey(deporteSeleccionado)) {
                Instructor instructor = deportesInstructores.get(deporteSeleccionado);
                instructor.verInformes();
            } else {
                System.out.println("Deporte no encontrado. Intente nuevamente.");
            }
        } while (true);
    }
}
