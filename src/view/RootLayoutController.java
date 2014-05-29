package view;

import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import window.Interface;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class RootLayoutController {
	private Interface ui;
	
	private HashMap<String, Node> windowPartials;
	
	@FXML
	private BorderPane rootLayout;
	
	@FXML
	private void handleCharacterAction(ActionEvent event) {
		SwapWindow(windowPartials.get("CharacterFluff"));
	}
	@FXML
	private void handleCombatStatsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("CombatStats"));
	}
	@FXML
	private void handleSpellsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Spells"));
	}
	@FXML
	private void handleInventoryAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Inventory"));
	}
	@FXML
	private void handleCombatAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Combat"));
	}
	@FXML
	private void handleFeatsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Feats"));
	}
	@FXML
	private void handleSkillsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Skills"));
	}
	@FXML
	private void handleOtherCharacterAction(ActionEvent event) {
		SwapWindow(windowPartials.get("OtherCharacter"));
	}
	
	private void SwapWindow(Node node) {
		rootLayout.setCenter(node);
	}

	public Interface getInterface() {
		return ui;
	}

	public void setInterface(Interface ui) {
		this.ui = ui;
	}
	
	public void setWindowPartials(HashMap<String, Node>windowPartials) {
		this.windowPartials = windowPartials;
	}
}
