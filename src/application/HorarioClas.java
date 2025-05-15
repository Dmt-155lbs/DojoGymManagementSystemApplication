/*package application;
import java.util.Map;
import java.util.Scanner;

public class HorarioClas {
    public static void verNumerosDisponibles(Scanner scanner, Map<String, Instructor> deportesInstructores) {
        System.out.print("Ingrese el deporte del instructor que desea consultar: ");
        String deporte = scanner.nextLine();

        if (deportesInstructores.containsKey(deporte)) {
            Instructor instructor = deportesInstructores.get(deporte);
            System.out.println("Horarios disponibles para " + deporte + ": " + instructor.getHorariosDisponibles());
        } else {
            System.out.println("No hay instructores registrados para el deporte " + deporte);
        }
    }
}
*/ 
