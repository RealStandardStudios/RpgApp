package view.partials.dialogs.partials;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Weapon;

public class EquipmentPartialController extends NewCharacterPartialController {

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
		
		private ObservableList<Weapon> obsListWeapons = FXCollections.observableArrayList();
		
		private ObservableList<Armor> obsListArmor = FXCollections.observableArrayList();
		
		private ObservableList<Goods> obsListGoods = FXCollections.observableArrayList();
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	/**
	 * This is what you will use to set the data for this view if you need to take data from the character class
	 */
	public void setData() {
		// TODO Auto-generated method stub
		
	}

}
