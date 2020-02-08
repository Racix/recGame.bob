
package lab2.level;

import java.util.ArrayList;
import java.util.Observable;


public class Level extends Observable {
	
	Room player;
	
	ArrayList<Room> length = new ArrayList<Room>();
	public boolean place(Room r, int x, int y)  {
		
		for(int i = 0; i < length.size();i++) {
			int startX = length.get(i).x;
			int endX = startX + length.get(i).dx;
			int startY = length.get(i).y;
			int endY = startY + length.get(i).dy;
			
			if (!((x+r.dx) <= startX || x>=endX || (y + r.dy) <= startY || y>=endY)) {
				System.out.println("hej");
				return false;
			}
		}
		r.x = x;
		r.y = y;
		length.add(r);
		return true;
	}
	
	void playerNorth() {
		if (player.north != null) {
			player = player.north;
			setChanged();
			notifyObservers();
		}
	}
	
	void playerEast() {
		if (player.east != null) {
			player = player.east;
			setChanged();
			notifyObservers();
		}
	}
	
	void playerSouth() {
		if (player.south != null) {
			player = player.south;
			setChanged();
			notifyObservers();
		}
	}
	
	void playerWest() {
		if (player.west != null) {
			player = player.west;
			setChanged();
			notifyObservers();
		}
	}
	
	public void firstLocation(Room r) {
		player = r;	
	}
	
}
