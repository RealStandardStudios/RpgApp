package view.partials.dialogs.partials;

import java.io.File;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Weapon;

public class EquipmentPartialController extends NewCharacterPartialController {

	// region Items Available Table annotations

	// Weapons available table
	@FXML
	private TableView<Weapon> tableWeaponsAvailable;

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

	// Armor available table
	@FXML
	private TableView<Armor> tableArmorAvailable;

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

	// Goods available table
	@FXML
	private TableView<Goods> tableGoodsAvailable;

	@FXML
	private TableColumn<Goods, String> columnGoodsName;

	@FXML
	private TableColumn<Goods, String> columnGoodsCost;

	@FXML
	private TableColumn<Goods, String> columnGoodsWeight;

	// endregion Items available

	// region Character Items Table annotations

	// Character Weapons Table
	@FXML
	private TableView<Weapon> tableWeaponsCharacter;

	@FXML
	private TableColumn<Weapon, String> columnCharWeaponName;

	@FXML
	private TableColumn<Weapon, String> columnCharWeaponQuantity;

	// Character Armor Table
	@FXML
	private TableView<Armor> tableArmorCharacter;

	@FXML
	private TableColumn<Armor, String> columnCharArmorName;

	@FXML
	private TableColumn<Armor, String> columnCharArmorQuantity;

	// Character Goods Table
	@FXML
	private TableView<Goods> tableGoodsCharacter;

	@FXML
	private TableColumn<Goods, String> columnCharGoodsName;

	@FXML
	private TableColumn<Goods, String> columnCharGoodsQuantity;

	// end region

	// Labels and buttons
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

	// endregion

	Item itemToAdd;
	Item itemToRemove;

	private ObservableList<Weapon> obsListWeapons = FXCollections
			.observableArrayList();

	private ObservableList<Armor> obsListArmor = FXCollections
			.observableArrayList();

	private ObservableList<Goods> obsListGoods = FXCollections
			.observableArrayList();

	private ObservableList<Weapon> obsChosenWeapons = FXCollections
			.observableArrayList();

	private ObservableList<Armor> obsChosenArmor = FXCollections
			.observableArrayList();

	private ObservableList<Goods> obsChosenGoods = FXCollections
			.observableArrayList();

	Integer totalWeight = 0;
	Integer goldRemaining = 0;

