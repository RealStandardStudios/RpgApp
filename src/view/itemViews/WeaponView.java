package view.itemViews;

public class WeaponView extends ItemView {

	@Override
	public void initialize() {
		
	}

	@Override
	public void show() {
		this.getDialogStage().show();
		this.itemName.setText(item.Name.get());
		this.itemType.setText("There is no item type?");
		this.itemCost.setText(item.Cost.get());
		this.itemWeight.setText(item.Weight.get());
	}
}
