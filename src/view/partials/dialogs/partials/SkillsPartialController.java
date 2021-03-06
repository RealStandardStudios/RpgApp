package view.partials.dialogs.partials;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import pathfinder.data.Skill;
import pathfinder.data.Effects.Effect;
import pathfinder.data.Effects.SkillEffect;
import view.objects.SkillGridRow;

public class SkillsPartialController extends NewCharacterPartialController {
	
	@FXML
	Label lblRanksRemaining;
	//region Skill Ability mods
	@FXML
	Label lblAbilityAcrobatics;
	@FXML
	Label lblAbilityAppraise;
	@FXML
	Label lblAbilityBluff;
	@FXML
	Label lblAbilityClimb;
	@FXML
	Label lblAbilityCraft;
	@FXML
	Label lblAbilityDiplomacy;
	@FXML
	Label lblAbilityDisableDevice;
	@FXML
	Label lblAbilityDisguise;
	@FXML
	Label lblAbilityEscapeArtist;
	@FXML
	Label lblAbilityFly;
	@FXML
	Label lblAbilityHandleAnimal;
	@FXML
	Label lblAbilityHeal;
	@FXML
	Label lblAbilityIntimidate;
	@FXML
	Label lblAbilityKnowledgeArcana;
	@FXML
	Label lblAbilityKnowledgeDungeoneering;
	@FXML
	Label lblAbilityKnowledgeEngineering;
	@FXML
	Label lblAbilityKnowledgeGeography;
	@FXML
	Label lblAbilityKnowledgeHistory;
	@FXML
	Label lblAbilityKnowledgeLocal;
	@FXML
	Label lblAbilityKnowledgeNature;
	@FXML
	Label lblAbilityKnowledgeNobility;
	@FXML
	Label lblAbilityKnowledgePlanes;
	@FXML
	Label lblAbilityKnowledgeReligion;
	@FXML
	Label lblAbilityLinguistics;
	@FXML
	Label lblAbilityPerception;
	@FXML
	Label lblAbilityPerform;
	@FXML
	Label lblAbilityProfession;
	@FXML
	Label lblAbilityRide;
	@FXML
	Label lblAbilitySenseMotive;
	@FXML
	Label lblAbilitySleightOfHand;
	@FXML
	Label lblAbilitySpellcraft;
	@FXML
	Label lblAbilityStealth;
	@FXML
	Label lblAbilitySurvival;
	@FXML
	Label lblAbilitySwim;
	@FXML
	Label lblAbilityUseMagicDevice;
	//endregion
	
	//region Skill Labels Totals
	@FXML
	Label lblTotalAcrobatics;
	@FXML
	Label lblTotalAppraise;
	@FXML
	Label lblTotalBluff;
	@FXML
	Label lblTotalClimb;
	@FXML
	Label lblTotalCraft;
	@FXML
	Label lblTotalDiplomacy;
	@FXML
	Label lblTotalDisableDevice;
	@FXML
	Label lblTotalDisguise;
	@FXML
	Label lblTotalEscapeArtist;
	@FXML
	Label lblTotalFly;
	@FXML
	Label lblTotalHandleAnimal;
	@FXML
	Label lblTotalHeal;
	@FXML
	Label lblTotalIntimidate;
	@FXML
	Label lblTotalKnowledgeArcana;
	@FXML
	Label lblTotalKnowledgeDungeoneering;
	@FXML
	Label lblTotalKnowledgeEngineering;
	@FXML
	Label lblTotalKnowledgeGeography;
	@FXML
	Label lblTotalKnowledgeHistory;
	@FXML
	Label lblTotalKnowledgeLocal;
	@FXML
	Label lblTotalKnowledgeNature;
	@FXML
	Label lblTotalKnowledgeNobility;
	@FXML
	Label lblTotalKnowledgePlanes;
	@FXML
	Label lblTotalKnowledgeReligion;
	@FXML
	Label lblTotalLinguistics;
	@FXML
	Label lblTotalPerception;
	@FXML
	Label lblTotalPerform;
	@FXML
	Label lblTotalProfession;
	@FXML
	Label lblTotalRide;
	@FXML
	Label lblTotalSenseMotive;
	@FXML
	Label lblTotalSleightOfHand;
	@FXML
	Label lblTotalSpellcraft;
	@FXML
	Label lblTotalStealth;
	@FXML
	Label lblTotalSurvival;
	@FXML
	Label lblTotalSwim;
	@FXML
	Label lblTotalUseMagicDevice;
	//endregion

