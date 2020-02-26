package zadatak3;

import java.util.Scanner;

public class Zadatak_1_0220 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva
		 * od 0 do n - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu
		 * vrstu petlje, vec samo jednu petlju). podrazumeva se da se n ucitava preko
		 * standardnog ulaza
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj - ");
		int n = sc.nextInt();
		int x = 0;
		int zbir = 0;
		int proizvod = 1;

		if (n > 0) {
			while (x < n) {
				if (n % 2 == 1) {
					zbir = zbir + x++;
					proizvod = proizvod * x++;
				} else {
					proizvod = proizvod * ++x;
					zbir = zbir + ++x;
				}
			}
			System.out.println("Zbir parnih iznosi " + zbir);
			System.out.println("Proizvod neparnih iznosi " + proizvod);
		} else {
			System.out.println("Pogresan unos");
		}
	}
}
