package view.partials.dialogs;

/*
public class LevelUpController extends DialogController implements jefXif.interfaces.PartialLoader
{
	
	String[] partialNames = new String[] { "AbilityScores", "Feat", "Skills"};
	
	@FXML
	AnchorPane skills;
	@FXML
	AnchorPane abilityScores;
	@FXML
	AnchorPane feats;
	
	@FXML
	TabPane tpTabs;

	
	@FXML
	private void handleTabChanged(Event event) {
		Tab tabChanged = (Tab) event.getSource();
		// System.out.println(tabChanged.getId());
		switch (tabChanged.getId()) {
		case "tpAbilityScores":
			getPartials().get("Race").getData();
			getPartials().get("Class").getData();
			if (getCharacter().getEffects().size() > 0)
				getCharacter().setEffects(new ArrayList<>());
			if (!aeAdded) {
				for (AbilityEffect effect : getCharacter().getRace().getRacialModifiers()) {
					getCharacter().getEffects().add(effect);
				}
				aeAdded = true;
			}
			if (!teAdded) {
				for (Trait t : getCharacter().getRace().getRacialTraits()) {
					getCharacter().getEffects().add(t.getEffect());
				}
				teAdded = true;
			}
			if (getPartials() != null)
				getPartials().get("AbilityScores").setData();
			break;

		case "tpSkills":
			getPartials().get("Class").getData();
			getPartials().get("Race").getData();
			getCharacter().setLevel(1);

			getPartials().get("Skills").setData();
			break;

		case "tpFeats":

			break;

		default:
			break;
		}
	
	@Override
	public void handleOkay(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
*/

