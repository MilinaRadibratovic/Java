package zadatak_1_0313;

import java.util.ArrayList;

public class Igraliste {

	private static ArrayList<Dete> deca = new ArrayList<Dete>();

	public static ArrayList<Dete> dodajDecu(Dete d) {
			deca.add(d);
			return deca;
		}
	public static ArrayList<Dete> ukloniDecu(Dete d) {
		deca.remove(d);
		return deca;
	}

	public static double prosekGodina(ArrayList<Dete> deca) {
		double prosekG = 0;
		for (int i = 0; i < deca.size(); i++) {
			double temp = deca.get(i).getBrGod();
			prosekG += temp;
		}
		return Math.round(prosekG / deca.size());
	}



	public static void main(String[] args) {

		Dete d1 = new Dete("Marko", "Markovic", 8, 3);
		Dete d2 = new Dete("Nikola", "Nikolic", 10, 6);
		Dete d3 = new Dete("Lazar", "Lazarevic", 5, 10);

		dodajDecu(d1);
		dodajDecu(d2);
		dodajDecu(d3);
		dodajDecu(new Dete("Ivan","Ivanovic",6,7));
		System.out.println(ukupnoKlikera(deca));
		System.out.println(prosekGodina(deca));
		
		d3.oduzmiKlikere(6);
		System.out.println(ukupnoKlikera(deca));
		System.out.println(d3.getBrKlikera());
		System.out.println(deca.get(3).oduzmiKlikere(4));
		ukloniDecu(deca.get(3));
		
		System.out.println(ukupnoKlikera(deca));
		System.out.println(prosekGodina(deca));
	}

	public static int ukupnoKlikera(ArrayList<Dete> deca) {
		int ukupnoKlikera = 0;
		for (int i = 0; i < deca.size(); i++) {
			int temp = deca.get(i).getBrKlikera();
			ukupnoKlikera += temp;
		}
		return ukupnoKlikera;
	}

}
