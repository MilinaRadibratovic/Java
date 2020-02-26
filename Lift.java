package zadatak2;

import java.util.Scanner;

public class Zadatak_1_0206 {

	public static void main(String[] args) {
		/*
		 * 1. U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava
		 * da li ce lift bezbedno krenuti u zavisnostii od tezine koju treba da ponese.
		 * Podrazumevane 3 opcije: Lift je preopterecen; Na granici je; Lift je pokrenut
		 * (zahtevi zadatka namerno nisu dalje razradjivani jer 1) ostavljam vasojmasti
		 * na volju 2) zelim da budem upucena u vas tok razmisljanja).
		 */

		Scanner sc = new Scanner(System.in);
		int max = 680;
		int min = 30;

		System.out.print("Unesite broj kilograma da bi se vozili liftom - ");
		int x = sc.nextInt();		
		if (x <= 0)
			System.out.println("Uneli ste pogresnu vrednost.");
		else if (x < 30)
			System.out.println("Nemate dovoljno kilograma.");
		else if (x > max)
			System.out.println("Lift je preopterecen.");

		else  {
			while (x >= min && x <= max) {
				System.out.print("Izaberite sprat od 0 do 10 - ");
				int sp = sc.nextInt();
				switch (sp) {
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.println("Nalazite se na " + sp + " spratu");
					break;
				default:
					System.out.println("Pogresan sprat.");
					continue;
				}
				if (x == max)
					System.out.println("Lift je dostigao maksimalno dozvoljeno opterecenje.");
				else if (x > max)
					System.out.println("Lift je preopterecen.");
				
				
				System.out.print("Unesite broj kilograma da bi se vozili liftom - ");
				x = x + sc.nextInt();
			}

			if (x == max)
				System.out.println("Lift je dostigao maksimalno dozvoljeno opterecenje.");
			else if (x > max)
				System.out.println("Lift je preopterecen.");
		}

	}
}
