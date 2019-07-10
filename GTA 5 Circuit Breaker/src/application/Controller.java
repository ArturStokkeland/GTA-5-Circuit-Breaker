package application;

import javafx.scene.input.KeyCode;

public class Controller {

	// MVC link
	public Model model;
	public View view;
	
	// gets keypress and decides what to do
	public void handleKeyPress(KeyCode key) {
		switch(key) {
		case UP:
			model.setPlayerDirection(0, -1);
			break;
		case RIGHT:
			model.setPlayerDirection(1, 0);
			break;
		case DOWN:
			model.setPlayerDirection(0, 1);
			break;
		case LEFT:
			model.setPlayerDirection(-1, 0);
			break;
		default:
			break;
		}
	}
	
}
