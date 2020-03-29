package ucionica;

public class Glavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polaznik p1 = new Polaznik("Marko", "Markovic");		
		Polaznik p2 = new Polaznik("Nikola", "Nikolic");
		Polaznik p3 = new Polaznik("Milos", "Milosevic");

		Laptop l1 = new Laptop("Dell");
		Laptop l2 = new Laptop("HP");
		Laptop l3 = new Laptop("Toshiba");

		l1.setP(p3);
		l1.setP(p2);
		
		l2.setP(p3);
		l2.setP(p1);
		l2.setP(p2);
		
		l3.setP(p1);
		System.out.println(l2);
		l2.remove(p1);
		System.out.println(l2);

	}
}