
public class Banios {
	
	private  class banioHombres{
		public int bHombres = 0;
	}
	private class banioMujeres {
		public int bMujeres = 0;
	}
	
	private banioHombres objbaniHombres = new banioHombres();
	private banioMujeres objbanioMujeres = new banioMujeres();
	
	
	public void HEntra(String nom) {
		synchronized(objbaniHombres) {
			while(objbaniHombres.bHombres >=10) {
				try {
					objbaniHombres.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				objbaniHombres.bHombres++;
				System.out.println(nom + " ha entrado en el baño. BHombre = " + objbaniHombres.bHombres);
				
		}	
		
	}
	
	public void HSale(String nom) {
		synchronized(objbaniHombres) {
			objbaniHombres.bHombres--;
			System.out.println(nom + " ha salido en el baño. BHombre = " + objbaniHombres.bHombres);
			objbaniHombres.notifyAll();
		}	
	}
	
	public void MEntra(String nom) {
		synchronized(objbanioMujeres){
			while(objbanioMujeres.bMujeres >= 10) {
				try {
					objbanioMujeres.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				objbanioMujeres.bMujeres++;
				System.out.println(nom + " ha entrado en el baño de BMujer = " + objbanioMujeres.bMujeres);
				
		}	
	}
	
	public void MSale(String nom) {
		synchronized(objbanioMujeres) {
			objbanioMujeres.bMujeres--;
			System.out.println(nom + " ha salido en el baño BMujer = " + objbanioMujeres.bMujeres);
			objbanioMujeres.notifyAll();
		}	
	}
	
	public void Espera() {
		try {
			Thread.sleep(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println("Error de sleep");
		}
	}
}
