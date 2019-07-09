package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage window) {
		
		// create MVC
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller();
		
		// link MVC together
		model.view = view;
		model.controller = controller;
		
		view.model = model;
		view.controller = controller;
		
		controller.model = model;
		controller.view = view;
		
		// build the game and start
		view.createMap(window);		
	}
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
