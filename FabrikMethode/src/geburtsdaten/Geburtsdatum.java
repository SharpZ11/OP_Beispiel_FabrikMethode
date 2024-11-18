package geburtsdaten;

public class Geburtsdatum {

	private String geburtstag;
	private String geburtsmonat;
	private String geburtsjahr;

	public Geburtsdatum(String geburtstag, String geburtsmonat, String geburtsjahr) {
		this.geburtstag = geburtstag;
		this.geburtsmonat = geburtsmonat;
		this.geburtsjahr = geburtsjahr;
	}

	public String gibGeburtsdatumZurueck(char trenner) {
		return "" + this.getGeburtstag() + trenner 
				+ this.getGeburtsmonat() + trenner 
				+ this.getGeburtsjahr();
	}

	public String getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}

	public String getGeburtsmonat() {
		return geburtsmonat;
	}

	public void setGeburtsmonat(String geburtsmonat) {
		this.geburtsmonat = geburtsmonat;
	}

	public String getGeburtsjahr() {
		return geburtsjahr;
	}

	public void setGeburtsjahr(String geburtsjahr) {
		this.geburtsjahr = geburtsjahr;
	}

}
