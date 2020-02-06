
package lab2.level;

import java.awt.Color;


public class Room { 
	Room north = null;
	Room east = null;
	Room south = null;
	Room west = null;
	Color color = null;
	
	public Room(int dx, int dy, Color color) {
		System.out.println("The rooms dimention is " + dx +"," + dy + " and the floor has color" + color);
	}

	public void connectNorthTo(Room r) {
		
	}
	public void connectEastTo(Room r) {
		
	}
	public void connectSouthTo(Room r) {
		
	}
	public void connectWestTo(Room r) {
		
	}
}
