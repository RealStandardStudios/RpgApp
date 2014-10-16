package view.partials;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Character;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Weapon;
import view.InventoryPartialController;
import view.RootController;
import view.itemViews.ArmorView;
import view.itemViews.GoodsView;
import view.itemViews.WeaponView;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
@SuppressWarnings("deprecation")
public class InventoryController extends MainWindowController {
	// region load and lift Labels
	@FXML
	Label lblTotalWeight;
	@FXML
	Label lblLightLoad;
	@FXML
	Label lblMediumLoad;
	@FXML
	Label lblHeavyLoad;
	@FXML
	Label lblLiftHead;
	@FXML
	Label lblLiftGround;
	@FXML
	Label lblPush;
	// endregion

	// region gold labels
	@FXML
	Label lblPlatnum;
	@FXML
	Label lblGold;
	@FXML
	Label lblSilver;
	@FXML
	Label lblCopper;
	// endregion

	@FXML
	AnchorPane apEquipment;

	InventoryPartialController inventoryPartial;

	@Override
	public void initialize() {

	}

	private void readItemViews() throws IOException {
		// create an FXML Loader
		FXMLLoader loader = new FXMLLoader();

		// Create all the views
		WeaponView weaponView;
		ArmorView armorView;
		GoodsView goodsView;

		// load the WeaponView
		loader.setLocation(WeaponView.class.getResource("WeaponView.fxml"));
		AnchorPane page = (AnchorPane) loader.load();

		Stage weaponViewStage = new Stage();
		weaponViewStage.setScene(new Scene(page));
		// show no boarders on the WeaponView
		weaponViewStage.initStyle(StageStyle.UNDECORATED);
		// make the dialog owner the main window
		weaponViewStage.initOwner(getRoot().getInterface().getPrimaryStage());
		// make it slightly transparent
		weaponViewStage.setOpacity(0.9);
		// make sure its not a modal window
		weaponViewStage.initModality(Modality.NONE);
		// set the WeapnView to the controller;
		weaponView = loader.getController();
		// give the controller its stage
		weaponView.setDialogStage(weaponViewStage);

		loader = new FXMLLoader();
		loader.setLocation(ArmorView.class.getResource("ArmorView.fxml"));
		page = (AnchorPane) loader.load();

		Stage armorViewStage = new Stage();
		armorViewStage.setScene(new Scene(page));
		armorViewStage.initStyle(StageStyle.UNDECORATED);
		// armorViewStage.setAlwaysOnTop(true);
		armorViewStage.initOwner(getRoot().getInterface().getPrimaryStage());
		armorViewStage.setOpacity(0.9);
		armorViewStage.initModality(Modality.NONE);
		armorView = loader.getController();
		armorView.setDialogStage(armorViewStage);

		loader = new FXMLLoader();
		loader.setLocation(ArmorView.class.getResource("GoodsView.fxml"));
		page = (AnchorPane) loader.load();

		Stage goodsViewStage = new Stage();
		goodsViewStage.setScene(new Scene(page));
		goodsViewStage.initStyle(StageStyle.UNDECORATED);
		// goodsViewStage.setAlwaysOnTop(true);
		goodsViewStage.initOwner(getRoot().getInterface().getPrimaryStage());
		goodsViewStage.setOpacity(0.9);
		goodsViewStage.initModality(Modality.NONE);
		goodsView = loader.getController();
		goodsView.setDialogStage(armorViewStage);

		// set all the ItemViews
		inventoryPartial.setArmorView(armorView);
		inventoryPartial.setWeaponView(weaponView);
		inventoryPartial.setGoodsView(goodsView);
	}

	/**
	 * loads the Inventory partial
	 * 
	 * @throws IOException
	 */
	private void loadInventory() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(InventoryPartialController.class.getResource("InventoryPartial.fxml"));

		AnchorPane pane = loader.load();
		inventoryPartial = loader.getController();
		inventoryPartial.setNode(pane);
		inventoryPartial.setInterface(getInterface());
		inventoryPartial.setParentWindow(this);
		inventoryPartial.setRoot(getRoot());

		apEquipment.getChildren().setAll((AnchorPane) inventoryPartial.getNode());
	}

	@Override
	public void setData() {
		try {
			loadInventory();
			readItemViews();
			inventoryPartial.setupScreen();
		} catch (IOException e) {
			Dialogs.create().masthead(e.getMessage()).message(e.getStackTrace().toString()).styleClass(Dialog.STYLE_CLASS_UNDECORATED).showError();
		}
		Character character = ((RootController) getRoot()).getCharacter();
		inventoryPartial.getItems().setAll(character.getInventory().getArmor());
		inventoryPartial.getItems().addAll(character.getInventory().getWeapons());
		inventoryPartial.getItems().addAll(character.getInventory().getGoods());
		double weight = 0.0;
		for (Armor a : character.getInventory().getArmorWorn()) {
			inventoryPartial.equipItem(a, a.getSlotType().name());
		}
		for (Weapon w : character.getInventory().getWeaponEquipped()) {
			inventoryPartial.equipItem(w, w.getSlotType().name());
		}
		for (Weapon w : character.getInventory().getWeapons()) {
			weight += convertWeightString(w.Weight.get());
		}
		for (Armor a : character.getInventory().getArmor()) {
			weight += convertWeightString(a.Weight.get());
		}
		for (Item i : character.getInventory().getGoods()) {
			weight += convertWeightString(i.Weight.get());
		}
		lblTotalWeight.setText("" + weight);
		// need to split this into its components
		lblGold.setText("" + character.getInventory().getCharacterGold());
	}

	private double convertWeightString(String string) {
		String[] parts = string.split(" ");
		if (parts[0].equals("1/2")) {
			return 0.5;
		} else if (parts[0].equals("-"));
		return Double.parseDouble(parts[0]);
	}
}
