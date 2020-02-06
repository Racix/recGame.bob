package lab2;

import java.awt.Color;

import lab2.level.Level;
import lab2.level.LevelGUI;
import lab2.level.Room;

public class Driver {

	public void run() {
		System.out.println("This is a print-out from the driver.");
		Room roomOne = new Room(100,200, Color.red);
		Room roomSecond = new Room(200,300, Color.blue);
		Room roomThird = new Room(200,100, Color.green);
		Room roomFourth = new Room(300,200, Color.black);
		Room roomFive = new Room(300,200, Color.white);
		
		roomOne.connectNorthTo(roomSecond);
		roomSecond.connectEastTo(roomThird);
		roomThird.connectSouthTo(roomFourth);
		roomFourth.connectWestTo(roomFive);
		roomFive.connectNorthTo(roomOne);
		
		Level l = new Level();
		l.place(roomOne,0,0);
		l.place(roomSecond,101,201);
		l.place(roomThird,301,501);
		l.place(roomFourth,601,701);
		l.place(roomFive,901,901);
	}
	
	

}