package lab2;

import java.awt.Color;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {

	public void run() {
		//System.out.println("This is a print-out from the driver.");
		Room roomOne = new Room(100,200, Color.red);
		Room roomSecond = new Room(200,300, Color.blue);
		Room roomThird = new Room(200,100, Color.pink);
		Room roomFourth = new Room(300,200, Color.black);
		Room roomFive = new Room(300,200, Color.white);
		
		roomOne.connectEastTo(roomSecond);
		roomSecond.connectSouthTo(roomThird);
		roomThird.connectEastTo(roomFourth);
		roomFourth.connectNorthTo(roomFive);
		roomFive.connectWestTo(roomOne);
		
		
		Level l = new Level();
		l.place(roomOne,0,0);
		l.place(roomSecond,150,100);
		l.place(roomThird,0,450);
		l.place(roomFourth,400,350);
		l.place(roomFive,400,0);
		LevelGUI lGUI = new LevelGUI(l,"START");
		l.firstLocation(roomOne);	
	
	}
	
	

}