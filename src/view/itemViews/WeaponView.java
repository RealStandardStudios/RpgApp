package view.itemViews;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Items.Weapon;

public class WeaponView extends ItemView {
	
	@FXML
	Label itemDmgS;
	@FXML
	Label itemDmgM;
	@FXML
	Label itemCrit;
	@FXML
	Label itemDmgType;
	@FXML
	Label itemRange;
	@FXML
	Label itemSpecial;
	
	@Override
	public void initialize() {
		
	}

	@Override
	public void show() {
		this.getDialogStage().show();
		this.itemName.setText(item.Name.get());
		this.itemType.setText(((Weapon) item).WeaponType.get());
		this.itemCost.setText(item.Cost.get());
		this.itemWeight.setText(item.Weight.get());
		this.itemDmgS.setText(((Weapon) item).DmgS.get());
		this.itemDmgM.setText(((Weapon) item).DmgM.get());
		this.itemDmgType.setText(((Weapon) item).WeaponDmgType.get());
		this.itemRange.setText(((Weapon) item).Range.get());
		this.itemCrit.setText(((Weapon) item).Critical.get());
		this.itemSpecial.setText(((Weapon) item).Special.get());
	}
}
