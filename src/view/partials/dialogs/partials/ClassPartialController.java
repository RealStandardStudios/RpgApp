package view.partials.dialogs.partials;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Classes.Class;

public class ClassPartialController extends NewCharacterPartialController {

	// region Class FXML fields
	@FXML
	ComboBox<Class> cboClasses;

	// endregion
	ObservableList<Class>classes;

	@Override
	public void initialize() {
		classes = FXCollections.observableArrayList();
		readClasses();
		
		cboClasses.setItems(classes);
	}

	private void readClasses() {
		File file = new File(this.getClass().getResource("").getPath()+programRoot+"PathfinderData/data");
		File featsFile = new File(file.getPath()+"\\Classes.cldf");
		try {
			classes.setAll(readDataFile(featsFile, Class.class));
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the Class File Properly").message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}

	@Override
	public void setData() {
		
	}
	
	@FXML
	private void handleChangedClass(ActionEvent event) {
		System.out.println("You changed the selected class or somthing");
	}

}
