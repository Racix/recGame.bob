
package lab2.level;

import java.util.ArrayList;
import java.util.Observable;


public class Level extends Observable {
	
	
	public boolean place(Room r, int x, int y)  {
		ArrayList<Room> Length = new ArrayList<Room>();
		
		for(int i = 0; i <= Length.size();i++) {
			int startX = Length.get(i).x;
			int endX = startX + Length.get(i).dx;
			int startY = Length.get(i).y;
			int endY = startY + Length.get(i).dy;
			
			if ((x+r.dx) >= startX || x<=endX || (y + r.dy) >= startY || y<=endY) {
				return false;
			}
		}
		r.x = x;
		r.y = y;
		Length.add(r);
		return true;
	}
	
	public void firstLocation(Room r) {
			
	}
	
}
