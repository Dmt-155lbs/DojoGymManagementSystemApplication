package application;

public class MuayThai extends Actividad {
	String cinturon; 
	
	public MuayThai(String deporte, int capacidadEstudiantes, String cinturon) {
		super(deporte, 30);
		this.cinturon = cinturon; 
		
	}
	
	public void informe() {
		System.out.println("Estudiantes en la clase de Muay Thai (cinturón " + cinturon+ "):"); 
		for (Estudiante estudiante : listaEstudiantes) {
			System.out.println(" - " + estudiante.getNombre() + "con el cinturón" + cinturon);
		}
	}
	
	@Override
	protected void agregarEstudianteInforme(Estudiante estudiante) {
		System.out.println(estudiante.getNombre() + " se ha agregado al informe de la clase de Boxeo (peso " + cinturon + ")");
	}

	@Override
	public String getDeporte() {
		return "Muay Thai";
	}
	

}
