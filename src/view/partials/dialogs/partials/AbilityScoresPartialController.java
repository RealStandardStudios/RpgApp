package view.partials.dialogs.partials;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pathfinder.data.Effects.AbilityEffect;
import pathfinder.data.Effects.Effect;

/**
 * The controller for the partial for Ability Scores
 * 
 * @author Real Standard Studios - Matthew Meehan, Joshua Boyd
 */
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

	/**
	 * the initialize method
	 */
	@Override
	public void initialize() {
		totalsAdded = false;
		racialBonus = new Label[]{lblRacialBonusStr,lblRacialBonusDex,lblRacialBonusCon,lblRacialBonusInt, lblRacialBonusWis, lblRacialBonusCha};
	}

	// region Set Labels

	void setStrLabels() {
		lblTotalStr.setText("" + getCharacter().getStrength().getTotalValue());	
		lblBaseStr.setText("" + getCharacter().getStrength().getBaseValue());
		lblStrMod.setText("" + getCharacter().getStrength().getModifier().get());
	}

	void setDexLabels() {
		lblTotalDex.setText("" + (getCharacter().getDexterity().getTotalValue()));
		lblBaseDex.setText("" + getCharacter().getDexterity().getBaseValue());
		lblDexMod.setText(""+ getCharacter().getDexterity().getModifier().get());
	}

	void setConLabels() {
		lblTotalCon.setText("" + (getCharacter().getConstitution().getTotalValue()));
		lblBaseCon.setText("" + getCharacter().getConstitution().getBaseValue());
		lblConMod.setText("" + getCharacter().getConstitution().getModifier().get());
	}

	void setIntLabels() {
		lblTotalInt.setText("" + (getCharacter().getIntelligence().getTotalValue()));
		lblBaseInt.setText("" + getCharacter().getIntelligence().getBaseValue());
		lblIntMod.setText("" + getCharacter().getIntelligence().getModifier().get());
	}

	void setWisLabels() {
		lblTotalWis.setText("" + (getCharacter().getWisdom().getTotalValue()));
		lblBaseWis.setText("" + getCharacter().getWisdom().getBaseValue());
		lblWisMod.setText("" + getCharacter().getWisdom().getModifier().get());
	}

	void setChaLabels() {
		lblTotalCha.setText("" + (getCharacter().getCharisma().getTotalValue()));
		lblBaseCha.setText("" + getCharacter().getCharisma().getBaseValue());
		lblChaMod.setText("" + getCharacter().getCharisma().getModifier().get());
	}

	// endregion

	// region handle AbilityScores
	@FXML
	void handleStrIncrease() {
		if (getCharacter().getStrength().getBaseValue() < 18) {
			getCharacter().getStrength().increaseValue();
			setStrLabels();
		}
	}

	@FXML
	void handleStrDecrease() {
		if (getCharacter().getStrength().getBaseValue() > 3) {
			getCharacter().getStrength().decreaseValue();
			setStrLabels();
		}
	}

	@FXML
	void handleDexIncrease() {
		if (getCharacter().getDexterity().getBaseValue() < 18) {
			getCharacter().getDexterity().increaseValue();
			setDexLabels();
		}
	}

	@FXML
	void handleDexDecrease() {
		if (getCharacter().getDexterity().getBaseValue() > 3) {
			getCharacter().getDexterity().decreaseValue();
			setDexLabels();
		}
	}

	@FXML
	void handleConIncrease() {
		if (getCharacter().getConstitution().getBaseValue() < 18) {
			getCharacter().getConstitution().increaseValue();
			setConLabels();
		}
	}

	@FXML
	void handleConDecrease() {
		if (getCharacter().getConstitution().getBaseValue() > 3) {
			getCharacter().getConstitution().decreaseValue();
			setConLabels();
		}
	}

	@FXML
	void handleIntIncrease() {
		if (getCharacter().getIntelligence().getBaseValue() < 18) {
			getCharacter().getIntelligence().increaseValue();
			setIntLabels();
		}
	}

	@FXML
	void handleIntDecrease() {
		if (getCharacter().getIntelligence().getBaseValue() > 3) {
			getCharacter().getIntelligence().decreaseValue();
			setIntLabels();
		}
	}

	@FXML
	void handleWisIncrease() {
		if (getCharacter().getWisdom().getBaseValue() < 18) {
			getCharacter().getWisdom().increaseValue();
			setWisLabels();
		}
	}

	@FXML
	void handleWisDecrease() {
		if (getCharacter().getWisdom().getBaseValue() > 3) {
			getCharacter().getWisdom().decreaseValue();
			setWisLabels();
		}
	}

	@FXML
	void handleChaIncrease() {
		if (getCharacter().getCharisma().getBaseValue() < 18) {
			getCharacter().getCharisma().increaseValue();
			setChaLabels();
		}
	}

	@FXML
	void handleChaDecrease() {
		if (getCharacter().getCharisma().getBaseValue() > 3) {
			getCharacter().getCharisma().decreaseValue();
			setChaLabels();
		}
	}

	// endregion

	/**
	 * sets the Data for all modifications to Ability Scores
	 */
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

	/**
	 * sets up the Racial Bonuses to Ability scores
	 */
	void setUpRacialBonus() {
		if (!totalsAdded)
			for (Effect e : getCharacter().getEffects()) {
				// System.out.println(e.getClass().toString());
				if (e.getClass().toString()
						.equals("class pathfinder.data.Effects.AbilityEffect")) {
					switch (((AbilityEffect) e).getAbilityName()) {
					case Strength:
						lblRacialBonusStr.setText("" + e.getValue());
						getCharacter().getStrength().setTotalValue(e.getValue());
						getCharacter().getStrength().setRacialBonus(e.getValue());
						setStrLabels();
						totalsAdded = true;
						break;

					case Constitution:
						lblRacialBonusCon.setText("" + e.getValue());
						getCharacter().getConstitution().setTotalValue(e.getValue());
						getCharacter().getConstitution().setRacialBonus(e.getValue());
						setConLabels();
						totalsAdded = true;
						break;

					case Dexterity:
						lblRacialBonusDex.setText("" + e.getValue());
						getCharacter().getDexterity().setTotalValue(e.getValue());
						getCharacter().getDexterity().setRacialBonus(e.getValue());
						setDexLabels();
						totalsAdded = true;
						break;

					case Charisma:
						lblRacialBonusCha.setText("" + e.getValue());
						getCharacter().getCharisma().setTotalValue(e.getValue());
						getCharacter().getCharisma().setRacialBonus(e.getValue());
						setChaLabels();
						totalsAdded = true;
						break;

					case Intelligence:
						lblRacialBonusInt.setText("" + e.getValue());
						getCharacter().getIntelligence().setTotalValue(e.getValue());
						getCharacter().getIntelligence().setRacialBonus(e.getValue());
						setIntLabels();
						totalsAdded = true;
						break;

					case Wisdom:
						lblRacialBonusWis.setText("" + e.getValue());
						getCharacter().getWisdom().setTotalValue(e.getValue());
						getCharacter().getWisdom().setRacialBonus(e.getValue());
						setWisLabels();
						totalsAdded = true;
						break;

					default:
						break;
					}
				}
			}
	}

	/**
	 * sets up the values on the first time running
	 */
	public void firstTimeRun() {
		totalsAdded = false;
		getParentWindow().setAbilities();
		
		for (Label label : racialBonus) {
			label.setText("0");
		}

		lblBaseStr.setText("" + getCharacter().getStrength().getBaseValue());
		lblBaseDex.setText("" + getCharacter().getDexterity().getBaseValue());
		lblBaseCon.setText("" + getCharacter().getConstitution().getBaseValue());
		lblBaseInt.setText("" + getCharacter().getIntelligence().getBaseValue());
		lblBaseWis.setText("" + getCharacter().getWisdom().getBaseValue());
		lblBaseCha.setText("" + getCharacter().getCharisma().getBaseValue());

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
