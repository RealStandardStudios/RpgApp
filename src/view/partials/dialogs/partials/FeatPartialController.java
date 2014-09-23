package view.partials.dialogs.partials;

import java.io.File;

import org.controlsfx.dialog.Dialogs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import pathfinder.data.Feat;

public class FeatPartialController extends NewCharacterPartialController {

	@FXML
	ComboBox<Feat> comboFeat;
	@FXML
	Label lblFeatName;
	@FXML
	Label lblFeatDescription;

	ObservableList<Feat> feats = FXCollections.observableArrayList();
	
	@Override
	public void initialize() {
		readFeats();

		comboFeat.setItems(feats);
	}
	
	void readFeats()
	{
		File file = new File(this.getClass().getResource("").getPath()+programRoot+"PathfinderData/data");
		File featsFile = new File(file.getPath()+"\\Feats.fdf");
		try {
			feats.setAll(readDataFile(featsFile, Feat.class));
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the Feat File Properly").message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}

	@Override
	public void setData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return null;
	}
}
