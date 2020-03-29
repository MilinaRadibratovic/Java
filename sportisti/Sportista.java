package zadatak10;

public class Sportista {
	
	private String ime;
	private String prezime;
	private int godRodjenja;



	public Sportista(String ime, String prezime, int godRodjenja) {
		super();
		this.ime = ime.toUpperCase();
		this.prezime = prezime.toUpperCase();
		this.godRodjenja = godRodjenja;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	@Override
	public String toString() {
		return ime + " " + prezime + ": " + godRodjenja;
	}

}
