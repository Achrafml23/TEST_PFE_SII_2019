package sii.maroc;

public class Ticket {

	private int nombrePlat;
	private String plat;
	
	public Ticket(int nombrePlat,String plat ) {
		this.nombrePlat  = nombrePlat;
		this.plat = plat;
	}
	public int getNombrePlat() {
		return nombrePlat;
	}

	public void setNombrePlat(int nombrePlat) {
		this.nombrePlat = nombrePlat;
	}

	public String getPlat() {
		return plat;
	}

	public void setPlat(String plat) {
		this.plat = plat;
	}

	public Ticket and(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
