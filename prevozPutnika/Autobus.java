package prevozPutnika;

import java.util.Arrays;

public class Autobus {

	private String naziv;
	private Vozac vozac;
	private Putnik[] putnici;
	private double cena;

	public Autobus(String naziv, Putnik[] putnici, double cena) {
		this.naziv = naziv;
		this.putnici =putnici;			
		this.cena = cena;
	}

	public void dodajVozaca(Vozac v) {
		this.vozac = v;
		System.out.println("Vozac je u vozilu,mozete platiti kartu.");
	}

	public boolean dodajPutnika(Putnik p) {
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == null) {
				putnici[i] = p;
				return true;
			}
		}
		System.out.println(
				"U autobusu nema vise mesta. " + p.getIme() + " " + p.getPrezime() + ", sacekajte sledeci autobus.");
		return false;
	}

	public boolean ukloniPutnika(Putnik p) {
		for (int i = 0; i < putnici.length; i++) {
			if (putnici[i] == p) {
				putnici[i] = null;
				return true;
			}
		}
		return false;
	}

	public boolean naplata(Putnik p) {
		if (vozac != null) {
			if (p.oduzmiNovac(cena) == true) {
				return true;
			} else {
				System.out.println("Nemate dovoljno novca. Napustite vozilo." + p);
				ukloniPutnika(p);
				return false;
			}
		}
		System.out.println("Vozac nije prisutan.");
		return false;
	}

	@Override
	public String toString() {

		String s = Arrays.toString(putnici);
		s = s.replaceAll(", null", "");
		s = s.replace("null,", "");
		String a = s.substring(1, s.length() - 1);
		if (vozac == null) {
			return naziv + " (" + "VOZAC; " + a + ")";
		}
		return naziv + " (" + vozac + a + ")";
	}

}
