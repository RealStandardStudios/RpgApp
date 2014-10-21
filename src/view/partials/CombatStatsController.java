package view.partials;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Feat;
import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.SaveAttribute;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.SlotType;
import view.RootController;


/**
 * @author Real Standard Studios - Matthew Meehan, Joshua boyd
 *
 */

public class CombatStatsController extends MainWindowController {
	//region total Stats
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
	//endregion
	
	//region Mod Stats
	@FXML
	Label lblModStr;
	@FXML
	Label lblModDex;
	@FXML
	Label lblModCon;
	@FXML
	Label lblModInt;
	@FXML
	Label lblModWis;
	@FXML
	Label lblModCha;
	//endregion
	
	//region Base Stats
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
	//endregion

	//region Enh Stats
	@FXML
	Label lblEnhStr;
	@FXML
	Label lblEnhDex;
	@FXML
	Label lblEnhCon;
	@FXML
	Label lblEnhInt;
	@FXML
	Label lblEnhWis;
	@FXML
	Label lblEnhCha;
	//endregion

	//region Misc Stats
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
	
	//region Total Saving Throws
	@FXML
	Label lblTotalFort;
	@FXML
	Label lblTotalRef;
	@FXML
	Label lblTotalWill;
	//endregion
	
	//region Base Saving Throws
	@FXML
	Label lblBaseFort;
	@FXML
	Label lblBaseRef;
	@FXML
	Label lblBaseWill;
	//endregion
	
	//region Ability Saving Throws
	@FXML
	Label lblAbilityFort;
	@FXML
	Label lblAbilityRef;
	@FXML
	Label lblAbilityWill;
	//endregion
	
	//region Enhancement Saving Throws
	@FXML
	Label lblEnhFort;
	@FXML
	Label lblEnhRef;
	@FXML
	Label lblEnhWill;
	//endregion
	
	//region Misc Saving Throws
	@FXML
	Label lblMiscFort;
	@FXML
	Label lblMiscRef;
	@FXML
	Label lblMiscWill;
	//endregion
	
	//region HP
	@FXML
	Label lblCurrentHP;
	@FXML
	Label lblMaxHP;
	@FXML
	Label lblDamage;
	@FXML
	Label lblNonLethalDamage;
	@FXML
	Label lblHitDice;
	//endregion
	
	//region Initiative
	@FXML 
	Label lblInitTotal;
	@FXML 
	Label lblInitDex;
	@FXML 
	Label lblInitMisc1;
	@FXML 
	Label lblInitMisc2;
	//endregion
	
	//region Speeds
	@FXML
	Label lblSpeedBase;
	@FXML
	Label lblSpeedArmor;
	@FXML
	Label lblSpeedSwim;
	@FXML
	Label lblSpeedClimb;
	@FXML
	Label lblSpeedFly;
	@FXML
	Label lblSpeedBurrow;
	@FXML
	Label lblSpeedModifiers;
	//endregion
	
	//region attacBonuses
	@FXML
	Label lblTotalMelee;
	@FXML
	Label lblBABMelee;
	@FXML
	Label lblAbilityMelee;
	@FXML
	Label lblSizeMelee;
	@FXML
	Label lblMiscMelee;
	
	@FXML
	Label lblTotalRanged;
	@FXML
	Label lblBABRanged;
	@FXML
	Label lblAbilityRanged;
	@FXML
	Label lblSizeRanged;
	@FXML
	Label lblMiscRanged;
	
	@FXML
	Label lblTotalCMB;
	@FXML
	Label lblBABCMB;
	@FXML
	Label lblAbilityCMB;
	@FXML
	Label lblSizeCMB;
	@FXML
	Label lblMiscCMB;
	
	@FXML
	Label lblTotalCMD;
	@FXML
	Label lblBABCMD;
	@FXML
	Label lblCMDStr;
	@FXML
	Label lblCMDDex;
	@FXML
	Label lblSizeCMD;
	@FXML
	Label lblMiscCMD;
	//endregion
	
