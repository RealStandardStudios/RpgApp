package view;

import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import jefXif.view.Gui;
import jefXif.view.RootLayoutController;
import jefXif.view.WindowController;
import pathfinder.data.Character.Character;
import view.partials.MainWindowController;
import window.Interface;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class RootController extends RootLayoutController {
	
	@FXML
	Label lblCharacterName;
	
	private Character character;
	
	/**
	 * @return the character
	 */
	public Character getCharacter() {
		return character;
	}
	/**
	 * @param character the character to set
	 */
	public void setCharacter(Character character) {
		this.character = character;
		this.lblCharacterName.setText(this.character.getName());
		for (MainWindowController window : windowPartials.values()) {
			window.setData();
		}
	}

	private HashMap<String, MainWindowController> windowPartials;
	
	
	@FXML
	private void handleCharacterAction(ActionEvent event) {
		SwapWindow(windowPartials.get("CharacterProfile").getNode());
	}
	@FXML
	private void handleCombatStatsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("CombatStats").getNode());
	}
	@FXML
	private void handleSpellsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Spells").getNode());
	}
	@FXML
	private void handleInventoryAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Inventory").getNode());
	}
	@FXML
	private void handleCombatAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Combat").getNode());
	}
	@FXML
	private void handleFeatsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Feats").getNode());
	}
	@FXML
	private void handleSkillsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Skills").getNode());
	}
	@FXML
	private void handleOtherCharacterAction(ActionEvent event) {
		SwapWindow(windowPartials.get("OtherCharacter").getNode());
	}
	
	private void SwapWindow(Node node) {
		rootLayout.setCenter(node);
	}

	public void setInterface(Gui ui) {
		this.ui = (Interface) ui;
	}
	
	public void setWindowPartials(HashMap<String, MainWindowController>windowPartials) {
		this.windowPartials = windowPartials;
	}
}
