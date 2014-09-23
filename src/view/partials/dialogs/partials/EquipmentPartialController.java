package view.partials.dialogs.partials;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import org.controlsfx.dialog.Dialogs;

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
	private TableColumn<Weapon, String> columnWeaponDmgType;
	
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
		readItems();
		
		// Set observable list of weapons into the weapons table
		tableWeapons.setItems(obsListWeapons);
		// Set the columns
		columnWeaponName.setCellValueFactory(cellData -> cellData.getValue().Name);
		columnWeaponType.setCellValueFactory(cellData -> cellData.getValue().WeaponType);
		columnWeaponCost.setCellValueFactory(cellData -> cellData.getValue().Cost);
		columnWeaponDmgS.setCellValueFactory(cellData -> cellData.getValue().DmgS);
		columnWeaponDmgM.setCellValueFactory(cellData -> cellData.getValue().DmgM);
		columnWeaponDmgType.setCellValueFactory(cellData -> cellData.getValue().WeaponDmgType);
		columnWeaponCrit.setCellValueFactory(cellData -> cellData.getValue().Critical);
		columnWeaponRange.setCellValueFactory(cellData -> cellData.getValue().Range);
		columnWeaponWeight.setCellValueFactory(cellData -> cellData.getValue().Weight);
		columnWeaponSpecial.setCellValueFactory(cellData -> cellData.getValue().Special);
		
		// Armor
		tableArmor.setItems(obsListArmor);
		columnArmorName.setCellValueFactory(cellData -> cellData.getValue().Name);
		columnArmorType.setCellValueFactory(cellData -> cellData.getValue().ArmorType);
		columnArmorCost.setCellValueFactory(cellData -> cellData.getValue().Cost);
		columnArmorBonus.setCellValueFactory(cellData -> cellData.getValue().ArmorBonus);
		columnArmorMaxDex.setCellValueFactory(cellData -> cellData.getValue().MaxDexBonus);
		columnArmorCheckPenalty.setCellValueFactory(cellData -> cellData.getValue().ArmorCheckPenalty);
		columnArmorSpellFailure.setCellValueFactory(cellData -> cellData.getValue().ArcaneSpellFailure);
		columnArmorSpeed30.setCellValueFactory(cellData -> cellData.getValue().Speed30feet);
		columnArmorSpeed20.setCellValueFactory(cellData -> cellData.getValue().Speed20feet);
		columnArmorWeight.setCellValueFactory(cellData -> cellData.getValue().Weight);
		
		// Goods
		tableGoods.setItems(obsListGoods);
		columnGoodsName.setCellValueFactory(cellData -> cellData.getValue().Name);
		columnGoodsCost.setCellValueFactory(cellData -> cellData.getValue().Cost);
		columnGoodsWeight.setCellValueFactory(cellData -> cellData.getValue().Weight);
	}

	@Override
	/**
	 * This is what you will use to set the data for this view if you need to take data from the character class
	 */
	public void setData() {
		// TODO Auto-generated method stub
		
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
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the Feat File Properly").message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
