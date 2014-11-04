package view;

import java.awt.MouseInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import jefXif.view.WindowController;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Inventory;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Shield;
import pathfinder.data.Items.SlotType;
import pathfinder.data.Items.Weapon;
import view.itemViews.ArmorView;
import view.itemViews.ItemView;
import view.itemViews.WeaponView;
import view.objects.ItemSlot;

/**
 * This is a Controller for the Inventory of the App
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
@SuppressWarnings("deprecation")
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
	@FXML
	AnchorPane mainPane;
	@FXML
	ImageView imgMan;
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
			if (slot.getItem() instanceof Armor || slot.getItem() instanceof Shield)
				i.getArmorWorn().add((Armor) slot.getItem());
			else if (slot.getItem() instanceof Weapon)
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
			row.hoverProperty().addListener(
					(observable) -> {
						final Item item = row.getItem();
						if (row.isHover() && item != null) {
							double xLoc = row.getLayoutX() + row.getWidth() / 2 + weaponView.getDialogStage().getWidth(), yLoc = MouseInfo
									.getPointerInfo().getLocation().getY()
									- weaponView.getDialogStage().getHeight();
							if (item instanceof Weapon) {
								weaponView.setItem(item);
								weaponView.getDialogStage().setLayoutX(xLoc);
								weaponView.getDialogStage().setLayoutY(yLoc);
								weaponView.show();
								armorView.getDialogStage().setVisible(false);
								goodsView.getDialogStage().setVisible(false);
							} else if (item instanceof Armor) {
								armorView.setItem(item);
								armorView.getDialogStage().setLayoutX(xLoc);
								armorView.getDialogStage().setLayoutY(yLoc);
								armorView.show();
								// weaponView.getDialogStage().hide();
								// goodsView.getDialogStage().hide();
							} else {
								goodsView.setItem(item);
								goodsView.getDialogStage().setLayoutX(xLoc);
								goodsView.getDialogStage().setLayoutY(yLoc);
								goodsView.show();
								// armorView.getDialogStage().hide();
								// weaponView.getDialogStage().hide();
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
				if (row.getItem() instanceof Armor || row.getItem() instanceof Shield || row.getItem() instanceof Weapon) {
					itemMenu.getItems().add(equip);
					itemMenu.getItems().add(unequip);
					row.setContextMenu(itemMenu);
				}

				return row;
			});

		itemSlots = new HashMap<>();
		imgMan.setImage(new Image("file:resources/images/mannequin.png"));
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
		try {
			if (weaponView == null)
				readItemViews();
		} catch (IOException e) {
			Dialogs.create().masthead(e.getMessage()).message(e.getStackTrace().toString()).styleClass(Dialog.STYLE_CLASS_UNDECORATED).showError();
		}
		if (itemSlots.size() == 0) {
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
	}

	/**
	 * Handles selected character items
	 * 
	 * @param item
	 */
	private void handleSelectedCharacterItem(Item item) {
		itemToRemove = item;
	}

	private void moveAndShowItemView(ItemView itemView, String itemSlot) {
		itemView.setItem(itemSlots.get(itemSlot).getItem());
		if (itemView.getItem() != null) {
			itemView.getDialogStage().setLayoutX(
					itemSlots.get(itemSlot).getLabel().getLayoutX() + itemView.getDialogStage().getWidth()
							+ itemSlots.get(itemSlot).getLabel().getWidth() / 3);
			if (itemView.getDialogStage().getLayoutX() > mainPane.getWidth())
				itemView.getDialogStage().setLayoutX(
						itemSlots.get(itemSlot).getLabel().getLayoutX() - itemSlots.get(itemSlot).getLabel().getWidth());
			itemView.getDialogStage().setLayoutY(MouseInfo.getPointerInfo().getLocation().getY() - itemView.getDialogStage().getHeight());
			itemView.show();
		}
	}

	/**
	 * Shows anything related to the Head slot
	 */
	@FXML
	private void showHead() {
		moveAndShowItemView(this.armorView, "Head");
	}

	/**
	 * Shows anything attached to the Torso slot
	 */
	@FXML
	private void showTorso() {
		moveAndShowItemView(armorView, "Torso");
	}

	/**
	 * Shows anything attached to the Hands slot
	 */
	@FXML
	private void showHands() {
		moveAndShowItemView(armorView, "Hands");
	}

	/**
	 * Shows anything attached to the Right Ring slot
	 */
	@FXML
	private void showRightRing() {
		moveAndShowItemView(armorView, "RightRing");
	}

	/**
	 * Shows anything attached to the Left Ring slot
	 */
	@FXML
	private void showLeftRing() {
		moveAndShowItemView(armorView, "LeftRing");
	}

	/**
	 * Shows anything attached to the Waist slot
	 */
	@FXML
	private void showWaist() {
		moveAndShowItemView(armorView, "Waist");
	}

	/**
	 * Shows anything attached to the Legs slot
	 */
	@FXML
	private void showLegs() {
		moveAndShowItemView(armorView, "Legs");
	}

	/**
	 * Shows anything attached to the Feet slot
	 */
	@FXML
	private void showFeet() {
		moveAndShowItemView(armorView, "Feet");
	}

	/**
	 * Shows anything attached to the Weapon slot
	 */
	@FXML
	private void showWeapon() {
		moveAndShowItemView(weaponView, "Melee");
	}

	/**
	 * Shows anything attached to the Ranged Weapon slot
	 */
	@FXML
	private void showRangedWeapon() {
		moveAndShowItemView(weaponView, "Ranged");
	}

	/**
	 * Shows anything attached to the Shield slot
	 */
	@FXML
	private void showShield() {
		moveAndShowItemView(armorView, "Shield");
	}

	public ItemView getWeaponView() {
		return weaponView;
	}

	public ItemView getArmorView() {
		return armorView;
	}

	public ItemView getGoodsView() {
		return goodsView;
	}

	private void readItemViews() throws IOException {
		// create an FXML Loader
		FXMLLoader loader = new FXMLLoader();

		// load the WeaponView
		loader.setLocation(WeaponView.class.getResource("WeaponView.fxml"));
		AnchorPane page = (AnchorPane) loader.load();
		// add the WeaponView to the main pane
		mainPane.getChildren().add(page);
		// set the WeaponView to the controller;
		weaponView = loader.getController();
		// give the controller its stage
		weaponView.setDialogStage(page);
		weaponView.setInterface(getInterface());
		weaponView.setNode(page);
		weaponView.setRoot(getRoot());

		loader = new FXMLLoader();
		loader.setLocation(ArmorView.class.getResource("ArmorView.fxml"));
		page = (AnchorPane) loader.load();
		mainPane.getChildren().add(page);
		armorView = loader.getController();
		armorView.setDialogStage(page);
		armorView.setInterface(getInterface());
		armorView.setNode(page);
		armorView.setRoot(getRoot());

		loader = new FXMLLoader();
		loader.setLocation(ArmorView.class.getResource("GoodsView.fxml"));
		page = (AnchorPane) loader.load();
		mainPane.getChildren().add(page);
		goodsView = loader.getController();
		goodsView.setDialogStage(page);
		goodsView.setInterface(getInterface());
		goodsView.setNode(page);
		goodsView.setRoot(getRoot());
	}

	public void addItem(Item itemToAdd) {
		inventory.add(itemToAdd);
		equipItem(itemToAdd, itemToAdd.getSlotType().name());
	}

	@FXML
	private void handleMouseExited() {
		weaponView.getDialogStage().setVisible(false);
		armorView.getDialogStage().setVisible(false);
		goodsView.getDialogStage().setVisible(false);
	}

	public void equipItem(Item itemToAdd, String slot) {
		// need to figure out how to get the row for the item in the table and
		// apply equipped
		if (itemSlots.get(slot) != null && itemSlots.get(slot).getItem() == null) {
			itemSlots.get(slot).setItem(itemToAdd);
			itemSlots.get(slot).getLabel().setDisable(false);
		}
	}
}
