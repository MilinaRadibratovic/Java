package zadatak_1_0313;

public class Dete {
	/*
	 * 1. Dete ima ime, prezime, broj godina i broj klikera. Napraviti mogucnost da
	 * se kreira vise objekata klase Dete. Ako se pozove metoda dodajKlikere ili
	 * metoda oduzmiKlikere, broj klikera se azurira. Napraviti metodu koja ce
	 * ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina
	 * (ako imamo troje dece, broj prosecnih godina za njih troje; ako imamo dvoje
	 * racunamo prosecne godine za to dvoje) .
	 */

	private String ime;
	private String prezime;
	private int brGod;
	private int brKlikera;

	public Dete(String ime, String prezime, int brGod, int brKlikera) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.brGod = brGod;
		this.brKlikera = brKlikera;
	}

	public int getBrGod() {
		return brGod;
	}

	public int getBrKlikera() {
		return brKlikera;
	}

	public int dodajKlikere(int brKl) {
		if (brKl > 0) {
			this.brKlikera += brKl;
			return brKlikera;
		} else {
			System.out.println("Neispravan unos.");
			return brKlikera;
		}
	}
	public int oduzmiKlikere(int brKl) {
		if (brKl > 0&& brKl<=this.brKlikera) {
			this.brKlikera -= brKl;
			return brKlikera;
		} else {
			System.out.println("Neispravan unos.");
			return brKlikera;
		}
	}
}
