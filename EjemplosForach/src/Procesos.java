import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	public Procesos() {
		arrayNombres();
		lista();
		ejemploHasMap();
	}

	public void arrayNombres() {
		int cant=Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de personas"));
		String nombres[]= new String[cant];
		
		for (int i = 0; i < cant; i++) {
			nombres[i]=JOptionPane.showInputDialog((i+1)+"-->ingrese el nombre");
		}
		
		for (String string : nombres) {
			System.out.println(string);
		}
	}
	
	public void lista() {
		
		ArrayList<Integer>numeros = new ArrayList<Integer>();
		String opcion;
		JOptionPane.showInternalMessageDialog(null,"* lista de numeros *");
		
		do {

			int numero=Integer.parseInt(JOptionPane.showInputDialog("numero"));
			numeros.add(numero);
			opcion=JOptionPane.showInputDialog("desea segir guandando datos si o no");
			
		} while (opcion.equalsIgnoreCase("si"));
		
		for (Integer integer : numeros) {
			
			System.out.println(integer);
			
		}
	}
	
	public void ejemploHasMap() {
		
		HashMap<Integer, String> perro = new HashMap<Integer, String>();
		
		int i = 1;
		int fin =Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de perros")); 
		
		while (i <= fin ) {
			String raza=JOptionPane.showInputDialog("ingresa la raza del perro");
			int edad =Integer.parseInt(JOptionPane.showInputDialog("ingresa la edad del perro"));
			perro.put(edad, raza);
			i++;
		}
		
		perro.forEach((k,v) -> System.out.println("edad--> " + k + ", Raza--> " + v));
		
	}
}
