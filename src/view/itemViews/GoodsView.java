package view.itemViews;

public class GoodsView extends ItemView {

	@Override
	public void show() {
		this.getDialogStage().show();
		this.itemCost.setText(item.Cost.get());
		this.itemName.setText(item.Name.get());
		this.itemType.setText("Good/Service");
		this.itemWeight.setText(item.Weight.get());
	}

	@Override
	public void initialize() {
		
	}

}