	//region AC'S
	@FXML
	Label lblTotalAC;
	@FXML
	Label lblArmorAC;
	@FXML
	Label lblShieldAC;
	@FXML
	Label lblDexAC;
	@FXML
	Label lblSizeAC;
	@FXML
	Label lblDodgeAC;
	@FXML
	Label lblNaturalAC;
	@FXML
	Label lblDeflectAC;
	@FXML
	Label lblEnhAC;
	@FXML
	Label lblMiscAC;
	
	@FXML
	Label lblTotalTouchAC;
	@FXML
	Label lblArmorTouchAC;
	@FXML
	Label lblShieldTouchAC;
	@FXML
	Label lblDexTouchAC;
	@FXML
	Label lblSizeTouchAC;
	@FXML
	Label lblDodgeTouchAC;
	@FXML
	Label lblNaturalTouchAC;
	@FXML
	Label lblDeflectTouchAC;
	@FXML
	Label lblEnhTouchAC;
	@FXML
	Label lblMiscTouchAC;
	
	@FXML
	Label lblTotalFlatFootAC;
	@FXML
	Label lblArmorFlatFootAC;
	@FXML
	Label lblShieldFlatFootAC;
	@FXML
	Label lblDexFlatFootAC;
	@FXML
	Label lblSizeFlatFootAC;
	@FXML
	Label lblDodgeFlatFootAC;
	@FXML
	Label lblNaturalFlatFootAC;
	@FXML
	Label lblDeflectFlatFootAC;
	@FXML
	Label lblEnhFlatFootAC;
	@FXML
	Label lblMiscFlatFootAC;
	//endregion
	
	pathfinder.data.Character.Character character;
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData() {
		character = ((RootController) getRoot()).getCharacter();
		setStats();
		setSavingThrows();
		setHP();
		setInitiative();
		setSpeeds();
		setAC();
		setAttackBonus();
	}
	
	//region setAtackBonus
	public void setAttackBonus()
	{
		lblTotalMelee.setText((character.getBaB()[0] + 
				character.getStrength().getModifier().get() +
				character.getRace().getSize().getSizeModifier()) + "");
		
		lblBABMelee.setText(character.getBaB()[0]+"");
		lblAbilityMelee.setText(character.getStrength().getModifier().get()+"");
		lblSizeMelee.setText(character.getRace().getSize().getSizeModifier() + "");
		lblMiscMelee.setText("0");
		//sets up melee
		
		lblTotalRanged.setText((character.getBaB()[0] + 
				character.getDexterity().getModifier().get() +
				character.getRace().getSize().getSizeModifier()) + "");
		
		lblBABRanged.setText(character.getBaB()[0]+"");
		lblAbilityRanged.setText(character.getDexterity().getModifier().get()+"");
		lblSizeRanged.setText(character.getRace().getSize().getSizeModifier() + "");
		lblMiscRanged.setText("0");
		//sets up range
		
		lblTotalCMB.setText((character.getBaB()[0] + 
				character.getStrength().getModifier().get() +
				character.getRace().getSize().getSizeModifier()) + "");
		
		lblBABCMB.setText(character.getBaB()[0]+"");
		lblAbilityCMB.setText(character.getStrength().getModifier().get()+"");
		lblSizeCMB.setText(character.getRace().getSize().getSizeModifier() + "");
		lblMiscCMB.setText("0");
		//sets up CMB
		
		lblTotalCMD.setText((character.getBaB()[0]+
				character.getStrength().getModifier().get()+
				character.getDexterity().getModifier().get()+
				character.getRace().getSize().getSizeModifier() + 10 ) + "");
		
		lblBABCMD.setText(character.getBaB()[0]+"");
		lblCMDStr.setText(character.getStrength().getModifier().get()+"");
		lblCMDDex.setText(character.getDexterity().getModifier().get()+"");
		lblSizeCMD.setText(character.getRace().getSize().getSizeModifier() + "");
		lblMiscCMD.setText("0");
		//sets up CMD
	}
	//endregion
	
