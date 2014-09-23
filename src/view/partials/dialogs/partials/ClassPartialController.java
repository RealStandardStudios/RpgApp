package view.partials.dialogs.partials;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Classes.Class;
import pathfinder.data.Classes.Objects.Feature;
import pathfinder.data.Classes.Objects.LevelTable.LevelTableRow;
import pathfinder.data.Classes.Objects.LevelTable.MonkLevelTableRow;
import pathfinder.data.Classes.Objects.LevelTable.SpellLevelTableRow;

public class ClassPartialController extends NewCharacterPartialController {
	
	Class selectedClass;
	
	// region Class FXML fields
	@FXML
	ComboBox<Class> cboClasses;

	@FXML
	Accordion accClass;

	// region Class Description Labels
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
	// endregion

	// region Class Progression table
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
	// endregion

	// region Spells Per Level Table
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
	// endregion

	// region Spells Known Table
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

	// endregion

	// region Monk Level Table
	@FXML
	private Tab tabMonkSpecials;

	@FXML
	private TableView<MonkLevelTableRow> tableMonkTable;

	@FXML
	private TableColumn<MonkLevelTableRow, String> columnFOB;

	@FXML
	private TableColumn<MonkLevelTableRow, String> columnUnarmed;

	@FXML
	private TableColumn<MonkLevelTableRow, String> columnAcBonus;

	@FXML
	private TableColumn<MonkLevelTableRow, String> columnFastMovement;

	TableColumn[] monkTable;

	// endregion

	// region Class Features
	@FXML
	private TableView<Feature> tableFeatures;

	@FXML
	private TableColumn<Feature, String> columnFeatureName;

	@FXML
	private TableColumn<Feature, String> columnFeatureType;

	@FXML
	private TableColumn<Feature, String> columnFeatureDesctiption;

	TableColumn[] featuresTable;
	// endregion

	@FXML
	TabPane tpProgression;

	// endregion
	ObservableList<Class> classes;

