package view.objects;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import jefXif.io.Data;
import jefXif.view.RootLayoutController;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Character;
import view.RootController;

/**
 * @author Matthew
 *
 */
@SuppressWarnings("deprecation")
public class OtherCharacterRow {
	RootController rootController;
	@FXML
	Label characterName;
	File characterFile;
	@FXML
	Button loadButton;
	@FXML
	HBox rowContainer;
	
	public HBox getRow() {
		return this.rowContainer;
	}
	
	public OtherCharacterRow(String characterName, File characterFile, RootLayoutController root) {
		super();
		this.rootController = (RootController) root;
		this.characterName = new Label(characterName);
		this.characterName.getStyleClass().addAll("data-label","character-name-label");
		this.characterFile = characterFile;
		this.loadButton = new Button("Load");
		this.loadButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				try {
					rootController.setCharacter(Data.Read(characterFile.getPath(), Character.class));
					Dialogs.create().title("Character Loaded")
					.message(String.format("The Character:%s was successfully loaded!", characterName))
					.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showInformation();
				} catch (IOException e) {
					Dialogs.create().title("Character Failed to Load")
					.message("The Character couldn't be loaded")
					.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showInformation();
				}
			}
		});
		rowContainer = new HBox(10.0, this.characterName, loadButton);
		rowContainer.setPadding(new Insets(10, 0, 10, 10));
	}
		
}
