package application;
import java.util.List; 
import java.util.ArrayList; 


public abstract class Actividad {


	protected List<Estudiante> listaEstudiantes;
	
	public Actividad(String deporte, int capacidadEstudiantes) {
		 
		this.listaEstudiantes = new ArrayList<>(); 
		
	}
	

	protected void agregarEstudianteInforme(Estudiante estudiante) {}
	public abstract void informe();
	public abstract String getDeporte();

}
