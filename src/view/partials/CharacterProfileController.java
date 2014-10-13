package view.partials;

import view.RootController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author Real Standard Studios - Matthew Meehan
 *
 */
public class CharacterProfileController extends MainWindowController {
	
	@FXML
	Label lblName;
	@FXML
	Label lblRace;
	@FXML
	Label lblHomeland;
	@FXML
	Label lblBackground;
	@FXML
	Label lblGender;
	@FXML
	Label lblHeight;
	@FXML
	Label lblWeight;
	@FXML
	Label lblAge;
	@FXML
	Label lblApperance;
	@FXML
	Label lblPersonality;
	@FXML
	Label lblAlignment;
	@FXML
	Label lblDeity;
	@FXML
	Label lblLanguages;
	
	@Override
	public void initialize() {
		// TODO Auto-generated method stub

	}
	
	public void setData() {
		this.lblAge.setText(((RootController) getRoot()).getCharacter().getFluff().get("Age"));
		this.lblAlignment.setText(((RootController) getRoot()).getCharacter().getAlignment().name());
		this.lblApperance.setText(((RootController) getRoot()).getCharacter().getFluff().get("Apperance"));
		this.lblBackground.setText(((RootController) getRoot()).getCharacter().getFluff().get("Background"));
		this.lblDeity.setText(((RootController) getRoot()).getCharacter().getFluff().get("Deities"));
		this.lblGender.setText(((RootController) getRoot()).getCharacter().getFluff().get("Gender"));
		this.lblHeight.setText(((RootController) getRoot()).getCharacter().getFluff().get("Height"));
		this.lblHomeland.setText(((RootController) getRoot()).getCharacter().getFluff().get("HomeLand"));
		this.lblLanguages.setText("Lol I don't think languages work yet");
		this.lblName.setText(((RootController) getRoot()).getCharacter().getName());
		this.lblPersonality.setText(((RootController) getRoot()).getCharacter().getFluff().get("Personality"));
		this.lblRace.setText(((RootController) getRoot()).getCharacter().getRace().getName());
		this.lblWeight.setText(((RootController) getRoot()).getCharacter().getFluff().get("Weight"));
	}
}
