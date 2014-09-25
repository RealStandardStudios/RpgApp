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
		lblStrMod.setText("" + getCharacter().getStrength().getModifier().get());
	}

	void setDexLabels() {
		lblTotalDex
				.setText(""
						+ (getCharacter().getDexterity().getValue()
								+ Integer.parseInt(lblRacialBonusDex.getText()) + Integer
									.parseInt(lblMiscDex.getText())));
		lblBaseDex.setText("" + getCharacter().getDexterity().getValue());
		lblDexMod.setText("" + getCharacter().getDexterity().getModifier().get());
	}

	void setConLabels() {
		lblTotalCon
				.setText(""
						+ (getCharacter().getConstitution().getValue()
								+ Integer.parseInt(lblRacialBonusCon.getText()) + Integer
									.parseInt(lblMiscCon.getText())));
		lblBaseCon.setText("" + getCharacter().getConstitution().getValue());
		lblConMod.setText("" + getCharacter().getConstitution().getModifier().get());
	}

	void setIntLabels() {
		lblTotalInt
				.setText(""
						+ (getCharacter().getIntelligence().getValue()
								+ Integer.parseInt(lblRacialBonusInt.getText()) + Integer
									.parseInt(lblMiscInt.getText())));
		lblBaseInt.setText("" + getCharacter().getIntelligence().getValue());
		lblIntMod.setText("" + getCharacter().getIntelligence().getModifier().get());
	}

	void setWisLabels() {
		lblTotalWis
				.setText(""
						+ (getCharacter().getWisdom().getValue()
								+ Integer.parseInt(lblRacialBonusWis.getText()) + Integer
									.parseInt(lblMiscWis.getText())));
		lblBaseWis.setText("" + getCharacter().getWisdom().getValue());
		lblWisMod.setText("" + getCharacter().getWisdom().getModifier().get());
	}

	void setChaLabels() {
		lblTotalCha
				.setText(""
						+ (getCharacter().getCharisma().getValue()
								+ Integer.parseInt(lblRacialBonusCha.getText()) + Integer
									.parseInt(lblMiscCha.getText())));
		lblBaseCha.setText("" + getCharacter().getCharisma().getValue());
		lblChaMod.setText("" + getCharacter().getCharisma().getModifier().get());
	}

	// endregion

	// region handle AbilityScores
	@FXML
	void handleStrIncrease() {
		if(getCharacter().getStrength().getValue() < 18)
		{
			getCharacter().getStrength().increaseValue();
			setStrLabels();
		}
	}

	@FXML
	void handleStrDecrease() {
		if(getCharacter().getStrength().getValue() > 3)
		{
			getCharacter().getStrength().decreaseValue();
			setStrLabels();
		}
	}

	@FXML
	void handleDexIncrease() {
		if(getCharacter().getDexterity().getValue() < 18)
		{
			getCharacter().getDexterity().increaseValue();
			setDexLabels();
		}
	}

	@FXML
	void handleDexDecrease() {
		if(getCharacter().getDexterity().getValue() > 3)
		{
			getCharacter().getDexterity().decreaseValue();
			setDexLabels();
		}
	}

	@FXML
	void handleConIncrease() {
		if(getCharacter().getConstitution().getValue() < 18)
		{
			getCharacter().getConstitution().increaseValue();
			setConLabels();
		}
	}

	@FXML
	void handleConDecrease() {
		if(getCharacter().getConstitution().getValue() > 3)
		{
			getCharacter().getConstitution().decreaseValue();
			setConLabels();
		}
	}

	@FXML
	void handleIntIncrease() {
		if(getCharacter().getIntelligence().getValue() < 18)
		{
			getCharacter().getIntelligence().increaseValue();
			setIntLabels();
		}
	}

	@FXML
	void handleIntDecrease() {
		if(getCharacter().getIntelligence().getValue() > 3)
		{
			getCharacter().getIntelligence().decreaseValue();
			setIntLabels();
		}
	}

	@FXML
	void handleWisIncrease() {
		if(getCharacter().getWisdom().getValue() < 18)
		{
			getCharacter().getWisdom().increaseValue();
			setWisLabels();
		}
	}

	@FXML
	void handleWisDecrease() {
		if(getCharacter().getWisdom().getValue() > 3)
		{
			getCharacter().getWisdom().decreaseValue();
			setWisLabels();
		}
	}

	@FXML
	void handleChaIncrease() {
		if(getCharacter().getCharisma().getValue() < 18)
		{
			getCharacter().getCharisma().increaseValue();
			setChaLabels();
		}
	}

	@FXML
	void handleChaDecrease() {
		if(getCharacter().getCharisma().getValue() > 3)
		{
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
		getCharacter().setStrength(new Ability(AbilityName.Strength, 8));
		getCharacter().setDexterity(new Ability(AbilityName.Dexterity, 8));
		getCharacter().setConstitution(new Ability(AbilityName.Dexterity, 8));
		getCharacter().setIntelligence(
				new Ability(AbilityName.Intelligence, 8));
		getCharacter().setWisdom(new Ability(AbilityName.Wisdom, 8));
		getCharacter().setCharisma(new Ability(AbilityName.Charisma, 8));

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
