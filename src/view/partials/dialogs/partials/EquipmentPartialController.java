package view.partials.dialogs.partials;

import java.awt.MouseInfo;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Weapon;
import view.InventoryPartialController;
import view.itemViews.ItemView;

/**
 * Controller for the Equipment view
 * 
 * @author Real Standard Studios - Matthew Heehan, Joshua Boyd
 */
@SuppressWarnings("deprecation")
public class EquipmentPartialController extends NewCharacterPartialController {

	// region Items Available Table annotations

	// Weapons available table
	@FXML
	private TableView<Weapon> tableWeaponsAvailable;

	@FXML
	private TableColumn<Weapon, String> columnWeaponName;

	// Armor available table
	@FXML
	private TableView<Armor> tableArmorAvailable;

	@FXML
	private TableColumn<Armor, String> columnArmorName;

	// Goods available table
	@FXML
	private TableView<Goods> tableGoodsAvailable;

	@FXML
	private TableColumn<Goods, String> columnGoodsName;

	// endregion Items available

	@FXML
	Label lblWeightValue;
	@FXML
	AnchorPane inventoryPane;
	@FXML
	Accordion accItems;

	// region Labels and buttons
	@FXML
	Label lblStartingWealthValue;

	@FXML
	Button btnRollStartingWealth;

	@FXML
	Label lblGoldRemainingValue;

	@FXML
	Button btnAddItem;

	@FXML
	Button btnRemoveItem;

	// endregion

	InventoryPartialController inventoryPartial;

	Item itemToAdd;
	ItemView weaponView;
	ItemView armorView;
	ItemView goodsView;

	private ObservableList<Weapon> obsListWeapons = FXCollections.observableArrayList();

	private ObservableList<Armor> obsListArmor = FXCollections.observableArrayList();

	private ObservableList<Goods> obsListGoods = FXCollections.observableArrayList();

	double totalWeight = 0;
	double goldRemaining = 0;
	boolean havePressedGenerateGold = true;
	String classChosen = "";

