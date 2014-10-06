package view.partials.dialogs.partials;

import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Skill;
import pathfinder.data.Effects.Effect;
import pathfinder.data.Effects.SkillEffect;
import view.SkillGridRow;

public class SkillsPartialController extends NewCharacterPartialController {
	
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
	Label lblClassAcrobatics;
	@FXML
	Label lblClassAppraise;
	@FXML
	Label lblClassBluff;
	@FXML
	Label lblClassClimb;
	@FXML
	Label lblClassCraft;
	@FXML
	Label lblClassDiplomacy;
	@FXML
	Label lblClassDisableDevice;
	@FXML
	Label lblClassDisguise;
	@FXML
	Label lblClassEscapeArtist;
	@FXML
	Label lblClassFly;
	@FXML
	Label lblClassHandleAnimal;
	@FXML
	Label lblClassHeal;
	@FXML
	Label lblClassIntimidate;
	@FXML
	Label lblClassKnowledgeArcana;
	@FXML
	Label lblClassKnowledgeDungeoneering;
	@FXML
	Label lblClassKnowledgeEngineering;
	@FXML
	Label lblClassKnowledgeGeography;
	@FXML
	Label lblClassKnowledgeHistory;
	@FXML
	Label lblClassKnowledgeLocal;
	@FXML
	Label lblClassKnowledgeNature;
	@FXML
	Label lblClassKnowledgeNobility;
	@FXML
	Label lblClassKnowledgePlanes;
	@FXML
	Label lblClassKnowledgeReligion;
	@FXML
	Label lblClassLinguistics;
	@FXML
	Label lblClassPerception;
	@FXML
	Label lblClassPerform;
	@FXML
	Label lblClassProfession;
	@FXML
	Label lblClassRide;
	@FXML
	Label lblClassSenseMotive;
	@FXML
	Label lblClassSleightOfHand;
	@FXML
	Label lblClassSpellcraft;
	@FXML
	Label lblClassStealth;
	@FXML
	Label lblClassSurvival;
	@FXML
	Label lblClassSwim;
	@FXML
	Label lblClassUseMagicDevice;
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
			if(s.trim().equals(skill.trim())||(skill.contains("Knowledge")&&s.equals("Knowledge (any)"))) {
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
	
	//region handleSkills
	@FXML
	void handleUseMagicDeviceIncrease() {
		skillGrid[34].increaseRanks();
	}

	@FXML
	void handleUseMagicDeviceDecrease() {
		skillGrid[34].decreaseRanks();
	}
	
	@FXML
	void handleSwimIncrease() {
		skillGrid[33].increaseRanks();
	}

	@FXML
	void handleSwimDecrease() {
		skillGrid[33].decreaseRanks();
	}
	
	@FXML
	void handleSurvivalIncrease() {
		skillGrid[32].increaseRanks();
	}

	@FXML
	void handleSurvivalDecrease() {
		skillGrid[32].decreaseRanks();
	}
	
	@FXML
	void handleStealthIncrease() {
		skillGrid[31].increaseRanks();
	}

	@FXML
	void handleStealthDecrease() {
		skillGrid[31].decreaseRanks();
	}
	
	@FXML
	void handleSpellcraftIncrease() {
		skillGrid[30].increaseRanks();
	}

	@FXML
	void handleSpellcraftDecrease() {
		skillGrid[30].decreaseRanks();
	}
	
	@FXML
	void handleSleightOfHandIncrease() {
		skillGrid[29].increaseRanks();
	}

	@FXML
	void handleSleightOfHandDecrease() {
		skillGrid[29].decreaseRanks();
	}
	
	@FXML
	void handleSenseMotiveIncrease() {
		skillGrid[28].increaseRanks();
	}

	@FXML
	void handleSenseMotiveDecrease() {
		skillGrid[28].decreaseRanks();
	}
	
	@FXML
	void handleRideIncrease() {
		skillGrid[27].increaseRanks();
	}

	@FXML
	void handleRideDecrease() {
		skillGrid[27].decreaseRanks();
	}
	
	@FXML
	void handleProfessionIncrease() {
		skillGrid[26].increaseRanks();
	}

	@FXML
	void handleProfessionDecrease() {
		skillGrid[26].decreaseRanks();
	}
	
	@FXML
	void handlePerformIncrease() {
		skillGrid[25].increaseRanks();
	}

	@FXML
	void handlePerformDecrease() {
		skillGrid[25].decreaseRanks();
	}
	
	@FXML
	void handlePerceptionIncrease() {
		skillGrid[24].increaseRanks();
	}

	@FXML
	void handlePerceptionDecrease() {
		skillGrid[24].decreaseRanks();
	}
	
	@FXML
	void handleLinguisticsIncrease() {
		skillGrid[23].increaseRanks();
	}

	@FXML
	void handleLinguisticsDecrease() {
		skillGrid[23].decreaseRanks();
	}
	
	@FXML
	void handleKnowledgeReligionIncrease() {
		skillGrid[22].increaseRanks();
	}

	@FXML
	void handleKnowledgeReligionDecrease() {
		skillGrid[22].decreaseRanks();
	}
	
	@FXML
	void handleKnowledgePlanesIncrease() {
		skillGrid[21].increaseRanks();
	}

	@FXML
	void handleKnowledgePlanesDecrease() {
		skillGrid[21].decreaseRanks();
	}
	
	@FXML
	void handleKnowledgeNobilityIncrease() {
		skillGrid[20].increaseRanks();
	}

	@FXML
	void handleKnowledgeNobilityDecrease() {
		skillGrid[20].decreaseRanks();
	}

	@FXML
	void handleKnowledgeNatureIncrease() {
		skillGrid[19].increaseRanks();
	}

	@FXML
	void handleKnowledgeNatureDecrease() {
		skillGrid[19].decreaseRanks();
	}

	@FXML
	void handleKnowledgeLocalIncrease() {
		skillGrid[18].increaseRanks();
	}

	@FXML
	void handleKnowledgeLocalDecrease() {
		skillGrid[18].decreaseRanks();
	}

	@FXML
	void handleKnowledgeHistoryIncrease() {
		skillGrid[17].increaseRanks();
	}

	@FXML
	void handleKnowledgeHistoryDecrease() {
		skillGrid[17].decreaseRanks();
	}

	@FXML
	void handleKnowledgeGeographyIncrease() {
		skillGrid[16].increaseRanks();
	}

	@FXML
	void handleKnowledgeGeographyDecrease() {
		skillGrid[16].decreaseRanks();
	}

	@FXML
	void handleKnowledgeEngineeringIncrease() {
		skillGrid[15].increaseRanks();
	}

	@FXML
	void handleKnowledgeEngineeringDecrease() {
		skillGrid[15].decreaseRanks();
	}

	@FXML
	void handleKnowledgeDungeoneeringIncrease() {
		skillGrid[14].increaseRanks();
	}

	@FXML
	void handleKnowledgeDungeoneeringDecrease() {
		skillGrid[14].decreaseRanks();
	}

	@FXML
	void handleKnowledgeArcanaIncrease() {
		skillGrid[13].increaseRanks();
	}

	@FXML
	void handleKnowledgeArcanaDecrease() {
		skillGrid[13].decreaseRanks();
	}

	@FXML
	void handleIntimidateIncrease() {
		skillGrid[12].increaseRanks();
	}

	@FXML
	void handleIntimidateDecrease() {
		skillGrid[12].decreaseRanks();
	}

	@FXML
	void handleHealIncrease() {
		skillGrid[11].increaseRanks();
	}

	@FXML
	void handleHealDecrease() {
		skillGrid[11].decreaseRanks();
	}

	@FXML
	void handleHandleAnimalIncrease() {
		skillGrid[10].increaseRanks();
	}

	@FXML
	void handleHandleAnimalDecrease() {
		skillGrid[10].decreaseRanks();
	}

	@FXML
	void handleFlyIncrease() {
		skillGrid[9].increaseRanks();
	}

	@FXML
	void handleFlyDecrease() {
		skillGrid[9].decreaseRanks();
	}

	@FXML
	void handleEscapeArtistIncrease() {
		skillGrid[8].increaseRanks();
	}

	@FXML
	void handleEscapeArtistDecrease() {
		skillGrid[8].decreaseRanks();
	}

	@FXML
	void handleDisguiseIncrease() {
		skillGrid[7].increaseRanks();
	}

	@FXML
	void handleDisguiseDecrease() {
		skillGrid[7].decreaseRanks();
	}

	@FXML
	void handleDisableDeviceIncrease() {
		skillGrid[6].increaseRanks();
	}

	@FXML
	void handleDisableDeviceDecrease() {
		skillGrid[6].decreaseRanks();
	}

	@FXML
	void handleDiplomacyIncrease() {
		skillGrid[5].increaseRanks();
	}

	@FXML
	void handleDiplomacyDecrease() {
		skillGrid[5].decreaseRanks();
	}

	@FXML
	void handleCraftIncrease() {
		skillGrid[4].increaseRanks();
	}

	@FXML
	void handleCraftDecrease() {
		skillGrid[4].decreaseRanks();
	}

	@FXML
	void handleClimbIncrease() {
		skillGrid[3].increaseRanks();
	}

	@FXML
	void handleClimbDecrease() {
		skillGrid[3].decreaseRanks();
	}

	@FXML
	void handleBluffIncrease() {
		skillGrid[2].increaseRanks();
	}

	@FXML
	void handleBluffDecrease() {
		skillGrid[2].decreaseRanks();
	}

	@FXML
	void handleAppraiseIncrease() {
		skillGrid[1].increaseRanks();
	}

	@FXML
	void handleAppraiseDecrease() {
		skillGrid[1].decreaseRanks();
	}

	@FXML
	void handleAcrobaticsIncrease() {
		skillGrid[0].increaseRanks();
	}

	@FXML
	void handleAcrobaticsDecrease() {
		skillGrid[0].decreaseRanks();
	}
	//endregion

	@Override
	public void setData() {

		skillGrid = new SkillGridRow[] {
			new SkillGridRow("Acrobatics", lblTotalAcrobatics, lblRanksAcrobatics, lblAbilityAcrobatics, lblRacialAcrobatics, lblClassAcrobatics, getCharacter().getDexterity()),
			new SkillGridRow("Appraise", lblTotalAppraise, lblRanksAppraise, lblAbilityAppraise, lblRacialAppraise, lblClassAppraise, getCharacter().getIntelligence()),
			new SkillGridRow("Bluff", lblTotalBluff, lblRanksBluff, lblAbilityBluff, lblRacialBluff, lblClassBluff, getCharacter().getCharisma()),
			new SkillGridRow("Climb", lblTotalClimb, lblRanksClimb, lblAbilityClimb, lblRacialClimb, lblClassClimb, getCharacter().getStrength()),
			new SkillGridRow("Craft", lblTotalCraft, lblRanksCraft, lblAbilityCraft, lblRacialCraft, lblClassCraft, getCharacter().getIntelligence()),
			new SkillGridRow("Diplomacy", lblTotalDiplomacy, lblRanksDiplomacy, lblAbilityDiplomacy, lblRacialDiplomacy, lblClassDiplomacy, getCharacter().getCharisma()),
			new SkillGridRow("Disable Device", lblTotalDisableDevice, lblRanksDisableDevice, lblAbilityDisableDevice, lblRacialDisableDevice, lblClassDisableDevice, getCharacter().getDexterity()),
			new SkillGridRow("Disguise", lblTotalDisguise, lblRanksDisguise, lblAbilityDisguise, lblRacialDisguise, lblClassDisguise, getCharacter().getCharisma()),
			new SkillGridRow("Escape Artist", lblTotalEscapeArtist, lblRanksEscapeArtist, lblAbilityEscapeArtist, lblRacialEscapeArtist, lblClassEscapeArtist, getCharacter().getDexterity()),
			new SkillGridRow("Fly", lblTotalFly, lblRanksFly, lblAbilityFly, lblRacialFly, lblClassFly, getCharacter().getDexterity()),
			new SkillGridRow("Handle Animal", lblTotalHandleAnimal, lblRanksHandleAnimal, lblAbilityHandleAnimal, lblRacialHandleAnimal, lblClassHandleAnimal, getCharacter().getCharisma()),
			new SkillGridRow("Heal", lblTotalHeal, lblRanksHeal, lblAbilityHeal, lblRacialHeal, lblClassHeal, getCharacter().getWisdom()),
			new SkillGridRow("Intimidate", lblTotalIntimidate, lblRanksIntimidate, lblAbilityIntimidate, lblRacialIntimidate, lblClassIntimidate, getCharacter().getCharisma()),
			new SkillGridRow("Knowledge (arcana)", lblTotalKnowledgeArcana, lblRanksKnowledgeArcana, lblAbilityKnowledgeArcana, lblRacialKnowledgeArcana, lblClassKnowledgeArcana, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (dungeoneering)", lblTotalKnowledgeDungeoneering, lblRanksKnowledgeDungeoneering, lblAbilityKnowledgeDungeoneering, lblRacialKnowledgeDungeoneering, lblClassKnowledgeDungeoneering, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (engineering)", lblTotalKnowledgeEngineering, lblRanksKnowledgeEngineering, lblAbilityKnowledgeEngineering, lblRacialKnowledgeEngineering, lblClassKnowledgeEngineering, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (geography)", lblTotalKnowledgeGeography, lblRanksKnowledgeGeography, lblAbilityKnowledgeGeography, lblRacialKnowledgeGeography, lblClassKnowledgeGeography, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (history)", lblTotalKnowledgeHistory, lblRanksKnowledgeHistory, lblAbilityKnowledgeHistory, lblRacialKnowledgeHistory, lblClassKnowledgeHistory, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (local)", lblTotalKnowledgeLocal, lblRanksKnowledgeLocal, lblAbilityKnowledgeLocal, lblRacialKnowledgeLocal, lblClassKnowledgeLocal, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (nature)", lblTotalKnowledgeNature, lblRanksKnowledgeNature, lblAbilityKnowledgeNature, lblRacialKnowledgeNature, lblClassKnowledgeNature, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (nobility)", lblTotalKnowledgeNobility, lblRanksKnowledgeNobility, lblAbilityKnowledgeNobility, lblRacialKnowledgeNobility, lblClassKnowledgeNobility, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (planes)", lblTotalKnowledgePlanes, lblRanksKnowledgePlanes, lblAbilityKnowledgePlanes, lblRacialKnowledgePlanes, lblClassKnowledgePlanes, getCharacter().getIntelligence()),
			new SkillGridRow("Knowledge (religion)", lblTotalKnowledgeReligion, lblRanksKnowledgeReligion, lblAbilityKnowledgeReligion, lblRacialKnowledgeReligion, lblClassKnowledgeReligion, getCharacter().getIntelligence()),
			new SkillGridRow("Linguistics", lblTotalLinguistics, lblRanksLinguistics, lblAbilityLinguistics, lblRacialLinguistics, lblClassLinguistics, getCharacter().getIntelligence()),
			new SkillGridRow("Perception", lblTotalPerception, lblRanksPerception, lblAbilityPerception, lblRacialPerception, lblClassPerception, getCharacter().getWisdom()),
			new SkillGridRow("Perform", lblTotalPerform, lblRanksPerform, lblAbilityPerform, lblRacialPerform, lblClassPerform, getCharacter().getCharisma()),
			new SkillGridRow("Profession", lblTotalProfession, lblRanksProfession, lblAbilityProfession, lblRacialProfession, lblClassProfession, getCharacter().getWisdom()),
			new SkillGridRow("Ride", lblTotalRide, lblRanksRide, lblAbilityRide, lblRacialRide, lblClassRide, getCharacter().getDexterity()),
			new SkillGridRow("Sense Motive", lblTotalSenseMotive, lblRanksSenseMotive, lblAbilitySenseMotive, lblRacialSenseMotive, lblClassSenseMotive, getCharacter().getWisdom()),
			new SkillGridRow("Sleight of Hand", lblTotalSleightOfHand, lblRanksSleightOfHand, lblAbilitySleightOfHand, lblRacialSleightOfHand, lblClassSleightOfHand, getCharacter().getDexterity()),
			new SkillGridRow("Spellcraft", lblTotalSpellcraft, lblRanksSpellcraft, lblAbilitySpellcraft, lblRacialSpellcraft, lblClassSpellcraft, getCharacter().getIntelligence()),
			new SkillGridRow("Stealth", lblTotalStealth, lblRanksStealth, lblAbilityStealth, lblRacialStealth, lblClassStealth, getCharacter().getDexterity()),
			new SkillGridRow("Survival", lblTotalSurvival, lblRanksSurvival, lblAbilitySurvival, lblRacialSurvival, lblClassSurvival, getCharacter().getWisdom()),
			new SkillGridRow("Swim", lblTotalSwim, lblRanksSwim, lblAbilitySwim, lblRacialSwim, lblClassSwim, getCharacter().getStrength()),
			new SkillGridRow("Use Magic Device", lblTotalUseMagicDevice, lblRanksUseMagicDevice, lblAbilityUseMagicDevice, lblRacialUseMagicDevice, lblClassUseMagicDevice, getCharacter().getDexterity())
		};
		handleLabelSteup();
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
