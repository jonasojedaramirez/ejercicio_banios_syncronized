
public class Principal {

	public static void main(String[] args) {
		
		Banios objBanio = new Banios();
		
		System.out.println("Inicio");
		
		for (int i=1; i<=200;i++) {
			(new Mujer("Mujer "+i, objBanio)).start();
			
		}
		for (int j=1; j<=200;j++) {
			(new Hombre("Hombre "+j, objBanio)).start();
			
		}

	}

}
