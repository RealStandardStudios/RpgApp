package view.partials;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Classes.Class;
import view.RootController;

/**
 * The Controller for the Character Controller
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class CharacterProfileController extends MainWindowController {
	//region Profile Labels
	@FXML
	Label lblName;
	@FXML
	Label lblRace;
	@FXML
	Label lblHomeland;
	@FXML
	Label lblBackground;
	@FXML
	Label lblGender;
	@FXML
	Label lblHeight;
	@FXML
	Label lblWeight;
	@FXML
	Label lblAge;
	@FXML
	Label lblApperance;
	@FXML
	Label lblPersonality;
	@FXML
	Label lblAlignment;
	@FXML
	Label lblDeity;
	@FXML
	Label lblLanguages;
	//endregion
	
	//region Class labels
	@FXML
	Label lblClass;
	@FXML
	Label lblArchetype;
	@FXML
	Label lblLevel;
	@FXML
	Label lblExp;
	@FXML
	TableView<Class> tableClasses;
	@FXML
	TableColumn<Class, String> columnClass;
	@FXML
	TableColumn<Class, Integer> columnLevels;
	//endregion
	
	@Override
	public void initialize() {
		columnClass.setCellValueFactory(cellData->cellData.getValue().getNameProperty());
		columnLevels.setCellValueFactory(cellData->new SimpleObjectProperty<Integer>(cellData.getValue().getLevel()));
	}
	
	/**
	 * sets the data for the Character Profile
	 */
	public void setData() {
		pathfinder.data.Character.Character character = ((RootController) getRoot()).getCharacter();
		lblAge.setText(character.getFluff().get("Age"));
		lblAlignment.setText(character.getAlignment().name());
		lblApperance.setText(character.getFluff().get("Appearance"));
		lblBackground.setText(character.getFluff().get("Background"));
		lblDeity.setText(character.getFluff().get("Deities"));
		lblGender.setText(character.getFluff().get("Gender"));
		lblHeight.setText(character.getFluff().get("Height"));
		lblHomeland.setText(character.getFluff().get("HomeLand"));
		lblLanguages.setText(character.getLanguagesString());
		lblName.setText(character.getName());
		lblPersonality.setText(character.getFluff().get("Personality"));
		lblRace.setText(character.getRace().getName());
		lblWeight.setText(character.getFluff().get("Weight"));
		lblClass.setText(character.getClasses()[0].getName());
		lblLevel.setText(""+character.getLevel());
		lblExp.setText(""+character.getExperienceValue());
		tableClasses.setItems(FXCollections.observableArrayList(character.getClasses()));
	}
}
