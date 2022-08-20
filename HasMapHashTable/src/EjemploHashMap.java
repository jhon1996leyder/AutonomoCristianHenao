import java.util.HashMap;
import javax.swing.JOptionPane;


public class EjemploHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> datosPersonales = new HashMap<Integer, String>();
		String opcion = null;
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de personas"));
		for (int i = 0; i < cantidad; i++) {
			
			JOptionPane.showMessageDialog(null, (i+1)+ "-->usuario");
			datosPersonales.put(Integer.parseInt(JOptionPane.showInputDialog("ingresa la cedula")),
								JOptionPane.showInputDialog("ingresa el nombre"));
		
		}
		
		do {
			
			for (int clave:datosPersonales.keySet()) {
			    String valor = datosPersonales.get(clave);
			    System.out.println("Cedula: " + clave + ", Nombre: " + valor);
			}
			
			int buscar=Integer.parseInt(JOptionPane.showInputDialog("ingresa la cedula a buscar"));
			
			if(datosPersonales.containsKey(buscar)) {
				System.out.println("si esta registrado");
			}else {
				System.out.println("no esta registrado");
			}
			
			opcion = JOptionPane.showInputDialog("desea verificar otro usuario?");
			
		} while (opcion.equalsIgnoreCase("si"));
	}

}
