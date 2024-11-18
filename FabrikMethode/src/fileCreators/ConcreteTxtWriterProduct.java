package fileCreators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import geburtsdaten.Geburtsdatum;

public class ConcreteTxtWriterProduct extends WriterProduct {

    private BufferedWriter writer;

    public ConcreteTxtWriterProduct() throws IOException {
    	writer = new BufferedWriter(new FileWriter("Geburtsdaten.txt", true));
    }

    @Override
    public void fuegeZeileHinzu(Geburtsdatum geburtsdatum) throws IOException {
    	writer.write(geburtsdatum.gibGeburtsdatumZurueck(';'));
    	writer.newLine();
    	writer.flush();
    	writer.close();
    }

}