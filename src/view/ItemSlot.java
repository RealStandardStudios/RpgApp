package view;

import javafx.scene.control.Label;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.SlotType;

/**
 * This is a base class for a single Item Slot
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class ItemSlot {
	private Label label;
	private Item item;
	private SlotType slot;
	
	/**
	 * simple get method for slot
	 * 
	 * @returns a SlotType
	 */
	public SlotType getSlot() {
		return slot;
	}
	
	/**
	 * simple get method for label
	 * 
	 * @returns a Label
	 */
	public Label getLabel() {
		return label;
	}

	/**
	 * simple get method for itemn
	 * 
	 * @returns an Item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * simple set method
	 * 
	 * @param item
	 */
	public void setItem(Item item) {
		this.item = item;
		if(this.item!=null)
			label.setText(this.item.Name.get());
		else
			label.setText(this.slot.name());
	}

	/**
	 * simple set method
	 * 
	 * @param label
	 * @param type
	 */
	public ItemSlot(Label label, SlotType type) {
		this.label = label;
		this.slot = type;
		setItem(null);
	}
}
