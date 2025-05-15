package application;
/*
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;*/ 

public class Estudiante extends Persona {
	private static String nivelDeporte; 
	private String deporte; 
	private String horainicio;
	private String horafinal; 

	public Estudiante(String nombre, String genero, String edad, String nivelDeporte, String deporte, String horainicio, String horafinal) {
		super(nombre, genero, edad);
		Estudiante.nivelDeporte = nivelDeporte; 
		this.deporte = deporte; 
		this.horainicio = horainicio; 
		this.horafinal = horafinal; 
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEdad() {
		return edad;
	}
	
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
	public String getDeporte() {
		return deporte;
	}
	
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String gethorainicio() {
		return horainicio;
	}
	
	public void sethorainicio(String horainicio) {
		this.horainicio = horainicio;
	}
	
	public String gethorafinal() {
		return horafinal;
	}
	
	public void sethorafinal(String horafinal) {
		this.horafinal = horafinal;
	}
	
	public String getNivelDeporte() {
	        return nivelDeporte;
	    }

    public void setNivelDeporte(String nivelDeporte) {
	        Estudiante.nivelDeporte = nivelDeporte;
	    }
    
    /*
    public static void leerHorariosDisponibles(Map<String, Instructor> deportesInstructores) {
        try (BufferedReader reader = new BufferedReader(new FileReader("informacion.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Instructor: ")) {
                    String nombreInstructor = line.substring("Instructor: ".length());
                    String deporte = reader.readLine().substring("Deporte enseñado: ".length());
                    String horariosString = reader.readLine().substring("Horarios disponibles: ".length());
                    String[] horariosArray = horariosString.split(", ");
                    
                    Instructor instructor = new Instructor(nombreInstructor, "", 0);
                    instructor.agregarDeporte(deporte);
                    for (String horario : horariosArray) {
                        instructor.agregarHorario(horario);
                    }
                    
                    deportesInstructores.put(deporte, instructor);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
	
	
	public static void registrarEstudiante(Scanner scanner, Map<String, Instructor> deportesInstructores) {
		leerHorariosDisponibles(deportesInstructores);
		
		    String genero = "";

		   
		        System.out.print("Ingrese el nombre del estudiante: ");
		        String nombre = scanner.nextLine();
		       
		    
		    while (true) {
		        System.out.print("Ingrese el género del estudiante (M o F) : ");
		        String inputGenero = scanner.nextLine();
		        if (inputGenero.matches("[a-zA-Z]+")) {
		            genero = inputGenero;
		            break;
		        } else {
		            System.out.println("Género inválido. Por favor, ingrese un género válido.");
		        }
		    }
        
        System.out.print("Ingrese la edad del estudiante: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("¿Qué deporte practica el estudiante? ");
        String deporte = scanner.nextLine();

        if (deportesInstructores.containsKey(deporte)) {
            Instructor instructor = deportesInstructores.get(deporte);
            System.out.println("Horarios disponibles (hora de inicio) para " + deporte + ": " + instructor.getHorariosDisponibles());
            System.out.print("Elija un número disponible: ");
            String numeroElegido = scanner.nextLine();
            int numero = Integer.parseInt(numeroElegido);
            int siguienteNumero = numero + 1;
            System.out.println("Horario de " + numeroElegido + " a " + siguienteNumero +" asignado al estudiante.");

            String nivel = "";
            if (deporte.equalsIgnoreCase("Judo") || deporte.equalsIgnoreCase("Taekwondo") || deporte.equalsIgnoreCase("MuayThai")) {
                System.out.print("¿Qué color de cinturón tiene? ");
                nivel = scanner.nextLine();
            } else if (deporte.equalsIgnoreCase("Boxeo")) {
                System.out.print("¿Cuál es su peso? ");
                nivel = scanner.nextLine();
            }

          
            System.out.println("\nInformación del estudiante:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Género: " + genero);
            System.out.println("Nivel de Deporte: " + nivel);

            System.out.println("\nInformación del instructor:");
            instructor.Informacion(); 
            System.out.println("Deportes enseñados: " + instructor.getDeportesEnsenados()); 
            
           
            
            try (FileWriter writer = new FileWriter("informacion.txt", true)) {
                writer.write("Estudiante: " + nombre + ", Género: " + genero + ", Edad: " + edad + "\n");
                writer.write("Deporte practicado: " + deporte + "\n");
                writer.write("Nivel: " + nivel + "\n");
                writer.write("Horario asignado: " + "de " + numeroElegido + " a " + (siguienteNumero) + " horas" + "\n");
                writer.write("--------------------------------------\n");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
            }
            
        }else {
        	 System.out.println("No hay instructores registrados para el deporte " + deporte);
        }
	}
	*/
}
            
            
            
            