	//region setAC
	public void setAC()
	{
		ObservableList<Armor> wornArmors = character.getInventory().getArmorWorn();
		int totalFlatFootedAC = 10;
		int totalAC = 10;
		int totalTouchAC = 10;
		int wornArmorAC = 0;
		int shieldAC = 0;
		int dexLimit = 1000;
		for (Armor armor : wornArmors) {
			if (armor.getSlotType()!=SlotType.Shield)
			{
				wornArmorAC += Integer.parseInt(armor.ArmorBonus.get()); 
				if(armor.MaxDexBonus.getValue() == "-")
				{
					dexLimit = Integer.parseInt(armor.MaxDexBonus.getValue());
				}
			}
			else
			{
				shieldAC += Integer.parseInt(armor.ArmorBonus.get()); 
				if(armor.MaxDexBonus.getValue() == "-")
				{
					dexLimit = Integer.parseInt(armor.MaxDexBonus.getValue());
				}
			}
		}
		totalAC += wornArmorAC + shieldAC;
		totalFlatFootedAC += wornArmorAC + shieldAC;
		lblArmorAC.setText(wornArmorAC+"");
		lblShieldAC.setText(""+shieldAC);
		lblArmorFlatFootAC.setText(wornArmorAC+"");
		lblShieldFlatFootAC.setText(""+shieldAC);
		
		if(dexLimit < character.getDexterity().getModifier().get())
		{
			lblDexAC.setText(dexLimit + "");
			lblDexTouchAC.setText(dexLimit + "");
			totalAC += dexLimit;
			totalTouchAC += dexLimit;
		}
		else
		{
			lblDexAC.setText(character.getDexterity().getModifier().get() + "");
			lblDexTouchAC.setText(character.getDexterity().getModifier().get() + "");
			totalAC += character.getDexterity().getModifier().get();
			totalTouchAC += character.getDexterity().getModifier().get();
		}
		
		lblSizeAC.setText(character.getRace().getSize().getSizeModifier()+"");
		lblSizeTouchAC.setText(character.getRace().getSize().getSizeModifier()+"");
		lblSizeFlatFootAC.setText(character.getRace().getSize().getSizeModifier()+"");
		
		totalAC += character.getRace().getSize().getSizeModifier();
		totalTouchAC += character.getRace().getSize().getSizeModifier();
		totalFlatFootedAC += character.getRace().getSize().getSizeModifier();
		
		int dodge = 0;
		for (Feat feats : character.getFeats()) {
			if(feats.getName().equals("Dodge*")) dodge++;
		}
		
		lblDodgeAC.setText(dodge + "");
		lblDodgeTouchAC.setText(dodge + "");
		totalAC += dodge;
		totalTouchAC += dodge;
		
		if(character.getRace().getName().equals("Kobolds"))
		{
			lblNaturalAC.setText("1");
			lblNaturalFlatFootAC.setText("1");
			totalAC += 1;
			totalFlatFootedAC += 1;
		}
		else if(character.getRace().getName().equals("Changeling"))
		{
			lblNaturalAC.setText("1");
			lblNaturalFlatFootAC.setText("1");
			totalAC += 1 ;
			totalFlatFootedAC += 1;
		}
		else if(character.getRace().getName().equals("Merfolk"))
		{
			lblNaturalAC.setText("2");
			lblNaturalFlatFootAC.setText("2");
			totalAC += 2;
			totalFlatFootedAC += 2;
		}
		else if(character.getRace().getName().equals("Nagaji"))
		{
			lblNaturalAC.setText("1");
			lblNaturalFlatFootAC.setText("1");
			totalAC += 1;
			totalFlatFootedAC += 1;
		}
		else
		{
			lblNaturalAC.setText("0");
			lblNaturalFlatFootAC.setText("0");
		}
		
		lblDeflectAC.setText("0");
		lblEnhAC.setText("0");
		lblMiscAC.setText("0");
		lblTotalAC.setText(totalAC + "");
		
		lblNaturalTouchAC.setText("N/A");
		lblDeflectTouchAC.setText("0");
		lblEnhTouchAC.setText("N/A");
		lblMiscTouchAC.setText("0");
		lblTotalTouchAC.setText(totalTouchAC+"");
		
		
		lblDeflectFlatFootAC.setText("0");
		lblEnhFlatFootAC.setText("0");
		lblMiscFlatFootAC.setText("0");
		lblTotalFlatFootAC.setText(totalFlatFootedAC + "");
	}
	//endregion
	
