package fileCreators;

import java.io.IOException;

public abstract class WriterCreator {
	
	// WriterCreator (Abstrakte Fabrik-Klasse)
	// Diese Klasse enthält eine abstrakte Methode factoryMethod(), die die Erstellung eines WriterProduct-Objekts
	// definiert. Die konkrete Implementierung dieser Methode ist in der Klasse ConcreteCsvWriterCreator.
	
	
	// FabrikMethode, die eine Instanz von einem ConcreteProduct innerhalb einer ConcreteCreator Klasse erstellt!
	
	// Eine ConcreteCreator Unterklasse verirbt diese WriterCreator Oberklasse,
	// damit diese die FabrikMethode überschreibt,
	// um wie schon oben genannt einen "return new ConcreteProduct" zu erstellen.
	
	// Auf diese Art und Weise kann man ganz einfach mehrere Konkrete Produkt Klassen erstellen, die z.B statt
	// nur in eine Csv-Datei auch in eine .txt, JSON oder sonstige Dateien reinschreiben kann!
	public abstract WriterProduct factoryMethod() throws IOException;

}
