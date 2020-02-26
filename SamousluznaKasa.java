package zadatak4;

import java.util.Scanner;

public class Zadatak_1_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ima meni za samousluznu kasu u prodavnici. Meni za
		 * potrosace sadrzi sledece opcije: 0 - Izlaz iz programa 1 - dodavanje cene
		 * proizvoda na racun (ubacivanje u potrosacku korpu) 2 - naplata racuna Ukoliko
		 * korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese opciju 1
		 * program pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u
		 * prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika da unese
		 * kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost manju od
		 * vrednosti racuna, potrebno je da se ispise greska, bez umanjenja racuna i da
		 * se ponovo ispise meni. Ukoliko korisnik unese vrednost vecu ili jednaku od
		 * cene racuna ispisuje se kusur i racun se ponovo postavlja na nulu. Zatim se
		 * ponovo ispisuje meni.+
		 */
		Scanner sc = new Scanner(System.in);
		float racun = 0;
		float kasa = 0;
		int kes = 0;

		System.out.println("0-izlaz iz programa;\n1-dodavanje proizvoda u korpu;\n2-ukupan iznos u korpi;\n");
		System.out.print("Izaberite opciju - ");
		int opc = sc.nextInt();

		while (opc != 0) {
			switch (opc) {
			case 0: {
				if (kasa == 0) {
					break;
				} else if (kasa < 0) {
					System.out.println("Vas kusur iznosi " + Math.abs(kasa));
					break;
				} else if (kasa > 0) {
					System.out.println("Niste platili");
				}
			}
				break;
			case 1: {
				System.out.println("Kada zelite da zavrsite unos ukucajte 0");
				System.out.println("Unesite iznose racuna - ");
				racun = sc.nextFloat();
				if (racun >= 0) {
					for (; racun > 0;) {
						kasa = kasa + racun;
						racun = sc.nextFloat();
					}
				} else {
					System.out.println("Pogresan unos.");
					break;
				}
			}
				break;
			case 2:
				System.out.println("Ukupan racun iznosi " + kasa + "din.");
				if (kasa > 0) {
					System.out.print("Unesite iznos za naplatu - ");
					kes = sc.nextInt();
					if (kes > 0) {
						kasa = kasa - kes;
					} else {
						System.out.println("Pogresan unos novca.");
						break;
					}
				} else if (kasa < 0) {
					System.out.println("Vas kusur iznosi " + Math.abs(kasa));
					System.out.println("Kusur mozete podici kada zavrsite kupovinu.");
					System.out.println("Ako zelite da nastavite, racun ce biti umanjen za vrednost kusura");
				}
				break;
			default:
				System.out.println("Pogresna opcija.");
				break;
			}
			if (kasa <= 0&& opc==0)
				break;
			System.out.print("Izaberite opciju - ");
			opc = sc.nextInt();
		}
		System.out.println("Hvala sto koristite nase usluge.");

	}

}
