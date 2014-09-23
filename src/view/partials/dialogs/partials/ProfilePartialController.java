package view.partials.dialogs.partials;

import java.util.HashMap;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProfilePartialController extends NewCharacterPartialController {

	//region FXML fields
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
	//endregion
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setData() {
				
	}

	@Override
	public void getData() {
		getCharacter().setName(txtCharName.getText());
		HashMap<String,String> fluff = new HashMap<String,String>();
		fluff.put("HomeLand", txtCharHomeLand.getText());
		fluff.put("Background", txtaCharBackground.getText());
		fluff.put("Deities", txtCharDeities.getText());
		fluff.put("Age", txtCharAge.getText());
		fluff.put("Height", txtCharHeight.getText());
		fluff.put("Weight", txtCharWeight.getText());
		fluff.put("Appearance", txtaCharAppearance.getText());
		fluff.put("Personality", txtaCharPersonality.getText());
		getCharacter().setFluff(fluff);
	}

}
