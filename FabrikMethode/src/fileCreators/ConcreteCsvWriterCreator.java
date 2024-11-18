package fileCreators;

import java.io.IOException;

public class ConcreteCsvWriterCreator extends WriterCreator {
	
	// ConcreteCsvWriterCreator (Konkrete Fabrik-Klasse)
	// Diese Klasse implementiert factoryMethod() und gibt eine Instanz von ConcreteCsvWriterProduct zurück.
	// Wenn ein Problem beim Erstellen des Writer auftritt, wird eine Excetion geworfen
	

	// Hierbei handelt es sich um die Konkrete Fabrik-Klasse, diese implementiert die FabrikMethode
	// und gibt eine Instanz von ConcreteCsvWriterProduct zurück.
	
	@Override
    public WriterProduct factoryMethod() throws IOException {
		return new ConcreteCsvWriterProduct();
    }
}