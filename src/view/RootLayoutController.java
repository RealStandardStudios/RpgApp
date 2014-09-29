package view;

import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import jefXif.WindowController;
import window.Interface;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class RootLayoutController {
	private Interface ui;
	
	private HashMap<String, WindowController> windowPartials;
	
	@FXML
	private BorderPane rootLayout;
	
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

	public Interface getInterface() {
		return ui;
	}

	public void setInterface(Interface ui) {
		this.ui = ui;
	}
	
	public void setWindowPartials(HashMap<String, WindowController>windowPartials) {
		this.windowPartials = windowPartials;
	}
}
