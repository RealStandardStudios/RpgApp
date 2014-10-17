package window;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jefXif.Strings;
import jefXif.view.Gui;
import jefXif.view.RootLayoutController;
import org.controlsfx.dialog.Dialogs;
import view.RootController;
import view.partials.MainWindowController;

/**
 * @author Real Standard Studios - Matthew Meehan
 * Loads and Initializes the main program
 */
public class Interface extends Gui {
	
	public Interface(Stage primaryStage) {
		super(primaryStage);
		Strings.ProgramTitle = "Compendium of Heroes";
	}

	@Override
	public void initRootLayout() {
		try {
			// Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource(
					"../view/RootLayout.fxml"));
			BorderPane pane = loader.load();

			// Show the scene containing the root layout
			Scene scene = new Scene(pane);
			getPrimaryStage().setScene(scene);

			// Give the controller access to the main app.
			RootLayoutController controller = loader.getController();
			controller.setInterface(this);
			setRootLayout(controller);

			getPrimaryStage().show();
		} catch (IOException e) {
			Dialogs.create().masthead(e.getMessage()).message(e.getStackTrace().toString()).showWarning();
		}
	}

	@Override
	public void loadPartials() throws IOException {
		HashMap<String, MainWindowController> windowPartials = new HashMap<>();
		String[] Windows = { "CharacterProfile", "Combat", "CombatStats",
				"Feats", "Inventory", "OtherCharacter",
				"Skills", "Spells"};
		for (String string : Windows) {
			windowPartials.put(string, (MainWindowController) loadPartial(string, this));
		}
		((RootController) getRootLayout()).setWindowPartials(windowPartials);
	}

	@Override
	public void initialize() {
		this.getPrimaryStage().setTitle(Strings.ProgramTitle);
		this.getPrimaryStage().getIcons()
				.add(new Image("file:resources/images/Icon.png"));

		initRootLayout();

		try {
			loadPartials();
		} catch (IOException e) {
			Dialogs.create().masthead(e.getMessage()).message(e.getStackTrace().toString()).showWarning();
		}
	}

	@Override
	public void loadData() {
		// This is where we will load in the data for the character
		
	}
}
