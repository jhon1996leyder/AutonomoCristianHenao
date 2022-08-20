
public class Empleado extends Animal{

	public Empleado() {}
	
	@Override
	public void comer(String nombre) {
		System.out.println("estoy comiendo en la "+nombre);
	}
}
