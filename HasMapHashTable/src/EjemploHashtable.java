import java.util.Hashtable;

import javax.swing.JOptionPane;

public class EjemploHashtable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> perros = new Hashtable<Integer, String>();
		
		int fin=Integer.parseInt(JOptionPane.showInputDialog("igrese la cantidad d perros"));
		int i=1;
		
		while (i <= fin) {
			
			perros.put(Integer.parseInt(JOptionPane.showInputDialog("Edad del Perro")),
						JOptionPane.showInputDialog("Raza del perro"));
			i++;
		}
		
		for (int string : perros.keySet()) {
			String valor = perros.get(string);
			System.out.println("key -->"+string+" valor-->"+valor);
		}
		
	}
	

}
