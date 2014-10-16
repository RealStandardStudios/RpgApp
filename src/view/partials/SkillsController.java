package view.partials;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Skill;
import view.RootController;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class SkillsController extends MainWindowController {
	
	@FXML
	TableView<Skill> tableSkills;
	@FXML
	TableColumn<Skill, String> columnName;
	@FXML
	TableColumn<Skill, Integer> columnTotal;
	@FXML
	TableColumn<Skill, Boolean> columnClassSkill;
	@FXML
	TableColumn<Skill, String> columnAbility;
	@FXML
	TableColumn<Skill, Integer> columnMod;
	@FXML
	TableColumn<Skill, Integer> columnRanks;
	@FXML
	TableColumn<Skill, String> columnMisc;
		
	
	@Override
	public void initialize() {
		columnName.setCellValueFactory(cellData->cellData.getValue().Name);
		columnTotal.setCellValueFactory(cellData->cellData.getValue().getTotal());
		columnClassSkill.setCellValueFactory(cellData->cellData.getValue().isClassSkill());
		columnAbility.setCellValueFactory(cellData->new SimpleStringProperty(cellData.getValue().AttrToUse.get().getAbilityName().toString()));
		columnMod.setCellValueFactory(cellData->cellData.getValue().RacialMod);
		columnRanks.setCellValueFactory(cellData->cellData.getValue().Rank);
	}

	@Override
	public void setData() {
		tableSkills.setItems(FXCollections.observableArrayList(((RootController) getRoot()).getCharacter().getSkills()));
	}

}
