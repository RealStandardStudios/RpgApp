package view.partials.dialogs.partials;

import jefXif.interfaces.DataFileReader;
import jefXif.view.WindowController;
import pathfinder.data.Character.Character;
import view.partials.dialogs.NewCharacterController;

public abstract class NewCharacterPartialController extends WindowController implements DataFileReader {

    private NewCharacterController parentWindow;

    public final String DataFile = System.getProperty("user.dir")+"/data";

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
    @Override
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
