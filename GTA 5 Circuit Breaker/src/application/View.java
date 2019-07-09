package application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class View {

	public Model model;
	public Controller controller;
	
	// window size
	private int width = 1600;
	private int height = 900;
	
	public void createMap(Stage window) {
		
		// create the game window
		Pane pane = new Pane();
		Scene scene = new Scene(pane, width, height);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene);
		window.show();
		
		// start the core game loop
		model.launchGame();
		
	}
}
