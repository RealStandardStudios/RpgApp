package view.partials;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
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
	
	@FXML
	Button btnLevelUp;
	
	@Override
	public void initialize() {
		columnClass.setCellValueFactory(cellData->cellData.getValue().getNameProperty());
		columnLevels.setCellValueFactory(cellData->cellData.getValue().getLevelProp());
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
		lblLevel.setText(""+(character.getLevel() + 1));
		lblExp.setText(""+character.getExperienceValue());
		tableClasses.setItems(FXCollections.observableArrayList(character.getClasses()));
	}
	
	@FXML
	public void addExp()
	{
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("AddExpDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Add Exp To Character");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initStyle(StageStyle.UTILITY);
			dialogStage.initOwner(this.getInterface().getPrimaryStage());
			dialogStage.resizableProperty().set(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			// Set the person into the controller.
			AddExpController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			controller.setInterface(getInterface());
			controller.loadPartials(((RootController) getRoot()).getCharacter(), this);
			dialogStage.onCloseRequestProperty().set(new EventHandler<WindowEvent>() {
				
				@Override
				public void handle(WindowEvent event) {
					controller.handleCancel(null);
				}
			});

			// Show the dialog and wait until the user closes it
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@FXML
	public void handleLevelUp()
	{
		/*
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("dialogs/LevelUpDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("LEVEL UP!");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initStyle(StageStyle.UTILITY);
			dialogStage.initOwner(this.getInterface().getPrimaryStage());
			dialogStage.resizableProperty().set(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			// Set the person into the controller.
			LevelUpController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			controller.setInterface(getInterface());
			//controller.loadPartials();
			dialogStage.onCloseRequestProperty().set(new EventHandler<WindowEvent>() {
				
				@Override
				public void handle(WindowEvent event) {
					controller.handleCancel(null);
				}
			});

			// Show the dialog and wait until the user closes it
			dialogStage.showAndWait();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
	
	public void updateExp()
	{
		int oldLevel = Integer.parseInt(lblLevel.getText());
		pathfinder.data.Character.Character character = ((RootController) getRoot()).getCharacter();
		
		if(oldLevel < character.getLevel())
		{
			btnLevelUp.setDisable(false);
			btnLevelUp.setVisible(true);
		}
		
		if(character.getLevel() < 20)
		{
			lblLevel.setText(""+(character.getLevel() + 1));
		}
		else
		{
			lblLevel.setText("At Max Level");
		}
		lblExp.setText(""+character.getExperienceValue());
		character.getClasses()[0].setLevel(character.getLevel());
		tableClasses.setItems(null);
		this.initialize();
		tableClasses.setItems(FXCollections.observableArrayList(character.getClasses()));
	}
}
