import java.util.HashMap;
import javax.swing.JOptionPane;
	
public class Proceso {
	
	HashMap<Integer,Estudiante> estudiantes = new HashMap<Integer,Estudiante>();
	
	public Proceso() {
		ingresarEstudiante();
	}

	public void ingresarEstudiante() {
		
		JOptionPane.showMessageDialog(null, "Registro de Estudiante");
		String opcion = "";
		int contador = 0;
		do {
			
			Estudiante estudi = new Estudiante();
			contador++;
			estudi.setNombre(JOptionPane.showInputDialog("Nombre"));
			estudi.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad del Estudiante")));
			estudi.setSalon(JOptionPane.showInputDialog("numero del salon"));
			estudi.setCurso(JOptionPane.showInputDialog("Curso al que Ingresa"));
			
			estudiantes.put(contador,estudi);
			
			opcion=JOptionPane.showInputDialog("Ingresar otro estudiante SI o NO");
		} while (!(opcion.equalsIgnoreCase("no")));
		

		for (Integer clave:estudiantes.keySet()) {
		    Estudiante valor = estudiantes.get(clave);
		    System.out.println("codigo del Registro: " + clave +" "+ valor.toString());
		}
	}

}
