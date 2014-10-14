package view.partials;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Feat;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Races.Traits.Trait;
import view.RootController;


/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class FeatsController extends MainWindowController {
	@FXML
	TableView<Feat> tableFeats;
	@FXML
	TableColumn<Feat, String> columnFeatName;
	@FXML
	TableColumn<Feat, String> columnFeatDesc;
	
	@FXML
	TableView<Trait> tableTraits;
	@FXML
	TableColumn<Trait, String> columnTraitName;
	@FXML
	TableColumn<Trait, String> columnTraitDesc;
	
	@FXML
	TableView<Feature> tableFeatures;
	@FXML
	TableColumn<Feature, String> columnFeatureName;
	@FXML
	TableColumn<Feature, String> columnFeatureDesc;
	
	@Override
	public void initialize() {
		columnFeatName.setCellValueFactory(cellData->cellData.getValue().Name);
		columnFeatDesc.setCellValueFactory(cellData->cellData.getValue().Description);
		columnTraitDesc.setCellValueFactory(cellData->cellData.getValue().Description);
		columnTraitName.setCellValueFactory(cellData->cellData.getValue().Name);
		columnFeatureName.setCellValueFactory(cellData->cellData.getValue().getNameProperty());
		columnFeatureDesc.setCellValueFactory(cellData->cellData.getValue().getDescriptionProperty());
	}

	@Override
	public void setData() {
		tableFeats.setItems(FXCollections.observableArrayList(((RootController) getRoot()).getCharacter().getFeats()));
		tableTraits.setItems(FXCollections.observableArrayList(((RootController) getRoot()).getCharacter().getRace().getRacialTraits()));
		tableFeatures.setItems(((RootController) getRoot()).getCharacter().getClasses()[0].getFeatures());
	}

}
