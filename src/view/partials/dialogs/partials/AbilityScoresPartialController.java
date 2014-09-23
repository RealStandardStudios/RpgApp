package view.partials.dialogs.partials;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Attributes.Ability;
import pathfinder.data.Attributes.AbilityName;
import pathfinder.data.Effects.AbilityEffect;
import pathfinder.data.Effects.Effect;

public class AbilityScoresPartialController extends
		NewCharacterPartialController {
	// region FXML labels
	@FXML
	Label lblBaseStr;
	@FXML
	Label lblBaseDex;
	@FXML
	Label lblBaseCon;
	@FXML
	Label lblBaseInt;
	@FXML
	Label lblBaseWis;
	@FXML
	Label lblBaseCha;

	@FXML
	Label lblTotalStr;
	@FXML
	Label lblTotalDex;
	@FXML
	Label lblTotalCon;
	@FXML
	Label lblTotalInt;
	@FXML
	Label lblTotalWis;
	@FXML
	Label lblTotalCha;

	@FXML
	Label lblStrMod;
	@FXML
	Label lblDexMod;
	@FXML
	Label lblConMod;
	@FXML
	Label lblIntMod;
	@FXML
	Label lblWisMod;
	@FXML
	Label lblChaMod;

	@FXML
	Label lblRacialBonusStr;
	@FXML
	Label lblRacialBonusDex;
	@FXML
	Label lblRacialBonusCon;
	@FXML
	Label lblRacialBonusInt;
	@FXML
	Label lblRacialBonusWis;
	@FXML
	Label lblRacialBonusCha;

	@FXML
	Label lblMiscStr;
	@FXML
	Label lblMiscDex;
	@FXML
	Label lblMiscCon;
	@FXML
	Label lblMiscInt;
	@FXML
	Label lblMiscWis;
	@FXML
	Label lblMiscCha;

	boolean firstRun = true;

	// endregion

	@Override
	public void initialize() {

	}

	// region Set Labels

	void setStrLabels() {
		lblTotalStr
				.setText(""
						+ (getCharacter().getStrength().getValue()
								+ Integer.parseInt(lblRacialBonusStr.getText()) + Integer
									.parseInt(lblMiscStr.getText())));
		lblBaseStr.setText("" + getCharacter().getStrength().getValue());
		lblStrMod.setText("" + getCharacter().getStrength().getModifier());
	}

	void setDexLabels() {
		lblTotalDex
				.setText(""
						+ (getCharacter().getDexterity().getValue()
								+ Integer.parseInt(lblRacialBonusDex.getText()) + Integer
									.parseInt(lblMiscDex.getText())));
		lblBaseDex.setText("" + getCharacter().getDexterity().getValue());
		lblDexMod.setText("" + getCharacter().getDexterity().getModifier());
	}

	void setConLabels() {
		lblTotalCon
				.setText(""
						+ (getCharacter().getConstitution().getValue()
								+ Integer.parseInt(lblRacialBonusCon.getText()) + Integer
									.parseInt(lblMiscCon.getText())));
		lblBaseCon.setText("" + getCharacter().getConstitution().getValue());
		lblConMod.setText("" + getCharacter().getConstitution().getModifier());
	}

	void setIntLabels() {
		lblTotalInt
				.setText(""
						+ (getCharacter().getIntelligence().getValue()
								+ Integer.parseInt(lblRacialBonusInt.getText()) + Integer
									.parseInt(lblMiscInt.getText())));
		lblBaseInt.setText("" + getCharacter().getIntelligence().getValue());
		lblIntMod.setText("" + getCharacter().getIntelligence().getModifier());
	}

	void setWisLabels() {
		lblTotalWis
				.setText(""
						+ (getCharacter().getWisdom().getValue()
								+ Integer.parseInt(lblRacialBonusWis.getText()) + Integer
									.parseInt(lblMiscWis.getText())));
		lblBaseWis.setText("" + getCharacter().getWisdom().getValue());
		lblWisMod.setText("" + getCharacter().getWisdom().getModifier());
	}

	void setChaLabels() {
		lblTotalCha
				.setText(""
						+ (getCharacter().getCharisma().getValue()
								+ Integer.parseInt(lblRacialBonusCha.getText()) + Integer
									.parseInt(lblMiscCha.getText())));
		lblBaseCha.setText("" + getCharacter().getCharisma().getValue());
		lblChaMod.setText("" + getCharacter().getCharisma().getModifier());
	}

	// endregion

	// region handle AbilityScores
	@FXML
	void handleStrIncrease() {
		getCharacter().getStrength().increaseValue();
		setStrLabels();
	}

	@FXML
	void handleStrDecrease() {
		getCharacter().getStrength().decreaseValue();
		setStrLabels();
	}

	@FXML
	void handleDexIncrease() {
		getCharacter().getDexterity().increaseValue();
		setDexLabels();
	}

	@FXML
	void handleDexDecrease() {
		getCharacter().getDexterity().decreaseValue();
		setDexLabels();
	}

	@FXML
	void handleConIncrease() {
		getCharacter().getConstitution().increaseValue();
		setConLabels();
	}

	@FXML
	void handleConDecrease() {
		getCharacter().getConstitution().decreaseValue();
		setConLabels();
	}

	@FXML
	void handleIntIncrease() {
		getCharacter().getIntelligence().increaseValue();
		setIntLabels();
	}

	@FXML
	void handleIntDecrease() {
		getCharacter().getIntelligence().decreaseValue();
		setIntLabels();
	}

	@FXML
	void handleWisIncrease() {
		getCharacter().getWisdom().increaseValue();
		setWisLabels();
	}

	@FXML
	void handleWisDecrease() {
		getCharacter().getWisdom().decreaseValue();
		setWisLabels();
	}

	@FXML
	void handleChaIncrease() {
		getCharacter().getCharisma().increaseValue();
		setChaLabels();
	}

	@FXML
	void handleChaDecrease() {
		getCharacter().getCharisma().decreaseValue();
		setChaLabels();
	}

	// endregion

	@Override
	public void setData() {
		if (firstRun) {
			firstRun = false;
			firstTimeRun();
		}
		setUpRacialBonus();

		// endregion
	}

	void setUpRacialBonus() {
		for (Effect e : getCharacter().getEffects()) {
			System.out.println(e.getClass().toString());
			if (e.getClass().toString() == "class pathfinder.data.Effects.AbilityEffect") {
				switch (((AbilityEffect) e).getAbilityName()) {
				case Strength:
					lblRacialBonusStr.setText("" + e.getValue());
					break;

				case Constitution:
					lblRacialBonusCon.setText("" + e.getValue());
					break;

				case Dexterity:
					lblRacialBonusDex.setText("" + e.getValue());
					break;

				case Charisma:
					lblRacialBonusCha.setText("" + e.getValue());
					break;

				case Intelligence:
					lblRacialBonusInt.setText("" + e.getValue());
					break;

				case Wisdom:
					lblRacialBonusWis.setText("" + e.getValue());
					break;

				default:
					break;
				}
			}
		}
	}

	void firstTimeRun() {
		getCharacter().setStrength(new Ability(AbilityName.Strength, 10));
		getCharacter().setDexterity(new Ability(AbilityName.Dexterity, 10));
		getCharacter().setConstitution(new Ability(AbilityName.Dexterity, 10));
		getCharacter().setIntelligence(
				new Ability(AbilityName.Intelligence, 10));
		getCharacter().setWisdom(new Ability(AbilityName.Wisdom, 10));
		getCharacter().setCharisma(new Ability(AbilityName.Charisma, 10));

		lblBaseStr.setText("" + getCharacter().getStrength().getValue());
		lblBaseDex.setText("" + getCharacter().getDexterity().getValue());
		lblBaseCon.setText("" + getCharacter().getConstitution().getValue());
		lblBaseInt.setText("" + getCharacter().getIntelligence().getValue());
		lblBaseWis.setText("" + getCharacter().getWisdom().getValue());
		lblBaseCha.setText("" + getCharacter().getCharisma().getValue());

		// region SetAbility Mod
		Label[] abilityModLabels = new Label[] { lblStrMod, lblDexMod,
				lblConMod, lblIntMod, lblWisMod, lblChaMod };
		int tempCount = 0;
		for (Label label : abilityModLabels) {
			label.setText(getCharacter().getAbilities()[tempCount]
					.getModifier() + "");
		}
	}

	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return null;
	}

}
