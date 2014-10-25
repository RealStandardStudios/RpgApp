package view.partials.dialogs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.stage.DirectoryChooser;
import jefXif.io.Data;
import jefXif.view.DialogController;
import jefXif.view.Gui;
import jefXif.view.WindowController;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.AbilityName;
import pathfinder.data.Character.Character;
import pathfinder.data.Effects.AbilityEffect;
import pathfinder.data.Races.Traits.Trait;
import rpg.MainApp;
import view.partials.dialogs.partials.NewCharacterPartialController;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
@SuppressWarnings("deprecation")
public class NewCharacterController extends DialogController implements jefXif.interfaces.PartialLoader {

	String[] partialNames = new String[] { "AbilityScores", "Class", "Equipment", "Feat", "Profile", "Race", "Skills", "Summary" };

	private HashMap<String, NewCharacterPartialController> partials;

	@FXML
	Button btnSave;

	// region tab Panes
	@FXML
	AnchorPane apAbilityScores;
	@FXML
	AnchorPane apRace;
	@FXML
	AnchorPane apClass;
	@FXML
	AnchorPane apSkills;
	@FXML
	AnchorPane apFeats;
	@FXML
	AnchorPane apEquipment;
	@FXML
	AnchorPane apProfile;
	@FXML
	AnchorPane apSummary;
	// endregion

	@FXML
	TabPane tpTabs;

	Character newCharacter;
	boolean aeAdded = false;
	boolean teAdded = false;
	public boolean raceSelected = false;
	public boolean classSelected = false;
	public boolean alignmentSelected = false;
	public boolean Selected = false;

	/**
	 * Base Constructor
	 */
	public NewCharacterController() {
		newCharacter = new Character();
	}

	@Override
	public void initialize() {

	}

