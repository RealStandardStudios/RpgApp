package view.partials.dialogs.partials;

import java.util.HashMap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import pathfinder.data.Character.Alignment;
import pathfinder.data.Character.Alignments;

import com.sun.javafx.scene.control.behavior.TextAreaBehavior;
import com.sun.javafx.scene.control.skin.TextAreaSkin;

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

	@Override
	public void initialize() {
		alignments = new CheckBox[] { cbLawfulGood, cbNeutralGood,
				cbChaoticGood, cbLawfulNeutral, cbTrueNeutral,
				cbChaoticNeutral, cbLawfulEvil, cbNeutralEvil, cbChaoticEvil };
	}

	@FXML
	private void handleChecked(ActionEvent event) {
		CheckBox checkBox = (CheckBox) event.getSource();
		for (CheckBox cb : alignments) {
			if (!cb.equals(checkBox)) {
				cb.selectedProperty().set(false);
			}
		}
	}

	@Override
	public void setData() {
		fixTextAreas();
		for (Alignment al : getCharacter().getClasses()[0]
				.getRequireAlignments()) {
			for (int i = 0; i < alignments.length; i++) {
				if (Alignments.Any[i].equals(al)) {
					alignments[i].setDisable(false);
				}
			}
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
