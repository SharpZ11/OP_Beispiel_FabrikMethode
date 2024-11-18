package fileCreators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import geburtsdaten.Geburtsdatum;

public class ConcreteCsvWriterProduct extends WriterProduct {
	
	// ConcreteCsvWriterProduct (Konkretes Produkt)
	// Diese Klasse implementiert die Methode fuegeZeileHinzu() und verwendet einen BufferedWriter, um die Daten
	// in eine CSV-Datei zu schreiben. Hier wird auch schließeWriter() definiert, um die Ressourcen freizugeben.
	
	private BufferedWriter writer;
	
	public ConcreteCsvWriterProduct() throws IOException{
		writer = new BufferedWriter(new FileWriter("Geburtsdaten.csv", true));
	}

	@Override
	public void fuegeZeileHinzu(Geburtsdatum geburtsdatum) throws IOException {
		writer.write(geburtsdatum.gibGeburtsdatumZurueck(';'));
		writer.newLine();
		writer.flush();
		writer.close();
	}
	
}
