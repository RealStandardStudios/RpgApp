package view.partials.dialogs.partials;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Classes.Class;
import pathfinder.data.Classes.Objects.LevelTable.LevelTableRow;
import pathfinder.data.Classes.Objects.LevelTable.SpellLevelTableRow;

public class ClassPartialController extends NewCharacterPartialController {

	// region Class FXML fields
	@FXML
	ComboBox<Class> cboClasses;
	
	@FXML
	Accordion accClass;
	
	//region Class Description Labels	
		@FXML
		private Label lblDescription;

		@FXML
		private Label lblRole;

		@FXML
		private Label lblAlignments;

		@FXML
		private Label lblHitDice;

		@FXML
		private Label lblClassSkills;

		@FXML
		private Label lblSkillRanksPerLevel;

		@FXML
		private Label lblWeaponProf;

		@FXML
		private Label lblArmorProf;

		@FXML
		private Label lblStartingWealthD6;
		//endregion

	//region Class Progression table
	@FXML
	private Tab tabLevelTable;

	@FXML
	private TableView<LevelTableRow> tableLevelTable;

	@FXML
	private TableColumn<LevelTableRow, Integer> columnLevel;

	@FXML
	private TableColumn<LevelTableRow, String> columnBAB;

	@FXML
	private TableColumn<LevelTableRow, Integer> columnFort;

	@FXML
	private TableColumn<LevelTableRow, Integer> columnRef;

	@FXML
	private TableColumn<LevelTableRow, Integer> columnWill;

	@FXML
	private TableColumn<LevelTableRow, String> columnSpecial;

	TableColumn[] levelTable;
	//endregion

	//region Spells Per Level Table
	@FXML
	private Tab tabSpellLevelTable;

	@FXML
	private TableView<SpellLevelTableRow> tableSpellLevelTable;

	@FXML
	private TableColumn<SpellLevelTableRow, Integer> columnLevelSpells;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column0;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column1st;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column2nd;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column3rd;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column4th;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column5th;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column6th;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column7th;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column8th;

	@FXML
	private TableColumn<SpellLevelTableRow, String> column9th;

	TableColumn[] spellLevelTable;
	//endregion

	//region Spells Known Table
		@FXML
		private Tab tabSpellsKnown;

		@FXML
		private TableView<SpellLevelTableRow> tableSpellsKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, Integer> columnLevelSpellsKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column0Known;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column1stKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column2ndKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column3rdKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column4thKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column5thKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column6thKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column7thKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column8thKnown;

		@FXML
		private TableColumn<SpellLevelTableRow, String> column9thKnown;
		
		TableColumn[] spellKnowenTable;
		
		//endregion
	
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
		Class selectedClass = cboClasses.getSelectionModel().getSelectedItem();
		accClass.setExpandedPane(accClass.getPanes().get(0));
		lblAlignments.setText(selectedClass.getAlignments());
		lblArmorProf.setText(selectedClass.getArmorProfsToString());
		lblDescription.setText(selectedClass.getDescription());
		lblClassSkills.setText(selectedClass.getClassSkillsToString());
		lblHitDice.setText(selectedClass.getHitDice().name());
		lblRole.setText(selectedClass.getRole());
		lblSkillRanksPerLevel.setText(selectedClass.getSkillRanksToString());
		lblStartingWealthD6.setText("D6x"+selectedClass.getStartingWealthD6());
		lblWeaponProf.setText(selectedClass.getWeaponProfsToString());
	}

}
