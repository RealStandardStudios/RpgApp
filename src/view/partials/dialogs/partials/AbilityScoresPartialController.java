package view.partials.dialogs.partials;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
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
	Label[] racialBonus;

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

	boolean totalsAdded;

	@Override
	public void initialize() {
		totalsAdded = false;
		racialBonus = new Label[]{lblRacialBonusStr,lblRacialBonusDex,lblRacialBonusCon,lblRacialBonusInt, lblRacialBonusWis, lblRacialBonusCha};
	}

	// region Set Labels

	void setStrLabels() {
		lblTotalStr.setText(""
				+ (getCharacter().getStrength().getValue() + Integer
						.parseInt(lblMiscStr.getText())));
		if (lblRacialBonusStr.getText() != "0")
			lblBaseStr.setText(""
					+ (getCharacter().getStrength().getValue() - Integer
							.parseInt(lblRacialBonusStr.getText())));
		else
			lblBaseStr.setText("" + getCharacter().getStrength().getValue());
		lblStrMod
				.setText("" + getCharacter().getStrength().getModifier().get());
	}

	void setDexLabels() {
		lblTotalDex.setText(""
				+ (getCharacter().getDexterity().getValue() + Integer
						.parseInt(lblMiscDex.getText())));
		if (lblRacialBonusDex.getText() != "0")
			lblBaseDex.setText(""
					+ (getCharacter().getDexterity().getValue() - Integer
							.parseInt(lblRacialBonusDex.getText())));
		else
			lblBaseDex.setText("" + getCharacter().getDexterity().getValue());
		lblDexMod.setText(""
				+ getCharacter().getDexterity().getModifier().get());
	}

	void setConLabels() {
		lblTotalCon.setText(""
				+ (getCharacter().getConstitution().getValue() + Integer
						.parseInt(lblMiscCon.getText())));
		if (lblRacialBonusCon.getText() != "0")
			lblBaseCon.setText(""
					+ (getCharacter().getConstitution().getValue() - Integer
							.parseInt(lblRacialBonusCon.getText())));
		else
			lblBaseCon
					.setText("" + getCharacter().getConstitution().getValue());
		lblConMod.setText(""
				+ getCharacter().getConstitution().getModifier().get());
	}

	void setIntLabels() {
		lblTotalInt.setText(""
				+ (getCharacter().getIntelligence().getValue() + Integer
						.parseInt(lblMiscInt.getText())));
		if (lblRacialBonusInt.getText() != "0")
			lblBaseInt.setText(""
					+ (getCharacter().getIntelligence().getValue() - Integer
							.parseInt(lblRacialBonusInt.getText())));
		else
			lblBaseInt
					.setText("" + getCharacter().getIntelligence().getValue());
		lblIntMod.setText(""
				+ getCharacter().getIntelligence().getModifier().get());
	}

	void setWisLabels() {
		lblTotalWis.setText(""
				+ (getCharacter().getWisdom().getValue() + Integer
						.parseInt(lblMiscWis.getText())));
		if (lblRacialBonusWis.getText() != "0")
			lblBaseWis.setText(""
					+ (getCharacter().getWisdom().getValue() - Integer
							.parseInt(lblRacialBonusWis.getText())));
		else
			lblBaseWis.setText("" + getCharacter().getWisdom().getValue());
		lblWisMod.setText("" + getCharacter().getWisdom().getModifier().get());
	}

	void setChaLabels() {
		lblTotalCha.setText(""
				+ (getCharacter().getCharisma().getValue() + Integer
						.parseInt(lblMiscCha.getText())));
		if (lblRacialBonusCha.getText() != "0")
			lblBaseCha.setText(""
					+ (getCharacter().getCharisma().getValue() - Integer
							.parseInt(lblRacialBonusCha.getText())));
		else
			lblBaseCha.setText("" + getCharacter().getCharisma().getValue());
		lblChaMod
				.setText("" + getCharacter().getCharisma().getModifier().get());
	}

	// endregion

	// region handle AbilityScores
	@FXML
	void handleStrIncrease() {
		if (getCharacter().getStrength().getValue() < 18) {
			getCharacter().getStrength().increaseValue();
			setStrLabels();
		}
	}

	@FXML
	void handleStrDecrease() {
		if (getCharacter().getStrength().getValue() > 3) {
			getCharacter().getStrength().decreaseValue();
			setStrLabels();
		}
	}

	@FXML
	void handleDexIncrease() {
		if (getCharacter().getDexterity().getValue() < 18) {
			getCharacter().getDexterity().increaseValue();
			setDexLabels();
		}
	}

	@FXML
	void handleDexDecrease() {
		if (getCharacter().getDexterity().getValue() > 3) {
			getCharacter().getDexterity().decreaseValue();
			setDexLabels();
		}
	}

	@FXML
	void handleConIncrease() {
		if (getCharacter().getConstitution().getValue() < 18) {
			getCharacter().getConstitution().increaseValue();
			setConLabels();
		}
	}

	@FXML
	void handleConDecrease() {
		if (getCharacter().getConstitution().getValue() > 3) {
			getCharacter().getConstitution().decreaseValue();
			setConLabels();
		}
	}

	@FXML
	void handleIntIncrease() {
		if (getCharacter().getIntelligence().getValue() < 18) {
			getCharacter().getIntelligence().increaseValue();
			setIntLabels();
		}
	}

	@FXML
	void handleIntDecrease() {
		if (getCharacter().getIntelligence().getValue() > 3) {
			getCharacter().getIntelligence().decreaseValue();
			setIntLabels();
		}
	}

	@FXML
	void handleWisIncrease() {
		if (getCharacter().getWisdom().getValue() < 18) {
			getCharacter().getWisdom().increaseValue();
			setWisLabels();
		}
	}

	@FXML
	void handleWisDecrease() {
		if (getCharacter().getWisdom().getValue() > 3) {
			getCharacter().getWisdom().decreaseValue();
			setWisLabels();
		}
	}

	@FXML
	void handleChaIncrease() {
		if (getCharacter().getCharisma().getValue() < 18) {
			getCharacter().getCharisma().increaseValue();
			setChaLabels();
		}
	}

	@FXML
	void handleChaDecrease() {
		if (getCharacter().getCharisma().getValue() > 3) {
			getCharacter().getCharisma().decreaseValue();
			setChaLabels();
		}
	}

	// endregion

	@Override
	public void setData() {
		if (firstRun) {
			firstRun = false;
			firstTimeRun();
		}
		setUpRacialBonus();
		setChaLabels();
		setConLabels();
		setDexLabels();
		setIntLabels();
		setStrLabels();
		setWisLabels();
	}

	void setUpRacialBonus() {
		if (!totalsAdded)
			for (Effect e : getCharacter().getEffects()) {
				// System.out.println(e.getClass().toString());
				if (e.getClass().toString()
						.equals("class pathfinder.data.Effects.AbilityEffect")) {
					switch (((AbilityEffect) e).getAbilityName()) {
					case Strength:
						lblRacialBonusStr.setText("" + e.getValue());
						getCharacter().getStrength().setValue(
								getCharacter().getStrength().getValue()
										+ e.getValue());
						setStrLabels();
						totalsAdded = true;
						break;

					case Constitution:
						lblRacialBonusCon.setText("" + e.getValue());
						getCharacter().getConstitution().setValue(
								getCharacter().getConstitution().getValue()
										+ e.getValue());
						setConLabels();
						totalsAdded = true;
						break;

					case Dexterity:
						lblRacialBonusDex.setText("" + e.getValue());
						getCharacter().getDexterity().setValue(
								getCharacter().getDexterity().getValue()
										+ e.getValue());
						setDexLabels();
						totalsAdded = true;
						break;

					case Charisma:
						lblRacialBonusCha.setText("" + e.getValue());
						getCharacter().getCharisma().setValue(
								getCharacter().getCharisma().getValue()
										+ e.getValue());
						setChaLabels();
						totalsAdded = true;
						break;

					case Intelligence:
						lblRacialBonusInt.setText("" + e.getValue());
						getCharacter().getIntelligence().setValue(
								getCharacter().getIntelligence().getValue()
										+ e.getValue());
						setIntLabels();
						totalsAdded = true;
						break;

					case Wisdom:
						lblRacialBonusWis.setText("" + e.getValue());
						getCharacter().getWisdom().setValue(
								getCharacter().getWisdom().getValue()
										+ e.getValue());
						setWisLabels();
						totalsAdded = true;
						break;

					default:
						break;
					}
				}
			}
	}

	public void firstTimeRun() {
		totalsAdded = false;
		getParentWindow().setAbilities();
		
		for (Label label : racialBonus) {
			label.setText("0");
		}

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
					.getModifier().get() + "");
		}
	}

}
