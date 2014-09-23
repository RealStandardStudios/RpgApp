package view.partials.dialogs;

import java.io.IOException;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import jefXif.DialogController;
import jefXif.Gui;
import jefXif.WindowController;
import jefXif.interfaces.PartialLoader;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Character;
import pathfinder.data.Classes.Class;
import pathfinder.data.Races.Race;
import view.partials.dialogs.partials.NewCharacterPartialController;

/**
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class NewCharacterController extends DialogController implements PartialLoader{
	
	public final String programRoot = "../../../../../";
	String[] partialNames = new String[] {
		"AbilityScores","Class","Equipment","Feat","Profile","Race","Skills"
	};
	
	HashMap<String,NewCharacterPartialController> partials;
	
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
	
	//endregion
	
	@FXML
	TabPane tpTabs;
	
	Character newCharacter;

	@Override
	public void initialize() {
		newCharacter = new Character();
	}
	
	@Override
	public WindowController loadPartial(String name, Gui ui) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource("partials/" + name + "Partial.fxml"));
		
		AnchorPane partial = loader.load();
		WindowController controller = loader.getController();
		controller.setInterface(ui);
		controller.setNode(partial);
		((NewCharacterPartialController)controller).setCharacter(newCharacter); 
		return controller;
	}

	@Override
	public void handleOkay(ActionEvent event) {
		// TODO Auto-generated method stub

	}
	
	@FXML
	public void handleBack(ActionEvent event) {
		if(tpTabs.getSelectionModel().selectedIndexProperty().get()>0)
			tpTabs.getSelectionModel().select(tpTabs.getSelectionModel().selectedIndexProperty().get()-1);
	}
	
	@FXML
	public void handleNext(ActionEvent event) {
		if(tpTabs.getSelectionModel().selectedIndexProperty().get()<6)
			tpTabs.getSelectionModel().select(tpTabs.getSelectionModel().selectedIndexProperty().get()+1);
		String selectedTab = tpTabs.getSelectionModel().getSelectedItem().tabPaneProperty().get().getId();
		switch (selectedTab) {
		case "Class":
			newCharacter.setClasses(new Class[]{(Class) partials.get(selectedTab).getData()});
			break;
		case "Race":
			newCharacter.setRace((Race) partials.get(selectedTab).getData());
			break;

		default:
			break;
		}
	}

	public void loadPartials() {
		partials= new HashMap<String, NewCharacterPartialController>();
		for (String string : partialNames) {
			try {
				partials.put(string, (NewCharacterPartialController)loadPartial(string, getInterface()));
			} catch (IOException e) {
				Dialogs.create().title("Read Error").masthead("There was an error with loading the UI").message(e.getMessage()).showWarning();
				e.printStackTrace();
			}
		}
		apAbilityScores.getChildren().setAll(partials.get(partialNames[0]).getNode());
		apClass.getChildren().setAll(partials.get(partialNames[1]).getNode());
		apEquipment.getChildren().setAll(partials.get(partialNames[2]).getNode());
		apFeats.getChildren().setAll(partials.get(partialNames[3]).getNode());
		apProfile.getChildren().setAll(partials.get(partialNames[4]).getNode());
		apRace.getChildren().setAll(partials.get(partialNames[5]).getNode());
		apSkills.getChildren().setAll(partials.get(partialNames[6]).getNode());		
	}
}
