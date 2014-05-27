package window;

import java.io.IOException;

import view.RootLayoutController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jefXif.Gui;

public class Interface extends Gui {

	public Interface(Stage primaryStage) {
		super(primaryStage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initRootLayout() {
		try {
			//Load root layout from fxml file
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(this.getClass().getResource("view/RootLayout.fxml"));
			setRootLayout((BorderPane) loader.load());
			
			//Show the scene containing the root layout
			Scene scene = new Scene(getRootLayout());
			getPrimaryStage().setScene(scene);
			
			// Give the controller access to the main app.
	        RootLayoutController controller = loader.getController();
	        controller.setInterface(this);

	        getPrimaryStage().show();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	@Override
	public void initialize() {
		this.getPrimaryStage().setTitle("RPG Applicaiton");
		this.getPrimaryStage().getIcons().add(new Image("file:resources/images/Icon.png"));
		
		initRootLayout();
	}

}
