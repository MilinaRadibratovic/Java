package zadatak10;

public class Klubovi {

	private Klub[] svi;
	private int pozicija;

	public Klubovi() {
		svi = new Klub[30];
	}

	public void dodajKlub(Klub k) {
		svi[pozicija] = k;
		pozicija++;

	}

	}

