package view;

import javafx.scene.control.Label;
import pathfinder.data.Items.Item;
import pathfinder.data.Items.SlotType;

public class ItemSlot {
	private Label label;
	private Item item;
	private SlotType slot;
	
	public SlotType getSlot() {
		return slot;
	}
	
	public Label getLabel() {
		return label;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
		if(this.item!=null)
			label.setText(this.item.Name.get());
		else
			label.setText(this.slot.name());
	}

	public ItemSlot(Label label, SlotType type) {
		this.label = label;
		this.slot = type;
		setItem(null);
	}
}
