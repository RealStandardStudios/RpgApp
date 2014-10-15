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
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Goods;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Weapon;
import view.InventoryPartialController;
import view.itemViews.ArmorView;
import view.itemViews.ItemView;
import view.itemViews.WeaponView;

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
	AnchorPane inventoryPane;

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

			row.hoverProperty().addListener((observable) -> {
				final Weapon weapon = row.getItem();
				if (row.isHover() && weapon != null) {
					weaponView.setItem(weapon);
					Point2D bound = row.localToScene(row.getLayoutX() + row.getWidth() + weaponView.getDialogStage().getWidth(), 0);
					weaponView.getDialogStage().setX(bound.getX());
					weaponView.getDialogStage().setY(MouseInfo.getPointerInfo().getLocation().getY());
					weaponView.show();
				}
			});

			return row;
		});
		columnWeaponName.setCellValueFactory(cellData -> cellData.getValue().Name);

		// Armor
		tableArmorAvailable.setItems(obsListArmor);
		tableArmorAvailable.setRowFactory(tableView -> {
			final TableRow<Armor> row = new TableRow<>();

			row.hoverProperty().addListener((observable) -> {
				final Armor armor = row.getItem();
				if (row.isHover() && armor != null) {
					armorView.setItem(armor);
					armorView.getDialogStage().setX(row.getLayoutX() + row.getWidth() + armorView.getDialogStage().getWidth());
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

			row.hoverProperty().addListener((observable) -> {
				final Goods good = row.getItem();
				if (row.isHover() && good != null) {
					goodsView.setItem(good);
					goodsView.getDialogStage().setX(row.getLayoutX() + row.getWidth() + goodsView.getDialogStage().getWidth());
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

	private void readItemViews() throws IOException {
		// Load the fxml file and create a new stage for the popup dialog.
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(WeaponView.class.getResource("WeaponView.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

    /**
     * loads in all the Item views
     * 
     * @throws IOException
     */
		Stage weaponViewStage = new Stage();
		weaponViewStage.setScene(new Scene(page));
		weaponViewStage.initStyle(StageStyle.UNDECORATED);
		// weaponViewStage.setAlwaysOnTop(true);
		weaponViewStage.initOwner(getParentWindow().getDialogStage());
		weaponViewStage.setOpacity(0.9);
		weaponViewStage.initModality(Modality.NONE);
		weaponView = loader.getController();
		weaponView.setDialogStage(weaponViewStage);

		loader = new FXMLLoader();
		loader.setLocation(ArmorView.class.getResource("ArmorView.fxml"));
		page = (AnchorPane) loader.load();

		Stage armorViewStage = new Stage();
		armorViewStage.setScene(new Scene(page));
		armorViewStage.initStyle(StageStyle.UNDECORATED);
		// armorViewStage.setAlwaysOnTop(true);
		armorViewStage.initOwner(getParentWindow().getDialogStage());
		armorViewStage.setOpacity(0.9);
		armorViewStage.initModality(Modality.NONE);
		armorView = loader.getController();
		armorView.setDialogStage(armorViewStage);

		// loader = new FXMLLoader();
		// loader.setLocation(ArmorView.class.getResource("GoodsView.fxml"));
		// page = (AnchorPane) loader.load();
		//
		// Stage goodsViewStage = new Stage();
		// goodsViewStage.setScene(new Scene(page));
		// goodsViewStage.initStyle(StageStyle.UNDECORATED);
		// // goodsViewStage.setAlwaysOnTop(true);
		// goodsViewStage.initOwner(getParentWindow().getDialogStage());
		// goodsViewStage.setOpacity(0.9);
		// goodsViewStage.initModality(Modality.NONE);
		// goodsView = loader.getController();
		// goodsView.setDialogStage(armorViewStage);
	}

	@Override
	/**
	 * This is what you will use to set the data for this view if you need to take data from the character class
	 */
	public void setData() {
		inventoryPartial.setupScreen();
		inventoryPartial.getWeightLabel().setText(totalWeight + "");
		if (getCharacter().getClasses()[0].getName() != classChosen) {
			btnRollStartingWealth.setDisable(false);
			classChosen = getCharacter().getClasses()[0].getName();
			inventoryPartial.getItems().clear();
		}

		try {
			readItemViews();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inventoryPartial.setWeaponView(weaponView);
		inventoryPartial.setArmorView(armorView);
		inventoryPartial.setGoodsView(goodsView);
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
		File file = new File(this.getClass().getResource("").getPath() + programRoot + "PathfinderData/data");
		File weaponsFile = new File(file.getPath() + "\\Weapons.idf");
		File armorFile = new File(file.getPath() + "\\Armors.idf");
		File goodsFile = new File(file.getPath() + "\\GoodsAndServices.idf");
		try {
			obsListWeapons = FXCollections.observableArrayList(readDataFile(weaponsFile, Weapon.class));
			obsListArmor = FXCollections.observableArrayList(readDataFile(armorFile, Armor.class));
			obsListGoods = FXCollections.observableArrayList(readDataFile(goodsFile, Goods.class));
			loadInventory();
		} catch (Exception e) {
			Dialogs.create().masthead("Read Error").masthead("Couldn't read the one of the Equipment Files properly").message(e.getMessage())
					.showWarning();
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
					inventoryPartial.getWeightLabel().setText(totalWeight + "");
				} else if (weight[0].equals("-")) {
				} else {
					totalWeight += Integer.parseInt(weight[0]);
					inventoryPartial.getWeightLabel().setText(totalWeight + "");
				}

				inventoryPartial.getItems().add(itemToAdd);
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
				inventoryPartial.getWeightLabel().setText(totalWeight + "");
			} else {
				totalWeight -= Integer.parseInt(weight[0]);
				inventoryPartial.getWeightLabel().setText(totalWeight + "");
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
