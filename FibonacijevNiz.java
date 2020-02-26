package zadatak4;

import java.util.Scanner;

public class Zadatak_4_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
		 */
		// 0 1 1 2 3 5 8 13

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj ispisa koje zelite - ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 0;

		if (n >= 1)
			System.out.print(a + " ");
		if (n >= 2)
			System.out.print(b + " ");
		if (n > 2) {
			for (int i = 0; i + 2 < n; i++) {
				c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}
	}

}
