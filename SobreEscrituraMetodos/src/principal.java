
public class principal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Perro perro =new Perro();
		Empleado empleado =new Empleado();
		
		animal.comer("firu");;
		perro.comer("ayla");
		empleado.comer("jhon");
		
		perro.comer("perro");
	}
}
