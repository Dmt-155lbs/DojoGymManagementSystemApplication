package application;

public class Persona {
	protected String nombre; 
	protected String genero; 
	protected String edad; 
	
	public Persona(String nombre, String genero, String edad) {
		this.nombre = nombre; 
		this.edad =edad; 
		this.genero = genero; 
	}
	
	public String getNombre() {
		return nombre; 
	}
	
	public String getEdad() { 
		return edad; 
		
	}
	
	public String getGenero() {
		return genero; 
	}
	
	
	public void Informacion() {
		System.out.println("nombre: " + nombre);
		System.out.println("Edad: " + edad); 
		System.out.println("Genero: " + genero);
	}

}
