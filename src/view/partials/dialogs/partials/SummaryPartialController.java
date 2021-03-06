package view.partials.dialogs.partials;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Skill;

public class SummaryPartialController extends NewCharacterPartialController {
	
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
	TableColumn<Skill,Integer> colSkillTotal;
	@FXML
	TableColumn<Skill,Integer> colSkillBonus;
	@FXML
	TableColumn<Skill,Integer> colSkillRanks;
	//endregion
	//endregion
	
	@Override
	public void setData() {
		setHPStats();
		
		//set fluff labels
		lblClass.setText(getCharacter().getClasses()[0].getName());
		lblName.setText(getCharacter().getName());
		lblAlignment.setText(getCharacter().getAlignment().name());
		lblSize.setText(getCharacter().getFluff().get("Height"));
		lblRace.setText(getCharacter().getRace().getName());
		lblAge.setText(getCharacter().getFluff().get("Age"));
		lblGender.setText(getCharacter().getFluff().get("Gender"));
		lblWeight.setText(getCharacter().getFluff().get("Weight"));
		
		//set ability Labels
		lblStrScore.setText(""+getCharacter().getStrength().getTotalValue());
		lblStrMod.setText(""+getCharacter().getStrength().getModifier().get());
		lblDexScore.setText(""+getCharacter().getDexterity().getTotalValue());
		lblDexMod.setText(""+getCharacter().getDexterity().getModifier().get());
		lblConScore.setText(""+getCharacter().getConstitution().getTotalValue());
		lblConMod.setText(""+getCharacter().getConstitution().getModifier().get());
		lblIntScore.setText(""+getCharacter().getIntelligence().getTotalValue());
		lblIntMod.setText(""+getCharacter().getIntelligence().getModifier().get());
		lblWisScore.setText(""+getCharacter().getWisdom().getTotalValue());
		lblWisMod.setText(""+getCharacter().getWisdom().getModifier().get());
		lblChaScore.setText(""+getCharacter().getCharisma().getTotalValue());
		lblChaMod.setText(""+getCharacter().getCharisma().getModifier().get());
		
		//set Speed Labels
		
		//set Defense Labels
		getCharacter().setArmorClass(0, 0);
		lblArmorClass.setText(Integer.toString(getCharacter().getArmorClass()));
		lblInitiative.setText(getCharacter().getDexterity().getModifier().get().toString());
		lblBaseAttackBonus.setText(getCharacter().getBabString());
		lblFortitude.setText(Integer.toString(getCharacter().getFortitude().getTotal()));
		lblReflex.setText(Integer.toString(getCharacter().getReflex().getTotal()));
		lblWill.setText(Integer.toString(getCharacter().getWill().getTotal()));
		
		//set TableSkills
		ArrayList<Skill> skills = new ArrayList<Skill>();
		for (Skill skill : getCharacter().getSkills()) {
			skills.add(skill);
		}
		tableSkills.setItems(FXCollections.observableArrayList(FXCollections.observableArrayList(skills)));
	}
	
	private void setHPStats()
	{
		getCharacter().setLevel(1);
		getCharacter().setMaxHP(getCharacter().getClasses()[0].getHitDice().getHitDiceAsInt(),
				getCharacter().getConstitution().getModifier().get());
		getCharacter().setCurrentHP(getCharacter().getMaxHP());
		getCharacter().setNonLethalHP(0);
		getCharacter().setExperienceTrack(0);
	}

	@Override
	public void initialize() {
		colSkillName.setCellValueFactory(cellData->cellData.getValue().Name);
		colSkillTotal.setCellValueFactory(cellData->cellData.getValue().getTotal());
		colSkillBonus.setCellValueFactory(cellData->cellData.getValue().AttrToUse.get().getModifier());
		colSkillRanks.setCellValueFactory(cellData->cellData.getValue().Rank);
	}

}
