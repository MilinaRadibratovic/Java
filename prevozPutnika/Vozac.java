package prevozPutnika;

public class Vozac extends Covek {

	private String zanimanje="sofer";

	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		
	}

	@Override
	public String toString() {
		return  getIme() + " " + getPrezime() + " - ";
	}

	public String getZanimanje() {
		return zanimanje;
	}


	
	
}
