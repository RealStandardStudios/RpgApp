package view.partials.dialogs.partials;

import java.io.File;

import jefXif.interfaces.DataFileReader;
import jefXif.view.WindowController;
import pathfinder.data.Character.Character;
import rpg.MainApp;
import view.partials.dialogs.NewCharacterController;

public abstract class NewCharacterPartialController extends WindowController implements DataFileReader {
	private NewCharacterController parentWindow;
	
	public final File DataFile = new File(MainApp.class.getResource("../").getPath()+"/data");
	
	/**
	 * This is what you will use to set the data for the partial view
	 */
	public abstract void setData();
	
	public void getData() {
	}
		
	/**
	 * @return the character
	 */
	public Character getCharacter() {
		return parentWindow.getCharacter();
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
