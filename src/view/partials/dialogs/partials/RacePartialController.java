package view.partials.dialogs.partials;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Races.Race;

public class RacePartialController extends NewCharacterPartialController {
	
	Race selectedRace;

	//region FXML Fields
	@FXML
	ComboBox<Race> cboRaces;
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
		cboRaces.setItems(races);
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
	
	@FXML
	private void handleSelectionChanged() {
		selectedRace = cboRaces.getValue();
		lblName.setText(selectedRace.getName());
		lblDescription.setText(selectedRace.getDescription());
		lblPDescription.setText(selectedRace.getPhysicalDescription());
		lblRaceRelations.setText(selectedRace.getRelations());
		lblAlignment.setText(selectedRace.getAlignmentAndReligion());
		lblAdventures.setText(selectedRace.getAdventures());
	}

	@Override
	public void getData() {
		this.getCharacter().setRace(selectedRace);
	}
}
