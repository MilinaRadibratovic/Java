package prevozPutnika;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Putnik[]p=new Putnik[55];
		
		Putnik p1=new Putnik("marko","markovic",321.21);
		Putnik p2=new Putnik("NIKOLA","NIKOLIC",320.00);
		Putnik p3=new Putnik("Lazar","Lazarevic",292.03);
		Putnik p4=new Putnik("ivan","Ivanovic",320);
		
		Vozac v=new Vozac("Milan","Milanovic");
		Autobus a1=new Autobus("Lasta",p,300.00);
		
		a1.dodajPutnika(p3);
		a1.dodajPutnika(p2);
		a1.dodajPutnika(p1);
		a1.dodajPutnika(p4);
		a1.naplata(p1);
		System.out.println(a1);
		
		a1.dodajVozaca(v);
		System.out.println(a1);
		
		a1.naplata(p1);
		a1.naplata(p2);
		a1.naplata(p3);
		a1.naplata(p4);
		System.out.println(a1);
		
		p3.dodajNovac(30);
		a1.dodajPutnika(p3);
		a1.naplata(p3);
		System.out.println(a1);
		
		a1.ukloniPutnika(p1);
		System.out.println(a1);
	}

}
