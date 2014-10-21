package view.partials.levelUpDialog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import jefXif.view.DialogController;

public class LevelUpController extends DialogController implements jefXif.interfaces.PartialLoader
{
	
	String[] partialNames = new String[] { "AbilityScores", "Feat", "Skills"};
	
	@FXML
	AnchorPane skills;
	@FXML
	AnchorPane abilityScores;
	@FXML
	AnchorPane feats;
	
	@FXML
	TabPane tpTabs;

	
	@Override
	public void handleOkay(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
