package zadatak4;

import java.util.Scanner;

public class Zadatak_3_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
		 * Primer: ulaz m=3, n=7; Izlaz (vidljivo u konzoli) Hint: koristiti dve for
		 * petlje;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dimenzije pravougaonika - ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		String a = "* ";
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a);
			}
			System.out.println();
		}

	}

}
