package view.partials.dialogs.partials;

import jefXif.DataFileReader;
import jefXif.WindowController;
import pathfinder.data.Character.Character;
import view.partials.dialogs.NewCharacterController;

public abstract class NewCharacterPartialController extends WindowController implements DataFileReader {
	private NewCharacterController parentWindow;
	private Character character;
	
	public final String programRoot = "../../../../../../";
	
	/**
	 * This is what you will use to set the data for the partial view
	 */
	public abstract void setData();
		
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
		setData();
	}

	/**
	 * @return the parentWindow
	 */
	public NewCharacterController getParentWindow() {
		return parentWindow;
	}

	/**
	 * @param parentWindow the parentWindow to set
	 */
	public void setParentWindow(NewCharacterController parentWindow) {
		this.parentWindow = parentWindow;
	}
	
}
