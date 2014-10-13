package view.itemViews;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Items.Armor;

public class ArmorView extends ItemView {

	@FXML
	Label armorBonus;
	@FXML
	Label armorMaxDex;
	@FXML
	Label armorACpenalty;
	@FXML
	Label armorArcane;
	@FXML
	Label armorSpeed30;
	@FXML
	Label armorSpeed20;
	
	@Override
	public void show() {
		this.getDialogStage().show();
		this.itemName.setText(item.Name.get());
		this.itemType.setText(((Armor) item).ArmorType.get());
		this.itemCost.setText(item.Cost.get());
		this.itemWeight.setText(item.Weight.get());
		this.armorBonus.setText(((Armor) item).ArmorBonus.get());
		this.armorMaxDex.setText(((Armor) item).MaxDexBonus.get());
		this.armorACpenalty.setText(((Armor) item).ArmorCheckPenalty.get());
		this.armorArcane.setText(((Armor) item).ArcaneSpellFailure.get());
		this.armorSpeed20.setText(((Armor) item).Speed20feet.get());
		this.armorSpeed30.setText(((Armor) item).Speed30feet.get());
	}

	@Override
	public void initialize() {
		
	}

}
