
package lab2.level;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class LevelGUI implements Observer {

	private Level lv;
	private Display d;
	
	public LevelGUI(Level level, String name) {
		
		this.lv = level;
		
		JFrame frame = new JFrame(name);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// TODO: You should change 200 to a value 
		// depending on the size of the level
		d = new Display(lv,1080,600);
		
		frame.getContentPane().add(d);
		frame.pack();
		frame.setLocation(0,0);
		frame.setVisible(true);
	}
	
	
	public void update(Observable arg0, Object arg1) {
		
	}
	
	private class Display extends JPanel {
		
		
		public Display(Level fp, int x, int y) {
		
			
			addKeyListener(new Listener());
			
			setBackground(Color.GREEN);
			setPreferredSize(new Dimension(x+20,y+20));
			setFocusable(true);
		}
		
		public void DrawLine(Graphics g) {
			g.setColor(lv.length.get(1).color);
			g.fillRect(lv.length.get(0).x + lv.length.get(0).dx, lv.length.get(0).y + lv.length.get(0).dy, 100, 5);
			g.setColor(lv.length.get(2).color);
			g.fillRect(lv.length.get(2).x + lv.length.get(2).dx, lv.length.get(2).y-50, 5, 100);
			g.setColor(lv.length.get(3).color);
			g.fillRect(lv.length.get(2).x + lv.length.get(2).dx, lv.length.get(2).y + lv.length.get(2).dy, 500, 5);
			g.setColor(lv.length.get(4).color);
			g.fillRect(lv.length.get(4).x + lv.length.get(4).dx, lv.length.get(4).y + lv.length.get(4).dy, 5, 300);
			g.setColor(lv.length.get(0).color);
			g.fillRect(lv.length.get(0).x + lv.length.get(0).dx, lv.length.get(0).y + 35, 500, 5);
			
		}
		
		public void colorRoom(Graphics g) {
			for(int i = 0; i < lv.length.size();i++) {
				System.out.print(lv.length.size());
				g.setColor(lv.length.get(i).color);
				g.fillRect(lv.length.get(i).x+20,lv.length.get(i).y+20,lv.length.get(i).dx,lv.length.get(i).dy);
				
			}
		}
		public void colorBorder(Graphics g) {
			for(int i = 0; i < lv.length.size();i++) {
			g.setColor(Color.orange);
			g.fillRect (lv.length.get(i).x+15,lv.length.get(i).y+15,lv.length.get(i).dx+10,lv.length.get(i).dy+10);
			}
		}
		
		

		public void paintComponent(Graphics g){
			
			super.paintComponent(g);
			colorBorder(g);
			DrawLine(g);
			colorRoom(g);
			
		}
		
		

	 	private class Listener implements KeyListener {

	 		
	 		public void keyPressed(KeyEvent arg0) {
	 		}

	 		public void keyReleased(KeyEvent arg0) {
	 		}

	 		public void keyTyped(KeyEvent event) {
	 		}
	 	}

	}
	
}
