package application;

import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Model {

	// MVC link
	public View view;
	public Controller controller;
	
	// gameobjects
	private GameObject player;
	private GameObject start;
	private GameObject end;
	private ArrayList<GameObject> walls = new ArrayList();
	
	// controls the flow of the game
	private boolean gameRunning = true;
	private boolean gamePaused = false;
	
	// sets up gameobjects, randomly generated map, and starts thread
	public void launchGame() {
		player = new GameObject(50, 50, 25, 25, Color.BLACK);
		Thread thread = new Thread(this::runGame);
		thread.setDaemon(true);
		thread.start();
	}
	
	// core game loop
	public void runGame() {
		while(gameRunning) {
			while(!gamePaused) {
				updatePosition();
				drawGame();
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	// gives player new position once per "frame"
	public synchronized void updatePosition() {
		player.xPos += player.speed * player.speedX;
		player.yPos += player.speed * player.speedY;
	}
	
	// redraws gameobjects once per "frame"
	public synchronized void drawGame() {
		view.drawObject(player, "circle");
	}
	
	// changes which direction the player moves
	public void setPlayerDirection(int x, int y) {
		player.speedX = x;
		player.speedY = y;
	}
	
}