	//region Skill Labels Ranks
	@FXML
	Label lblRanksAcrobatics;
	@FXML
	Label lblRanksAppraise;
	@FXML
	Label lblRanksBluff;
	@FXML
	Label lblRanksClimb;
	@FXML
	Label lblRanksCraft;
	@FXML
	Label lblRanksDiplomacy;
	@FXML
	Label lblRanksDisableDevice;
	@FXML
	Label lblRanksDisguise;
	@FXML
	Label lblRanksEscapeArtist;
	@FXML
	Label lblRanksFly;
	@FXML
	Label lblRanksHandleAnimal;
	@FXML
	Label lblRanksHeal;
	@FXML
	Label lblRanksIntimidate;
	@FXML
	Label lblRanksKnowledgeArcana;
	@FXML
	Label lblRanksKnowledgeDungeoneering;
	@FXML
	Label lblRanksKnowledgeEngineering;
	@FXML
	Label lblRanksKnowledgeGeography;
	@FXML
	Label lblRanksKnowledgeHistory;
	@FXML
	Label lblRanksKnowledgeLocal;
	@FXML
	Label lblRanksKnowledgeNature;
	@FXML
	Label lblRanksKnowledgeNobility;
	@FXML
	Label lblRanksKnowledgePlanes;
	@FXML
	Label lblRanksKnowledgeReligion;
	@FXML
	Label lblRanksLinguistics;
	@FXML
	Label lblRanksPerception;
	@FXML
	Label lblRanksPerform;
	@FXML
	Label lblRanksProfession;
	@FXML
	Label lblRanksRide;
	@FXML
	Label lblRanksSenseMotive;
	@FXML
	Label lblRanksSleightOfHand;
	@FXML
	Label lblRanksSpellcraft;
	@FXML
	Label lblRanksStealth;
	@FXML
	Label lblRanksSurvival;
	@FXML
	Label lblRanksSwim;
	@FXML
	Label lblRanksUseMagicDevice;
	SkillGridRow[] skillGrid;
	//endregion

	//region Class Skill Labels	
	@FXML
	CheckBox chkClassAcrobatics;
	@FXML
	CheckBox chkClassAppraise;
	@FXML
	CheckBox chkClassBluff;
	@FXML
	CheckBox chkClassClimb;
	@FXML
	CheckBox chkClassCraft;
	@FXML
	CheckBox chkClassDiplomacy;
	@FXML
	CheckBox chkClassDisableDevice;
	@FXML
	CheckBox chkClassDisguise;
	@FXML
	CheckBox chkClassEscapeArtist;
	@FXML
	CheckBox chkClassFly;
	@FXML
	CheckBox chkClassHandleAnimal;
	@FXML
	CheckBox chkClassHeal;
	@FXML
	CheckBox chkClassIntimidate;
	@FXML
	CheckBox chkClassKnowledgeArcana;
	@FXML
	CheckBox chkClassKnowledgeDungeoneering;
	@FXML
	CheckBox chkClassKnowledgeEngineering;
	@FXML
	CheckBox chkClassKnowledgeGeography;
	@FXML
	CheckBox chkClassKnowledgeHistory;
	@FXML
	CheckBox chkClassKnowledgeLocal;
	@FXML
	CheckBox chkClassKnowledgeNature;
	@FXML
	CheckBox chkClassKnowledgeNobility;
	@FXML
	CheckBox chkClassKnowledgePlanes;
	@FXML
	CheckBox chkClassKnowledgeReligion;
	@FXML
	CheckBox chkClassLinguistics;
	@FXML
	CheckBox chkClassPerception;
	@FXML
	CheckBox chkClassPerform;
	@FXML
	CheckBox chkClassProfession;
	@FXML
	CheckBox chkClassRide;
	@FXML
	CheckBox chkClassSenseMotive;
	@FXML
	CheckBox chkClassSleightOfHand;
	@FXML
	CheckBox chkClassSpellcraft;
	@FXML
	CheckBox chkClassStealth;
	@FXML
	CheckBox chkClassSurvival;
	@FXML
	CheckBox chkClassSwim;
	@FXML
	CheckBox chkClassUseMagicDevice;
	//endregion

