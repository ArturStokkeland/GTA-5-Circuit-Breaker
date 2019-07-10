package application;

import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

public class View implements EventHandler<KeyEvent> {

	// MVC link
	public Model model;
	public Controller controller;
	
	// window size
	private int width = 1600;
	private int height = 900;
	
	// canvas to draw gameobjects on
	private Canvas canvas;
	
	// creates user interface for the game
	public void createMap(Stage window) {
		canvas = new Canvas(width, height);
		Pane pane = new Pane(canvas);
		Scene scene = new Scene(pane, width, height);
		scene.setOnKeyPressed(this);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		window.setScene(scene);
		window.show();
		
		// start the core game loop
		model.launchGame();
	}
	
	// draws gameobjects
	public void drawObject(GameObject go, String shape) {
		GraphicsContext gc = canvas.getGraphicsContext2D();
		gc.fillOval(go.xPos, go.yPos, go.width, go.height);
	}

	// KeyEvent handler
	public void handle(KeyEvent event) {
		controller.handleKeyPress(event.getCode());		
	}
}
