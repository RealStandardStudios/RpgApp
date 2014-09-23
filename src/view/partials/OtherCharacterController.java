package view.partials;

import java.io.IOException;

import view.partials.dialogs.NewCharacterController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import jefXif.WindowController;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class OtherCharacterController extends WindowController {

	@FXML
	private void handleNewCharacterAction(ActionEvent event) {
		showNewChar();
	}
	
	@FXML
	private void showNewChar()
	{
		try
		{
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("dialogs/NewCharacterDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
	
	        // Create the dialog Stage.
	        Stage dialogStage = new Stage();
	        dialogStage.setTitle("Create New Character");
	        dialogStage.initModality(Modality.WINDOW_MODAL);
	        dialogStage.initOwner(this.getInterface().getPrimaryStage());
	        Scene scene = new Scene(page);
	        dialogStage.setScene(scene);
	
	        // Set the person into the controller.
	        NewCharacterController controller = loader.getController();
	        controller.setDialogStage(dialogStage);
	        controller.setInterface(getInterface());
	        controller.loadPartials();
	
	        // Show the dialog and wait until the user closes it
	        dialogStage.showAndWait();
		}
		catch(IOException e)
		{
	        e.printStackTrace();
		}
	}
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

}
