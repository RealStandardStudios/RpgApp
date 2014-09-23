package view.partials.dialogs.partials;

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
	Label lblArmorClas;
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
	TableColumn<Skill,String> colSkillBonus;
	@FXML
	TableColumn<Skill,String> colSkillRanks;
	//endregion
	//endregion
	
	@Override
	public void setData() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
