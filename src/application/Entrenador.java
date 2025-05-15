package application;

public class Entrenador {
	
	private String nombre;
	private int edad;
	String especializacion, horarioLaboral, horaInicio, horaFin;
	
	Entrenador(String nombre, int edad, String especializacion, String horarioLaboral, String horaInicio, String horaFin) {
		this.nombre = nombre;
		this.edad = edad;
		this.especializacion = especializacion;
		this.horarioLaboral = horarioLaboral;
		this.horaInicio = horaInicio; // Inicializar horaInicio como una cadena vacía
        this.horaFin = horaFin;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public String getEspecializacion() {
		return especializacion;
	}
	
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}
	
	public String getHorarioLaboral() {
		return horarioLaboral;
	}
	
	public void setHorarioLaboral(String horarioLaboral) {
		this.horarioLaboral = horarioLaboral;
	}
	
	public String gethoraInicio() {
		return horaInicio;
	}
	
	public void sethoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	
	public String gethoraFin() {
		return horaFin;
	}
	
	public void sethoraFin(String horaFin) {
		this.horaFin = horaFin;
	}



}
