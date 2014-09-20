package view.partials.dialogs.partials;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import pathfinder.data.Classes.Class;

public class ClassPartialController extends NewCharacterPartialController {

	// region Class FXML fields
	@FXML
	ComboBox<Class> cboClasses;

	// endregion

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData() {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
	private void handleChangedClass(ActionEvent event) {
		System.out.println("You changed the selected class or somthing");
	}

}
