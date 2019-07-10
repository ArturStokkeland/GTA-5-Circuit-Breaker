package application;

import javafx.scene.paint.Color;

public class GameObject {
	public int xPos; // X position
	public int yPos; // Y position
	public int width; // size of object
	public int height; // size of object
	public int speed = 5; // travel speed
	public int speedX = 1; // X direction weight
	public int speedY = 0; // Y direction weight
	public Color color; // color of object
	
	// constructor
	public GameObject(int x, int y, int w, int h, Color c) {
		xPos = x;
		yPos = y;
		width = w;
		height = h;
		color = c;
	}
}
