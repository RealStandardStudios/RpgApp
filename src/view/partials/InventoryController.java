package view.partials;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Character;
import pathfinder.data.Items.Armor;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.Weapon;
import view.InventoryPartialController;
import view.RootController;

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
		Character character = ((RootController) getRoot()).getCharacter();
		try {
			loadInventory();
			inventoryPartial.setupScreen();
			inventoryPartial.getItems().setAll(character.getInventory().getArmor());
			inventoryPartial.getItems().addAll(character.getInventory().getWeapons());
			inventoryPartial.getItems().addAll(character.getInventory().getGoods());
		} catch (IOException e) {
			Dialogs.create().masthead(e.getMessage()).message(e.getStackTrace().toString()).styleClass(Dialog.STYLE_CLASS_UNDECORATED).showError();
		}
		
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
