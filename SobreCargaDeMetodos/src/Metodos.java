import javax.swing.JOptionPane;

public class Metodos {
	
	public void caminar() {
		
		String nombre = JOptionPane.showInputDialog("ingresa el nombre");
		
		System.out.println(nombre + " estas caminando ");
		
	}
	
	public void caminar(String nombre) {
		
		System.out.println("El Nombre Del Perro Es--> "+nombre);
	}
	
	public void caminar(String nombre, String color) {
		
		System.out.println("El Nombre Del gato Es--> "+nombre+" y el color del gato es--> "+color);
	}


}