	//region Racial Bonus Labels
	@FXML
	Label lblRacialAcrobatics;
	@FXML
	Label lblRacialAppraise;
	@FXML
	Label lblRacialBluff;
	@FXML
	Label lblRacialClimb;
	@FXML
	Label lblRacialCraft;
	@FXML
	Label lblRacialDiplomacy;
	@FXML
	Label lblRacialDisableDevice;
	@FXML
	Label lblRacialDisguise;
	@FXML
	Label lblRacialEscapeArtist;
	@FXML
	Label lblRacialFly;
	@FXML
	Label lblRacialHandleAnimal;
	@FXML
	Label lblRacialHeal;
	@FXML
	Label lblRacialIntimidate;
	@FXML
	Label lblRacialKnowledgeArcana;
	@FXML
	Label lblRacialKnowledgeDungeoneering;
	@FXML
	Label lblRacialKnowledgeEngineering;
	@FXML
	Label lblRacialKnowledgeGeography;
	@FXML
	Label lblRacialKnowledgeHistory;
	@FXML
	Label lblRacialKnowledgeLocal;
	@FXML
	Label lblRacialKnowledgeNature;
	@FXML
	Label lblRacialKnowledgeNobility;
	@FXML
	Label lblRacialKnowledgePlanes;
	@FXML
	Label lblRacialKnowledgeReligion;
	@FXML
	Label lblRacialLinguistics;
	@FXML
	Label lblRacialPerception;
	@FXML
	Label lblRacialPerform;
	@FXML
	Label lblRacialProfession;
	@FXML
	Label lblRacialRide;
	@FXML
	Label lblRacialSenseMotive;
	@FXML
	Label lblRacialSleightOfHand;
	@FXML
	Label lblRacialSpellcraft;
	@FXML
	Label lblRacialStealth;
	@FXML
	Label lblRacialSurvival;
	@FXML
	Label lblRacialSwim;
	@FXML
	Label lblRacialUseMagicDevice;
	
	int checkInt = 0;
	//endregion
	
	@Override
	public void initialize() {
	}
	
	@FXML
	public void handleLabelSteup()
	{
		for (SkillGridRow skillGridRow : skillGrid) {
			skillGridRow.getAbilityLabel();
			skillGridRow.setClassSkill(getClassSkill(skillGridRow.getName()));
			skillGridRow.setRacialMod(getRacialMod(skillGridRow.getName()));
			skillGridRow.getRanksLabel();
			setTotal(skillGridRow);
		}		
	}
	
	//region abilitySetupForSkills
	private Boolean getClassSkill(String skill) {
		Boolean classSkill = false;
		for (String s : getCharacter().getClasses()[0].getClassSkills()) {
			if(s.trim().contains(skill.trim())||(skill.contains("Knowledge")&&s.equals("Knowledge (any)"))) {
				return true;
			}
		}
		return classSkill;
	}
	
	private int getRacialMod(String skill) {
		int racialBonus = 0;
		for (Effect e : getCharacter().getEffects()) {
			//System.out.println(e.getClass().toString());
			if(e.getClass().toString().equals("class pathfinder.data.Effects.SkillEffect")) {
				SkillEffect effect = (SkillEffect) e;
				//System.out.println("There is a skill effect!");
				if(effect.getBonusType().equals("racial")) {
					
					// this might not be true
					if(effect.getSkillName().trim().toLowerCase().equals(skill.trim().toLowerCase())){
						return effect.getValue();
					}
				}
			}
		}
		return racialBonus;
	}
	//endregion
	
	//region totalSetupForSkills
	void setTotal(SkillGridRow row)
	{
		row.getTotalLabel();
	}
	//endregion
	
	void increaseRank(SkillGridRow skill)
	{
		int pointsRemaining = Integer.parseInt(lblRanksRemaining.getText());
		if(pointsRemaining > 0)
		{
			if(skill.getRanks() < getCharacter().getLevel())
			{
				skill.increaseRanks();
				pointsRemaining--;
				lblRanksRemaining.setText(pointsRemaining + "");
			}
		}
	}
	
