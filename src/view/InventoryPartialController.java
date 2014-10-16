package view;

import java.awt.MouseInfo;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
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
 * This is a Controller for the Inventory of the App
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class InventoryPartialController extends WindowController {
	// region FXML elements
	@FXML
	TableView<Item> tableInventory;
	@FXML
	TableColumn<Item, String> colName;
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
	// endregion

	HashMap<String, ItemSlot> itemSlots;

	ItemView weaponView;
	ItemView armorView;
	ItemView goodsView;
	Item itemToRemove;

	public Item getItemToRemove() {
		return this.itemToRemove;
	}

	private ObservableList<Item> inventory = FXCollections.observableArrayList();

	public ObservableList<Item> getItems() {
		return this.inventory;
	}

	/**
	 * Simple Get method for the itemToRemove data mamber
	 * 
	 * @returns an Item
	 */
	public Inventory getInventory(double money) {
		ArrayList<Weapon> weapons = new ArrayList<>();
		ArrayList<Armor> armor = new ArrayList<>();
		ArrayList<Goods> goods = new ArrayList<>();
		for (Item item : inventory) {
			if (item instanceof Weapon)
				weapons.add((Weapon) item);
			if (item instanceof Armor || item instanceof Shield)
				armor.add((Armor) item);
			if (item instanceof Goods)
				goods.add((Goods) item);
		}
		Inventory i = new Inventory(FXCollections.observableArrayList(weapons), FXCollections.observableArrayList(armor),
				FXCollections.observableArrayList(goods), money);
		for (ItemSlot slot : itemSlots.values()) {
			if (slot.getItem() instanceof Armor)
				i.getArmorWorn().add((Armor) slot.getItem());
			if (slot.getItem() instanceof Weapon)
				i.getWeaponEquipped().add((Weapon) slot.getItem());
		}
		return i;
	}

	@Override
	public void initialize() {
		// make the list view look at the right list
		tableInventory.setItems(inventory);
		// set the on selection options for the list
		tableInventory.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> handleSelectedCharacterItem(newValue));
		colName.setCellValueFactory(cellData -> cellData.getValue().Name);
		// deal with each cell of the list
		tableInventory.setRowFactory(tableRow -> {
			final TableRow<Item> row = new TableRow<>();

			/**
			 * Gets data from the ObservableList inventory and populates
			 * individual ArrayLists based on item type.
			 * 
			 * @param money
			 * @returns an Inventory
			 */
			row.hoverProperty().addListener((observable) -> {
				final Item item = row.getItem();
				if (row.isHover() && item != null) {
					Point2D bound = row.localToScene(row.getLayoutX() + row.getWidth() + weaponView.getDialogStage().getWidth(), 0);
					double xLoc = bound.getX(), yLoc = MouseInfo.getPointerInfo().getLocation().getY();
					if (item instanceof Weapon) {
						weaponView.setItem(item);
						weaponView.getDialogStage().setX(xLoc);
						weaponView.getDialogStage().setY(yLoc);
						weaponView.show();
						armorView.getDialogStage().close();
						goodsView.getDialogStage().close();
					} else if (item instanceof Armor) {
						armorView.setItem(item);
						armorView.getDialogStage().setX(xLoc);
						armorView.getDialogStage().setY(yLoc);
						armorView.show();
						weaponView.getDialogStage().close();
						goodsView.getDialogStage().close();
					} else {
						goodsView.setItem(item);
						goodsView.getDialogStage().setX(xLoc);
						goodsView.getDialogStage().setY(yLoc);
						goodsView.show();
						armorView.getDialogStage().close();
						weaponView.getDialogStage().close();
					}
				}
			});

			// create a context menu for the cell
				ContextMenu itemMenu = new ContextMenu();
				// create the equip option for the menu
				MenuItem equip = new MenuItem("Equip Item");
				equip.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						equipItem(row, row.getItem().getSlotType().name());
					}

				});

				// create the Unequip option for the menu
				MenuItem unequip = new MenuItem("Unequip Item");
				unequip.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						unequipItem(row, row.getItem().getSlotType().name());
						System.out.println(String.format("%s Successfully removed from %s slot", row.getItem().Name.get(), row.getItem()
								.getSlotType().name()));
					}
				});
				if (row.getItem() instanceof Armor || row.getItem() instanceof Weapon) {
					itemMenu.getItems().add(equip);
					itemMenu.getItems().add(unequip);
					row.setContextMenu(itemMenu);
				}

				return row;
			});

		itemSlots = new HashMap<>();
	}

	private void equipItem(final TableRow<Item> row, String caseString) {
		if (itemSlots.get(caseString) != null) {
			itemSlots.get(caseString).setItem(row.getItem());
			row.getStyleClass().add("equipped");
		}
	}

	private void unequipItem(TableRow<Item> row, String caseString) {
		if (itemSlots.get(caseString) != null) {
			itemSlots.get(caseString).setItem(null);
			row.getStyleClass().remove("equipped");
		}
	}

	/**
	 * Sets up things relevant to the inventory screen
	 */
	public void setupScreen() {
		itemSlots.put("Head", new ItemSlot(lblHead, SlotType.Head));
		itemSlots.put("Torso", new ItemSlot(lblTorso, SlotType.Torso));
		itemSlots.put("Hands", new ItemSlot(lblHands, SlotType.Hands));
		itemSlots.put("RightRing", new ItemSlot(lblRightRing, SlotType.Ring));
		itemSlots.put("LeftRing", new ItemSlot(lblLeftRing, SlotType.Ring));
		itemSlots.put("Waist", new ItemSlot(lblWaist, SlotType.Waist));
		itemSlots.put("Legs", new ItemSlot(lblLegs, SlotType.Legs));
		itemSlots.put("Feet", new ItemSlot(lblFeet, SlotType.Feet));
		itemSlots.put("Melee", new ItemSlot(lblWeapon, SlotType.Melee));
		itemSlots.put("Ranged", new ItemSlot(lblRangedWeapon, SlotType.Ranged));
		itemSlots.put("Shield", new ItemSlot(lblShield, SlotType.Shield));
	}

	/**
	 * Handles selected character items
	 * 
	 * @param item
	 */
	private void handleSelectedCharacterItem(Item item) {
		itemToRemove = item;
	}

	/**
	 * Shows anything related to the Head slot
	 */
	@FXML
	private void showHead() {
		armorView.setItem(itemSlots.get("Head").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Head").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Head").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Torso slot
	 */
	@FXML
	private void showTorso() {
		armorView.setItem(itemSlots.get("Torso").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Torso").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Torso").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Hands slot
	 */
	@FXML
	private void showHands() {
		armorView.setItem(itemSlots.get("Hands").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Hands").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Hands").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Right Ring slot
	 */
	@FXML
	private void showRightRing() {
		armorView.setItem(itemSlots.get("RightRing").getItem());
		armorView.getDialogStage().setX(itemSlots.get("RightRing").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("RightRing").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Left Ring slot
	 */
	@FXML
	private void showLeftRing() {
		armorView.setItem(itemSlots.get("LeftRing").getItem());
		armorView.getDialogStage().setX(itemSlots.get("LeftRing").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("LeftRing").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Waist slot
	 */
	@FXML
	private void showWaist() {
		armorView.setItem(itemSlots.get("Waist").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Waist").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Waist").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Legs slot
	 */
	@FXML
	private void showLegs() {
		armorView.setItem(itemSlots.get("Legs").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Legs").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Legs").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Feet slot
	 */
	@FXML
	private void showFeet() {
		armorView.setItem(itemSlots.get("Feet").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Feet").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Feet").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Shows anything attached to the Weapon slot
	 */
	@FXML
	private void showWeapon() {
		weaponView.setItem(itemSlots.get("Melee").getItem());
		Bounds screenBounds = itemSlots.get("Melee").getLabel().localToScene(itemSlots.get("Melee").getLabel().getBoundsInLocal());
		weaponView.getDialogStage().setX(screenBounds.getMaxX() + weaponView.getDialogStage().getWidth());
		weaponView.getDialogStage().setY(screenBounds.getMinY());
		if (weaponView.getItem() != null)
			weaponView.show();
	}

	/**
	 * Shows anything attached to the Ranged Weapon slot
	 */
	@FXML
	private void showRangedWeapon() {
		weaponView.setItem(itemSlots.get("Ranged").getItem());
		Bounds screenBounds = itemSlots.get("Ranged").getLabel().localToScene(itemSlots.get("Ranged").getLabel().getBoundsInLocal());
		weaponView.getDialogStage().setX(screenBounds.getMaxX() + weaponView.getDialogStage().getWidth());
		weaponView.getDialogStage().setY(screenBounds.getMinY());
		if (weaponView.getItem() != null)
			weaponView.show();
	}

	/**
	 * Shows anything attached to the Shield slot
	 */
	@FXML
	private void showShield() {
		armorView.setItem(itemSlots.get("Shield").getItem());
		armorView.getDialogStage().setX(itemSlots.get("Shield").getLabel().getLayoutX());
		armorView.getDialogStage().setY(itemSlots.get("Shield").getLabel().getLayoutY());
		if (armorView.getItem() != null)
			armorView.show();
	}

	/**
	 * Sets up the weapons view
	 * 
	 * @param weaponView
	 */
	public void setWeaponView(ItemView weaponView) {
		this.weaponView = weaponView;
	}

	/**
	 * Sets up the Armour view
	 * 
	 * @param armorView
	 */
	public void setArmorView(ItemView armorView) {
		this.armorView = armorView;
	}

	/**
	 * Sets up the goods view
	 * 
	 * @param goodsView
	 */
	public void setGoodsView(ItemView goodsView) {
		this.goodsView = goodsView;
	}

	public void addItem(Item itemToAdd) {
		inventory.add(itemToAdd);
		equipItem(itemToAdd, itemToAdd.getSlotType().name());
	}
	
	@FXML
	private void handleMouseExited() {
		weaponView.getDialogStage().close();
		armorView.getDialogStage().close();
		goodsView.getDialogStage().close();
	}

	public void equipItem(Item itemToAdd, String slot) {
		// need to figure out how to get the row for the item in the table and
		// apply equipped
		if (itemSlots.get(slot)!=null && itemSlots.get(slot).getItem() == null) {
			itemSlots.get(slot).setItem(itemToAdd);
		}
	}
}