	/**
	 * loads all the partials required for a New Character
	 */
	@Override
	public WindowController loadPartial(String name, Gui ui) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("partials/" + name + "Partial.fxml"));

		AnchorPane partial = loader.load();
		NewCharacterPartialController controller = loader.getController();
		controller.setInterface(ui);
		controller.setNode(partial);
		controller.setParentWindow(this);
		return controller;
	}

	/**
	 * handler for the Tab Changed event
	 * 
	 * @param event
	 */
	@FXML
	private void handleTabChanged(Event event) {
		Tab tabChanged = (Tab) event.getSource();
		// System.out.println(tabChanged.getId());
		switch (tabChanged.getId()) {
		case "tpAbilityScores":
			getPartials().get("Race").getData();
			getPartials().get("Class").getData();
			if (getCharacter().getEffects().size() > 0)
				getCharacter().setEffects(new ArrayList<>());
			if (!aeAdded) {
				for (AbilityEffect effect : getCharacter().getRace().getRacialModifiers()) {
					getCharacter().getEffects().add(effect);
				}
				aeAdded = true;
			}
			if (!teAdded) {
				for (Trait t : getCharacter().getRace().getRacialTraits()) {
					getCharacter().getEffects().add(t.getEffect());
				}
				teAdded = true;
			}
			if (getPartials() != null)
				getPartials().get("AbilityScores").setData();
			break;

		case "tpRace":

			break;

		case "tpClass":

			break;

		case "tpSkills":
			getPartials().get("Class").getData();
			getPartials().get("Race").getData();
			getCharacter().setLevel(1);

			getPartials().get("Skills").setData();
			break;

		case "tpFeats":

			break;
		case "tpEquipment":
			getPartials().get("Class").getData();
			getPartials().get("Race").getData();
			getPartials().get("Feat").getData();

			if (getPartials() != null)
				getPartials().get("Equipment").setData();
			break;

		case "tpProfile":
			getPartials().get("Class").getData();
			getPartials().get("Profile").setData();
			break;

		case "tpSummary":
			getPartials().get("Equipment").getData();
			getPartials().get("Class").getData();
			getPartials().get("Race").getData();
			getPartials().get("Skills").getData();
			getPartials().get("Feat").getData();
			getPartials().get("Profile").getData();

			getPartials().get("Summary").setData();
			btnSave.disableProperty().set(false);
			break;
		default:
			break;
		}
	}

	/**
	 * handler for the Okay event
	 */
	@Override
	public void handleOkay(ActionEvent event) {
		if (!btnSave.isDisabled()) {
			try {
				saveCharacter();
			} catch (IOException e) {
//				e.printStackTrace();
				Dialogs.create().title("ERROR").masthead("There was an Error saving the Character").message(e.getStackTrace().toString()).showWarning();
			}
		}
	}

	/**
	 * handler for the Cancel event
	 */
	@Override
	@FXML
	public void handleCancel(ActionEvent event) {
		this.newCharacter = null;
		getDialogStage().close();
	}

	/**
	 * allows for saving a New Character
	 * 
	 * @throws IOException
	 */
	private void saveCharacter() throws IOException {
		DirectoryChooser directoryChooser = new DirectoryChooser();

		directoryChooser.setTitle("Data Directory");
		File defaultDirectory = new File(MainApp.class.getResource("").getPath() + "\\..\\characters");
		if (!defaultDirectory.exists())
			defaultDirectory.mkdirs();
		directoryChooser.setInitialDirectory(defaultDirectory);
		// Show the directory chooser
		File file = directoryChooser.showDialog(this.getInterface().getPrimaryStage());

		if (file != null) {
			this.getDialogStage().close();
			Data.Write(file.getPath() + "\\" + getCharacter().getName() + ".cdf", newCharacter);
		}
	}

	/**
	 * handler for the Back event
	 * 
	 * @param event
	 */
	@FXML
	public void handleBack(ActionEvent event) {
		if (tpTabs.getSelectionModel().selectedIndexProperty().get() > 0)
			tpTabs.getSelectionModel().select(tpTabs.getSelectionModel().selectedIndexProperty().get() - 1);
	}

	/**
	 * handler for the Next event
	 * 
	 * @param event
	 */
	@FXML
	public void handleNext(ActionEvent event) {
		int pageNumber = tpTabs.getSelectionModel().getSelectedIndex();
		if (alignmentSelected && pageNumber == 6) {
			goToNext();
		} else if (!alignmentSelected && pageNumber == 6) {
			Dialogs.create().title("Selection error").masthead("Please Select An Alignment")
					.message("Please select a alignment from the checkboxs below").styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
		}
		if (classSelected && pageNumber == 1) {
			goToNext();
		} else if (!classSelected && pageNumber == 1) {
			Dialogs.create().title("Selection error").masthead("Please Select A Class ").message("Please select a class from the dropdown menu")
					.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
		}
		if (raceSelected && pageNumber == 0) {
			goToNext();
		} else if (!raceSelected && pageNumber == 0) {
			Dialogs.create().title("Selection error").masthead("Please Select A Race ").message("Please select a race from the dropdown menu")
					.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
		}
		if (pageNumber > 1 && pageNumber < 6) {
			goToNext();
		}
	}

	/**
	 * method for navigating the tabs
	 */
	void goToNext() {
		if (tpTabs.getSelectionModel().selectedIndexProperty().get() < partialNames.length - 1)
			tpTabs.getSelectionModel().select(tpTabs.getSelectionModel().selectedIndexProperty().get() + 1);
		tpTabs.getSelectionModel().getSelectedItem().setDisable(false);
	}

	/**
	 * method for loading the partials
	 */
	public void loadPartials() {
		partials = new HashMap<String, NewCharacterPartialController>();
		for (String string : partialNames) {
			try {
				getPartials().put(string, (NewCharacterPartialController) loadPartial(string, getInterface()));
			} catch (IOException e) {
				Dialogs.create().title("Read Error").masthead("There was an error with loading the UI").message(e.getMessage())
						.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
				e.printStackTrace();
			}
		}
		getPartials().get(partialNames[0]).setData();
		apAbilityScores.getChildren().setAll(getPartials().get(partialNames[0]).getNode());
		apClass.getChildren().setAll(getPartials().get(partialNames[1]).getNode());
		apEquipment.getChildren().setAll(getPartials().get(partialNames[2]).getNode());
		apFeats.getChildren().setAll(getPartials().get(partialNames[3]).getNode());
		apProfile.getChildren().setAll(getPartials().get(partialNames[4]).getNode());
		apRace.getChildren().setAll(getPartials().get(partialNames[5]).getNode());
		apSkills.getChildren().setAll(getPartials().get(partialNames[6]).getNode());
		apSummary.getChildren().setAll(getPartials().get(partialNames[7]).getNode());
	}

	/**
	 * a get method so that each view can access the main controller
	 * 
	 * @returns a Character
	 */
	public Character getCharacter() {
		return this.newCharacter;
	}

	/**
	 * sets the base abilities for a New Character
	 */
	public void setAbilities() {
		getCharacter().setStrength(new Ability(AbilityName.Strength, 8));
		getCharacter().setDexterity(new Ability(AbilityName.Dexterity, 8));
		getCharacter().setConstitution(new Ability(AbilityName.Dexterity, 8));
		getCharacter().setIntelligence(new Ability(AbilityName.Intelligence, 8));
		getCharacter().setWisdom(new Ability(AbilityName.Wisdom, 8));
		getCharacter().setCharisma(new Ability(AbilityName.Charisma, 8));
	}

	/**
	 * gets the Partials
	 * 
	 * @returns a HashMap<String, NewCharacterPartialController>
	 */
	public HashMap<String, NewCharacterPartialController> getPartials() {
		return partials;
	}

	/**
	 * sets Ability effects
	 * 
	 * @param b
	 */
	public void setAeAdded(boolean b) {
		this.aeAdded = b;
	}

	/**
	 * sets Trait effects
	 * 
	 * @param b
	 */
	public void setTeAdded(boolean b) {
		this.teAdded = b;
	}
}
