package view.partials;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import jefXif.io.Data;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Character;
import rpg.application;
import view.RootController;
import view.partials.dialogs.NewCharacterController;

/**
 * The Controller for the Other Characters
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
@SuppressWarnings("deprecation")
public class OtherCharacterController extends MainWindowController {

	/**
	 * handler for the NewCharacter event
	 * 
	 * @param event
	 */
	@FXML
	private void handleNewCharacterAction(ActionEvent event) {
		showNewChar();
	}

	/**
	 * handler for the Load Character event
	 * 
	 * @param event
	 * @throws IOException
	 */
	@FXML
	private void handleLoadChatacterAction(ActionEvent event) throws IOException {
		FileChooser fileChooser = new FileChooser();

		// Set extension filter
		FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("CDF files (*.cdf)", "*.cdf");
		fileChooser.getExtensionFilters().add(extFilter);
		File chosenFile = new File(application.class.getResource("../").getPath()+"../characters");
		fileChooser.setInitialDirectory(chosenFile);

		// Show open file dialog
		File file = fileChooser.showOpenDialog(getInterface().getPrimaryStage());

		if (file != null) {
			((RootController) getRoot()).setCharacter(Data.Read(file.getPath(), Character.class));
			Dialogs.create().title("Character Loaded")
					.message(String.format("The Character:%s was successfully loaded!", ((RootController) getRoot()).getCharacter().getName()))
					.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showInformation();
		}
	}

	/**
	 * displays the new character views
	 */
	@FXML
	private void showNewChar() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("dialogs/NewCharacterDialog.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

			// Create the dialog Stage.
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Create New Character");
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.initStyle(StageStyle.UTILITY);
			dialogStage.initOwner(this.getInterface().getPrimaryStage());
			dialogStage.resizableProperty().set(false);
			Scene scene = new Scene(page);
			dialogStage.setScene(scene);

			// Set the person into the controller.
			NewCharacterController controller = loader.getController();
			controller.setDialogStage(dialogStage);
			controller.setInterface(getInterface());
			controller.loadPartials();
			dialogStage.onCloseRequestProperty().set(new EventHandler<WindowEvent>() {
				
				@Override
				public void handle(WindowEvent event) {
					controller.handleCancel(null);
				}
			});

			// Show the dialog and wait until the user closes it
			dialogStage.showAndWait();

			if (controller.getCharacter() != null)
				((RootController) this.getRoot()).setCharacter(controller.getCharacter());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData() {
		// TODO Auto-generated method stub

	}

}
