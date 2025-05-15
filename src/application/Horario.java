package application;

public class Horario {
	
	private String apertura;
	private String cierre;
	private String horarioDisponible;
	private String entrenadorDisponible;
	
	public Horario(String apertura, String cierre, String horarioDisponible, String entrenadorDisponible) {
		this.apertura = apertura;
		this.cierre = cierre;
		this.horarioDisponible = horarioDisponible;
		this.entrenadorDisponible = entrenadorDisponible;
	}
	
	public String getApertura() {
		return apertura;
	}
	
	public void setApertura(String apertura) {
		this.apertura = apertura;
	}
	
	public String getCierre() {
		return cierre;
	}
	
	public void setCierre(String cierre) {
		this.cierre = cierre;
	}
	
	public String getHorarioDisponible() {
		return horarioDisponible;
	}
	
	public void setHorarioDisponible(String horarioDisponible) {
		this.horarioDisponible = horarioDisponible;
	}
	
	public String getEntrenadorDisponible() {
		return entrenadorDisponible;
	}
	
	public void setEntrenadorDisponible(String entrenadorDisponible) {
		this.entrenadorDisponible = entrenadorDisponible;
	}


}
