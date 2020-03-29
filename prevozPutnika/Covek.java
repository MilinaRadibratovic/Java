package prevozPutnika;



public class Covek {

	private String ime;
	private String prezime;
	
	
	public Covek(String ime, String prezime) {
		super();
		String i=ime.substring(0, 1).toUpperCase();
		String p=prezime.substring(0,1).toUpperCase();
		this.ime =i+ime.substring(1).toLowerCase();
		this.prezime = p+prezime.substring(1).toLowerCase();
	}


	public String getIme() {
		return ime;
	}


	public String getPrezime() {
		return prezime;
	}






	
	
	
	
	
}
