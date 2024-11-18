package geburtsdaten;

import javafx.stage.Stage;

public class AnwendersystemControl {

    private AnwendersystemModel anwModel;
    private AnwendersystemView anwView;

    public AnwendersystemControl(Stage primaryStage) {
        this.anwModel = new AnwendersystemModel();
        this.anwView = new AnwendersystemView(this, primaryStage, anwModel);
    }

    public void schreibeInDatei(Geburtsdatum geburtsdatum) {
        try {
            // Rufe die neue Methode im Model auf
            this.anwModel.schreibeGeburtsdatumInDatei(geburtsdatum);
            this.anwView.zeigeInformationsfensterAn("Das Geburtsdatum wurde in die Datei geschrieben.");
        } catch (Exception exc) {
            this.anwView.zeigeFehlermeldungAn("Fehler beim Schreiben in die Datei.");
        }
    }
}