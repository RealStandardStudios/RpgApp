package view.partials.dialogs.partials;

import java.io.File;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Feat;
import pathfinder.data.FeatPrerequisite;

@SuppressWarnings("deprecation")
public class FeatPartialController extends NewCharacterPartialController {

	@FXML
	ComboBox<Feat> comboFeat;
	@FXML
	Label lblFeatName;
	@FXML
	Label lblFeatDescription;
	@FXML
	TableView<Feat> tableFeatsSelected;
	@FXML
	TableColumn<Feat, String> columnFeatsSelectedName;
	@FXML
	TableColumn<Feat, String> columnFeatsSelectedDesc;
	@FXML
	TableColumn<FeatPrerequisite, String> columnFeatPrereq;
	@FXML
	TableView<FeatPrerequisite> tableFeat;

	ObservableList<Feat> feats = FXCollections.observableArrayList();
	ObservableList<Feat> addedFeats = FXCollections.observableArrayList();
	
	@Override
	public void initialize() {
		readFeats();

		comboFeat.setItems(feats);		
	}
	
	void readFeats()
	{
		File featsFile = new File(DataFile.getPath() + "\\Feats.fdf");
		try {
			feats.setAll(readDataFile(featsFile, Feat.class));
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the Feat File Properly").message(e.getMessage()).styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
			e.printStackTrace();
		}
	}
	
	@FXML
	void handleAddFeat()
	{
		Feat feat = comboFeat.getSelectionModel().getSelectedItem();
		addedFeats.add(feat);
		
		tableFeatsSelected.setItems(addedFeats);
		columnFeatsSelectedName.setCellValueFactory(cellData->cellData.getValue().Name);
		columnFeatsSelectedDesc.setCellValueFactory(cellData->cellData.getValue().Description);
	}
	
	@FXML
	void handleRemoveFeat()
	{
		addedFeats.remove(tableFeatsSelected.getSelectionModel().getSelectedItem());
		
		tableFeatsSelected.setItems(addedFeats);
		columnFeatsSelectedName.setCellValueFactory(cellData->cellData.getValue().Name);
		columnFeatsSelectedDesc.setCellValueFactory(cellData->cellData.getValue().Description);
	}
	
	@FXML
	void handleFeatDropdownSelected()
	{
		Feat feat = comboFeat.getSelectionModel().getSelectedItem();
		lblFeatName.setText(feat.getName());
		lblFeatDescription.setText(feat.getBenefit());
		
		ObservableList<FeatPrerequisite>prerequisites = FXCollections.observableArrayList(feat.getPrerequisite());
		
		tableFeat.setItems(prerequisites);
		columnFeatPrereq.setCellValueFactory(cellData->cellData.getValue().Description);
	}

	@Override
	public void setData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getData() {
		getCharacter().setFeats(addedFeats.toArray(new Feat[]{}));
	}
}
