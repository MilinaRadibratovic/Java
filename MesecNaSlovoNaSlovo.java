package zadatak2;

import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		/*
		 * 2.Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima
		 * meseci u godini koji pocinju na to slovo(na taj glas) - za resavanje ovog
		 * zadatka koristiti switch
		 */
		
		Scanner sc = new Scanner(System.in);
		String mesec = sc.next();

		switch (mesec) {
		case "januar":
		case "jun":
		case "jul":
			System.out.println("3");
			break;
		case "februar":
		case "avgust":
		case "septembar":
		case "oktobar":
		case "novembar":
		case "decembar":
			System.out.println("1");
			break;
		case "mart":
		case "maj":
			System.out.println("2");
			break;
		default:
			System.out.println("Uneli ste pogresan naziv meseca");
			break;
		}

	}

}