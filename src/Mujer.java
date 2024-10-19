
public class Mujer extends Thread {
	
	public String nom;
	public Banios objBanio;
	
	public Mujer(String nom, Banios objBanio) {
		
		this.nom = nom;
		this.objBanio = objBanio;
	}
	
	@Override
	public void run() {
		this.objBanio.MEntra(this.nom);
		this.objBanio.Espera();
		this.objBanio.MSale(this.nom);
		
	}

}