	void decreseRank(SkillGridRow skill)
	{
		int pointsRemaining = Integer.parseInt(lblRanksRemaining.getText());
		if(skill.getRanks() > 0)
		{
			skill.decreaseRanks();
			pointsRemaining++;
			lblRanksRemaining.setText(pointsRemaining + "");
		}
	}
	
	//region handleSkills
	@FXML
	void handleUseMagicDeviceIncrease() {
		increaseRank(skillGrid[34]);
	}

	@FXML
	void handleUseMagicDeviceDecrease() {
		decreseRank(skillGrid[34]);
	}
	
	@FXML
	void handleSwimIncrease() {
		increaseRank(skillGrid[33]);
	}

	@FXML
	void handleSwimDecrease() {
		decreseRank(skillGrid[33]);
	}
	
	@FXML
	void handleSurvivalIncrease() {
		increaseRank(skillGrid[32]);
	}

	@FXML
	void handleSurvivalDecrease() {
		decreseRank(skillGrid[32]);
	}
	
	@FXML
	void handleStealthIncrease() {
		increaseRank(skillGrid[31]);
	}

	@FXML
	void handleStealthDecrease() {
		decreseRank(skillGrid[31]);
	}
	
	@FXML
	void handleSpellcraftIncrease() {
		increaseRank(skillGrid[30]);
	}

	@FXML
	void handleSpellcraftDecrease() {
		decreseRank(skillGrid[30]);
	}
	
	@FXML
	void handleSleightOfHandIncrease() {
		increaseRank(skillGrid[29]);
	}

	@FXML
	void handleSleightOfHandDecrease() {
		decreseRank(skillGrid[29]);
	}
	
	@FXML
	void handleSenseMotiveIncrease() {
		increaseRank(skillGrid[28]);
	}

	@FXML
	void handleSenseMotiveDecrease() {
		decreseRank(skillGrid[28]);
	}
	
	@FXML
	void handleRideIncrease() {
		increaseRank(skillGrid[27]);
	}

	@FXML
	void handleRideDecrease() {
		decreseRank(skillGrid[27]);
	}
	
	@FXML
	void handleProfessionIncrease() {
		increaseRank(skillGrid[26]);
	}

	@FXML
	void handleProfessionDecrease() {
		decreseRank(skillGrid[26]);
	}
	
	@FXML
	void handlePerformIncrease() {
		increaseRank(skillGrid[25]);
	}

	@FXML
	void handlePerformDecrease() {
		decreseRank(skillGrid[25]);
	}
	
	@FXML
	void handlePerceptionIncrease() {
		increaseRank(skillGrid[24]);
	}

	@FXML
	void handlePerceptionDecrease() {
		decreseRank(skillGrid[24]);
	}
	
	@FXML
	void handleLinguisticsIncrease() {
		increaseRank(skillGrid[23]);
	}

	@FXML
	void handleLinguisticsDecrease() {
		decreseRank(skillGrid[23]);
	}
	
	@FXML
	void handleKnowledgeReligionIncrease() {
		increaseRank(skillGrid[22]);
	}

	@FXML
	void handleKnowledgeReligionDecrease() {
		decreseRank(skillGrid[22]);
	}
	
	@FXML
	void handleKnowledgePlanesIncrease() {
		increaseRank(skillGrid[21]);
	}

	@FXML
	void handleKnowledgePlanesDecrease() {
		decreseRank(skillGrid[21]);
	}
	
	@FXML
	void handleKnowledgeNobilityIncrease() {
		increaseRank(skillGrid[20]);
	}

	@FXML
	void handleKnowledgeNobilityDecrease() {
		decreseRank(skillGrid[20]);
	}

	@FXML
	void handleKnowledgeNatureIncrease() {
		increaseRank(skillGrid[19]);
	}

	@FXML
	void handleKnowledgeNatureDecrease() {
		decreseRank(skillGrid[19]);
	}

	@FXML
	void handleKnowledgeLocalIncrease() {
		increaseRank(skillGrid[18]);
	}

	@FXML
	void handleKnowledgeLocalDecrease() {
		decreseRank(skillGrid[18]);
	}

