package view;

import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import jefXif.view.Gui;
import jefXif.view.RootLayoutController;
import pathfinder.data.Character.Character;
import view.partials.MainWindowController;
import window.Interface;

/**
 * The Root Controller for the RogApp
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class RootController extends RootLayoutController {
	
	@FXML
	Label lblCharacterName;
	
	private Character character;
	
	/**
	 * simple get method for character
	 * 
	 * @returns the character
	 */
	public Character getCharacter() {
		return character;
	}
	
	/**
	 * simple set method
	 * 
	 * @param character the character to set
	 */
	public void setCharacter(Character character) {
		this.character = character;
		this.lblCharacterName.setText(this.character.getName());
		if(character!=null) {
			for (MainWindowController window : windowPartials.values()) {
				window.setData();
			}
		}
	}

	private HashMap<String, MainWindowController> windowPartials;
	
	/**
	 * handler for Character Profiles
	 * 
	 * @param event
	 */
	@FXML
	private void handleCharacterAction(ActionEvent event) {
		SwapWindow(windowPartials.get("CharacterProfile").getNode());
	}
	
	/**
	 * handler for Combat Statistics
	 * 
	 * @param event
	 */
	@FXML
	private void handleCombatStatsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("CombatStats").getNode());
	}
	
	/**
	 * handler for Spells
	 * 
	 * @param event
	 */
	@FXML
	private void handleSpellsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Spells").getNode());
	}
	
	/**
	 * handler for Inventory
	 * 
	 * @param event
	 */
	@FXML
	private void handleInventoryAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Inventory").getNode());
	}
	
	/**
	 * handler for Combat
	 * 
	 * @param event
	 */
	@FXML
	private void handleCombatAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Combat").getNode());
	}
	
	/**
	 * handler for Feats
	 * 
	 * @param event
	 */
	@FXML
	private void handleFeatsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Feats").getNode());
	}
	
	/**
	 * handler for Skills
	 * 
	 * @param event
	 */
	@FXML
	private void handleSkillsAction(ActionEvent event) {
		SwapWindow(windowPartials.get("Skills").getNode());
	}
	
	/**
	 * handler for Other Characters
	 * 
	 * @param event
	 */
	@FXML
	private void handleOtherCharacterAction(ActionEvent event) {
		SwapWindow(windowPartials.get("OtherCharacter").getNode());
	}
	
	/**
	 * allows swapping of windows
	 * 
	 * @param node
	 */
	private void SwapWindow(Node node) {
		rootLayout.setCenter(node);
	}

	/**
	 * sets the interface
	 */
	public void setInterface(Gui ui) {
		this.ui = (Interface) ui;
	}
	
	/**
	 * sets the Window Partials
	 * 
	 * @param windowPartials
	 */
	public void setWindowPartials(HashMap<String, MainWindowController>windowPartials) {
		this.windowPartials = windowPartials;
	}
}
