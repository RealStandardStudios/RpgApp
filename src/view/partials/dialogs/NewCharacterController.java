package view.partials.dialogs;

import java.io.IOException;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import jefXif.DialogController;
import jefXif.Gui;
import jefXif.WindowController;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.AbilityName;
import pathfinder.data.Character.Character;
import view.partials.dialogs.partials.NewCharacterPartialController;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class NewCharacterController extends DialogController implements jefXif.interfaces.PartialLoader{
	
	public final String programRoot = "../../../../../";
	String[] partialNames = new String[] {
		"AbilityScores","Class","Equipment","Feat","Profile","Race","Skills","Summary"
	};
	
	private HashMap<String,NewCharacterPartialController> partials;
	
	//region tab Panes
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
	//endregion
	
	@FXML
	TabPane tpTabs;
	
	Character newCharacter;
	
	
	public NewCharacterController() {
		newCharacter = new Character();
	}

	@Override
	public void initialize() {
		
	}
	
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
	
	@FXML
	private void handleTabChanged(Event event) {
		Tab tabChanged = (Tab) event.getSource();
		//System.out.println(tabChanged.getId());
		switch (tabChanged.getId()) {
		case "tpAbilityScores":
			getPartials().get("Race").getData();
			getPartials().get("Class").getData();
			if(getPartials()!=null)getPartials().get("AbilityScores").setData();
			break;
			
		case "tpRace":
			
			break;
			
		case "tpClass":
			
			break;
			
		case "tpSkills":
			getPartials().get("Class").getData();
			getPartials().get("Race").getData();
			
			getPartials().get("Skills").setData();
			break;
			
		case "tpFeats":
			
			break;
		case "tpEquipment":
			getPartials().get("Class").getData();
			getPartials().get("Race").getData();
			getPartials().get("Feat").getData();
			
			if(getPartials()!=null)getPartials().get("Equipment").setData();
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
			getCharacter().setLevel(1);
			
			getPartials().get("Summary").setData();
			break;
		default:
			break;
		}
	}
	
//	public void recheckWealthRoll()
//	{
//		if(partials != null)
//		{
//			partials.get("Equipment").setData();
//		}
//	}
	
	@Override
	public void handleOkay(ActionEvent event) {
		System.out.println("Look at how much this is saving right now");
	}
	
	@FXML
	public void handleBack(ActionEvent event) {
		if(tpTabs.getSelectionModel().selectedIndexProperty().get()>0)
			tpTabs.getSelectionModel().select(tpTabs.getSelectionModel().selectedIndexProperty().get()-1);
	}
	
	@FXML
	public void handleNext(ActionEvent event) {
		if(tpTabs.getSelectionModel().selectedIndexProperty().get()<partialNames.length-1)
			tpTabs.getSelectionModel().select(tpTabs.getSelectionModel().selectedIndexProperty().get()+1);
	}

	public void loadPartials() {
		partials = new HashMap<String, NewCharacterPartialController>();
		for (String string : partialNames) {
			try {
				getPartials().put(string, (NewCharacterPartialController)loadPartial(string, getInterface()));
			} catch (IOException e) {
				Dialogs.create().title("Read Error").masthead("There was an error with loading the UI").message(e.getMessage()).showWarning();
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

	public Character getCharacter() {
		return this.newCharacter;
	}

	public void setAbilities() {
		getCharacter().setStrength(new Ability(AbilityName.Strength, 8));
		getCharacter().setDexterity(new Ability(AbilityName.Dexterity, 8));
		getCharacter().setConstitution(new Ability(AbilityName.Dexterity, 8));
		getCharacter().setIntelligence(
				new Ability(AbilityName.Intelligence, 8));
		getCharacter().setWisdom(new Ability(AbilityName.Wisdom, 8));
		getCharacter().setCharisma(new Ability(AbilityName.Charisma, 8));
	}

	public HashMap<String,NewCharacterPartialController> getPartials() {
		return partials;
	}
}
