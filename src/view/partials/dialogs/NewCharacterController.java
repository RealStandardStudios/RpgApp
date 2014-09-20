package view.partials.dialogs;

import java.io.File;
import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import jefXif.DataFileReader;
import jefXif.DialogController;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Feat;
import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.AbilityName;
import pathfinder.data.Character.Character;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Weapon;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class NewCharacterController extends DialogController implements DataFileReader{
	
	ObservableList<Feat> feats = FXCollections.observableArrayList();
	final String programRoot = "../../../../../";
	
	
	@FXML
	ComboBox<Feat> comboFeat;
	@FXML 
	TableColumn<Feat, String> columnFeatPrereq;
	@FXML
	TableView<Feat> tableFeat;
	@FXML
	Label lblFeatName;
	@FXML
	Label lblFeatDescription;
	
	//region abilityModForAbtributes
	
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
	
	//region AbilityMods
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
	
	//region Attributes
	@FXML
	Label lblBaseStr;
	@FXML
	Label lblBaseDex;
	@FXML
	Label lblBaseCon;
	@FXML
	Label lblBaseInt;
	@FXML
	Label lblBaseWis;
	@FXML
	Label lblBaseCha;
	
	@FXML
	Label lblTotalStr;
	@FXML
	Label lblTotalDex;
	@FXML
	Label lblTotalCon;
	@FXML
	Label lblTotalInt;
	@FXML
	Label lblTotalWis;
	@FXML
	Label lblTotalCha;
	
	@FXML
	Label lblRacialBonusStr;
	@FXML
	Label lblRacialBonusDex;
	@FXML
	Label lblRacialBonusCon;
	@FXML
	Label lblRacialBonusInt;
	@FXML
	Label lblRacialBonusWis;
	@FXML
	Label lblRacialBonusCha;
	
	@FXML
	Label lblMiscStr;
	@FXML
	Label lblMiscDex;
	@FXML
	Label lblMiscCon;
	@FXML
	Label lblMiscInt;
	@FXML
	Label lblMiscWis;
	@FXML
	Label lblMiscCha;
	//endregion
	
	//region skills
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
	
	//region Equipment
	
		//Weapon table
	@FXML
	private TableView<Weapon> tableWeapons;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponName;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponType;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponCost;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponDmgS;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponDmgM;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponCrit;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponRange;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponWeight;
	
	@FXML
	private TableColumn<Weapon, String> columnWeaponSpecial;
	
		//Armor table
	@FXML
	private TableView<Armor> tableArmor;
	
	@FXML
	private TableColumn<Armor, String> columnArmorName;
	
	@FXML
	private TableColumn<Armor, String> columnArmorType;
	
	@FXML
	private TableColumn<Armor, String> columnArmorCost;
	
	@FXML
	private TableColumn<Armor, String> columnArmorBonus;
	
	@FXML
	private TableColumn<Armor, String> columnArmorMaxDex;
	
	@FXML
	private TableColumn<Armor, String> columnArmorCheckPenalty;
	
	@FXML
	private TableColumn<Armor, String> columnArmorSpellFailure;
	
	@FXML
	private TableColumn<Armor, String> columnArmorSpeed30;
	
	@FXML
	private TableColumn<Armor, String> columnArmorSpeed20;
	
	@FXML
	private TableColumn<Armor, String> columnArmorWeight;
	
		//Goods table
	@FXML
	private TableView<Goods> tableGoods;
	
	@FXML
	private TableColumn<Goods, String> columnGoodsName;
	
	@FXML
	private TableColumn<Goods, String> columnGoodsCost;
	
	@FXML
	private TableColumn<Goods, String> columnGoodsWeight;
	
		//Labels and buttons
	@FXML
	Label lblStartingWealthValue;
	
	@FXML
	Button btnRollStartingWealth;
	
	@FXML
	Label lblGoldRemainingValue;
	
	@FXML
	Label lblWeightValue;
	
	@FXML
	Button btnAddItem;
	
	@FXML
	Button btnRemoveItem;
	
	//endregion
	
	private ObservableList<Weapon> obsListWeapons;
	
	private ObservableList<Armor> obsListArmor;
	
	private ObservableList<Goods> obsListGoods;
	
	Character newCharacter;

	@Override
	public void initialize() {
		newCharacter = new Character();
		
		//make HashMap<SkillName,Skill> of all the skills
		
		newCharacter.setStrength(new Ability(AbilityName.Strength, 10));
		newCharacter.setDexterity(new Ability(AbilityName.Dexterity, 10));
		newCharacter.setConstitution(new Ability(AbilityName.Dexterity, 10));
		newCharacter.setIntelligence(new Ability(AbilityName.Intelligence, 10));
		newCharacter.setWisdom(new Ability(AbilityName.Wisdom, 10));
		newCharacter.setCharisma(new Ability(AbilityName.Charisma, 10));

		lblBaseStr.setText("" + newCharacter.getStrength().getValue());
		lblBaseDex.setText("" + newCharacter.getDexterity().getValue());
		lblBaseCon.setText("" + newCharacter.getConstitution().getValue());
		lblBaseInt.setText("" + newCharacter.getIntelligence().getValue());
		lblBaseWis.setText("" + newCharacter.getWisdom().getValue());
		lblBaseCha.setText("" + newCharacter.getCharisma().getValue());
		
		//region SetAbility Mod
		Label[] abilityModLabels = new Label[]
				{
				lblStrMod, lblDexMod, lblConMod, lblIntMod, lblWisMod, lblChaMod
				};
		int tempCount = 0;
		for (Label label : abilityModLabels)
		{
			label.setText(newCharacter.getAbilities()[tempCount].getModifier() + "");
		}
		//endregion
		//sets the default ability mod
		
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
		
		setTotalStr();
		setTotalDex();
		setTotalCon();
		setTotalInt();
		setTotalWis();
		setTotalCha();
		
		//Equipment
		columnWeaponName.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
		tableWeapons.setItems(obsListWeapons);
		
		readFeats();
		
		comboFeat.setItems(feats);
	}
	
	@FXML
	void handleSelectFeat()
	{
		 Feat feat = comboFeat.getValue();
		 lblFeatName.setText(feat.getName());
		 lblFeatDescription.setText(feat.getBenefit());
		 //set tableFeat to the list 
		 //tableFeat.setItems();
		 columnFeatPrereq.setCellValueFactory(cellData->cellData.getValue().getPrerequisite().Name);
		 
	}

	
	void readFeats()
	{
		File file = new File(this.getClass().getResource("").getPath()+programRoot+"PathfinderData/data");
		File featsFile = new File(file.getPath()+"\\Feats.fdf");
		try {
			feats.setAll(readDataFile(featsFile, Feat.class));
		} catch (IOException e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the Feat File Properly").message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}
	
	void readItems()
	{
		File file = new File(this.getClass().getResource("").getPath()+programRoot+"PathfinderData/data");
		File weaponsFile = new File(file.getPath()+"\\Weapons.idf");
		File armorFile = new File(file.getPath()+"\\Armors.idf");
		File goodsFile = new File(file.getPath()+"\\GoodsAndServices.idf");
		try {
			obsListWeapons = FXCollections.observableArrayList(readDataFile(weaponsFile, Weapon.class));
			obsListArmor = FXCollections.observableArrayList(readDataFile(armorFile, Armor.class));
			obsListGoods = FXCollections.observableArrayList(readDataFile(goodsFile, Goods.class));
		} catch (IOException e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the Feat File Properly").message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}
	
	@FXML
	void handleSkillAbilityScores()
	{
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
	}
	
	
	//region abilitySetupForSkills
	void setAbilityAcrobatics()
	{
		lblAbilityAcrobatics.setText("Dex: " +newCharacter.getDexterity().getModifier());
	}
	void setAbilityAppraise()
	{
		lblAbilityAppraise.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityBluff()
	{
		lblAbilityBluff.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	void setAbilityClimb()
	{
		lblAbilityClimb.setText("Str: " + newCharacter.getStrength().getModifier());
	}
	void setAbilityCraft()
	{
		lblAbilityCraft.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityDiplomacy()
	{
		lblAbilityDiplomacy.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	void setAbilityDisableDevice()
	{
		lblAbilityDisableDevice.setText("Dex: " + newCharacter.getDexterity().getModifier());
	}
	void setAbilityDisguise()
	{
		lblAbilityDisguise.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	void setAbilityEscapeArtist()
	{
		lblAbilityEscapeArtist.setText("Dex: " + newCharacter.getDexterity().getModifier());
	}
	void setAbilityFly()
	{
		lblAbilityFly.setText("Dex: " + newCharacter.getDexterity().getModifier());
	}
	void setAbilityHandleAnimal()
	{
		lblAbilityHandleAnimal.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	void setAbilityHeal()
	{
		lblAbilityHeal.setText("Wis: " + newCharacter.getWisdom().getModifier());
	}
	void setAbilityIntimidate()
	{
		lblAbilityIntimidate.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	void setAbilityKnowledgeArcana()
	{
		lblAbilityKnowledgeArcana.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeDungeoneering()
	{
		lblAbilityKnowledgeDungeoneering.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeEngineering()
	{
		lblAbilityKnowledgeEngineering.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeGeography()
	{
		lblAbilityKnowledgeGeography.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeHistory()
	{
		lblAbilityKnowledgeHistory.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeLocal()
	{
		lblAbilityKnowledgeLocal.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeNature()
	{
		lblAbilityKnowledgeNature.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeNobility()
	{
		lblAbilityKnowledgeNobility.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgePlanes()
	{
		lblAbilityKnowledgePlanes.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityKnowledgeReligion()
	{
		lblAbilityKnowledgeReligion.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityLinguistics()
	{
		lblAbilityLinguistics.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityPerception()
	{
		lblAbilityPerception.setText("Wis: " + newCharacter.getWisdom().getModifier());
	}
	void setAbilityPerform()
	{
		lblAbilityPerform.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	void setAbilityProfession()
	{
		lblAbilityProfession.setText("Wis: " + newCharacter.getWisdom().getModifier());
	}
	void setAbilityRide()
	{
		lblAbilityRide.setText("Dex: " + newCharacter.getDexterity().getModifier());
	}
	void setAbilitySenseMotive()
	{
		lblAbilitySenseMotive.setText("Wis: " + newCharacter.getWisdom().getModifier());
	}
	void setAbilitySleightOfHand()
	{
		lblAbilitySleightOfHand.setText("Dex; " + newCharacter.getDexterity().getModifier());
	}
	void setAbilitySpellcraft()
	{
		lblAbilitySpellcraft.setText("Int: " + newCharacter.getIntelligence().getModifier());
	}
	void setAbilityStealth()
	{
		lblAbilityStealth.setText("Dex: " + newCharacter.getDexterity().getModifier());
	}
	void setAbilitySurvival()
	{
		lblAbilitySurvival.setText("Wis: " + newCharacter.getWisdom().getModifier());
	}
	void setAbilitySwim()
	{
		lblAbilitySwim.setText("Str: " + newCharacter.getStrength().getModifier());
	}
	void setAbilityUseMagicDevice()
	{
		lblAbilityUseMagicDevice.setText("Cha: " + newCharacter.getCharisma().getModifier());
	}
	
	
	//endregion
	
	//region handleSkills
	@FXML
	void handleUseMagicDeviceIncrease() {
		lblRanksUseMagicDevice.setText(""
				+ (Integer.parseInt(lblRanksUseMagicDevice.getText()) + 1));
	}

	@FXML
	void handleUseMagicDeviceDecrease() {
		lblRanksUseMagicDevice.setText(""
				+ (Integer.parseInt(lblRanksUseMagicDevice.getText()) - 1));
	}
	
	@FXML
	void handleSwimIncrease() {
		lblRanksSwim.setText(""
				+ (Integer.parseInt(lblRanksSwim.getText()) + 1));
	}

	@FXML
	void handleSwimDecrease() {
		lblRanksSwim.setText(""
				+ (Integer.parseInt(lblRanksSwim.getText()) - 1));
	}
	
	@FXML
	void handleSurvivalIncrease() {
		lblRanksSurvival.setText(""
				+ (Integer.parseInt(lblRanksSurvival.getText()) + 1));
	}

	@FXML
	void handleSurvivalDecrease() {
		lblRanksSurvival.setText(""
				+ (Integer.parseInt(lblRanksSurvival.getText()) - 1));
	}
	
	@FXML
	void handleStealthIncrease() {
		lblRanksStealth.setText(""
				+ (Integer.parseInt(lblRanksStealth.getText()) + 1));
	}

	@FXML
	void handleStealthDecrease() {
		lblRanksStealth.setText(""
				+ (Integer.parseInt(lblRanksStealth.getText()) - 1));
	}
	
	@FXML
	void handleSpellcraftIncrease() {
		lblRanksSpellcraft.setText(""
				+ (Integer.parseInt(lblRanksSpellcraft.getText()) + 1));
	}

	@FXML
	void handleSpellcraftDecrease() {
		lblRanksSpellcraft.setText(""
				+ (Integer.parseInt(lblRanksSpellcraft.getText()) - 1));
	}
	
	@FXML
	void handleSleightOfHandIncrease() {
		lblRanksSleightOfHand.setText(""
				+ (Integer.parseInt(lblRanksSleightOfHand.getText()) + 1));
	}

	@FXML
	void handleSleightOfHandDecrease() {
		lblRanksSleightOfHand.setText(""
				+ (Integer.parseInt(lblRanksSleightOfHand.getText()) - 1));
	}
	
	@FXML
	void handleSenseMotiveIncrease() {
		lblRanksSenseMotive.setText(""
				+ (Integer.parseInt(lblRanksSenseMotive.getText()) + 1));
	}

	@FXML
	void handleSenseMotiveDecrease() {
		lblRanksSenseMotive.setText(""
				+ (Integer.parseInt(lblRanksSenseMotive.getText()) - 1));
	}
	
	@FXML
	void handleRideIncrease() {
		lblRanksRide.setText(""
				+ (Integer.parseInt(lblRanksRide.getText()) + 1));
	}

	@FXML
	void handleRideDecrease() {
		lblRanksRide.setText(""
				+ (Integer.parseInt(lblRanksRide.getText()) - 1));
	}
	
	@FXML
	void handleProfessionIncrease() {
		lblRanksProfession.setText(""
				+ (Integer.parseInt(lblRanksProfession.getText()) + 1));
	}

	@FXML
	void handleProfessionDecrease() {
		lblRanksProfession.setText(""
				+ (Integer.parseInt(lblRanksProfession.getText()) - 1));
	}
	
	@FXML
	void handlePerformIncrease() {
		lblRanksPerform.setText(""
				+ (Integer.parseInt(lblRanksPerform.getText()) + 1));
	}

	@FXML
	void handlePerformDecrease() {
		lblRanksPerform.setText(""
				+ (Integer.parseInt(lblRanksPerform.getText()) - 1));
	}
	
	@FXML
	void handlePerceptionIncrease() {
		lblRanksPerception.setText(""
				+ (Integer.parseInt(lblRanksPerception.getText()) + 1));
	}

	@FXML
	void handlePerceptionDecrease() {
		lblRanksPerception.setText(""
				+ (Integer.parseInt(lblRanksPerception.getText()) - 1));
	}
	
	@FXML
	void handleLinguisticsIncrease() {
		lblRanksLinguistics.setText(""
				+ (Integer.parseInt(lblRanksLinguistics.getText()) + 1));
	}

	@FXML
	void handleLinguisticsDecrease() {
		lblRanksLinguistics.setText(""
				+ (Integer.parseInt(lblRanksLinguistics.getText()) - 1));
	}
	
	@FXML
	void handleKnowledgeReligionIncrease() {
		lblRanksKnowledgeReligion.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeReligion.getText()) + 1));
	}

	@FXML
	void handleKnowledgeReligionDecrease() {
		lblRanksKnowledgeReligion.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeReligion.getText()) - 1));
	}
	
	@FXML
	void handleKnowledgePlanesIncrease() {
		lblRanksKnowledgePlanes.setText(""
				+ (Integer.parseInt(lblRanksKnowledgePlanes.getText()) + 1));
	}

	@FXML
	void handleKnowledgePlanesDecrease() {
		lblRanksKnowledgePlanes.setText(""
				+ (Integer.parseInt(lblRanksKnowledgePlanes.getText()) - 1));
	}
	
	@FXML
	void handleKnowledgeNobilityIncrease() {
		lblRanksKnowledgeNobility.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNobility.getText()) + 1));
	}

	@FXML
	void handleKnowledgeNobilityDecrease() {
		lblRanksKnowledgeNobility.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNobility.getText()) - 1));
	}

	@FXML
	void handleKnowledgeNatureIncrease() {
		lblRanksKnowledgeNature.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNature.getText()) + 1));
	}

	@FXML
	void handleKnowledgeNatureDecrease() {
		lblRanksKnowledgeNature.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeNature.getText()) - 1));
	}

	@FXML
	void handleKnowledgeLocalIncrease() {
		lblRanksKnowledgeLocal.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeLocal.getText()) + 1));
	}

	@FXML
	void handleKnowledgeLocalDecrease() {
		lblRanksKnowledgeLocal.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeLocal.getText()) - 1));
	}

	@FXML
	void handleKnowledgeHistoryIncrease() {
		lblRanksKnowledgeHistory.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeHistory.getText()) + 1));
	}

	@FXML
	void handleKnowledgeHistoryDecrease() {
		lblRanksKnowledgeHistory.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeHistory.getText()) - 1));
	}

	@FXML
	void handleKnowledgeGeographyIncrease() {
		lblRanksKnowledgeGeography.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeGeography.getText()) + 1));
	}

	@FXML
	void handleKnowledgeGeographyDecrease() {
		lblRanksKnowledgeGeography.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeGeography.getText()) - 1));
	}

	@FXML
	void handleKnowledgeEngineeringIncrease() {
		lblRanksKnowledgeEngineering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeEngineering
								.getText()) + 1));
	}

	@FXML
	void handleKnowledgeEngineeringDecrease() {
		lblRanksKnowledgeEngineering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeEngineering
								.getText()) - 1));
	}

	@FXML
	void handleKnowledgeDungeoneeringIncrease() {
		lblRanksKnowledgeDungeoneering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeDungeoneering
								.getText()) + 1));
	}

	@FXML
	void handleKnowledgeDungeoneeringDecrease() {
		lblRanksKnowledgeDungeoneering
				.setText(""
						+ (Integer.parseInt(lblRanksKnowledgeDungeoneering
								.getText()) - 1));
	}

	@FXML
	void handleKnowledgeArcanaIncrease() {
		lblRanksKnowledgeArcana.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeArcana.getText()) + 1));
	}

	@FXML
	void handleKnowledgeArcanaDecrease() {
		lblRanksKnowledgeArcana.setText(""
				+ (Integer.parseInt(lblRanksKnowledgeArcana.getText()) - 1));
	}

	@FXML
	void handleIntimidateIncrease() {
		lblRanksIntimidate.setText(""
				+ (Integer.parseInt(lblRanksIntimidate.getText()) + 1));
	}

	@FXML
	void handleIntimidateDecrease() {
		lblRanksIntimidate.setText(""
				+ (Integer.parseInt(lblRanksIntimidate.getText()) - 1));
	}

	@FXML
	void handleHealIncrease() {
		lblRanksHeal.setText(""
				+ (Integer.parseInt(lblRanksHeal.getText()) + 1));
	}

	@FXML
	void handleHealDecrease() {
		lblRanksHeal.setText(""
				+ (Integer.parseInt(lblRanksHeal.getText()) - 1));
	}

	@FXML
	void handleHandleAnimalIncrease() {
		lblRanksHandleAnimal.setText(""
				+ (Integer.parseInt(lblRanksHandleAnimal.getText()) + 1));
	}

	@FXML
	void handleHandleAnimalDecrease() {
		lblRanksHandleAnimal.setText(""
				+ (Integer.parseInt(lblRanksHandleAnimal.getText()) - 1));
	}

	@FXML
	void handleFlyIncrease() {
		lblRanksFly.setText("" + (Integer.parseInt(lblRanksFly.getText()) + 1));
	}

	@FXML
	void handleFlyDecrease() {
		lblRanksFly.setText("" + (Integer.parseInt(lblRanksFly.getText()) - 1));
	}

	@FXML
	void handleEscapeArtistIncrease() {
		lblRanksEscapeArtist.setText(""
				+ (Integer.parseInt(lblRanksEscapeArtist.getText()) + 1));
	}

	@FXML
	void handleEscapeArtistDecrease() {
		lblRanksEscapeArtist.setText(""
				+ (Integer.parseInt(lblRanksEscapeArtist.getText()) - 1));
	}

	@FXML
	void handleDisguiseIncrease() {
		lblRanksDisguise.setText(""
				+ (Integer.parseInt(lblRanksDisguise.getText()) + 1));
	}

	@FXML
	void handleDisguiseDecrease() {
		lblRanksDisguise.setText(""
				+ (Integer.parseInt(lblRanksDisguise.getText()) - 1));
	}

	@FXML
	void handleDisableDeviceIncrease() {
		lblRanksDisableDevice.setText(""
				+ (Integer.parseInt(lblRanksDisableDevice.getText()) + 1));
	}

	@FXML
	void handleDisableDeviceDecrease() {
		lblRanksDisableDevice.setText(""
				+ (Integer.parseInt(lblRanksDisableDevice.getText()) - 1));
	}

	@FXML
	void handleDiplomacyIncrease() {
		lblRanksDiplomacy.setText(""
				+ (Integer.parseInt(lblRanksDiplomacy.getText()) + 1));
	}

	@FXML
	void handleDiplomacyDecrease() {
		lblRanksDiplomacy.setText(""
				+ (Integer.parseInt(lblRanksDiplomacy.getText()) - 1));
	}

	@FXML
	void handleCraftIncrease() {
		lblRanksCraft.setText(""
				+ (Integer.parseInt(lblRanksCraft.getText()) + 1));
	}

	@FXML
	void handleCraftDecrease() {
		lblRanksCraft.setText(""
				+ (Integer.parseInt(lblRanksCraft.getText()) - 1));
	}

	@FXML
	void handleClimbIncrease() {
		lblRanksClimb.setText(""
				+ (Integer.parseInt(lblRanksClimb.getText()) + 1));
	}

	@FXML
	void handleClimbDecrease() {
		lblRanksClimb.setText(""
				+ (Integer.parseInt(lblRanksClimb.getText()) - 1));
	}

	@FXML
	void handleBluffIncrease() {
		lblRanksBluff.setText(""
				+ (Integer.parseInt(lblRanksBluff.getText()) + 1));
	}

	@FXML
	void handleBluffDecrease() {
		lblRanksBluff.setText(""
				+ (Integer.parseInt(lblRanksBluff.getText()) - 1));
	}

	@FXML
	void handleAppraiseIncrease() {
		lblRanksAppraise.setText(""
				+ (Integer.parseInt(lblRanksAppraise.getText()) + 1));
	}

	@FXML
	void handleAppraiseDecrease() {
		lblRanksAppraise.setText(""
				+ (Integer.parseInt(lblRanksAppraise.getText()) - 1));
	}

	@FXML
	void handleAcrobaticsIncrease() {
		lblRanksAcrobatics.setText(""
				+ (Integer.parseInt(lblRanksAcrobatics.getText()) + 1));
	}

	@FXML
	void handleAcrobaticsDecrease() {
		lblRanksAcrobatics.setText(""
				+ (Integer.parseInt(lblRanksAcrobatics.getText()) - 1));
	}
	//endregion

	//region setTotals
	
	void setTotalStr()
	{
		lblTotalStr.setText("" + (newCharacter.getStrength().getValue() + Integer.parseInt(lblRacialBonusStr.getText()) 
				+ Integer.parseInt(lblMiscStr.getText())));
	}
	
	void setTotalDex()
	{
		lblTotalDex.setText("" + (newCharacter.getDexterity().getValue() + Integer.parseInt(lblRacialBonusDex.getText()) 
				+ Integer.parseInt(lblMiscDex.getText())));
	}
	
	void setTotalCon()
	{
		lblTotalCon.setText("" + (newCharacter.getConstitution().getValue() + Integer.parseInt(lblRacialBonusCon.getText()) 
				+ Integer.parseInt(lblMiscCon.getText())));
	}
	
	void setTotalInt()
	{
		lblTotalInt.setText("" + (newCharacter.getIntelligence().getValue() + Integer.parseInt(lblRacialBonusInt.getText()) 
				+ Integer.parseInt(lblMiscInt.getText())));
	}
	
	void setTotalWis()
	{
		lblTotalWis.setText("" + (newCharacter.getWisdom().getValue() + Integer.parseInt(lblRacialBonusWis.getText()) 
				+ Integer.parseInt(lblMiscWis.getText())));
	}
	
	void setTotalCha()
	{
		lblTotalCha.setText("" + (newCharacter.getCharisma().getValue() + Integer.parseInt(lblRacialBonusCha.getText()) 
				+ Integer.parseInt(lblMiscCha.getText())));
	}
	
	//endregion
	
	//region AbilityScore
	@FXML
	void handleStrIncrease() {
		newCharacter.getStrength().increaseValue();
		lblBaseStr.setText("" + newCharacter.getStrength().getValue());
		lblStrMod.setText("" + newCharacter.getStrength().getModifier());
		setTotalStr();
	}

	@FXML
	void handleStrDecrease() {
		newCharacter.getStrength().decreaseValue();
		lblBaseStr.setText("" + newCharacter.getStrength().getValue());
		lblStrMod.setText("" + newCharacter.getStrength().getModifier());
		setTotalStr();
	}

	@FXML
	void handleDexIncrease() {
		newCharacter.getDexterity().increaseValue();
		lblBaseDex.setText("" + newCharacter.getDexterity().getValue());
		lblDexMod.setText("" + newCharacter.getDexterity().getModifier());
		setTotalDex();
	}

	@FXML
	void handleDexDecrease() {
		newCharacter.getDexterity().decreaseValue();
		lblBaseDex.setText("" + newCharacter.getDexterity().getValue());
		lblDexMod.setText("" + newCharacter.getDexterity().getModifier());
		setTotalDex();
	}

	@FXML
	void handleConIncrease() {
		newCharacter.getConstitution().increaseValue();
		lblBaseCon.setText("" + newCharacter.getConstitution().getValue());
		lblConMod.setText("" + newCharacter.getConstitution().getModifier());
		setTotalCon();
	}

	@FXML
	void handleConDecrease() {
		newCharacter.getConstitution().decreaseValue();
		lblBaseCon.setText("" + newCharacter.getConstitution().getValue());
		lblConMod.setText("" + newCharacter.getConstitution().getModifier());
		setTotalCon();
	}

	@FXML
	void handleIntIncrease() {
		newCharacter.getIntelligence().increaseValue();
		lblBaseInt.setText("" + newCharacter.getIntelligence().getValue());
		lblIntMod.setText("" + newCharacter.getIntelligence().getModifier());
		setTotalInt();
	}

	@FXML
	void handleIntDecrease() {
		newCharacter.getIntelligence().decreaseValue();
		lblBaseInt.setText("" + newCharacter.getIntelligence().getValue());
		lblIntMod.setText("" + newCharacter.getIntelligence().getModifier());
		setTotalInt();
	}

	@FXML
	void handleWisIncrease() {
		newCharacter.getWisdom().increaseValue();
		lblBaseWis.setText("" + newCharacter.getWisdom().getValue());
		lblWisMod.setText("" + newCharacter.getWisdom().getModifier());
		setTotalWis();
	}

	@FXML
	void handleWisDecrease() {
		newCharacter.getWisdom().decreaseValue();
		lblBaseWis.setText("" + newCharacter.getWisdom().getValue());
		lblWisMod.setText("" + newCharacter.getWisdom().getModifier());
		setTotalWis();
	}

	@FXML
	void handleChaIncrease() {
		newCharacter.getCharisma().increaseValue();
		lblBaseCha.setText("" + newCharacter.getCharisma().getValue());
		lblChaMod.setText("" + newCharacter.getCharisma().getModifier());
		setTotalCha();
	}

	@FXML
	void handleChaDecrease() {
		newCharacter.getCharisma().decreaseValue();
		lblBaseCha.setText("" + newCharacter.getCharisma().getValue());
		lblChaMod.setText("" + newCharacter.getCharisma().getModifier());
		setTotalCha();
	}
	//endregion

	@Override
	public void handleOkay(ActionEvent event) {
		// TODO Auto-generated method stub

	}

}
