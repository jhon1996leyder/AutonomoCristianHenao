
public class Estudiante {
	
	private String nombre;
	private int edad ;
	private String curso;
	private String salon;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}
	
	@Override
	public String toString() {
		return "Estudiante--> Nombre=" + nombre + ", Edad=" + edad + ", Curso=" + curso + ", Salon=" + salon + "";
	}
	
	
}
