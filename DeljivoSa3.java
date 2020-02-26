package zadatak4;

public class Zadatak_2_0221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce prebrojati koliko je brojeva od 9 do 250
		 * (ukljucujuci i njih) deljivih brojem 3
		 */

		int i;
		int t = 250;
		int n = 1;
		for (i = 9; i % 3 == 0 && i <= t; i += 3) {
			for (; n <= (t - i) / 3; n++) {
			}
		}
		System.out.println(n + " broj je deljiv sa 3.");

	}

}
