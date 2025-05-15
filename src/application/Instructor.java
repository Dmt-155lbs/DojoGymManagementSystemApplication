
package application;
/*import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList; */

import java.util.List;

public class Instructor extends Persona {
	
	private List<String> deportesEnsenados; 
	private List<String> horariosDisponibles;
	private String deporte; 
	private String horainicio;
	private String horafinal; 

	public Instructor(String nombre, String genero, String edad, String deporte, String horainicio, String horafinal) {
		super(nombre, genero, edad);
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

	public void agregarDeporte(String deporte) { 
		deportesEnsenados.add(deporte); 
	}
	
	public void agregarHorario ( String horario) {
		if (horariosDisponibles.size() < 5) {
			horariosDisponibles.add(horario);
			
		} else {
			System.out.println("No se pueden agregar más de 5 horarios");
			
		}
	}
		
	public List<String> getHorariosDisponibles() {
		return horariosDisponibles; 
	}
	
	 public List<String> getDeportesEnsenados() {
	        return deportesEnsenados;
	    }
	 
	 @SuppressWarnings("null")
	public void verInformes() {
	        System.out.println("Informes de clases del instructor " + getNombre() + ":");
	        for (String deporte : deportesEnsenados) {
	            System.out.println("- " + deporte);
	            Actividad[] listaActividades = null;
				for (Actividad actividad : listaActividades) {
	                if (actividad.getDeporte().equals(deporte)) {
	                    actividad.informe();
	                    break;
	                }
	            }
	        }
	    }
	 
	 
	 /*
	
	 public static Instructor registrarInstructor(Scanner scanner, Map<String, Instructor> deportesInstructores) {

		    String genero = "";

		  
		        System.out.print("Ingrese el nombre del instructor: ");
		        String nombre = scanner.nextLine();
		   

		    while (true) {
		        System.out.print("Ingrese el género del instructor: ");
		        String inputGenero = scanner.nextLine();
		        if (inputGenero.matches("[a-zA-Z]+")) {
		            genero = inputGenero;
		            break;
		        } else {
		            System.out.println("Género inválido. Por favor, ingrese un género válido.");
		        }
		    }
	       
	        System.out.print("Ingrese la edad del instructor: ");
	        int edad = scanner.nextInt();
	        scanner.nextLine(); 

	        Instructor instructor = new Instructor(nombre, genero, edad);
	        System.out.print("¿Qué deporte enseña? ");
	        String deporte = scanner.nextLine();
	        instructor.agregarDeporte(deporte);

	        for (int i = 0; i < 5; i++) {
	            boolean numeroValido = false;
	            int numero = 0;

	            while (!numeroValido) {
	                System.out.print("Ingrese la hora a la que quiere empezar su clase (duración de 1 hora): ");
	                String input = scanner.nextLine();

	                try {
	                    numero = Integer.parseInt(input);
	                    if (numero >= 7 && numero <= 18) {
	                        numeroValido = true;
	                    } else {
	                        System.out.println("La hora debe estar entre las 7 AM y 18 PM. Intente nuevamente.");
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Entrada inválida. Ingrese una hora válida.");
	                }
	            }

	            instructor.agregarHorario(String.valueOf(numero));
	        }

	        deportesInstructores.put(deporte, instructor);
	        System.out.println("Instructor registrado exitosamente.");
	        
	        try (FileWriter writer = new FileWriter("informacion.txt", true)) {
	            writer.write("Instructor: " + nombre + ", Género: " + genero + ", Edad: " + edad + "\n");
	            writer.write("Deporte enseñado: " + deporte + "\n");
	            writer.write("Horarios disponibles: " + instructor.getHorariosDisponibles() + "\n");
	            writer.write("--------------------------------------\n");
	        } catch (IOException e) {
	            System.err.println("Error al escribir en el archivo: " + e.getMessage());
	        }

	        return instructor;
	    }
	 
	 
	 */
	 
}
	



