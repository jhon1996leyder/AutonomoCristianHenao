import javax.swing.JOptionPane;

public class Flecha {
	int longitud;
	String color;
	
	//contructor implicito
	public Flecha() {
		longitud=Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud"));
		color =JOptionPane.showInputDialog("ingresa el color");
	}
	
	//constructor explicito
	public Flecha(int longitud,String color) {
		this.longitud=longitud;
		this.color=color;
	}
	
	
	private void imprime(String simbolo) {
		if (color.equalsIgnoreCase("negro")) {
			System.out.print(simbolo);
		}else {
			System.err.print(simbolo);
		}
	}
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	public void construirFlechas() {
		for(int i=0;i<longitud;i++) {
			imprime("-");
		}
		imprime(">"+"\n");
	}
}
