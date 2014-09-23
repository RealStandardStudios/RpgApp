package view.partials.dialogs.partials;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Skill;
import pathfinder.data.Character.Character;

public class SummaryPartialController extends NewCharacterPartialController {
	
	Character newCharacter;
	
	//region FXML elements
	
	//region fluff labels
	@FXML
	Label lblName;
	@FXML
	Label lblRace;
	@FXML
	Label lblClass;
	@FXML
	Label lblAlignment;
	@FXML
	Label lblSize;
	@FXML
	Label lblWeight;
	@FXML
	Label lblGender;
	@FXML
	Label lblAge;
	//endregion
	
	//region Ability Labels
	@FXML
	Label lblStrScore;
	@FXML
	Label lblDexScore;
	@FXML
	Label lblConScore;
	@FXML
	Label lblIntScore;
	@FXML
	Label lblWisScore;
	@FXML
	Label lblChaScore;
	
	@FXML
	Label lblStrMod;
	@FXML
	Label lblDexMod;
	@FXML
	Label lblConMod;
	@FXML
	Label lblIntMod;
	@FXML
	Label lblWisMod;
	@FXML
	Label lblChaMod;	
	//endregion
	
	//region Speed Labels
	@FXML
	Label lblLandSpeed;
	@FXML
	Label lblFly;
	@FXML
	Label lblSwim;
	@FXML
	Label lblClimb;
	@FXML
	Label lblBurrow;
	//endregion
	
	//region defense labels
	@FXML
	Label lblHitPoints;
	@FXML
	Label lblArmorClass;
	@FXML
	Label lblInitiative;
	@FXML
	Label lblBaseAttackBonus;
	@FXML
	Label lblFortitude;
	@FXML
	Label lblReflex;
	@FXML
	Label lblWill;
	//endregion
	
	//region Skill Tables
	@FXML
	TableView<Skill> tableSkills;
	@FXML
	TableColumn<Skill,String> colSkillName;
	@FXML
	TableColumn<Skill,Integer> colSkillBonus;
	@FXML
	TableColumn<Skill,Integer> colSkillRanks;
	//endregion
	//endregion
	
	@Override
	public void setData() {
		//set fluff labels
		lblClass.setText(getCharacter().getClasses()[0].getName());
		lblRace.setText(getCharacter().getRace().getName());
		
		//set ability Labels
		lblStrScore.setText(""+getCharacter().getStrength().getValue());
		lblStrMod.setText(""+getCharacter().getStrength().getModifier().get());
		lblDexScore.setText(""+getCharacter().getDexterity().getValue());
		lblDexMod.setText(""+getCharacter().getDexterity().getModifier().get());
		lblConScore.setText(""+getCharacter().getConstitution().getValue());
		lblConMod.setText(""+getCharacter().getConstitution().getModifier().get());
		lblIntScore.setText(""+getCharacter().getIntelligence().getValue());
		lblIntMod.setText(""+getCharacter().getIntelligence().getModifier().get());
		lblWisScore.setText(""+getCharacter().getWisdom().getValue());
		lblWisMod.setText(""+getCharacter().getWisdom().getModifier().get());
		lblChaScore.setText(""+getCharacter().getCharisma().getValue());
		lblChaMod.setText(""+getCharacter().getCharisma().getModifier().get());
		
		//set Speed Labels
		
		//set Defense Labels
		
		//set TableSkills
		tableSkills.setItems(FXCollections.observableArrayList(getCharacter().getSkills()));
	}

	@Override
	public void initialize() {
		colSkillName.setCellValueFactory(cellData->cellData.getValue().Name);
		colSkillBonus.setCellValueFactory(cellData->cellData.getValue().AttrToUse.get().getModifier());
		colSkillRanks.setCellValueFactory(cellData->cellData.getValue().Rank);
	}

}
