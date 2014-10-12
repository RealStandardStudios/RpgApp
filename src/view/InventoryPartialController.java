/**
 * 
 */
package view;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import jefXif.view.WindowController;
import pathfinder.data.Character.Inventory;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Shield;
import pathfinder.data.Items.SlotType;
import pathfinder.data.Items.Weapon;
import view.itemViews.ItemView;

/**
 * @author Matthew
 *
 */
public class InventoryPartialController extends WindowController {

	@FXML
	TableView<Item> tableInventory;
	@FXML
	TableColumn<Item, String> colName;
	@FXML
	Label lblWeightValue;
	@FXML
	Label lblHead;
	@FXML
	Label lblTorso;
	@FXML
	Label lblHands;
	@FXML
	Label lblRightRing;
	@FXML
	Label lblLeftRing;
	@FXML
	Label lblWaist;
	@FXML
	Label lblLegs;
	@FXML
	Label lblFeet;
	@FXML
	Label lblWeapon;
	@FXML
	Label lblRangedWeapon;
	@FXML
	Label lblShield;

	HashMap<String, ItemSlot> itemSlots;

	ItemView weaponView;
	ItemView armorView;
	ItemView goodsView;
	Item itemToRemove;

	public Item getItemToRemove() {
		return this.itemToRemove;
	}

	private ObservableList<Item> inventory = FXCollections
			.observableArrayList();
	
	public ObservableList<Item> getItems() {
		return this.inventory;
	}

	public Inventory getInventory(double money) {
		ArrayList<Weapon> weapons = new ArrayList<>();
		ArrayList<Armor> armor = new ArrayList<>();
		ArrayList<Goods> goods = new ArrayList<>();
		for (Item item : inventory) {
			if (item.getClass().isInstance(Weapon.class))
				weapons.add((Weapon) item);
			if (item.getClass().isInstance(Armor.class)
					|| item.getClass().isInstance(Shield.class))
				armor.add((Armor) item);
			if (item.getClass().isInstance(Goods.class))
				goods.add((Goods) item);
		}
		return new Inventory(FXCollections.observableArrayList(weapons),
				FXCollections.observableArrayList(armor),
				FXCollections.observableArrayList(goods), money);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see jefXif.view.WindowController#initialize()
	 */
	@Override
	public void initialize() {
		// make the list view look at the right list
		tableInventory.setItems(inventory);
		// set the on selection options for the list
		tableInventory
				.getSelectionModel()
				.selectedItemProperty()
				.addListener(
						(observable, oldValue, newValue) -> handleSelectedCharacterItem(newValue));
		colName.setCellValueFactory(cellData -> cellData.getValue().Name);
		// deal with each cell of the list
		tableInventory.setRowFactory(tableRow -> {
			final TableRow<Item> row = new TableRow<>();
			// create a context menu for the cell
				ContextMenu itemMenu = new ContextMenu();
				// create the equip option for the menu
				MenuItem equip = new MenuItem("Equip Item");
				equip.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						String[] classParts = row.getItem().getClass()
								.toString().split("\\.");
						String caseString = classParts[classParts.length - 1];
						switch (caseString) {
						case "Weapon":
							if (itemSlots.get(caseString) != null) {
								// inventory.add(itemSlots.get(caseString).getItem());
								itemSlots.get(caseString)
										.setItem(row.getItem());
								row.getStyleClass().add("equipped");
								// inventory.remove(row.getItem());
							} else {
								itemSlots.get(caseString)
										.setItem(row.getItem());
								row.getStyleClass().add("equipped");
							}
							System.out.println(row.getItem().Name.get()
									+ " Successfully added to the Weapon slot");
							break;
						default:
							System.out.println(row.getItem().getClass()
									.toString());
							break;
						}
					}

				});

				itemMenu.getItems().add(equip);

				row.setContextMenu(itemMenu);
				return row;
			});

		itemSlots = new HashMap<>();
	}

	public void setupScreen() {
		itemSlots.put("Head", new ItemSlot(lblHead, SlotType.Head));
		itemSlots.put("Torso", new ItemSlot(lblTorso, SlotType.Torso));
		itemSlots.put("Hands", new ItemSlot(lblHands, SlotType.Hands));
		itemSlots.put("RightRing", new ItemSlot(lblRightRing, SlotType.Ring));
		itemSlots.put("LeftRing", new ItemSlot(lblLeftRing, SlotType.Ring));
		itemSlots.put("Waist", new ItemSlot(lblWaist, SlotType.Waist));
		itemSlots.put("Legs", new ItemSlot(lblLegs, SlotType.Legs));
		itemSlots.put("Feet", new ItemSlot(lblFeet, SlotType.Feet));
		itemSlots.put("Weapon", new ItemSlot(lblWeapon, SlotType.Weapon));
		itemSlots.put("Ranged", new ItemSlot(lblRangedWeapon,
				SlotType.RangedWeapon));
		itemSlots.put("Shield", new ItemSlot(lblShield, SlotType.Shield));
	}

	private void handleSelectedCharacterItem(Item item) {
		itemToRemove = item;
	}

	public Labeled getWeightLabel() {
		return this.lblWeightValue;
	}

	@FXML
	private void showHead() {
		armorView.setItem(itemSlots.get("Head").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showTorso() {
		armorView.setItem(itemSlots.get("Torso").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showHands() {
		armorView.setItem(itemSlots.get("Hands").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showRightRing() {
		armorView.setItem(itemSlots.get("RightRing").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showLeftRing() {
		armorView.setItem(itemSlots.get("LeftRing").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showWaist() {
		armorView.setItem(itemSlots.get("Waist").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showLegs() {
		armorView.setItem(itemSlots.get("Legs").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showFeet() {
		armorView.setItem(itemSlots.get("Feet").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	@FXML
	private void showWeapon() {
		weaponView.setItem(itemSlots.get("Weapon").getItem());
		weaponView.getDialogStage().setX(0);
		weaponView.getDialogStage().setY(0);
		if (weaponView.getItem() != null)
			weaponView.show();
	}

	@FXML
	private void showRangedWeapon() {
		weaponView.setItem(itemSlots.get("Ranged").getItem());
		weaponView.getDialogStage().setX(0);
		weaponView.getDialogStage().setY(0);
		if (weaponView.getItem() != null)
			weaponView.show();
	}

	@FXML
	private void showShield() {
		armorView.setItem(itemSlots.get("Shield").getItem());
		armorView.getDialogStage().setX(0);
		armorView.getDialogStage().setY(0);
		if (armorView.getItem() != null)
			armorView.show();
	}

	public void setWeaponView(ItemView weaponView) {
		this.weaponView = weaponView;
	}

	public void setArmorView(ItemView armorView) {
		this.armorView = armorView;
	}

	public void setGoodsView(ItemView goodsView) {
		this.goodsView = goodsView;
	}
}
