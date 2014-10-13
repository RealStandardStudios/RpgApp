package view;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import pathfinder.data.Skill;
import pathfinder.data.Attributes.Ability;

public class SkillGridRow {
	String name;
	Label totalLabel;
	Label ranksLabel;
	Label abilityLabel;
	Label racialLabel;
	CheckBox classLabel;
	int total;
	int ranks;
	int racialMod;
	boolean classSkill;
	int miscMod;
	Ability ability;

	// region getters and setters
	public Label getTotalLabel() {
		totalLabel.setText(""+getTotal());
		return totalLabel;
	}

	public Label getRanksLabel() {
		ranksLabel.setText(""+ranks);
		return ranksLabel;
	}
	
	public Label getAbilityLabel() {
		abilityLabel.setText(ability.getAbilityName().toString().substring(0, 3)+": "+ability.getModifier().get());
		return abilityLabel;
	}

	public Label getRacialLabel() {
		racialLabel.setText(""+racialMod);
		return racialLabel;
	}

	public CheckBox getClassLabel() {
		classLabel.setSelected(classSkill);
		return classLabel;
	}
	
	public int getTotal() {
		this.total = this.ability.getModifier().get();
		if (ranks!=0 && classSkill)
			total+=3;
		total += ranks;
		total += racialMod;
		total += miscMod;
		return total;
	}

	public int getRanks() {
		return ranks;
	}

	public void increaseRanks() {
		this.ranks++;
		this.getRanksLabel();
		this.getTotalLabel();
	}
	
	public void decreaseRanks() {
		this.ranks--;
		this.getRanksLabel();
		this.getTotalLabel();
	}

	public int getRacialMod() {
		return racialMod;
	}

	public void setRacialMod(int racialMod) {
		this.racialMod = racialMod;
		this.racialLabel.setText(""+racialMod);
	}

	public boolean isClassSkill() {
		return classSkill;
	}

	public void setClassSkill(boolean classSkill) {
		this.classSkill = classSkill;
		this.classLabel.setSelected(classSkill);
	}

	public int getMiscMod() {
		return miscMod;
	}

	public void setMiscMod(int miscMod) {
		this.miscMod = miscMod;
	}

	public int getAbilityMod() {
		return ability.getModifier().get();
	}
	
	public String getName() {
		return this.name;
	}

	// endregion
	public SkillGridRow(String name, Label totalLabel, Label ranksLabel, Label abilityLabel, Label racialLabel,
			CheckBox classLabel, Ability ability) {
		this.name = name;
		this.totalLabel = totalLabel;
		this.ranksLabel = ranksLabel;
		this.racialLabel = racialLabel;
		this.classLabel = classLabel;
		this.abilityLabel = abilityLabel;
		
		this.total = 0;
		this.ranks = 0;
		this.racialMod = 0;
		this.classSkill = false;
		this.miscMod = 0;
		this.ability = ability;
		
		this.getTotal();
	}
	
	public Skill toSkill() {
		return new Skill(racialMod, ranks, ability, name, classSkill, null);
	}
}
