package view.partials;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import jefXif.WindowController;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class NewCharacterController extends WindowController {

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
	//first tab base abtributes
	
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
	//Skills
	
	
	
	int baseStr;
	int baseDex;
	int baseCon;
	int baseInt;
	int baseWis;
	int baseCha;
	
	
	
	private Stage dialogStage;
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	@Override
	public void initialize() {
		baseStr = 10;
		baseDex = 10;
		baseCon = 10;
		baseInt = 10;
		baseWis = 10;
		baseCha = 10;
		
		lblBaseStr.setText("" + baseStr);
		lblBaseDex.setText("" + baseDex);
		lblBaseCon.setText("" + baseCon);
		lblBaseInt.setText("" + baseInt);
		lblBaseWis.setText("" + baseWis);
		lblBaseCha.setText("" + baseCha);
		
		lblRanksAcrobatics.setText("0");
		lblRanksAppraise.setText("0");
		lblRanksBluff.setText("0");
		lblRanksClimb.setText("0");
		lblRanksCraft.setText("0");
		lblRanksDiplomacy.setText("0");
		lblRanksDisableDevice.setText("0");
		lblRanksDisguise.setText("0");
		lblRanksEscapeArtist.setText("0");
		lblRanksFly.setText("0");
		lblRanksHandleAnimal.setText("0");
		lblRanksHeal.setText("0");
		lblRanksIntimidate.setText("0");
		lblRanksKnowledgeArcana.setText("0");
		lblRanksKnowledgeDungeoneering.setText("0");
		lblRanksKnowledgeEngineering.setText("0");
		lblRanksKnowledgeGeography.setText("0");
		lblRanksKnowledgeHistory.setText("0");
		lblRanksKnowledgeLocal.setText("0");
		lblRanksKnowledgeNature.setText("0");
		lblRanksKnowledgeNobility.setText("0");
		lblRanksKnowledgePlanes.setText("0");
		lblRanksKnowledgeReligion.setText("0");
		lblRanksLinguistics.setText("0");
		lblRanksPerception.setText("0");
		lblRanksPerform.setText("0");
		lblRanksProfession.setText("0");
		lblRanksRide.setText("0");
		lblRanksSenseMotive.setText("0");
		lblRanksSleightOfHand.setText("0");
		lblRanksSpellcraft.setText("0");
		lblRanksStealth.setText("0");
		lblRanksSurvival.setText("0");
		lblRanksSwim.setText("0");
		lblRanksUseMagicDevice.setText("0");

	}
	
	@FXML
	void handleKnowledgeNobilityIncrease()
	{
		lblRanksKnowledgeNobility.setText("" + (Integer.parseInt(lblRanksKnowledgeNobility.getText())+1));
	}
	@FXML
	void handleKnowledgeNobilityDecrease()
	{
		lblRanksKnowledgeNobility.setText("" + (Integer.parseInt(lblRanksKnowledgeNobility.getText())-1));
	}
	@FXML
	void handleKnowledgeNatureIncrease()
	{
		lblRanksKnowledgeNature.setText("" + (Integer.parseInt(lblRanksKnowledgeNature.getText())+1));
	}
	@FXML
	void handleKnowledgeNatureDecrease()
	{
		lblRanksKnowledgeNature.setText("" + (Integer.parseInt(lblRanksKnowledgeNature.getText())-1));
	}
	@FXML
	void handleKnowledgeLocalIncrease()
	{
		lblRanksKnowledgeLocal.setText("" + (Integer.parseInt(lblRanksKnowledgeLocal.getText())+1));
	}
	@FXML
	void handleKnowledgeLocalDecrease()
	{
		lblRanksKnowledgeLocal.setText("" + (Integer.parseInt(lblRanksKnowledgeLocal.getText())-1));
	}
	@FXML
	void handleKnowledgeHistoryIncrease()
	{
		lblRanksKnowledgeHistory.setText("" + (Integer.parseInt(lblRanksKnowledgeHistory.getText())+1));
	}
	@FXML
	void handleKnowledgeHistoryDecrease()
	{
		lblRanksKnowledgeHistory.setText("" + (Integer.parseInt(lblRanksKnowledgeHistory.getText())-1));
	}
	@FXML
	void handleKnowledgeGeographyIncrease()
	{
		lblRanksKnowledgeGeography.setText("" + (Integer.parseInt(lblRanksKnowledgeGeography.getText())+1));
	}
	@FXML
	void handleKnowledgeGeographyDecrease()
	{
		lblRanksKnowledgeGeography.setText("" + (Integer.parseInt(lblRanksKnowledgeGeography.getText())-1));
	}
	@FXML
	void handleKnowledgeEngineeringIncrease()
	{
		lblRanksKnowledgeEngineering.setText("" + (Integer.parseInt(lblRanksKnowledgeEngineering.getText())+1));
	}
	@FXML
	void handleKnowledgeEngineeringDecrease()
	{
		lblRanksKnowledgeEngineering.setText("" + (Integer.parseInt(lblRanksKnowledgeEngineering.getText())-1));
	}
	@FXML
	void handleKnowledgeDungeoneeringIncrease()
	{
		lblRanksKnowledgeDungeoneering.setText("" + (Integer.parseInt(lblRanksKnowledgeDungeoneering.getText())+1));
	}
	@FXML
	void handleKnowledgeDungeoneeringDecrease()
	{
		lblRanksKnowledgeDungeoneering.setText("" + (Integer.parseInt(lblRanksKnowledgeDungeoneering.getText())-1));
	}
	@FXML
	void handleKnowledgeArcanaIncrease()
	{
		lblRanksKnowledgeArcana.setText("" + (Integer.parseInt(lblRanksKnowledgeArcana.getText())+1));
	}
	@FXML
	void handleKnowledgeArcanaDecrease()
	{
		lblRanksKnowledgeArcana.setText("" + (Integer.parseInt(lblRanksKnowledgeArcana.getText())-1));
	}
	@FXML
	void handleIntimidateIncrease()
	{
		lblRanksIntimidate.setText("" + (Integer.parseInt(lblRanksIntimidate.getText())+1));
	}
	@FXML
	void handleIntimidateDecrease()
	{
		lblRanksIntimidate.setText("" + (Integer.parseInt(lblRanksIntimidate.getText())-1));
	}
	@FXML
	void handleHealIncrease()
	{
		lblRanksHeal.setText("" + (Integer.parseInt(lblRanksHeal.getText())+1));
	}
	@FXML
	void handleHealDecrease()
	{
		lblRanksHeal.setText("" + (Integer.parseInt(lblRanksHeal.getText())-1));
	}
	@FXML
	void handleHandleAnimalIncrease()
	{
		lblRanksHandleAnimal.setText("" + (Integer.parseInt(lblRanksHandleAnimal.getText())+1));
	}
	@FXML
	void handleHandleAnimalDecrease()
	{
		lblRanksHandleAnimal.setText("" + (Integer.parseInt(lblRanksHandleAnimal.getText())-1));
	}
	@FXML
	void handleFlyIncrease()
	{
		lblRanksFly.setText("" + (Integer.parseInt(lblRanksFly.getText())+1));
	}
	@FXML
	void handleFlyDecrease()
	{
		lblRanksFly.setText("" + (Integer.parseInt(lblRanksFly.getText())-1));
	}
	@FXML
	void handleEscapeArtistIncrease()
	{
		lblRanksEscapeArtist.setText("" + (Integer.parseInt(lblRanksEscapeArtist.getText())+1));
	}
	@FXML
	void handleEscapeArtistDecrease()
	{
		lblRanksEscapeArtist.setText("" + (Integer.parseInt(lblRanksEscapeArtist.getText())-1));
	}
	@FXML
	void handleDisguiseIncrease()
	{
		lblRanksDisguise.setText("" + (Integer.parseInt(lblRanksDisguise.getText())+1));
	}
	@FXML
	void handleDisguiseDecrease()
	{
		lblRanksDisguise.setText("" + (Integer.parseInt(lblRanksDisguise.getText())-1));
	}
	@FXML
	void handleDisableDeviceIncrease()
	{
		lblRanksDisableDevice.setText("" + (Integer.parseInt(lblRanksDisableDevice.getText())+1));
	}
	@FXML
	void handleDisableDeviceDecrease()
	{
		lblRanksDisableDevice.setText("" + (Integer.parseInt(lblRanksDisableDevice.getText())-1));
	}
	@FXML
	void handleDiplomacyIncrease()
	{
		lblRanksDiplomacy.setText("" + (Integer.parseInt(lblRanksDiplomacy.getText())+1));
	}
	@FXML
	void handleDiplomacyDecrease()
	{
		lblRanksDiplomacy.setText("" + (Integer.parseInt(lblRanksDiplomacy.getText())-1));
	}
	@FXML
	void handleCraftIncrease()
	{
		lblRanksCraft.setText("" + (Integer.parseInt(lblRanksCraft.getText())+1));
	}
	@FXML
	void handleCraftDecrease()
	{
		lblRanksCraft.setText("" + (Integer.parseInt(lblRanksCraft.getText())-1));
	}
	@FXML
	void handleClimbIncrease()
	{
		lblRanksClimb.setText("" + (Integer.parseInt(lblRanksClimb.getText())+1));
	}
	@FXML
	void handleClimbDecrease()
	{
		lblRanksClimb.setText("" + (Integer.parseInt(lblRanksClimb.getText())-1));
	}
	@FXML
	void handleBluffIncrease()
	{
		lblRanksBluff.setText("" + (Integer.parseInt(lblRanksBluff.getText())+1));
	}
	@FXML
	void handleBluffDecrease()
	{
		lblRanksBluff.setText("" + (Integer.parseInt(lblRanksBluff.getText())-1));
	}
	@FXML
	void handleAppraiseIncrease()
	{
		lblRanksAppraise.setText("" + (Integer.parseInt(lblRanksAppraise.getText())+1));
	}
	@FXML
	void handleAppraiseDecrease()
	{
		lblRanksAppraise.setText("" + (Integer.parseInt(lblRanksAppraise.getText())-1));
	}
	@FXML
	void handleAcrobaticsIncrease()
	{
		lblRanksAcrobatics.setText("" + (Integer.parseInt(lblBaseStr.getText())+1));
	}
	@FXML
	void handleAcrobaticsDecrease()
	{
		lblRanksAcrobatics.setText("" + (Integer.parseInt(lblBaseStr.getText())-1));
	}
	
	@FXML
	void handleStrIncrease()
	{
		baseStr++;
		lblBaseStr.setText("" + baseStr);
	}
	@FXML
	void handleStrDecrease()
	{
		baseStr--;
		lblBaseStr.setText("" + baseStr);
	}
	@FXML
	void handleDexIncrease()
	{
		baseDex++;
		lblBaseDex.setText("" + baseDex);
	}
	@FXML
	void handleDexDecrease()
	{
		baseDex--;
		lblBaseDex.setText("" + baseDex);
	}
	@FXML
	void handleConIncrease()
	{
		baseCon++;
		lblBaseCon.setText("" + baseCon);
	}
	@FXML
	void handleConDecrease()
	{
		baseCon--;
		lblBaseCon.setText("" + baseCon);
	}
	@FXML
	void handleIntIncrease()
	{
		baseInt++;
		lblBaseInt.setText("" + baseInt);
	}
	@FXML
	void handleIntDecrease()
	{
		baseInt--;
		lblBaseInt.setText("" + baseInt);
	}
	@FXML
	void handleWisIncrease()
	{
		baseWis++;
		lblBaseWis.setText("" + baseWis);
	}
	@FXML
	void handleWisDecrease()
	{
		baseWis--;
		lblBaseWis.setText("" + baseWis);
	}
	@FXML
	void handleChaIncrease()
	{
		baseCha++;
		lblBaseCha.setText("" + baseCha);
	}
	@FXML
	void handleChaDecrease()
	{
		baseCha--;
		lblBaseCha.setText("" + baseCha);
	}
	
	@FXML
	private void handleCancel()
	{
	    dialogStage.close();
	}
	 

}