	//region setSpeeds
	public void setSpeeds()
	{
		ObservableList<Armor> wornArmors = character.getInventory().getArmorWorn();
		int wornArmorWeight = 0;
		for (Armor armor : wornArmors) {
			if(character.getRace().getSize().getSizeModifier() == 1 )
			{
				String[] ar = armor.Speed20feet.get().split(" ");
				wornArmorWeight += Integer.parseInt(ar[0]); 
			}
			if(character.getRace().getSize().getSizeModifier() == 0 )
			{
				String[] ar = armor.Speed30feet.get().split(" ");
				if(!ar[0].equals("-"))
					wornArmorWeight += Integer.parseInt(ar[0]); 
			}
		}
		lblSpeedBase.setText(character.getRace().getSpeed() + "");
		lblSpeedArmor.setText(wornArmorWeight + "");
	}
	//endregion
	
	//region setInitiative
	public void setInitiative()
	{
		lblInitDex.setText(character.getDexterity().getModifier().get() + "");
		lblInitTotal.setText(character.getDexterity().getModifier().get() + "");
	}
	//endregion
	
	//region setHP
	private void setHP()
	{
		lblCurrentHP.setText(character.getCurrentHP()+"");
		lblMaxHP.setText(character.getMaxHP()+"");
		lblDamage.setText((character.getMaxHP() - character.getCurrentHP())+"");
		lblNonLethalDamage.setText(character.getNonLethalHP() +"");
		lblHitDice.setText(character.getClasses()[0].getHitDice() + "");
	}
	//endregion
	
	//region setSavingThrows
	private void setSavingThrows()
	{
		SaveAttribute[] save = new SaveAttribute[]{character.getFortitude(),
				character.getReflex(), character.getWill()};
		Label[] totalSavingThrow = new Label[]{lblTotalFort, lblTotalRef, lblTotalWill};
		Label[] baseSavingThrow = new Label[]{lblBaseFort, lblBaseRef, lblBaseWill};
		Label[] abilitySavingThrow = new Label[]{lblAbilityFort, lblAbilityRef, lblAbilityWill};
		Label[] enhSavingThrow = new Label[]{lblEnhFort, lblEnhRef, lblEnhWill};
		Label[] miscSavingThrow = new Label[]{lblMiscFort, lblMiscRef, lblMiscWill};
		for (int i = 0; i < 3; i++)
		{
			totalSavingThrow[i].setText(save[i].getTotal()+"");
			baseSavingThrow[i].setText(save[i].getBaseValueProperty().get().toString());
			abilitySavingThrow[i].setText(save[i].getModifier()+"");
			enhSavingThrow[i].setText("0");
			miscSavingThrow[i].setText(save[i].getMiscMod()+"");
		}
	}
	//endregion
	
	//region SetStats
	private void setStats()
	{
		Label[] totalStats = new Label[]{lblTotalStr, lblTotalDex, lblTotalCon, lblTotalInt, lblTotalWis, lblTotalCha};
		Label[] modStats = new Label[]{lblModStr, lblModDex, lblModCon, lblModInt, lblModWis, lblModCha};
		Label[] baseStats = new Label[]{lblBaseStr, lblBaseDex, lblBaseCon, lblBaseInt, lblBaseWis, lblBaseCha};
		Label[] enhStats = new Label[]{lblEnhStr, lblEnhDex, lblEnhCon, lblEnhInt, lblEnhWis, lblEnhCha};
		Label[] miscStats = new Label[]{lblMiscStr, lblMiscDex, lblMiscCon, lblMiscInt, lblMiscWis, lblMiscCha};
		Ability[] ability = character.getAbilities();
		
		for (int i = 0; i < ability.length; i++) {
			totalStats[i].setText(ability[i].getTotalValue()+"");
			baseStats[i].setText(ability[i].getBaseValue()+"");
			modStats[i].setText(ability[i].getModifier().get()+"");
			miscStats[i].setText(ability[i].getRacialBonus()+"");
			enhStats[i].setText("0");
		}
	}
	//endregion

}
