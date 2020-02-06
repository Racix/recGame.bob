
package lab2.level;

import java.awt.Color;


public class Room {
	int x = 0, y = 0, dx = 0, dy = 0;
	Room north = null;
	Room east = null;
	Room south = null;
	Room west = null;
	Color color = null;
	
	public Room(int dx, int dy, Color color) {
		this.dy = dy;
		this.dx = dx;
		this.color = color;
		System.out.println("The rooms dimention is " + dx +"," + dy + " and the floor has color" + color);
	}

	public void connectNorthTo(Room r) {
		north = r;
	}
	public void connectEastTo(Room r) {
		east = r;
	}
	public void connectSouthTo(Room r) {
		south = r;
	}
	public void connectWestTo(Room r) {
		west = r;
	}
}
