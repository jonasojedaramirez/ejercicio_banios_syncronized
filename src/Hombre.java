
public class Hombre extends Thread {
	
	public String nom;
	public Banios objBanio;
	
	public Hombre(String nom, Banios objBanio) {
		
		this.nom = nom;
		this.objBanio = objBanio;
	}
	
	@Override
	public void run() {
		this.objBanio.HEntra(this.nom);
		this.objBanio.Espera();
		this.objBanio.HSale(this.nom);
		
	}

} 
