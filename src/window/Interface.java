package window;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jefXif.Gui;
import jefXif.WindowController;
import view.RootLayoutController;

import com.sun.istack.internal.logging.Logger;

/**
 * @author Real Standard Studios - Matthew Meehan
 * Loads and Initializes the main program
 */
public class Interface extends Gui {
	private RootLayoutController rootLayoutController;
	
	public Interface(Stage primaryStage) {
		super(primaryStage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initRootLayout() {
		try {
			// Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource(
					"../view/RootLayout.fxml"));
			setRootLayout((BorderPane) loader.load());

			// Show the scene containing the root layout
			Scene scene = new Scene(getRootLayout());
			getPrimaryStage().setScene(scene);

			// Give the controller access to the main app.
			rootLayoutController = loader.getController();
			rootLayoutController.setInterface(this);

			getPrimaryStage().show();
		} catch (IOException e) {
			Logger.getLogger(this.getClass()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public void loadPartials() throws IOException {
		HashMap<String, WindowController> windowPartials = new HashMap<>();
		String[] Windows = { "CharacterProfile", "Combat", "CombatStats",
				"Feats", "Inventory", "OtherCharacter",
				"Skills", "Spells"};
		for (String string : Windows) {
			windowPartials.put(string, loadPartial(string, this));
		}
		rootLayoutController.setWindowPartials(windowPartials);
	}

	@Override
	public void initialize() {
		this.getPrimaryStage().setTitle("RPG Applicaiton");
		this.getPrimaryStage().getIcons()
				.add(new Image("file:resources/images/Icon.png"));

		initRootLayout();

		try {
			loadPartials();
		} catch (IOException e) {
			Logger.getLogger(this.getClass()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public void loadData() {
		// This is where we will load in the data for the character
		
	}
}
