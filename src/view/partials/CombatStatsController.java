package view.partials;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.SaveAttribute;
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
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData() {
		setStats();
		setSavingThrows();
	}
	
	//region setSavingThrows
	private void setSavingThrows()
	{
		SaveAttribute[] save = new SaveAttribute[]{((RootController) getRoot()).getCharacter().getFortitude(),
				((RootController) getRoot()).getCharacter().getReflex(), ((RootController) getRoot()).getCharacter().getWill()};
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
		Ability[] ability = ((RootController) getRoot()).getCharacter().getAbilities();
		
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
