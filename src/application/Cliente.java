package application;

public class Cliente {
	
	private String nombre;
	private int edad;
	private double peso;
	private double altura;
	private String historialEntrenamiento, objetivosFitness;
	
	Cliente(String nombre, int edad, double peso, double altura, String historialEntrenamiento, String objetivosFitness) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.historialEntrenamiento = historialEntrenamiento;
		this.objetivosFitness = objetivosFitness;
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
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	
	public String gethistorialEntrenamiento() {
		return historialEntrenamiento;
	}
	
	public void sethistorialEntrenamiento(String historialEntrenamiento) {
		this.historialEntrenamiento = historialEntrenamiento;
	}
	
	public String getobjetivosFitness() {
		return objetivosFitness;
	}
	
	public void setobjetivosFitness(String objetivosFitness) {
		this.objetivosFitness = objetivosFitness;
	}
	
	

}
