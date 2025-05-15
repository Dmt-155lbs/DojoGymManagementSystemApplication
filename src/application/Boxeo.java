package application;

public class Boxeo extends Actividad {
	private String peso; 
	

	public Boxeo(String deporte, int capacidadEstudiantes, String peso) {
		super(deporte, capacidadEstudiantes);
		this.peso = peso; 
	}
	
	
	public void informe() {
		System.out.println("Estudiantes en la clase de Boxeo (peso " + peso + "):");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("- " + estudiante.getNombre());
        }
	}
	
	@Override
	protected void agregarEstudianteInforme(Estudiante estudiante) {
		System.out.println(estudiante.getNombre() + " se ha agregado al informe de la clase de Boxeo (peso " + peso + ")");
	}


	@Override
	public String getDeporte() {
		return "Boxeo";
	}
	
	
	
	

}
