package fileCreators;

import java.io.IOException;
import geburtsdaten.Geburtsdatum;

public abstract class WriterProduct {
	// WriterProduct (Abstrakte Produkt-Klasse)
	// Diese Klasse definiert die Methode fuegeZeileHinzu(), die von ConcreteCsvWriterProduct implementiert wird.
	// ConcreteCsvWriterProduct ist das konkrete Produkt, das die Logik zum Schreiben von CSV-Dateien enthält.
	
	
	// Hier werden abstrakte Methoden gebildet, die jedes potenzielle Produkt besitzt 
	// In diesem Fall handelt es sich hier um eine Methode, die eine Zeile 
	// in eine beliebige Datei hinzufuegen soll (hier ein Geburtsdatum)
	// Dabei kann es sich um eine Csv, txt oder jegliche andere Form handeln, die dann in der
	// ConcreteProduct landen wird, wobei diese Spezialisierungen weitere Methoden implementieren können, 
	// jedoch diese Abstrakte Methode vererben müssen und dessen Funktionalität implementieren.
	public abstract void fuegeZeileHinzu(Geburtsdatum geburtsdatum) throws IOException;
	
}
