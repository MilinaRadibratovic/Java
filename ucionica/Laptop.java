package ucionica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Laptop {
	/*
	 * Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju
	 * prilikom kreiranja. Marka moze samo da se dohvati. Lista polaznika koji
	 * koriste laptop moze da se prosiri i da se smanji. Moze da se ispise u obliku
	 * (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
	 */

	private ArrayList<Polaznik> p;
	private String marka;

	public Laptop(String marka) {
		this.marka = marka.toUpperCase();
		p = new ArrayList<Polaznik>();
	}

	public void setP(Polaznik ime) {
		p.add(ime);
	}

	public void remove(Polaznik ime) {
		p.remove(ime);
	}

	public String getMarka() {
		return marka;
	}

	@Override
	public String toString() {

		String s = marka + " {" + p + "}";
		s = s.replaceAll("\\[", "");
		s = s.replaceAll("\\]", "");

		return s;
	}

}
