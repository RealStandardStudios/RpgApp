package view.partials;

import pathfinder.data.Attributes.Ability;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import view.RootController;


/**
 * @author Real Standard Studios - Matthew Meehan
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

		
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData() {
		setStats();
		
	}
	
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

}
