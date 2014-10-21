package view.partials;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import jefXif.view.DialogController;

import org.controlsfx.dialog.Dialogs;

@SuppressWarnings("deprecation")
public class AddExpController extends DialogController  {

	@FXML
	TextField lblExpToAdd;
	
	pathfinder.data.Character.Character character;
	CharacterProfileController parentController;
	
	@FXML
	public void handleAddExp()
	{
		if(!lblExpToAdd.getText().equals(""))
		{
			try
			{
				int expToAdd = Integer.parseInt(lblExpToAdd.getText());
				character.setExp(character.getExperienceValue()  + expToAdd);
				lblExpToAdd.setText("Added Exp To Character");
			}
			catch(Exception e)
			{
				Dialogs.create().masthead("Input Error").masthead("Number Conversion Error").message(e.getMessage())
				.styleClass("Please enter a number with no spaces").showWarning();
			}
		}
	}
	
	@FXML
	public void handleCancel(ActionEvent event) {
		parentController.updateExp();
		this.getDialogStage().close();
	}

	@Override
	public void handleOkay(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

	public void loadPartials(pathfinder.data.Character.Character character, CharacterProfileController parentController)
	{
		this.parentController = parentController;
		this.character = character;
	}
}