	@FXML
	void handleKnowledgeHistoryIncrease() {
		increaseRank(skillGrid[17]);
	}

	@FXML
	void handleKnowledgeHistoryDecrease() {
		decreseRank(skillGrid[17]);
	}

	@FXML
	void handleKnowledgeGeographyIncrease() {
		increaseRank(skillGrid[16]);
	}

	@FXML
	void handleKnowledgeGeographyDecrease() {
		decreseRank(skillGrid[16]);
	}

	@FXML
	void handleKnowledgeEngineeringIncrease() {
		increaseRank(skillGrid[15]);
	}

	@FXML
	void handleKnowledgeEngineeringDecrease() {
		decreseRank(skillGrid[15]);
	}

	@FXML
	void handleKnowledgeDungeoneeringIncrease() {
		increaseRank(skillGrid[14]);
	}

	@FXML
	void handleKnowledgeDungeoneeringDecrease() {
		decreseRank(skillGrid[14]);
	}

	@FXML
	void handleKnowledgeArcanaIncrease() {
		increaseRank(skillGrid[13]);
	}

	@FXML
	void handleKnowledgeArcanaDecrease() {
		decreseRank(skillGrid[13]);
	}

	@FXML
	void handleIntimidateIncrease() {
		increaseRank(skillGrid[12]);
	}

	@FXML
	void handleIntimidateDecrease() {
		decreseRank(skillGrid[12]);
	}

	@FXML
	void handleHealIncrease() {
		increaseRank(skillGrid[11]);
	}

	@FXML
	void handleHealDecrease() {
		decreseRank(skillGrid[11]);
	}

	@FXML
	void handleHandleAnimalIncrease() {
		increaseRank(skillGrid[10]);
	}

	@FXML
	void handleHandleAnimalDecrease() {
		decreseRank(skillGrid[10]);
	}

	@FXML
	void handleFlyIncrease() {
		increaseRank(skillGrid[9]);
	}

	@FXML
	void handleFlyDecrease() {
		decreseRank(skillGrid[9]);
	}

	@FXML
	void handleEscapeArtistIncrease() {
		increaseRank(skillGrid[8]);
	}

	@FXML
	void handleEscapeArtistDecrease() {
		decreseRank(skillGrid[8]);
	}

	@FXML
	void handleDisguiseIncrease() {
		increaseRank(skillGrid[7]);
	}

	@FXML
	void handleDisguiseDecrease() {
		decreseRank(skillGrid[7]);
	}

	@FXML
	void handleDisableDeviceIncrease() {
		increaseRank(skillGrid[6]);
	}

	@FXML
	void handleDisableDeviceDecrease() {
		decreseRank(skillGrid[6]);
	}

	@FXML
	void handleDiplomacyIncrease() {
		increaseRank(skillGrid[5]);
	}

	@FXML
	void handleDiplomacyDecrease() {
		decreseRank(skillGrid[5]);
	}

	@FXML
	void handleCraftIncrease() {
		increaseRank(skillGrid[4]);
	}

	@FXML
	void handleCraftDecrease() {
		decreseRank(skillGrid[4]);
	}

	@FXML
	void handleClimbIncrease() {
		increaseRank(skillGrid[3]);
	}

	@FXML
	void handleClimbDecrease() {
		decreseRank(skillGrid[3]);
	}

	@FXML
	void handleBluffIncrease() {
		increaseRank(skillGrid[2]);
	}

	@FXML
	void handleBluffDecrease() {
		decreseRank(skillGrid[2]);
	}

	@FXML
	void handleAppraiseIncrease() {
		increaseRank(skillGrid[1]);
	}
	@FXML
	void handleAppraiseDecrease() {
		decreseRank(skillGrid[1]);
	}

	@FXML
	void handleAcrobaticsIncrease() {
		increaseRank(skillGrid[0]);
	}

	@FXML
	void handleAcrobaticsDecrease() {
		decreseRank(skillGrid[0]);
	}
	//endregion