	@Override
	public void initialize() {
		readItems();

		tableWeaponsAvailable
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedAvailableItem(newValue));
		tableArmorAvailable
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedAvailableItem(newValue));
		tableGoodsAvailable
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedAvailableItem(newValue));

		tableWeaponsCharacter
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedCharacterItem(newValue));
		tableArmorCharacter
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedCharacterItem(newValue));
		tableGoodsCharacter
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedCharacterItem(newValue));

		// region Available Items

		// Set observable list of weapons into the weapons table
		tableWeaponsAvailable.setItems(obsListWeapons);
		// Set the columns
		columnWeaponName
				.setCellValueFactory(cellData -> cellData.getValue().Name);
		columnWeaponType
				.setCellValueFactory(cellData -> cellData.getValue().WeaponType);
		columnWeaponCost
				.setCellValueFactory(cellData -> cellData.getValue().Cost);
		columnWeaponDmgS
				.setCellValueFactory(cellData -> cellData.getValue().DmgS);
		columnWeaponDmgM
				.setCellValueFactory(cellData -> cellData.getValue().DmgM);
		columnWeaponDmgType
				.setCellValueFactory(cellData -> cellData.getValue().WeaponDmgType);
		columnWeaponCrit
				.setCellValueFactory(cellData -> cellData.getValue().Critical);
		columnWeaponRange
				.setCellValueFactory(cellData -> cellData.getValue().Range);
		columnWeaponWeight
				.setCellValueFactory(cellData -> cellData.getValue().Weight);
		columnWeaponSpecial
				.setCellValueFactory(cellData -> cellData.getValue().Special);

		// Armor
		tableArmorAvailable.setItems(obsListArmor);
		columnArmorName
				.setCellValueFactory(cellData -> cellData.getValue().Name);
		columnArmorType
				.setCellValueFactory(cellData -> cellData.getValue().ArmorType);
		columnArmorCost
				.setCellValueFactory(cellData -> cellData.getValue().Cost);
		columnArmorBonus
				.setCellValueFactory(cellData -> cellData.getValue().ArmorBonus);
		columnArmorMaxDex
				.setCellValueFactory(cellData -> cellData.getValue().MaxDexBonus);
		columnArmorCheckPenalty.setCellValueFactory(cellData -> cellData
				.getValue().ArmorCheckPenalty);
		columnArmorSpellFailure.setCellValueFactory(cellData -> cellData
				.getValue().ArcaneSpellFailure);
		columnArmorSpeed30
				.setCellValueFactory(cellData -> cellData.getValue().Speed30feet);
		columnArmorSpeed20
				.setCellValueFactory(cellData -> cellData.getValue().Speed20feet);
		columnArmorWeight
				.setCellValueFactory(cellData -> cellData.getValue().Weight);

		// Goods
		tableGoodsAvailable.setItems(obsListGoods);
		columnGoodsName
				.setCellValueFactory(cellData -> cellData.getValue().Name);
		columnGoodsCost
				.setCellValueFactory(cellData -> cellData.getValue().Cost);
		columnGoodsWeight
				.setCellValueFactory(cellData -> cellData.getValue().Weight);

		// end region

		// region Character Items

		tableWeaponsCharacter.setItems(obsChosenWeapons);
		columnCharWeaponName.setCellValueFactory(cellData -> cellData
				.getValue().Name);
		// columnCharWeaponQuantity - this might not always be 1

		tableArmorCharacter.setItems(obsChosenArmor);
		columnCharArmorName
				.setCellValueFactory(cellData -> cellData.getValue().Name);
		// columnCharArmorQuantity - this will probably always be 1

		tableGoodsCharacter.setItems(obsChosenGoods);
		columnCharGoodsName
				.setCellValueFactory(cellData -> cellData.getValue().Name);
		// columnCharGoodsQuantity - this might not always be 1

		// endregion

		lblStartingWealthValue.setText("Click Roll");
		lblGoldRemainingValue.setText("Roll starting wealth first");

		lblWeightValue.setText(totalWeight.toString());

	}

	@Override
	/**
	 * This is what you will use to set the data for this view if you need to take data from the character class
	 */
	public void setData() {
		// TODO Auto-generated method stub

	}

	void readItems() {
		File file = new File(this.getClass().getResource("").getPath()
				+ programRoot + "PathfinderData/data");
		File weaponsFile = new File(file.getPath() + "\\Weapons.idf");
		File armorFile = new File(file.getPath() + "\\Armors.idf");
		File goodsFile = new File(file.getPath() + "\\GoodsAndServices.idf");
		try {
			obsListWeapons = FXCollections.observableArrayList(readDataFile(
					weaponsFile, Weapon.class));
			obsListArmor = FXCollections.observableArrayList(readDataFile(
					armorFile, Armor.class));
			obsListGoods = FXCollections.observableArrayList(readDataFile(
					goodsFile, Goods.class));
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error")
					.masthead("Couldn't read the Feat File Properly")
					.message(e.getMessage()).showWarning();
			e.printStackTrace();
		}
	}

	private void handleSelectedAvailableItem(Item item) {
		// Action result =
		// Dialogs.create().title("Item Selected").masthead("Do you want to add this Item to your Character?").message("Selected Item: "+item.Name.get()).showConfirm();
		itemToAdd = item;
	}

	private void handleSelectedCharacterItem(Item item) {
		// Action result =
		// Dialogs.create().title("Item Selected").masthead("Do you want to remove this Item from your Character?").message("Selected Item: "+item.Name.get()).showConfirm();
		itemToRemove = item;
	}

	@FXML
	private void handleAddToCharacter(ActionEvent event) {
		if (itemToAdd != null) {
			switch (itemToAdd.getClass().toString()) {
			case "class pathfinder.data.Items.Weapon":
				obsChosenWeapons.add((Weapon) itemToAdd);
				break;

			case "class pathfinder.data.Items.Armor":
				obsChosenArmor.add((Armor) itemToAdd);
				break;

			case "class pathfinder.data.Items.Goods":
				obsChosenGoods.add((Goods) itemToAdd);
				break;

			default:
				break;
			}
			totalWeight = 0;
			
			for (Item i : obsChosenWeapons) {
				String[] weight = i.Weight.get().split(" ");
				totalWeight += Integer.parseInt(weight[0]);
				lblWeightValue.setText(totalWeight.toString());
				
				String[] cost = i.Cost.get().split(" ");
				goldRemaining -= Integer.parseInt(cost[0]);
				lblGoldRemainingValue.setText(goldRemaining.toString());
			}
			
			for (Item i : obsChosenArmor) {
				String[] weight = i.Weight.get().split(" ");
				totalWeight+= Integer.parseInt(weight[0]);
				lblWeightValue.setText(totalWeight.toString());
				
				String[] cost = i.Cost.get().split(" ");
				goldRemaining -= Integer.parseInt(cost[0]);
				lblGoldRemainingValue.setText(goldRemaining.toString());
			}
			
			for (Item i : obsChosenGoods) {
				String[] weight = i.Weight.get().split(" ");
				totalWeight+= Integer.parseInt(weight[0]);
				lblWeightValue.setText(totalWeight.toString());
				
				String[] cost = i.Cost.get().split(" ");
				goldRemaining -= Integer.parseInt(cost[0]);
				lblGoldRemainingValue.setText(goldRemaining.toString());
			}

			itemToAdd = null;
		}
	}

	@FXML
	private void handleRemoveFromCharacter(ActionEvent event) {
		if (itemToRemove != null) {
			
			String[] weight = itemToRemove.Weight.get().split(" ");
			totalWeight -= Integer.parseInt(weight[0]);			
			lblWeightValue.setText(totalWeight.toString());
			
			String[] cost = itemToRemove.Cost.get().split(" ");
			goldRemaining += Integer.parseInt(cost[0]);
			lblGoldRemainingValue.setText(goldRemaining.toString());
			
			
			switch (itemToRemove.getClass().toString()) {
			case "class pathfinder.data.Items.Weapon":
				obsChosenWeapons.remove((Weapon) itemToRemove);
				break;

			case "class pathfinder.data.Items.Armor":
				obsChosenArmor.remove((Armor) itemToRemove);
				break;

			case "class pathfinder.data.Items.Goods":
				obsChosenGoods.remove((Goods) itemToRemove);
				break;
			}
		}
	}

	@FXML
	private void handleRollStartingWealth() {
		int startingWealthD6 = getCharacter().getClasses()[0]
				.getStartingWealthD6();
		Random rnd = new Random();
		int min = startingWealthD6;
		int max = startingWealthD6 * 6;
		Integer startingWealth = (rnd.nextInt(max - min) + min) * 10;

		lblStartingWealthValue.setText(startingWealth.toString());
		lblGoldRemainingValue.setText(startingWealth.toString());
	}

	@Override
	public void getData() {

	}

}
