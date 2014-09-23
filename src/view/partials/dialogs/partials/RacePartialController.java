package view.partials.dialogs.partials;

import java.io.File;

import org.controlsfx.dialog.Dialogs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Classes.Class;
import pathfinder.data.Races.Race;

public class RacePartialController extends NewCharacterPartialController {
	
	//region FXML Fields
	@FXML
	Label lblName;
	@FXML
	Label lblDescription;
	@FXML
	Label lblPDescription;
	@FXML
	Label lblSociety;
	@FXML
	Label lblRaceRelations;
	@FXML
	Label lblAlignment;
	@FXML
	Label lblAdventures;
	@FXML
	Label lblRacialModifiers;
	@FXML
	Label lblSize;
	@FXML
	Label lblSpeed;
	@FXML
	Label lblVision;
	@FXML
	Label lblTraits;
	@FXML
	Label lblWeapons;
	@FXML
	Label lblLanguages;
	
	//endregion
	
	ObservableList<Race> races;
	
	@Override
	public void initialize() {
		races = FXCollections.observableArrayList();
		
		setData();
	}

	@Override
	public void setData() {
		readRaces();
	}

	private void readRaces() {
		File file = new File(this.getClass().getResource("").getPath()
				+ programRoot + "PathfinderData/data");
		File featsFile = new File(file.getPath() + "\\Races.rdf");
		try {
			races.setAll(readDataFile(featsFile, Race.class));
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error")
					.masthead("Couldn't read the Class File Properly")
					.message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}

}
