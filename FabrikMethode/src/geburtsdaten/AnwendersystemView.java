package geburtsdaten;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
//Zeigt die Daten als Oberflächenelemente an
public class AnwendersystemView {

	private AnwendersystemControl anwControl;
	private AnwendersystemModel anwModel;
	// Eingabefenster Element-Objekte erzeugt
	private GridPane grid = new GridPane();
	private Button btnTest = new Button("Geburtsdatum eingabe");
	private Label labelTag = new Label("Geburtstag");
	private TextField txtTag = new TextField();
	private Label labelMonat = new Label("Geburtsmonat");
	private TextField txtMonat = new TextField();
	private Label labelJahr = new Label("Geburtsjahr");
	private TextField txtJahr = new TextField();

	// Konstruktor anpassung durch Aufruf vom Konstruktor in AnwendersystemControl
	// mit diesen Übergabeparametern (aufgrund von Sequenzdiagramm!)
	public AnwendersystemView(AnwendersystemControl anwControl, Stage primaryStage, AnwendersystemModel anwModel) {
		// Zuweisung der Parameter zu den Instanzvariablen
		this.anwControl = anwControl;
		this.anwModel = anwModel;
		// Erzeugung des Eingabefensters
		this.grid.setAlignment(Pos.CENTER);
		this.grid.setHgap(10);
		this.grid.setVgap(10);
		this.grid.setPadding(new Insets(25, 25, 25, 25));
		
		// Den String dann zur PrimaryStage übergeben, damit diese Angezeigt wird!
		primaryStage.setTitle(this.anwModel.getUeberschrift());
		Scene scene = new Scene(grid, 350, 150);
		primaryStage.setScene(scene);
		primaryStage.show();

		this.initKomponenten();
		this.initListener();
	}

	private void initKomponenten() {
		this.grid.add(this.labelTag, 0, 0);
		this.grid.add(this.txtTag, 1, 0);
		this.grid.add(this.labelMonat, 0, 1);		
		this.grid.add(this.txtMonat, 1, 1);
		this.grid.add(this.labelJahr, 0, 2);
		this.grid.add(this.txtJahr, 1, 2);
		this.grid.add(this.btnTest, 1, 3);
	}

	private void initListener() {
		btnTest.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				anwControl.schreibeInDatei(new Geburtsdatum(txtTag.getText() , txtMonat.getText() , txtJahr.getText()));
			}
		});
	}

	void zeigeInformationsfensterAn(String meldung) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information");
		alert.setContentText(meldung);
		alert.showAndWait();
	}

	void zeigeFehlermeldungAn(String meldung) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Fehlermeldung");
		alert.setContentText(meldung);
		alert.showAndWait();
	}

}