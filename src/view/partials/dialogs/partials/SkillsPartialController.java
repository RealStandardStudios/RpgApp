package view.partials.dialogs.partials;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Skill;
import pathfinder.data.Attributes.Ability;
import pathfinder.data.Effects.Effect;
import pathfinder.data.Effects.SkillEffect;

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
	Label[] skillLabels;
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
		skillLabels = new Label[] { lblRanksAcrobatics, lblRanksAppraise,
				lblRanksBluff, lblRanksClimb, lblRanksClimb, lblRanksCraft,
				lblRanksDiplomacy, lblRanksDisableDevice, lblRanksDisguise,
				lblRanksEscapeArtist, lblRanksFly, lblRanksHandleAnimal,
				lblRanksHeal, lblRanksIntimidate, lblRanksKnowledgeArcana,
				lblRanksKnowledgeDungeoneering, lblRanksKnowledgeEngineering,
				lblRanksKnowledgeGeography, lblRanksKnowledgeHistory,
				lblRanksKnowledgeLocal, lblRanksKnowledgeNature,
				lblRanksKnowledgeNobility, lblRanksKnowledgePlanes,
				lblRanksKnowledgeReligion, lblRanksLinguistics,
				lblRanksPerception, lblRanksPerform, lblRanksProfession,
				lblRanksRide, lblRanksSenseMotive, lblRanksSleightOfHand,
				lblRanksSpellcraft, lblRanksStealth, lblRanksSurvival,
				lblRanksSwim, lblRanksUseMagicDevice };

		for (Label label : skillLabels) {
			label.setText("0");
		}
	}
	
	@FXML
	public void handleLabelSteup()
	{
		//region HandlesTheAbilityModifiersToBeSetUp
		setAcrobatics();
		setAppraise();
		setBluff();
		setClimb();
		setCraft();
		setDiplomacy();
		setDisableDevice();
		setDisguise();
		setEscapeArtist();
		setFly();
		setHandleAnimal();
		setHeal();
		setIntimidate();
		setKnowledgeArcana();
		setKnowledgeDungeoneering();
		setKnowledgeEngineering();
		setKnowledgeGeography();
		setKnowledgeHistory();
		setKnowledgeLocal();
		setKnowledgeNature();
		setKnowledgeNobility();
		setKnowledgePlanes();
		setKnowledgeReligion();
		setLinguistics();
		setPerception();
		setPerform();
		setProfession();
		setRide();
		setSenseMotive();
		setSleightOfHand();
		setSpellcraft();
		setStealth();
		setSurvival();
		setSwim();
		setUseMagicDevice();
		//endregion
		
		//region HandlesSettingUpTheTotals
		setTotalAcrobatics();
		setTotalAppraise();
		setTotalBluff();
		setTotalClimb();
		setTotalCraft();
		setTotalDiplomacy();
		setTotalDisableDevice();
		setTotalDisguise();
		setTotalEscapeArtist();
		setTotalFly();
		setTotalHandleAnimal();
		setTotalHeal();
		setTotalIntimidate();
		setTotalKnowledgeArcana();
		setTotalKnowledgeDungeoneering();
		setTotalKnowledgeEngineering();
		setTotalKnowledgeGeography();
		setTotalKnowledgeHistory();
		setTotalKnowledgeLocal();
		setTotalKnowledgeNature();
		setTotalKnowledgeNobility();
		setTotalKnowledgePlanes();
		setTotalKnowledgeReligion();
		setTotalLinguistics();
		setTotalPerception();
		setTotalPerform();
		setTotalProfession();
		setTotalRide();
		setTotalSenseMotive();
		setTotalSleightOfHand();
		setTotalSpellcraft();
		setTotalStealth();
		setTotalSurvival();
		setTotalSwim();
		setTotalUseMagicDevice();
		//endregion
		
	}
	
	//region abilitySetupForSkills
	private void setClassSkillLabel(String skill, Label lblClassSkill) {
		for (String s : getCharacter().getClasses()[0].getClassSkills()) {
			if(s.trim().equals(skill.trim())||(skill.contains("Knowledge")&&s.equals("Knowledge (any)"))) {
				lblClassSkill.setText("True");
				break;
			}
			else
				lblClassSkill.setText("False");
		}
	}	
	private void setRacialBonusLabel(String skill,Label lblRacialBonus) {
		for (Effect e : getCharacter().getEffects()) {
			System.out.println(e.getClass().toString());
			if(e.getClass().toString().equals("class pathfinder.data.Effects.SkillEffect")) {
				SkillEffect effect = (SkillEffect) e;
				//System.out.println("There is a skill effect!");
				if(effect.getBonusType().equals("racial")) {
					if(effect.getSkillName().trim().toLowerCase().equals(skill.trim().toLowerCase()))
						lblRacialBonus.setText(""+effect.getValue());
					else
						lblRacialBonus.setText("0");
				}
			}
			else lblRacialBonus.setText("0");
		}
	}
	void setAcrobatics()
	{
		lblAbilityAcrobatics.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Acrobatics";
		setClassSkillLabel(skill,lblClassAcrobatics);
		setRacialBonusLabel(skill, lblRacialAcrobatics);
	}
	void setAppraise()
	{
		lblAbilityAppraise.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Appraise";
		setClassSkillLabel(skill,lblClassAppraise);
		setRacialBonusLabel(skill, lblRacialAcrobatics);
	}
	void setBluff()
	{
		lblAbilityBluff.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Bluff";
		setClassSkillLabel(skill,lblClassBluff);
		setRacialBonusLabel(skill, lblRacialBluff);
	}
	void setClimb()
	{
		lblAbilityClimb.setText("Str: " + getCharacter().getStrength().getModifier().get().toString());
		String skill = "Climb";
		setClassSkillLabel(skill,lblClassClimb);
		setRacialBonusLabel(skill, lblRacialClimb);
	}
	void setCraft()
	{
		lblAbilityCraft.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Craft";
		setClassSkillLabel(skill,lblClassCraft);
		setRacialBonusLabel(skill, lblRacialCraft);
	}
	void setDiplomacy()
	{
		lblAbilityDiplomacy.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Diplomacy";
		setClassSkillLabel(skill,lblClassDiplomacy);
		setRacialBonusLabel(skill, lblRacialDiplomacy);
	}
	void setDisableDevice()
	{
		lblAbilityDisableDevice.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Disable Device";
		setClassSkillLabel(skill,lblClassDisableDevice);
		setRacialBonusLabel(skill, lblRacialDisableDevice);
	}
	void setDisguise()
	{
		lblAbilityDisguise.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Disguise";
		setClassSkillLabel(skill,lblClassDisguise);
		setRacialBonusLabel(skill, lblRacialDisguise);
	}
	void setEscapeArtist()
	{
		lblAbilityEscapeArtist.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Escape Artist";
		setClassSkillLabel(skill,lblClassEscapeArtist);
		setRacialBonusLabel(skill, lblRacialEscapeArtist);
	}
	void setFly()
	{
		lblAbilityFly.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Fly";
		setClassSkillLabel(skill,lblClassFly);
		setRacialBonusLabel(skill, lblRacialFly);
	}
	void setHandleAnimal()
	{
		lblAbilityHandleAnimal.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Handle Animal";
		setClassSkillLabel(skill,lblClassHandleAnimal);
		setRacialBonusLabel(skill, lblRacialHandleAnimal);
	}
	void setHeal()
	{
		lblAbilityHeal.setText("Wis: " + getCharacter().getWisdom().getModifier().get().toString());
		String skill = "Heal";
		setClassSkillLabel(skill,lblClassHeal);
		setRacialBonusLabel(skill, lblRacialHeal);
	}
	void setIntimidate()
	{
		lblAbilityIntimidate.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Intimidate";
		setClassSkillLabel(skill,lblClassIntimidate);
		setRacialBonusLabel(skill, lblRacialIntimidate);
	}
	void setKnowledgeArcana()
	{
		lblAbilityKnowledgeArcana.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (arcana)";
		setClassSkillLabel(skill,lblClassKnowledgeArcana);
		setRacialBonusLabel(skill, lblRacialKnowledgeArcana);
	}
	void setKnowledgeDungeoneering()
	{
		lblAbilityKnowledgeDungeoneering.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (dungeoneering)";
		setClassSkillLabel(skill,lblClassKnowledgeDungeoneering);
		setRacialBonusLabel(skill, lblRacialKnowledgeDungeoneering);
	}
	void setKnowledgeEngineering()
	{
		lblAbilityKnowledgeEngineering.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (engineering)";
		setClassSkillLabel(skill,lblClassKnowledgeEngineering);
		setRacialBonusLabel(skill, lblRacialKnowledgeEngineering);
	}
	void setKnowledgeGeography()
	{
		lblAbilityKnowledgeGeography.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (geography)";
		setClassSkillLabel(skill,lblClassKnowledgeGeography);
		setRacialBonusLabel(skill, lblRacialKnowledgeGeography);
	}
	void setKnowledgeHistory()
	{
		lblAbilityKnowledgeHistory.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (history)";
		setClassSkillLabel(skill,lblClassKnowledgeHistory);
		setRacialBonusLabel(skill, lblRacialKnowledgeHistory);
	}
	void setKnowledgeLocal()
	{
		lblAbilityKnowledgeLocal.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (local)";
		setClassSkillLabel(skill,lblClassKnowledgeLocal);
		setRacialBonusLabel(skill, lblRacialKnowledgeLocal);
	}
	void setKnowledgeNature()
	{
		lblAbilityKnowledgeNature.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (nature)";
		setClassSkillLabel(skill,lblClassKnowledgeNature);
		setRacialBonusLabel(skill, lblRacialKnowledgeNature);
	}
	void setKnowledgeNobility()
	{
		lblAbilityKnowledgeNobility.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (nobility)";
		setClassSkillLabel(skill,lblClassKnowledgeNobility);
		setRacialBonusLabel(skill, lblRacialKnowledgeNobility);
	}
	void setKnowledgePlanes()
	{
		lblAbilityKnowledgePlanes.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (planes)";
		setClassSkillLabel(skill,lblClassKnowledgePlanes);
		setRacialBonusLabel(skill, lblRacialKnowledgePlanes);
	}
	void setKnowledgeReligion()
	{
		lblAbilityKnowledgeReligion.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Knowledge (religion)";
		setClassSkillLabel(skill,lblClassKnowledgeReligion);
		setRacialBonusLabel(skill, lblRacialKnowledgeReligion);
	}
	void setLinguistics()
	{
		lblAbilityLinguistics.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Linguistics";
		setClassSkillLabel(skill,lblClassLinguistics);
		setRacialBonusLabel(skill, lblRacialLinguistics);
	}
	void setPerception()
	{
		lblAbilityPerception.setText("Wis: " + getCharacter().getWisdom().getModifier().get().toString());
		String skill = "Perception";
		setClassSkillLabel(skill,lblClassPerception);
		setRacialBonusLabel(skill, lblRacialPerception);
	}
	void setPerform()
	{
		lblAbilityPerform.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Perform";
		setClassSkillLabel(skill,lblClassPerform);
		setRacialBonusLabel(skill, lblRacialPerform);
	}
	void setProfession()
	{
		lblAbilityProfession.setText("Wis: " + getCharacter().getWisdom().getModifier().get().toString());
		String skill = "Profession";
		setClassSkillLabel(skill,lblClassProfession);
		setRacialBonusLabel(skill, lblRacialProfession);
	}
	void setRide()
	{
		lblAbilityRide.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Ride";
		setClassSkillLabel(skill,lblClassRide);
		setRacialBonusLabel(skill, lblRacialRide);
	}
	void setSenseMotive()
	{
		lblAbilitySenseMotive.setText("Wis: " + getCharacter().getWisdom().getModifier().get().toString());
		String skill = "Sense Motive";
		setClassSkillLabel(skill,lblClassSenseMotive);
		setRacialBonusLabel(skill, lblRacialSenseMotive);
	}
	void setSleightOfHand()
	{
		lblAbilitySleightOfHand.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Sleight of Hand";
		setClassSkillLabel(skill,lblClassSleightOfHand);
		setRacialBonusLabel(skill, lblRacialSleightOfHand);
	}
	void setSpellcraft()
	{
		lblAbilitySpellcraft.setText("Int: " + getCharacter().getIntelligence().getModifier().get().toString());
		String skill = "Spellcraft";
		setClassSkillLabel(skill,lblClassSpellcraft);
		setRacialBonusLabel(skill, lblRacialSpellcraft);
	}
	void setStealth()
	{
		lblAbilityStealth.setText("Dex: " + getCharacter().getDexterity().getModifier().get().toString());
		String skill = "Stealth";
		setClassSkillLabel(skill,lblClassStealth);
		setRacialBonusLabel(skill, lblRacialStealth);
	}
	void setSurvival()
	{
		lblAbilitySurvival.setText("Wis: " + getCharacter().getWisdom().getModifier().get().toString());
		String skill = "Survival";
		setClassSkillLabel(skill,lblClassSurvival);
		setRacialBonusLabel(skill, lblRacialSurvival);
	}
	void setSwim()
	{
		lblAbilitySwim.setText("Str: " + getCharacter().getStrength().getModifier().get().toString());
		String skill = "Swim";
		setClassSkillLabel(skill,lblClassSwim);
		setRacialBonusLabel(skill, lblRacialSwim);
	}
	void setUseMagicDevice()
	{
		lblAbilityUseMagicDevice.setText("Cha: " + getCharacter().getCharisma().getModifier().get().toString());
		String skill = "Use Magic Device";
		setClassSkillLabel(skill,lblClassUseMagicDevice);
		setRacialBonusLabel(skill, lblRacialUseMagicDevice);
	}
	//endregion
	
	//region totalSetupForSkills
		void setTotalAcrobatics()
		{
			lblTotalAcrobatics.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksAcrobatics.getText())));
		}
		void setTotalAppraise()
		{
			lblTotalAppraise.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksAppraise.getText())));
		}
		void setTotalBluff()
		{
			lblTotalBluff.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksBluff.getText())));
		}
		void setTotalClimb()
		{
			lblTotalClimb.setText("" + (getCharacter().getStrength().getModifier().get() + Integer.parseInt(lblRanksClimb.getText())));
		}
		void setTotalCraft()
		{
			lblTotalCraft.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksCraft.getText())));
		}
		void setTotalDiplomacy()
		{
			lblTotalDiplomacy.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksDiplomacy.getText())));
		}
		void setTotalDisableDevice()
		{
			lblTotalDisableDevice.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksDisableDevice.getText())));
		}
		void setTotalDisguise()
		{
			lblTotalDisguise.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksDisguise.getText())));
		}
		void setTotalEscapeArtist()
		{
			lblTotalEscapeArtist.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksEscapeArtist.getText())));
		}
		void setTotalFly()
		{
			lblTotalFly.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksFly.getText())));
		}
		void setTotalHandleAnimal()
		{
			lblTotalHandleAnimal.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksHandleAnimal.getText())));
		}
		void setTotalHeal()
		{
			lblTotalHeal.setText("" + (getCharacter().getWisdom().getModifier().get() + Integer.parseInt(lblRanksHeal.getText())));
		}
		void setTotalIntimidate()
		{
			lblTotalIntimidate.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksIntimidate.getText())));
		}
		void setTotalKnowledgeArcana()
		{
			lblTotalKnowledgeArcana.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeArcana.getText())));
		}
		void setTotalKnowledgeDungeoneering()
		{
			lblTotalKnowledgeDungeoneering.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeDungeoneering.getText())));
		}
		void setTotalKnowledgeEngineering()
		{
			lblTotalKnowledgeEngineering.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeEngineering.getText())));
		}
		void setTotalKnowledgeGeography()
		{
			lblTotalKnowledgeGeography.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeGeography.getText())));
		}
		void setTotalKnowledgeHistory()
		{
			lblTotalKnowledgeHistory.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeHistory.getText())));
		}
		void setTotalKnowledgeLocal()
		{
			lblTotalKnowledgeLocal.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeLocal.getText())));
		}
		void setTotalKnowledgeNature()
		{
			lblTotalKnowledgeNature.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeNature.getText())));
		}
		void setTotalKnowledgeNobility()
		{
			lblTotalKnowledgeNobility.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeNobility.getText())));
		}
		void setTotalKnowledgePlanes()
		{
			lblTotalKnowledgePlanes.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgePlanes.getText())));
		}
		void setTotalKnowledgeReligion()
		{
			lblTotalKnowledgeReligion.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksKnowledgeReligion.getText())));
		}
		void setTotalLinguistics()
		{
			lblTotalLinguistics.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksLinguistics.getText())));
		}
		void setTotalPerception()
		{
			lblTotalPerception.setText("" + (getCharacter().getWisdom().getModifier().get() + Integer.parseInt(lblRanksPerception.getText())));
		}
		void setTotalPerform()
		{
			lblTotalPerform.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksPerform.getText())));
		}
		void setTotalProfession()
		{
			lblTotalProfession.setText("" + (getCharacter().getWisdom().getModifier().get() + Integer.parseInt(lblRanksProfession.getText())));
		}
		void setTotalRide()
		{
			lblTotalRide.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksRide.getText())));
		}
		void setTotalSenseMotive()
		{
			lblTotalSenseMotive.setText("" + (getCharacter().getWisdom().getModifier().get() + Integer.parseInt(lblRanksSenseMotive.getText())));
		}
		void setTotalSleightOfHand()
		{
			lblTotalSleightOfHand.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksSleightOfHand.getText())));
		}
		void setTotalSpellcraft()
		{
			lblTotalSpellcraft.setText("" + (getCharacter().getIntelligence().getModifier().get() + Integer.parseInt(lblRanksSpellcraft.getText())));
		}
		void setTotalStealth()
		{
			lblTotalStealth.setText("" + (getCharacter().getDexterity().getModifier().get() + Integer.parseInt(lblRanksStealth.getText())));
		}
		void setTotalSurvival()
		{
			lblTotalSurvival.setText("" + (getCharacter().getWisdom().getModifier().get() + Integer.parseInt(lblRanksSurvival.getText())));
		}
		void setTotalSwim()
		{
			lblTotalSwim.setText("" + (getCharacter().getStrength().getModifier().get() + Integer.parseInt(lblRanksSwim.getText())));
		}
		void setTotalUseMagicDevice()
		{
			lblTotalUseMagicDevice.setText("" + (getCharacter().getCharisma().getModifier().get() + Integer.parseInt(lblRanksUseMagicDevice.getText())));
		}
		//endregion
	
	//region handleSkills
	@FXML
	void handleUseMagicDeviceIncrease() {
		lblRanksUseMagicDevice.setText(""
				+ (Integer.parseInt(lblRanksUseMagicDevice.getText()) + 1));
		setTotalUseMagicDevice();
	}

	@FXML
	void handleUseMagicDeviceDecrease() {
		lblRanksUseMagicDevice.setText(""
				+ (Integer.parseInt(lblRanksUseMagicDevice.getText()) - 1));
		setTotalUseMagicDevice();
	}
	
	@FXML
	void handleSwimIncrease() {
		lblRanksSwim.setText(""
				+ (Integer.parseInt(lblRanksSwim.getText()) + 1));
		setTotalSwim();
	}

	@FXML
	void handleSwimDecrease() {
		lblRanksSwim.setText(""
				+ (Integer.parseInt(lblRanksSwim.getText()) - 1));
		setTotalSwim();
	}
	
	@FXML
	void handleSurvivalIncrease() {
		lblRanksSurvival.setText(""
				+ (Integer.parseInt(lblRanksSurvival.getText()) + 1));
		setTotalSurvival();
	}

	@FXML
	void handleSurvivalDecrease() {
		lblRanksSurvival.setText(""
				+ (Integer.parseInt(lblRanksSurvival.getText()) - 1));
		setTotalSurvival();
	}
	
	@FXML
	void handleStealthIncrease() {
		lblRanksStealth.setText(""
				+ (Integer.parseInt(lblRanksStealth.getText()) + 1));
		setTotalStealth();
	}

	@FXML
	void handleStealthDecrease() {
		lblRanksStealth.setText(""
				+ (Integer.parseInt(lblRanksStealth.getText()) - 1));
		setTotalStealth();
	}
	
	@FXML
	void handleSpellcraftIncrease() {
		lblRanksSpellcraft.setText(""
				+ (Integer.parseInt(lblRanksSpellcraft.getText()) + 1));
		setTotalSpellcraft();
	}

	@FXML
	void handleSpellcraftDecrease() {
		lblRanksSpellcraft.setText(""
				+ (Integer.parseInt(lblRanksSpellcraft.getText()) - 1));
		setTotalSpellcraft();
	}
	
	@FXML
	void handleSleightOfHandIncrease() {
		lblRanksSleightOfHand.setText(""
				+ (Integer.parseInt(lblRanksSleightOfHand.getText()) + 1));
		setTotalSleightOfHand();
	}

	@FXML
	void handleSleightOfHandDecrease() {
		lblRanksSleightOfHand.setText(""
				+ (Integer.parseInt(lblRanksSleightOfHand.getText()) - 1));
		setTotalSleightOfHand();
	}
	
	@FXML
	void handleSenseMotiveIncrease() {
		lblRanksSenseMotive.setText(""
				+ (Integer.parseInt(lblRanksSenseMotive.getText()) + 1));
		setTotalSenseMotive();
	}

	@FXML
	void handleSenseMotiveDecrease() {
		lblRanksSenseMotive.setText(""
				+ (Integer.parseInt(lblRanksSenseMotive.getText()) - 1));
		setTotalSenseMotive();
	}
	
	@FXML
	void handleRideIncrease() {
		lblRanksRide.setText(""
				+ (Integer.parseInt(lblRanksRide.getText()) + 1));
		setTotalRide();
	}

	@FXML
	void handleRideDecrease() {
		lblRanksRide.setText(""
				+ (Integer.parseInt(lblRanksRide.getText()) - 1));
		setTotalRide();
	}
	
	@FXML
	void handleProfessionIncrease() {
		lblRanksProfession.setText(""
				+ (Integer.parseInt(lblRanksProfession.getText()) + 1));
		setTotalProfession();
	}

	@FXML
	void handleProfessionDecrease() {
		lblRanksProfession.setText(""
				+ (Integer.parseInt(lblRanksProfession.getText()) - 1));
		setTotalProfession();
	}
	
	@FXML
	void handlePerformIncrease() {
		lblRanksPerform.setText(""
				+ (Integer.parseInt(lblRanksPerform.getText()) + 1));
		setTotalPerform();
	}

	@FXML
	void handlePerformDecrease() {
		lblRanksPerform.setText(""
				+ (Integer.parseInt(lblRanksPerform.getText()) - 1));
		setTotalPerform();
	}
	
	@FXML
	void handlePerceptionIncrease() {
		lblRanksPerception.setText(""
				+ (Integer.parseInt(lblRanksPerception.getText()) + 1));
		setTotalPerception();
	}

	@FXML
	void handlePerceptionDecrease() {
		lblRanksPerception.setText(""
				+ (Integer.parseInt(lblRanksPerception.getText()) - 1));
		setTotalPerception();
	}
	
	@FXML
	void handleLinguisticsIncrease() {
		lblRanksLinguistics.setText(""
				+ (Integer.parseInt(lblRanksLinguistics.getText()) + 1));
		setTotalLinguistics();
	}

	@FXML
	void handleLinguisticsDecrease() {
		lblRanksLinguistics.setText(""
				+ (Integer.parseInt(lblRanksLinguistics.getText()) - 1));
		setTotalLinguistics();
	}
	
	@FXML
	void handleKnowledgeReligionIncrease() {
		lblRanksKnowledgeReligion.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeReligion.getText()) + 1));
		setTotalKnowledgeReligion();
	}

	@FXML
	void handleKnowledgeReligionDecrease() {
		lblRanksKnowledgeReligion.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeReligion.getText()) - 1));
		setTotalKnowledgeReligion();
	}
	
	@FXML
	void handleKnowledgePlanesIncrease() {
		lblRanksKnowledgePlanes.setText(""
				+ (Integer.parseInt(lblRanksKnowledgePlanes.getText()) + 1));
		setTotalKnowledgePlanes();
	}

	@FXML
	void handleKnowledgePlanesDecrease() {
		lblRanksKnowledgePlanes.setText(""
				+ (Integer.parseInt(lblRanksKnowledgePlanes.getText()) - 1));
		setTotalKnowledgePlanes();
	}
	
	@FXML
	void handleKnowledgeNobilityIncrease() {
		lblRanksKnowledgeNobility.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNobility.getText()) + 1));
		setTotalKnowledgeNobility();
	}

	@FXML
	void handleKnowledgeNobilityDecrease() {
		lblRanksKnowledgeNobility.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNobility.getText()) - 1));
		setTotalKnowledgeNobility();
	}

	@FXML
	void handleKnowledgeNatureIncrease() {
		lblRanksKnowledgeNature.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNature.getText()) + 1));
		setTotalKnowledgeNature();
	}

	@FXML
	void handleKnowledgeNatureDecrease() {
		lblRanksKnowledgeNature.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNature.getText()) - 1));
		setTotalKnowledgeNature();
	}

	@FXML
	void handleKnowledgeLocalIncrease() {
		lblRanksKnowledgeLocal.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeLocal.getText()) + 1));
		setTotalKnowledgeLocal();
	}

	@FXML
	void handleKnowledgeLocalDecrease() {
		lblRanksKnowledgeLocal.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeLocal.getText()) - 1));
		setTotalKnowledgeLocal();
	}

	@FXML
	void handleKnowledgeHistoryIncrease() {
		lblRanksKnowledgeHistory.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeHistory.getText()) + 1));
		setTotalKnowledgeHistory();
	}

	@FXML
	void handleKnowledgeHistoryDecrease() {
		lblRanksKnowledgeHistory.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeHistory.getText()) - 1));
		setTotalKnowledgeHistory();
	}

	@FXML
	void handleKnowledgeGeographyIncrease() {
		lblRanksKnowledgeGeography.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeGeography.getText()) + 1));
		setTotalKnowledgeGeography();
	}

	@FXML
	void handleKnowledgeGeographyDecrease() {
		lblRanksKnowledgeGeography.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeGeography.getText()) - 1));
		setTotalKnowledgeGeography();
	}

	@FXML
	void handleKnowledgeEngineeringIncrease() {
		lblRanksKnowledgeEngineering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeEngineering
								.getText()) + 1));
		setTotalKnowledgeEngineering();
	}

	@FXML
	void handleKnowledgeEngineeringDecrease() {
		lblRanksKnowledgeEngineering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeEngineering
								.getText()) - 1));
		setTotalKnowledgeEngineering();
	}

	@FXML
	void handleKnowledgeDungeoneeringIncrease() {
		lblRanksKnowledgeDungeoneering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeDungeoneering
								.getText()) + 1));
		setTotalKnowledgeDungeoneering();
	}

	@FXML
	void handleKnowledgeDungeoneeringDecrease() {
		lblRanksKnowledgeDungeoneering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeDungeoneering
								.getText()) - 1));
		setTotalKnowledgeDungeoneering();
	}

	@FXML
	void handleKnowledgeArcanaIncrease() {
		lblRanksKnowledgeArcana.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeArcana.getText()) + 1));
		setTotalKnowledgeArcana();
	}

	@FXML
	void handleKnowledgeArcanaDecrease() {
		lblRanksKnowledgeArcana.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeArcana.getText()) - 1));
		setTotalKnowledgeArcana();
	}

	@FXML
	void handleIntimidateIncrease() {
		lblRanksIntimidate.setText(""
				+ (Integer.parseInt(lblRanksIntimidate.getText()) + 1));
		setTotalIntimidate();
	}

	@FXML
	void handleIntimidateDecrease() {
		lblRanksIntimidate.setText(""
				+ (Integer.parseInt(lblRanksIntimidate.getText()) - 1));
		setTotalIntimidate();
	}

	@FXML
	void handleHealIncrease() {
		lblRanksHeal.setText(""
				+ (Integer.parseInt(lblRanksHeal.getText()) + 1));
		setTotalHeal();
	}

	@FXML
	void handleHealDecrease() {
		lblRanksHeal.setText(""
				+ (Integer.parseInt(lblRanksHeal.getText()) - 1));
		setTotalHeal();
	}

	@FXML
	void handleHandleAnimalIncrease() {
		lblRanksHandleAnimal.setText(""
				+ (Integer.parseInt(lblRanksHandleAnimal.getText()) + 1));
		setTotalHandleAnimal();
	}

	@FXML
	void handleHandleAnimalDecrease() {
		lblRanksHandleAnimal.setText(""
				+ (Integer.parseInt(lblRanksHandleAnimal.getText()) - 1));
		setTotalHandleAnimal();
	}

	@FXML
	void handleFlyIncrease() {
		lblRanksFly.setText("" + (Integer.parseInt(lblRanksFly.getText()) + 1));
		setTotalFly();
	}

	@FXML
	void handleFlyDecrease() {
		lblRanksFly.setText("" + (Integer.parseInt(lblRanksFly.getText()) - 1));
		setTotalFly();
	}

	@FXML
	void handleEscapeArtistIncrease() {
		lblRanksEscapeArtist.setText(""
				+ (Integer.parseInt(lblRanksEscapeArtist.getText()) + 1));
		setTotalEscapeArtist();
	}

	@FXML
	void handleEscapeArtistDecrease() {
		lblRanksEscapeArtist.setText(""
				+ (Integer.parseInt(lblRanksEscapeArtist.getText()) - 1));
		setTotalEscapeArtist();
	}

	@FXML
	void handleDisguiseIncrease() {
		lblRanksDisguise.setText(""
				+ (Integer.parseInt(lblRanksDisguise.getText()) + 1));
		setTotalDisguise();
	}

	@FXML
	void handleDisguiseDecrease() {
		lblRanksDisguise.setText(""
				+ (Integer.parseInt(lblRanksDisguise.getText()) - 1));
				setTotalDisguise();
	}

	@FXML
	void handleDisableDeviceIncrease() {
		lblRanksDisableDevice.setText(""
				+ (Integer.parseInt(lblRanksDisableDevice.getText()) + 1));
		setTotalDisableDevice();
	}

	@FXML
	void handleDisableDeviceDecrease() {
		lblRanksDisableDevice.setText(""
				+ (Integer.parseInt(lblRanksDisableDevice.getText()) - 1));
		setTotalDisableDevice();
	}

	@FXML
	void handleDiplomacyIncrease() {
		lblRanksDiplomacy.setText(""
				+ (Integer.parseInt(lblRanksDiplomacy.getText()) + 1));
		setTotalDiplomacy();
	}

	@FXML
	void handleDiplomacyDecrease() {
		lblRanksDiplomacy.setText(""
				+ (Integer.parseInt(lblRanksDiplomacy.getText()) - 1));
		setTotalDiplomacy();
	}

	@FXML
	void handleCraftIncrease() {
		lblRanksCraft.setText(""
				+ (Integer.parseInt(lblRanksCraft.getText()) + 1));
		setTotalCraft();
	}

	@FXML
	void handleCraftDecrease() {
		lblRanksCraft.setText(""
				+ (Integer.parseInt(lblRanksCraft.getText()) - 1));
				setTotalCraft();
	}

	@FXML
	void handleClimbIncrease() {
		lblRanksClimb.setText(""
				+ (Integer.parseInt(lblRanksClimb.getText()) + 1));
		setTotalClimb();
	}

	@FXML
	void handleClimbDecrease() {
		lblRanksClimb.setText(""
				+ (Integer.parseInt(lblRanksClimb.getText()) - 1));
		setTotalClimb();
	}

	@FXML
	void handleBluffIncrease() {
		lblRanksBluff.setText(""
				+ (Integer.parseInt(lblRanksBluff.getText()) + 1));
		setTotalBluff();
	}

	@FXML
	void handleBluffDecrease() {
		lblRanksBluff.setText(""
				+ (Integer.parseInt(lblRanksBluff.getText()) - 1));
		setTotalBluff();
	}

	@FXML
	void handleAppraiseIncrease() {
		lblRanksAppraise.setText(""
				+ (Integer.parseInt(lblRanksAppraise.getText()) + 1));
		setTotalAppraise();
	}

	@FXML
	void handleAppraiseDecrease() {
		lblRanksAppraise.setText(""
				+ (Integer.parseInt(lblRanksAppraise.getText()) - 1));
		setTotalAppraise();
	}

	@FXML
	void handleAcrobaticsIncrease() {
		lblRanksAcrobatics.setText(""
				+ (Integer.parseInt(lblRanksAcrobatics.getText()) + 1));
		setTotalAcrobatics();
	}

	@FXML
	void handleAcrobaticsDecrease() {
		lblRanksAcrobatics.setText(""
				+ (Integer.parseInt(lblRanksAcrobatics.getText()) - 1));
		setTotalAcrobatics();
	}
	//endregion

	@Override
	public void setData() {
		handleLabelSteup();
	}

	@Override
	public void getData() {
		ArrayList<Skill> skills = new ArrayList<Skill>();
		skills.add(addSkill(Integer.parseInt(lblRanksAcrobatics.getText()), getCharacter().getDexterity(), "Acrobatics", null));
		skills.add(addSkill(Integer.parseInt(lblRanksAcrobatics.getText()), getCharacter().getDexterity(), "Acrobatics", null));
		skills.add(addSkill(Integer.parseInt(lblRanksAppraise.getText()), getCharacter().getIntelligence(), "Appraise", null));
		skills.add(addSkill(Integer.parseInt(lblRanksBluff.getText()), getCharacter().getCharisma(), "Bluff", null));
		skills.add(addSkill(Integer.parseInt(lblRanksClimb.getText()), getCharacter().getStrength(), "Climb", null));
		skills.add(addSkill(Integer.parseInt(lblRanksCraft.getText()), getCharacter().getIntelligence(), "Craft", null));
		skills.add(addSkill(Integer.parseInt(lblRanksDiplomacy.getText())	, getCharacter().getCharisma(), "Diplomacy", null));
		skills.add(addSkill(Integer.parseInt(lblRanksDisableDevice.getText()), getCharacter().getDexterity(), "Disable Device", null));
		skills.add(addSkill(Integer.parseInt(lblRanksDisguise.getText()), getCharacter().getCharisma(), "Disguise", null));
		skills.add(addSkill(Integer.parseInt(lblRanksEscapeArtist.getText()), getCharacter().getDexterity(), "Escape Artist", null));
		skills.add(addSkill(Integer.parseInt(lblRanksFly.getText()), getCharacter().getDexterity(), "Fly", null));
		skills.add(addSkill(Integer.parseInt(lblRanksHandleAnimal.getText()), getCharacter().getCharisma(), "Handle Animal", null));
		skills.add(addSkill(Integer.parseInt(lblRanksHeal.getText()), getCharacter().getWisdom(), "Heal", null));
		skills.add(addSkill(Integer.parseInt(lblRanksIntimidate.getText()), getCharacter().getCharisma(), "Intimidate", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeArcana.getText()), getCharacter().getIntelligence(), "Knowledge Arcana", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeDungeoneering.getText()), getCharacter().getIntelligence(), "Knowledge Dungeoneering", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeEngineering.getText()), getCharacter().getIntelligence(), "Knowledge Engineering", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeGeography.getText()), getCharacter().getIntelligence(), "Knowledge Geography", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeHistory.getText()), getCharacter().getIntelligence(), "Knowledge History", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeLocal.getText()), getCharacter().getIntelligence(), "Knowledge Local", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeNature.getText()), getCharacter().getIntelligence(), "Knowledge Nature", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeNobility.getText()), getCharacter().getIntelligence(), "Knowledge Nobility", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgePlanes.getText()), getCharacter().getIntelligence(), "Knowledge Planes", null));
		skills.add(addSkill(Integer.parseInt(lblRanksKnowledgeReligion.getText()), getCharacter().getIntelligence(), "Knowledge Religion", null));
		skills.add(addSkill(Integer.parseInt(lblRanksLinguistics.getText()), getCharacter().getIntelligence(), "Linguistics", null));
		skills.add(addSkill(Integer.parseInt(lblRanksPerception.getText()), getCharacter().getWisdom(), "Perception", null));
		skills.add(addSkill(Integer.parseInt(lblRanksPerform.getText()), getCharacter().getCharisma(), "Perform", null));
		skills.add(addSkill(Integer.parseInt(lblRanksProfession.getText()), getCharacter().getWisdom(), "Profession", null));
		skills.add(addSkill(Integer.parseInt(lblRanksRide.getText()), getCharacter().getDexterity(), "Ride", null));
		skills.add(addSkill(Integer.parseInt(lblRanksSenseMotive.getText()), getCharacter().getWisdom(), "Sense Motive", null));
		skills.add(addSkill(Integer.parseInt(lblRanksSleightOfHand.getText()), getCharacter().getDexterity(), "Sleight of Hand", null));
		skills.add(addSkill(Integer.parseInt(lblRanksSpellcraft.getText()), getCharacter().getIntelligence(), "Spellcraft", null));
		skills.add(addSkill(Integer.parseInt(lblRanksStealth.getText()), getCharacter().getDexterity(), "Stealth", null));
		skills.add(addSkill(Integer.parseInt(lblRanksSurvival.getText()), getCharacter().getWisdom(), "Survival", null));
		skills.add(addSkill(Integer.parseInt(lblRanksSwim.getText()), getCharacter().getDexterity(), "Swim", null));
		skills.add(addSkill(Integer.parseInt(lblRanksUseMagicDevice.getText()), getCharacter().getCharisma(), "Use Magic Device", null));
		
		this.getCharacter().setSkills(skills.toArray(new Skill[]{}));
	}

	private Skill addSkill(int rank, Ability attrToUse, String name, HashMap<String, Integer> situationalMod) {
		Skill skill = null;
		for (String S : getCharacter().getClasses()[0].getClassSkills()) {
			if(S.equals(name)) skill =  new Skill(rank, attrToUse, name, true, situationalMod);
			else skill = new Skill(rank, attrToUse, name, false, situationalMod);
		}
		return skill;
		
	}

}
