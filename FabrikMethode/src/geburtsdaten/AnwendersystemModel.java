package geburtsdaten;

// Importiere benötigte Klassen für IO
import java.io.IOException;

import fileCreators.ConcreteCsvWriterCreator;
import fileCreators.ConcreteTxtWriterCreator;
import fileCreators.WriterCreator;
import fileCreators.WriterProduct;

// Die Fabrik-Methode anwenden
public class AnwendersystemModel {

	private WriterCreator csvCreator; // Verwende eine WriterCreator-Instanz fuer CSV
	private WriterCreator txtCreator; // Verwende eine WriterCreator-Instanz fuer txt

	public AnwendersystemModel() {
		// Erstelle die konkrete Creator-Instanz (hier z.B. ConcreteCsvWriterCreator)
		this.csvCreator = new ConcreteCsvWriterCreator();
		this.txtCreator = new ConcreteTxtWriterCreator();
	}

	public String getUeberschrift() {
		return "Geburtsdatum eingeben";
	}

	// Neue Methode für das Schreiben in die Datei mithilfe der Fabrik-Methode
	public void schreibeGeburtsdatumInDatei(Geburtsdatum geburtsdatum) throws IOException {
		  // Erstelle das CSV-WriterProduct
        WriterProduct csvWriterProduct = this.csvCreator.factoryMethod();
        if (csvWriterProduct != null) {
            csvWriterProduct.fuegeZeileHinzu(geburtsdatum);

        } else {
            throw new IOException("CSV WriterProduct konnte nicht erstellt werden.");
        }

        // Erstelle das TXT-WriterProduct
        WriterProduct txtWriterProduct = this.txtCreator.factoryMethod();
        if (txtWriterProduct != null) {
            txtWriterProduct.fuegeZeileHinzu(geburtsdatum);
           
        } else {
            throw new IOException("TXT WriterProduct konnte nicht erstellt werden.");
        }
	}
}