	@Override
	public void initialize() {
		classes = FXCollections.observableArrayList();
		setData();

		cboClasses.setItems(classes);
		// region Init the Class Progression Level Table with columns
		columnLevel.setCellValueFactory(cellData -> cellData.getValue()
				.getLevelNumProperty());
		columnBAB.setCellValueFactory(cellData -> cellData.getValue()
				.getBABProperty());
		columnFort.setCellValueFactory(cellData -> cellData.getValue()
				.getFortSave().getBaseValueProperty());
		columnRef.setCellValueFactory(cellData -> cellData.getValue()
				.getRefSave().getBaseValueProperty());
		columnWill.setCellValueFactory(cellData -> cellData.getValue()
				.getWillSave().getBaseValueProperty());
		columnSpecial.setCellValueFactory(cellData -> cellData.getValue()
				.getSpecialProperty());
		// endregion

		// region Init the Class Progression Spell Level Table with columns
		columnLevelSpells.setCellValueFactory(cellData -> cellData.getValue()
				.getLevelNumProperty());
		column0.setCellValueFactory(cellData -> cellData.getValue().getSPD()[0]);
		column1st
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[1]);
		column2nd
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[2]);
		column3rd
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[3]);
		column4th
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[4]);
		column5th
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[5]);
		column6th
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[6]);
		column7th
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[7]);
		column8th
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[8]);
		column9th
				.setCellValueFactory(cellData -> cellData.getValue().getSPD()[9]);
		// endregion

		// region Init the Class Progression Spells Known Table with columns
		columnLevelSpellsKnown.setCellValueFactory(cellData -> cellData
				.getValue().getLevelNumProperty());
		column0Known.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[0]);
		column1stKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[1]);
		column2ndKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[2]);
		column3rdKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[3]);
		column4thKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[4]);
		column5thKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[5]);
		column6thKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[6]);
		column7thKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[7]);
		column8thKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[8]);
		column9thKnown.setCellValueFactory(cellData -> cellData.getValue()
				.getSpellsKnown()[9]);
		// endregion

		// region Init the Monk progression table with columns
		columnFOB.setCellValueFactory(celldata -> celldata.getValue()
				.getFlurryOfBlowsString());
		columnUnarmed.setCellValueFactory(cellData -> cellData.getValue()
				.getUnarmedDamageProperty());
		columnAcBonus.setCellValueFactory(cellData -> cellData.getValue()
				.getAcBonusProperty());
		columnFastMovement.setCellValueFactory(cellData -> cellData.getValue()
				.getFastMovementProperty());
		// endregion

		 //region Init the features table with columns
		 columnFeatureName.setCellValueFactory(cellData -> cellData.getValue()
		 .getNameProperty());
		 columnFeatureType.setCellValueFactory(cellData -> cellData.getValue()
		 .getTypeProperty());
		 columnFeatureDesctiption.setCellValueFactory(cellData -> cellData
		 .getValue().getDescriptionProperty());
		// endregion

		// Array of Table Columns
		levelTable = new TableColumn[] { columnLevel, columnBAB, columnFort,
				columnRef, columnWill, columnSpecial };

		tableLevelTable.getColumns().addListener(
				new ListChangeListener<TableColumn<LevelTableRow, ?>>() {
					public boolean suspended;

					@Override
					public void onChanged(
							Change<? extends TableColumn<LevelTableRow, ?>> change) {
						change.next();

						if (change.wasReplaced() && !suspended) {
							this.suspended = true;
							// array of table columns as defined above
							tableLevelTable.getColumns().setAll(levelTable);
							this.suspended = false;
						}

					}

				});

		spellLevelTable = new TableColumn[] { columnLevelSpells, column0,
				column1st, column2nd, column3rd, column4th, column5th,
				column6th, column7th, column8th, column9th };

		tableSpellLevelTable.getColumns().addListener(
				new ListChangeListener<TableColumn<SpellLevelTableRow, ?>>() {
					public boolean suspended;

					@Override
					public void onChanged(
							Change<? extends TableColumn<SpellLevelTableRow, ?>> change) {
						change.next();

						if (change.wasReplaced() && !suspended) {
							this.suspended = true;
							// array of table columns as defined above
							tableSpellLevelTable.getColumns().setAll(
									spellLevelTable);
							this.suspended = false;
						}

					}

				});

		spellKnowenTable = new TableColumn[] { columnLevelSpellsKnown,
				column0Known, column1stKnown, column2ndKnown, column3rdKnown,
				column4thKnown, column5thKnown, column6thKnown, column7thKnown,
				column8thKnown, column9thKnown };

		tableSpellsKnown.getColumns().addListener(
				new ListChangeListener<TableColumn<SpellLevelTableRow, ?>>() {
					public boolean suspended;

					@Override
					public void onChanged(
							Change<? extends TableColumn<SpellLevelTableRow, ?>> change) {
						change.next();

						if (change.wasReplaced() && !suspended) {
							this.suspended = true;
							// array of table columns as defined above
							tableSpellsKnown.getColumns().setAll(
									spellKnowenTable);
							this.suspended = false;
						}

					}

				});

		monkTable = new TableColumn[] { columnFOB, columnUnarmed,
				columnAcBonus, columnFastMovement };

		tableMonkTable.getColumns().addListener(
				new ListChangeListener<TableColumn<MonkLevelTableRow, ?>>() {
					public boolean suspended;

					@Override
					public void onChanged(
							Change<? extends TableColumn<MonkLevelTableRow, ?>> change) {
						change.next();

						if (change.wasReplaced() && !suspended) {
							this.suspended = true;

							tableMonkTable.getColumns().setAll(monkTable);
						}
					}
				});

		featuresTable = new TableColumn[] { columnFeatureName,
				columnFeatureType, columnFeatureDesctiption };

		tableFeatures.getColumns().addListener(
				new ListChangeListener<TableColumn<Feature, ?>>() {
					public boolean suspended;

					@Override
					public void onChanged(
							Change<? extends TableColumn<Feature, ?>> change) {
						change.next();

						if (change.wasReplaced() && !suspended) {
							this.suspended = true;
							tableFeatures.getColumns().setAll(featuresTable);
							this.suspended = false;
						}
					}
				});
	}

	private void readClasses() {
		File file = new File(this.getClass().getResource("").getPath()
				+ programRoot + "PathfinderData/data");
		File featsFile = new File(file.getPath() + "\\Classes.cldf");
		try {
			classes.setAll(readDataFile(featsFile, Class.class));
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error")
					.masthead("Couldn't read the Class File Properly")
					.message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}

	@Override
	public void setData() {
		readClasses();
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
		lblStartingWealthD6
				.setText("D6x" + selectedClass.getStartingWealthD6());
		lblWeaponProf.setText(selectedClass.getWeaponProfsToString());

		tableLevelTable.setItems(selectedClass.getLeveltableRow());

		String tableRowType = selectedClass.getLeveltableRow().get(0)
				.getClass().getName();
		if (tableRowType != "pathfinder.data.Classes.Objects.LevelTable.SpellLevelTableRow")
			tpProgression.getTabs().removeAll(tabSpellLevelTable,
					tabSpellsKnown);
		else {
			tpProgression.getTabs().add(tabSpellLevelTable);
			SpellLevelTableRow[] levelTableRow = new SpellLevelTableRow[selectedClass
					.getLeveltableRow().size()];
			for (int i = 0; i < selectedClass.getLeveltableRow().size(); i++) {
				levelTableRow[i] = (SpellLevelTableRow) selectedClass
						.getLeveltableRow().get(i);
			}
			ObservableList<SpellLevelTableRow> spellLevelTables = FXCollections
					.observableArrayList(levelTableRow);
			tableSpellLevelTable.setItems(spellLevelTables);
			if(spellLevelTables.get(0).getSpellsKnown()[0]!=null) {
				tpProgression.getTabs().add(tabSpellsKnown);
				tableSpellsKnown.setItems(spellLevelTables);
			}
			else 
				tpProgression.getTabs().remove(tabSpellsKnown);
		}
		if (tableRowType != "pathfinder.data.Classes.Objects.LevelTable.MonkLevelTableRow")
			tpProgression.getTabs().remove(tabMonkSpecials);
		else {
			tpProgression.getTabs().add(tabMonkSpecials);

			MonkLevelTableRow[] levelTableRow = new MonkLevelTableRow[selectedClass
					.getLeveltableRow().size()];
			for (int i = 0; i < selectedClass.getLeveltableRow().size(); i++) {
				levelTableRow[i] = (MonkLevelTableRow) selectedClass
						.getLeveltableRow().get(i);
			}
			tableMonkTable.setItems(FXCollections
					.observableArrayList(levelTableRow));
		}
		
		tableFeatures.setItems(selectedClass.getFeatures());
		//need to resize row according to the length of the description field some how
	}

	@Override
	public void getData() {
		getCharacter().setClasses(new Class[]{selectedClass});
	}

}
