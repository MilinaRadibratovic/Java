package zadatak1;

import java.util.Scanner;

public class Zadatak_1_0204 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se
		 * ivice prostorije ucitavaju preko konzole. (za pretpostavku uzeti da soba ima
		 * zidove oblika pravougaonika i da nema prozora).
		 */

		Scanner s = new Scanner(System.in);

		System.out.println("Unesite trazene podatke u metrima ");

		System.out.print("Duzina prostorije - ");
		float a = s.nextFloat();
		System.out.print("Sirina prostorije - ");
		float b = s.nextFloat();
		System.out.print("Visina prostorije - ");
		float c = s.nextFloat();
		System.out.print("Visina vrata - ");
		float d = s.nextFloat();
		System.out.print("Sirina vrata - ");
		float e = s.nextFloat();

		if (a > 0 && b > 0 && c > 0 && d > 0 && e >0 && e < b && e < a && d < c) {
			System.out.print("Povrsina prostorije za krecenje iznosi - ");
			System.out.print(((2 * (a * c) + 2 * (b * c) + (a * b)) - (d * e)) + "m2");
		} else {
			System.out.println("Uneli ste pogresne vrednosti.");
		}

	}

}
