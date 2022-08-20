
public class Principal {
	
	Flecha flecha1,flecha2,flecha3;
	
	public static void main(String[] args) {
		
		Principal miPrincipal = new Principal();
		
	}
	
	public Principal() {
		
		flecha1=new Flecha();
		
		flecha1.construirFlechas();
		flecha1.imprimirEspacio();
		
		flecha2=new Flecha();
		
		flecha2.construirFlechas();
		flecha2.imprimirEspacio();
		
		flecha3=new Flecha();
		
		flecha3.construirFlechas();
		flecha3.imprimirEspacio();
		
	}

}
