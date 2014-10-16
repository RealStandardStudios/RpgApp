package view.itemViews;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import jefXif.view.HoverDialog;
import pathfinder.data.Items.Item;

/**
 * The view for Items
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
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
	
	/**
	 * shows the view
	 */
	public abstract void show();
	
	/**
	 * handler for Close
	 */
	@FXML
	private void handleClose() {
		this.getDialogStage().close();
	}
}
