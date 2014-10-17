package rpg;

import javafx.application.Application;
import javafx.stage.Stage;
import window.Interface;

/**
 * Base application class for the RpgApp
 * 
 * @author Real Standard Studios - Matthew Meehan
 */
public class MainApp extends Application {

	/**
	 * This method starts when the App is launched
	 */
	@Override
	public void start(Stage primaryStage) {
		Interface gui = new Interface(primaryStage);
		gui.initialize();
	}

	/**
	 * Main method for the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