	@Override
	public void initialize() {
		readItems();

		/**
		 * Initializes the class
		 */
		tableWeaponsAvailable.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> handleSelectedAvailableItem(newValue));
		tableArmorAvailable.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> handleSelectedAvailableItem(newValue));
		tableGoodsAvailable.getSelectionModel().selectedItemProperty()
				.addListener((observable, oldValue, newValue) -> handleSelectedAvailableItem(newValue));

		// region Available Items

		// Set observable list of weapons into the weapons table
		tableWeaponsAvailable.setItems(obsListWeapons);
		tableWeaponsAvailable.setRowFactory(tableView -> {
			final TableRow<Weapon> row = new TableRow<>();

			row.hoverProperty().addListener(
					(observable) -> {
						final Weapon weapon = row.getItem();
						if (row.isHover() && weapon != null) {
							weaponView.setItem(weapon);
							Point2D bound = row.localToScene(row.getLayoutX() + row.getWidth()
									+ weaponView.getDialogStage().getWidth(), 0);
							weaponView.getDialogStage().setX(bound.getX());
							weaponView.getDialogStage().setY(MouseInfo.getPointerInfo().getLocation().getY());

							weaponView.show();

							getParentWindow().getDialogStage().setFocused(true);
						}
					});

			return row;
		});
		columnWeaponName.setCellValueFactory(cellData -> cellData.getValue().Name);

		// Armor
		tableArmorAvailable.setItems(obsListArmor);
		tableArmorAvailable.setRowFactory(tableView -> {
			final TableRow<Armor> row = new TableRow<>();

			row.hoverProperty().addListener(
					(observable) -> {
						final Armor armor = row.getItem();
						if (row.isHover() && armor != null) {
							armorView.setItem(armor);
							armorView.getDialogStage().setX(
									row.getLayoutX() + row.getWidth() + armorView.getDialogStage().getWidth());
							armorView.getDialogStage().setY(MouseInfo.getPointerInfo().getLocation().getY());
							armorView.show();
						}
					});
			return row;
		});
		columnArmorName.setCellValueFactory(cellData -> cellData.getValue().Name);

		// Goods
		tableGoodsAvailable.setItems(obsListGoods);
		tableGoodsAvailable.setRowFactory(tableView -> {
			final TableRow<Goods> row = new TableRow<>();

			row.hoverProperty().addListener(
					(observable) -> {
						final Goods good = row.getItem();
						if (row.isHover() && good != null) {
							goodsView.setItem(good);
							goodsView.getDialogStage().setX(
									row.getLayoutX() + row.getWidth() + goodsView.getDialogStage().getWidth());
							goodsView.getDialogStage().setY(MouseInfo.getPointerInfo().getLocation().getY());
							goodsView.show();
						}
					});
			return row;
		});
		columnGoodsName.setCellValueFactory(cellData -> cellData.getValue().Name);

		// endregion

		lblStartingWealthValue.setText("Click");
		lblGoldRemainingValue.setText("Roll first");
	}

	@Override
	/**
	 * This is what you will use to set the data for this view if you need to take data from the character class
	 */
	public void setData() {
		inventoryPartial.setupScreen();

		lblWeightValue.setText(totalWeight + "");
		if (getCharacter().getClasses()[0].getName() != classChosen) {
			btnRollStartingWealth.setDisable(false);
			classChosen = getCharacter().getClasses()[0].getName();
			inventoryPartial.getItems().clear();
		}

		this.armorView = inventoryPartial.getArmorView();
		this.weaponView = inventoryPartial.getWeaponView();
		this.goodsView = inventoryPartial.getGoodsView();
	}

	private void loadInventory() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(InventoryPartialController.class.getResource("InventoryPartial.fxml"));

		/**
		 * loads the Inventory partial
		 * 
		 * @throws IOException
		 */
		AnchorPane pane = loader.load();
		inventoryPartial = loader.getController();
		inventoryPartial.setNode(pane);
		inventoryPartial.setInterface(getInterface());
		inventoryPartial.setParentWindow(this);
		inventoryPartial.setRoot(getRoot());

		inventoryPane.getChildren().add((AnchorPane) inventoryPartial.getNode());
	}

	void readItems() {
		File weaponsFile = new File(DataFile + "\\Weapons.idf");
		File armorFile = new File(DataFile + "\\Armors.idf");
		File goodsFile = new File(DataFile + "\\GoodsAndServices.idf");
		try {
			obsListWeapons = FXCollections.observableArrayList(readDataFile(weaponsFile, Weapon.class));
			obsListArmor = FXCollections.observableArrayList(readDataFile(armorFile, Armor.class));
			obsListGoods = FXCollections.observableArrayList(readDataFile(goodsFile, Goods.class));
			loadInventory();
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the one of the Equipment Files properly")
					.message(e.getMessage()).styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
			e.printStackTrace();
		}
	}

	/**
	 * handler for the Item Selection for the Available Items Table
	 * 
	 * @param item
	 */
	private void handleSelectedAvailableItem(Item item) {
		itemToAdd = item;
	}

	@FXML
	private void handleMouseExited() {
		weaponView.getDialogStage().close();
		armorView.getDialogStage().close();
		goodsView.getDialogStage().close();
	}

	/**
	 * handler for the Add To Character event
	 * 
	 * @param event
	 */
	@FXML
	private void handleAddToCharacter(ActionEvent event) {

		if (itemToAdd != null && getCharacter().getClasses()[0].getName() == classChosen) {
			String[] cost;
			double priceCheck = 0;
			String[] weight;

			cost = itemToAdd.Cost.get().split(" ");

			if (cost[1].equals("gp")) {
				String[] over1000 = cost[0].split(",");
				String price = "";

				for (String string : over1000) {
					price += string;
				}
				priceCheck = goldRemaining - Integer.parseInt(price);
			}
			// deals with the cost when it's gp's

			else if (cost[1].equals("sp")) {
				double price = Integer.parseInt(cost[0]) / 10.0;
				priceCheck = goldRemaining - price;
				priceCheck = priceCheck * 100;
				priceCheck = Math.round(priceCheck);
				priceCheck = priceCheck / 100;
			}
			// deals with the cost when it's sp's

			else {
				double price = Integer.parseInt(cost[0]) / 100.0;
				priceCheck = goldRemaining - price;
				priceCheck = priceCheck * 100;
				priceCheck = Math.round(priceCheck);
				priceCheck = priceCheck / 100;
			}
			// defaults to cost being cp

			if (priceCheck >= 0) {
				// if the cost of the item takes your money into deficit, don't
				// buy the item

				goldRemaining = priceCheck;
				lblGoldRemainingValue.setText(goldRemaining + "");

				weight = itemToAdd.Weight.get().split(" ");
				if (weight[0].equals("1/2")) {
					totalWeight += 0.5;
					lblWeightValue.setText(totalWeight + "");
				} else if (weight[0].equals("-")) {
				} else {
					totalWeight += Integer.parseInt(weight[0]);
					lblWeightValue.setText(totalWeight + "");
				}
				inventoryPartial.addItem(itemToAdd);
			} else {
				Dialogs.create().masthead("The item you have selected is too expensive")
						.message(String.format("Cost:%s\nAvailable Gold:%.2f", itemToAdd.Cost.get(), goldRemaining))
						.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showWarning();
			}
		}
	}

	/**
	 * handler for the Remove From Character event
	 * 
	 * @param event
	 */
	@FXML
	private void handleRemoveFromCharacter(ActionEvent event) {
		if (inventoryPartial.getItemToRemove() != null && getCharacter().getClasses()[0].getName() == classChosen) {

			String[] weight = inventoryPartial.getItemToRemove().Weight.get().split(" ");
			weight = itemToAdd.Weight.get().split(" ");
			if (weight[0].equals("1/2")) {
				totalWeight -= 0.5;
				lblWeightValue.setText(totalWeight + "");
			} else {
				totalWeight -= Integer.parseInt(weight[0]);
				lblWeightValue.setText(totalWeight + "");
			}

			String[] cost = inventoryPartial.getItemToRemove().Cost.get().split(" ");
			double price = 0;

			if (cost[1].equals("gp")) {
				String[] over1000 = cost[0].split(",");
				String priceParts = "";
				for (String string : over1000) {
					priceParts += string;
				}
				price = Integer.parseInt(priceParts);
			} else if (cost[1].equals("sp")) {
				price = Integer.parseInt(cost[0]) / 10.0;
			} else {
				price = Integer.parseInt(cost[0]) / 100.0;
			}

			goldRemaining += price;
			goldRemaining = goldRemaining * 100;
			goldRemaining = Math.round(goldRemaining);
			goldRemaining = goldRemaining / 100;
			lblGoldRemainingValue.setText(goldRemaining + "");

			inventoryPartial.getItems().remove(inventoryPartial.getItemToRemove());
		}
	}

	/**
	 * handler for the Roll Starting Wealth event
	 */
	@FXML
	private void handleRollStartingWealth() {
		if (havePressedGenerateGold) {
			int startingWealthD6 = getCharacter().getClasses()[0].getStartingWealthD6();
			Random rnd = new Random();
			int min = startingWealthD6;
			int max = startingWealthD6 * 6;
			Integer startingWealth = (rnd.nextInt(max - min) + min) * 10;
			goldRemaining = startingWealth;

			lblStartingWealthValue.setText(startingWealth.toString());
			lblGoldRemainingValue.setText("" + goldRemaining);
			btnRollStartingWealth.setDisable(true);
		}
		accItems.setDisable(false);
	}

	/**
	 * sends the data form the view to the main controller for access elsewhere
	 */
	@Override
	public void getData() {
		// need to get the items on each label
		getCharacter().setInventory(inventoryPartial.getInventory(goldRemaining));
	}

}