	@Override
	public void setData() {	
		
		if(checkInt != getCharacter().getIntelligence().getTotalValue())
		{			
			lblRanksRemaining.setText((getCharacter().getIntelligence().getModifier().getValue() + getCharacter().getClasses()[0].getSkillRanksPerLevel()) + "");
			checkInt = getCharacter().getIntelligence().getTotalValue();
			
			skillGrid = new SkillGridRow[] {
				new SkillGridRow("Acrobatics", lblTotalAcrobatics, lblRanksAcrobatics, lblAbilityAcrobatics, lblRacialAcrobatics, chkClassAcrobatics, getCharacter().getDexterity()),
				new SkillGridRow("Appraise", lblTotalAppraise, lblRanksAppraise, lblAbilityAppraise, lblRacialAppraise, chkClassAppraise, getCharacter().getIntelligence()),
				new SkillGridRow("Bluff", lblTotalBluff, lblRanksBluff, lblAbilityBluff, lblRacialBluff, chkClassBluff, getCharacter().getCharisma()),
				new SkillGridRow("Climb", lblTotalClimb, lblRanksClimb, lblAbilityClimb, lblRacialClimb, chkClassClimb, getCharacter().getStrength()),
				new SkillGridRow("Craft", lblTotalCraft, lblRanksCraft, lblAbilityCraft, lblRacialCraft, chkClassCraft, getCharacter().getIntelligence()),
				new SkillGridRow("Diplomacy", lblTotalDiplomacy, lblRanksDiplomacy, lblAbilityDiplomacy, lblRacialDiplomacy, chkClassDiplomacy, getCharacter().getCharisma()),
				new SkillGridRow("Disable Device", lblTotalDisableDevice, lblRanksDisableDevice, lblAbilityDisableDevice, lblRacialDisableDevice, chkClassDisableDevice, getCharacter().getDexterity()),
				new SkillGridRow("Disguise", lblTotalDisguise, lblRanksDisguise, lblAbilityDisguise, lblRacialDisguise, chkClassDisguise, getCharacter().getCharisma()),
				new SkillGridRow("Escape Artist", lblTotalEscapeArtist, lblRanksEscapeArtist, lblAbilityEscapeArtist, lblRacialEscapeArtist, chkClassEscapeArtist, getCharacter().getDexterity()),
				new SkillGridRow("Fly", lblTotalFly, lblRanksFly, lblAbilityFly, lblRacialFly, chkClassFly, getCharacter().getDexterity()),
				new SkillGridRow("Handle Animal", lblTotalHandleAnimal, lblRanksHandleAnimal, lblAbilityHandleAnimal, lblRacialHandleAnimal, chkClassHandleAnimal, getCharacter().getCharisma()),
				new SkillGridRow("Heal", lblTotalHeal, lblRanksHeal, lblAbilityHeal, lblRacialHeal, chkClassHeal, getCharacter().getWisdom()),
				new SkillGridRow("Intimidate", lblTotalIntimidate, lblRanksIntimidate, lblAbilityIntimidate, lblRacialIntimidate, chkClassIntimidate, getCharacter().getCharisma()),
				new SkillGridRow("Knowledge (arcana)", lblTotalKnowledgeArcana, lblRanksKnowledgeArcana, lblAbilityKnowledgeArcana, lblRacialKnowledgeArcana, chkClassKnowledgeArcana, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (dungeoneering)", lblTotalKnowledgeDungeoneering, lblRanksKnowledgeDungeoneering, lblAbilityKnowledgeDungeoneering, lblRacialKnowledgeDungeoneering, chkClassKnowledgeDungeoneering, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (engineering)", lblTotalKnowledgeEngineering, lblRanksKnowledgeEngineering, lblAbilityKnowledgeEngineering, lblRacialKnowledgeEngineering, chkClassKnowledgeEngineering, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (geography)", lblTotalKnowledgeGeography, lblRanksKnowledgeGeography, lblAbilityKnowledgeGeography, lblRacialKnowledgeGeography, chkClassKnowledgeGeography, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (history)", lblTotalKnowledgeHistory, lblRanksKnowledgeHistory, lblAbilityKnowledgeHistory, lblRacialKnowledgeHistory, chkClassKnowledgeHistory, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (local)", lblTotalKnowledgeLocal, lblRanksKnowledgeLocal, lblAbilityKnowledgeLocal, lblRacialKnowledgeLocal, chkClassKnowledgeLocal, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (nature)", lblTotalKnowledgeNature, lblRanksKnowledgeNature, lblAbilityKnowledgeNature, lblRacialKnowledgeNature, chkClassKnowledgeNature, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (nobility)", lblTotalKnowledgeNobility, lblRanksKnowledgeNobility, lblAbilityKnowledgeNobility, lblRacialKnowledgeNobility, chkClassKnowledgeNobility, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (planes)", lblTotalKnowledgePlanes, lblRanksKnowledgePlanes, lblAbilityKnowledgePlanes, lblRacialKnowledgePlanes, chkClassKnowledgePlanes, getCharacter().getIntelligence()),
				new SkillGridRow("Knowledge (religion)", lblTotalKnowledgeReligion, lblRanksKnowledgeReligion, lblAbilityKnowledgeReligion, lblRacialKnowledgeReligion, chkClassKnowledgeReligion, getCharacter().getIntelligence()),
				new SkillGridRow("Linguistics", lblTotalLinguistics, lblRanksLinguistics, lblAbilityLinguistics, lblRacialLinguistics, chkClassLinguistics, getCharacter().getIntelligence()),
				new SkillGridRow("Perception", lblTotalPerception, lblRanksPerception, lblAbilityPerception, lblRacialPerception, chkClassPerception, getCharacter().getWisdom()),
				new SkillGridRow("Perform", lblTotalPerform, lblRanksPerform, lblAbilityPerform, lblRacialPerform, chkClassPerform, getCharacter().getCharisma()),
				new SkillGridRow("Profession", lblTotalProfession, lblRanksProfession, lblAbilityProfession, lblRacialProfession, chkClassProfession, getCharacter().getWisdom()),
				new SkillGridRow("Ride", lblTotalRide, lblRanksRide, lblAbilityRide, lblRacialRide, chkClassRide, getCharacter().getDexterity()),
				new SkillGridRow("Sense Motive", lblTotalSenseMotive, lblRanksSenseMotive, lblAbilitySenseMotive, lblRacialSenseMotive, chkClassSenseMotive, getCharacter().getWisdom()),
				new SkillGridRow("Sleight of Hand", lblTotalSleightOfHand, lblRanksSleightOfHand, lblAbilitySleightOfHand, lblRacialSleightOfHand, chkClassSleightOfHand, getCharacter().getDexterity()),
				new SkillGridRow("Spellcraft", lblTotalSpellcraft, lblRanksSpellcraft, lblAbilitySpellcraft, lblRacialSpellcraft, chkClassSpellcraft, getCharacter().getIntelligence()),
				new SkillGridRow("Stealth", lblTotalStealth, lblRanksStealth, lblAbilityStealth, lblRacialStealth, chkClassStealth, getCharacter().getDexterity()),
				new SkillGridRow("Survival", lblTotalSurvival, lblRanksSurvival, lblAbilitySurvival, lblRacialSurvival, chkClassSurvival, getCharacter().getWisdom()),
				new SkillGridRow("Swim", lblTotalSwim, lblRanksSwim, lblAbilitySwim, lblRacialSwim, chkClassSwim, getCharacter().getStrength()),
				new SkillGridRow("Use Magic Device", lblTotalUseMagicDevice, lblRanksUseMagicDevice, lblAbilityUseMagicDevice, lblRacialUseMagicDevice, chkClassUseMagicDevice, getCharacter().getDexterity())
			};
			handleLabelSteup();
		}
	}

	@Override
	public void getData() {
		ArrayList<Skill> skills = new ArrayList<Skill>();
		for (SkillGridRow skillGridRow : skillGrid) {
			skills.add(skillGridRow.toSkill());
		}
		
		this.getCharacter().setSkills(skills.toArray(new Skill[]{}));
	}

	// private Skill addSkill(int rank, Ability attrToUse, String name,
	// HashMap<String, Integer> situationalMod) {
	// Skill skill = null;
	// for (String S : getCharacter().getClasses()[0].getClassSkills()) {
	// if(S.equals(name)) skill = new Skill(rank, attrToUse, name, true,
	// situationalMod);
	// else skill = new Skill(rank, attrToUse, name, false, situationalMod);
	// }
	// return skill;
	//
	// }

}
