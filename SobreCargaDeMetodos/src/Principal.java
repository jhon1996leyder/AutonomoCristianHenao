import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Metodos misMetodos = new Metodos();
		
		misMetodos.caminar();
		
		System.out.println("<-------------------------------------->");
		
		misMetodos.caminar("ayla");
		
		System.out.println("<-------------------------------------->");
		
		String nombre=JOptionPane.showInputDialog("ingrese el nombre del gato");
		String color=JOptionPane.showInputDialog("ingrese el color del gato");
		misMetodos.caminar(nombre,color);
		
	}

}
