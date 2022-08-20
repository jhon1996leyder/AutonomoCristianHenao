import javax.swing.JOptionPane;

public class Proceso {
	
	String nombre;
	int edad;
	
	//contrctor implicito
	public void mensaje() { 
		nombre=JOptionPane.showInputDialog("ingrese el nombre");
		edad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad"));
		System.out.println("mi nombre es " + nombre +" y mi edad="+ edad);
	}
	
	//constructor explicito
	public void mensajeExplicito(String nombre, int edad) {
		
		System.out.println("mi nombre es " + nombre +" y mi edad="+ edad);

	}
	

}
