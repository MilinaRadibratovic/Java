package zadatak10;

import java.util.Arrays;

public class Klub {

	private String naziv;
	private String sediste;
	private int godOsnivanja;
	private Sportista[] sportisti;



	public Klub(String naziv, String sediste, int godOsnivanja, Sportista[] sportisti) {
		super();
		this.naziv = naziv;
		this.sediste = sediste;
		this.godOsnivanja = godOsnivanja;
		this.sportisti = sportisti;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getSediste() {
		return sediste;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}
	

	public Sportista[] getSportisti() {
		return sportisti;
	}

	@Override
	public String toString() {
		return naziv + "\n"+ sediste + "\n" + godOsnivanja + "\nsportisti:"+ Arrays.toString(sportisti);
	}





}
