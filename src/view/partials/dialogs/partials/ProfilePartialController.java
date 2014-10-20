package view.partials.dialogs.partials;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import org.controlsfx.dialog.Dialog;
import org.controlsfx.dialog.Dialogs;

import pathfinder.data.Character.Alignment;
import pathfinder.data.Character.Alignments;
import view.partials.dialogs.SelectLanguagesDialogController;

import com.sun.javafx.scene.control.behavior.TextAreaBehavior;
import com.sun.javafx.scene.control.skin.TextAreaSkin;

@SuppressWarnings("deprecation")
public class ProfilePartialController extends NewCharacterPartialController {

	// region FXML fields
	@FXML
	TextField txtCharName;
	@FXML
	TextField txtCharHomeLand;
	@FXML
	TextArea txtaCharBackground;
	@FXML
	TextField txtCharDeities;
	@FXML
	Label lblLanguagesKnown;
	@FXML
	TextField txtCharAge;
	@FXML
	TextField txtCharHeight;
	@FXML
	TextField txtCharWeight;
	@FXML
	TextArea txtaCharAppearance;
	@FXML
	TextArea txtaCharPersonality;
	@FXML
	TextField txtCharGender;
	@FXML
	Button btnLanguages;

	// region Alignment Grid
	@FXML
	CheckBox cbLawfulGood;
	@FXML
	CheckBox cbNeutralGood;
	@FXML
	CheckBox cbChaoticGood;
	@FXML
	CheckBox cbLawfulNeutral;
	@FXML
	CheckBox cbTrueNeutral;
	@FXML
	CheckBox cbChaoticNeutral;
	@FXML
	CheckBox cbLawfulEvil;
	@FXML
	CheckBox cbNeutralEvil;
	@FXML
	CheckBox cbChaoticEvil;
	CheckBox[] alignments;

	// endregion
	// endregion

	SelectLanguagesDialogController languageSelection;
	
	@Override
	public void initialize() {
		alignments = new CheckBox[] { cbLawfulGood, cbNeutralGood, cbChaoticGood, cbLawfulNeutral, cbTrueNeutral, cbChaoticNeutral, cbLawfulEvil,
				cbNeutralEvil, cbChaoticEvil };
	}

	@FXML
	private void handleChecked(ActionEvent event) {
		CheckBox checkBox = (CheckBox) event.getSource();
		for (CheckBox cb : alignments) {
			if (!cb.equals(checkBox)) {
				cb.selectedProperty().set(false);
			}
		}
		getParentWindow().alignmentSelected = true;
	}

	@Override
	public void setData() {
		fixTextAreas();
		for (Alignment al : getCharacter().getClasses()[0].getRequireAlignments()) {
			for (int i = 0; i < alignments.length; i++) {
				if (Alignments.Any[i].equals(al)) {
					alignments[i].setDisable(false);
				}
			}
		}
		if (getCharacter().getIntelligence().getModifier().get() > 0) {
			lblLanguagesKnown.setText(String.format("You have %d languages to select", getCharacter().getIntelligence().getModifier().get()));
			btnLanguages.setDisable(false);
		}
		else {
			lblLanguagesKnown.setText(getCharacter().getRace().getLanguages()[0]);
			btnLanguages.setDisable(true);
		}
	}

	@Override
	public void getData() {
		getCharacter().setName(txtCharName.getText());
		HashMap<String, String> fluff = new HashMap<String, String>();
		Alignment alignment = null;
		for (int i = 0; i < alignments.length; i++) {
			if (alignments[i].selectedProperty().get()) {
				alignment = Alignments.Any[i];
			}
		}
		getCharacter().setAlignment(alignment);
		fluff.put("HomeLand", txtCharHomeLand.getText());
		fluff.put("Background", txtaCharBackground.getText());
		fluff.put("Deities", txtCharDeities.getText());
		fluff.put("Gender", txtCharGender.getText());
		fluff.put("Age", txtCharAge.getText());
		fluff.put("Height", txtCharHeight.getText());
		fluff.put("Weight", txtCharWeight.getText());
		fluff.put("Appearance", txtaCharAppearance.getText());
		fluff.put("Personality", txtaCharPersonality.getText());
		getCharacter().setFluff(fluff);
		getCharacter().setLanguages(languageSelection.getData());
	}
	
	@FXML
	private void handleGetLanguages(ActionEvent event) {
		// create an FXML Loader
		FXMLLoader loader = new FXMLLoader();

		// load the WeaponView
		loader.setLocation(SelectLanguagesDialogController.class.getResource("SelectLanguagesDialog.fxml"));
		AnchorPane page = null;
		try {
			page = (AnchorPane) loader.load();
		} catch (IOException e) {
			Dialogs.create().masthead(e.getMessage()).message(e.getStackTrace().toString())
			.styleClass(Dialog.STYLE_CLASS_UNDECORATED).showError();
		}

		Stage languageDialogStage = new Stage();
		languageDialogStage.setScene(new Scene(page));
		// show no boarders on the View
		languageDialogStage.initStyle(StageStyle.UNDECORATED);
		// make the dialog owner the main window
		if (getRoot() != null)
			languageDialogStage.initOwner(getRoot().getInterface().getPrimaryStage());
		else
			languageDialogStage.initOwner(getParentWindow().getInterface().getPrimaryStage());;
		// make sure its not a modal window
		languageDialogStage.initModality(Modality.WINDOW_MODAL);
		// set the WeapnView to the controller;
		languageSelection = loader.getController();
		// give the controller its stage
		languageSelection.setDialogStage(languageDialogStage);
		languageSelection.setInterface(getInterface());
		languageSelection.setNode(page);
		languageSelection.setRoot(getRoot());
		languageSelection.setData(getCharacter().getRace().getLanguages());
		languageSelection.getDialogStage().showAndWait();
	}

	private void fixTextAreas() {
		txtaCharAppearance.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.TAB) {
					TextAreaSkin skin = (TextAreaSkin) txtaCharAppearance.getSkin();
					if (skin.getBehavior() instanceof TextAreaBehavior) {
						TextAreaBehavior behavior = (TextAreaBehavior) skin.getBehavior();
						if (event.isControlDown()) {
							behavior.callAction("InsertTab");
						} else {
							behavior.callAction("TraverseNext");
						}
						event.consume();
					}

				}
			}
		});
		txtaCharBackground.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.TAB) {
					TextAreaSkin skin = (TextAreaSkin) txtaCharBackground.getSkin();
					if (skin.getBehavior() instanceof TextAreaBehavior) {
						TextAreaBehavior behavior = (TextAreaBehavior) skin.getBehavior();
						if (event.isControlDown()) {
							behavior.callAction("InsertTab");
						} else {
							behavior.callAction("TraverseNext");
						}
						event.consume();
					}

				}
			}
		});
		txtaCharPersonality.addEventFilter(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (event.getCode() == KeyCode.TAB) {
					TextAreaSkin skin = (TextAreaSkin) txtaCharPersonality.getSkin();
					if (skin.getBehavior() instanceof TextAreaBehavior) {
						TextAreaBehavior behavior = (TextAreaBehavior) skin.getBehavior();
						if (event.isControlDown()) {
							behavior.callAction("InsertTab");
						} else {
							behavior.callAction("TraverseNext");
						}
						event.consume();
					}

				}
			}
		});
	}

}
