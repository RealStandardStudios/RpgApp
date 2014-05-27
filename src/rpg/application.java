package rpg;

import javafx.application.Application;
import javafx.stage.Stage;
import window.Interface;

public class application extends Application {

	@Override
	public void start(Stage primaryStage) {
		Interface gui = new Interface(primaryStage);
		gui.initialize();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
