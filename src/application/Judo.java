package application;

public class Judo extends Actividad {
	private String cinturon; 
	
	public Judo(String deporte, int capacidadEstudiantes, String cinturon) {
		super(deporte, capacidadEstudiantes);
		this.cinturon = cinturon; 
	}
	
	public void informe() {
		System.out.println("Estudiantes en la clase de Judo (cinturón " + cinturon + "):");
		for (Estudiante estudiante : listaEstudiantes) {
		System.out.println("- " + estudiante.getNombre());
	    }
    }
	
	@Override
	protected void agregarEstudianteInforme(Estudiante estudiante) {
		System.out.println(estudiante.getNombre() + " se ha agregado al informe de la clase de Boxeo (peso " + cinturon + ")");
	}

	@Override
	public String getDeporte() {
		return "Judo";
	}
	
}

