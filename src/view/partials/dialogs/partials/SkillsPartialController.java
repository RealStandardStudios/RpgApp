package view.partials.dialogs.partials;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

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
	
	//region Skill Labels
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


	//region Skill Labels
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
		setAbilityAcrobatics();
		setAbilityAppraise();
		setAbilityBluff();
		setAbilityClimb();
		setAbilityCraft();
		setAbilityDiplomacy();
		setAbilityDisableDevice();
		setAbilityDisguise();
		setAbilityEscapeArtist();
		setAbilityFly();
		setAbilityHandleAnimal();
		setAbilityHeal();
		setAbilityIntimidate();
		setAbilityKnowledgeArcana();
		setAbilityKnowledgeDungeoneering();
		setAbilityKnowledgeEngineering();
		setAbilityKnowledgeGeography();
		setAbilityKnowledgeHistory();
		setAbilityKnowledgeLocal();
		setAbilityKnowledgeNature();
		setAbilityKnowledgeNobility();
		setAbilityKnowledgePlanes();
		setAbilityKnowledgeReligion();
		setAbilityLinguistics();
		setAbilityPerception();
		setAbilityPerform();
		setAbilityProfession();
		setAbilityRide();
		setAbilitySenseMotive();
		setAbilitySleightOfHand();
		setAbilitySpellcraft();
		setAbilityStealth();
		setAbilitySurvival();
		setAbilitySwim();
		setAbilityUseMagicDevice();
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
	void setAbilityAcrobatics()
	{
		lblAbilityAcrobatics.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilityAppraise()
	{
		lblAbilityAppraise.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityBluff()
	{
		lblAbilityBluff.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	void setAbilityClimb()
	{
		lblAbilityClimb.setText("Str: " + getCharacter().getStrength().getModifier());
	}
	void setAbilityCraft()
	{
		lblAbilityCraft.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityDiplomacy()
	{
		lblAbilityDiplomacy.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	void setAbilityDisableDevice()
	{
		lblAbilityDisableDevice.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilityDisguise()
	{
		lblAbilityDisguise.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	void setAbilityEscapeArtist()
	{
		lblAbilityEscapeArtist.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilityFly()
	{
		lblAbilityFly.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilityHandleAnimal()
	{
		lblAbilityHandleAnimal.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	void setAbilityHeal()
	{
		lblAbilityHeal.setText("Wis: " + getCharacter().getWisdom().getModifier());
	}
	void setAbilityIntimidate()
	{
		lblAbilityIntimidate.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	void setAbilityKnowledgeArcana()
	{
		lblAbilityKnowledgeArcana.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeDungeoneering()
	{
		lblAbilityKnowledgeDungeoneering.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeEngineering()
	{
		lblAbilityKnowledgeEngineering.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeGeography()
	{
		lblAbilityKnowledgeGeography.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeHistory()
	{
		lblAbilityKnowledgeHistory.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeLocal()
	{
		lblAbilityKnowledgeLocal.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeNature()
	{
		lblAbilityKnowledgeNature.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeNobility()
	{
		lblAbilityKnowledgeNobility.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgePlanes()
	{
		lblAbilityKnowledgePlanes.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityKnowledgeReligion()
	{
		lblAbilityKnowledgeReligion.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityLinguistics()
	{
		lblAbilityLinguistics.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityPerception()
	{
		lblAbilityPerception.setText("Wis: " + getCharacter().getWisdom().getModifier());
	}
	void setAbilityPerform()
	{
		lblAbilityPerform.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	void setAbilityProfession()
	{
		lblAbilityProfession.setText("Wis: " + getCharacter().getWisdom().getModifier());
	}
	void setAbilityRide()
	{
		lblAbilityRide.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilitySenseMotive()
	{
		lblAbilitySenseMotive.setText("Wis: " + getCharacter().getWisdom().getModifier());
	}
	void setAbilitySleightOfHand()
	{
		lblAbilitySleightOfHand.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilitySpellcraft()
	{
		lblAbilitySpellcraft.setText("Int: " + getCharacter().getIntelligence().getModifier());
	}
	void setAbilityStealth()
	{
		lblAbilityStealth.setText("Dex: " + getCharacter().getDexterity().getModifier());
	}
	void setAbilitySurvival()
	{
		lblAbilitySurvival.setText("Wis: " + getCharacter().getWisdom().getModifier());
	}
	void setAbilitySwim()
	{
		lblAbilitySwim.setText("Str: " + getCharacter().getStrength().getModifier());
	}
	void setAbilityUseMagicDevice()
	{
		lblAbilityUseMagicDevice.setText("Cha: " + getCharacter().getCharisma().getModifier());
	}
	//endregion
	
	//region totalSetupForSkills
		void setTotalAcrobatics()
		{
			lblTotalAcrobatics.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksAcrobatics.getText())));
		}
		void setTotalAppraise()
		{
			lblTotalAppraise.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksAppraise.getText())));
		}
		void setTotalBluff()
		{
			lblTotalBluff.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksBluff.getText())));
		}
		void setTotalClimb()
		{
			lblTotalClimb.setText("" + (getCharacter().getStrength().getModifier() + Integer.parseInt(lblRanksClimb.getText())));
		}
		void setTotalCraft()
		{
			lblTotalCraft.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksCraft.getText())));
		}
		void setTotalDiplomacy()
		{
			lblTotalDiplomacy.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksDiplomacy.getText())));
		}
		void setTotalDisableDevice()
		{
			lblTotalDisableDevice.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksDisableDevice.getText())));
		}
		void setTotalDisguise()
		{
			lblTotalDisguise.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksDisguise.getText())));
		}
		void setTotalEscapeArtist()
		{
			lblTotalEscapeArtist.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksEscapeArtist.getText())));
		}
		void setTotalFly()
		{
			lblTotalFly.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksFly.getText())));
		}
		void setTotalHandleAnimal()
		{
			lblTotalHandleAnimal.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksHandleAnimal.getText())));
		}
		void setTotalHeal()
		{
			lblTotalHeal.setText("" + (getCharacter().getWisdom().getModifier() + Integer.parseInt(lblRanksHeal.getText())));
		}
		void setTotalIntimidate()
		{
			lblTotalIntimidate.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksIntimidate.getText())));
		}
		void setTotalKnowledgeArcana()
		{
			lblTotalKnowledgeArcana.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeArcana.getText())));
		}
		void setTotalKnowledgeDungeoneering()
		{
			lblTotalKnowledgeDungeoneering.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeDungeoneering.getText())));
		}
		void setTotalKnowledgeEngineering()
		{
			lblTotalKnowledgeEngineering.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeEngineering.getText())));
		}
		void setTotalKnowledgeGeography()
		{
			lblTotalKnowledgeGeography.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeGeography.getText())));
		}
		void setTotalKnowledgeHistory()
		{
			lblTotalKnowledgeHistory.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeHistory.getText())));
		}
		void setTotalKnowledgeLocal()
		{
			lblTotalKnowledgeLocal.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeLocal.getText())));
		}
		void setTotalKnowledgeNature()
		{
			lblTotalKnowledgeNature.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeNature.getText())));
		}
		void setTotalKnowledgeNobility()
		{
			lblTotalKnowledgeNobility.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeNobility.getText())));
		}
		void setTotalKnowledgePlanes()
		{
			lblTotalKnowledgePlanes.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgePlanes.getText())));
		}
		void setTotalKnowledgeReligion()
		{
			lblTotalKnowledgeReligion.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksKnowledgeReligion.getText())));
		}
		void setTotalLinguistics()
		{
			lblTotalLinguistics.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksLinguistics.getText())));
		}
		void setTotalPerception()
		{
			lblTotalPerception.setText("" + (getCharacter().getWisdom().getModifier() + Integer.parseInt(lblRanksPerception.getText())));
		}
		void setTotalPerform()
		{
			lblTotalPerform.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksPerform.getText())));
		}
		void setTotalProfession()
		{
			lblTotalProfession.setText("" + (getCharacter().getWisdom().getModifier() + Integer.parseInt(lblRanksProfession.getText())));
		}
		void setTotalRide()
		{
			lblTotalRide.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksRide.getText())));
		}
		void setTotalSenseMotive()
		{
			lblTotalSenseMotive.setText("" + (getCharacter().getWisdom().getModifier() + Integer.parseInt(lblRanksSenseMotive.getText())));
		}
		void setTotalSleightOfHand()
		{
			lblTotalSleightOfHand.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksSleightOfHand.getText())));
		}
		void setTotalSpellcraft()
		{
			lblTotalSpellcraft.setText("" + (getCharacter().getIntelligence().getModifier() + Integer.parseInt(lblRanksSpellcraft.getText())));
		}
		void setTotalStealth()
		{
			lblTotalStealth.setText("" + (getCharacter().getDexterity().getModifier() + Integer.parseInt(lblRanksStealth.getText())));
		}
		void setTotalSurvival()
		{
			lblTotalSurvival.setText("" + (getCharacter().getWisdom().getModifier() + Integer.parseInt(lblRanksSurvival.getText())));
		}
		void setTotalSwim()
		{
			lblTotalSwim.setText("" + (getCharacter().getStrength().getModifier() + Integer.parseInt(lblRanksSwim.getText())));
		}
		void setTotalUseMagicDevice()
		{
			lblTotalUseMagicDevice.setText("" + (getCharacter().getCharisma().getModifier() + Integer.parseInt(lblRanksUseMagicDevice.getText())));
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

}
