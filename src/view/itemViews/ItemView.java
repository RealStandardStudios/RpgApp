package view.itemViews;

import pathfinder.data.Items.Item;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import jefXif.view.HoverDialog;

public abstract class ItemView extends HoverDialog {
	Item item;
	@FXML
	Label itemName;
	@FXML
	Label itemType;
	@FXML
	Label itemCost;
	@FXML
	Label itemWeight;
	@FXML
	ImageView itemImage;
	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	
	public abstract void show();
	
	@FXML
	private void handleClose() {
		this.getDialogStage().close();
	}
}
