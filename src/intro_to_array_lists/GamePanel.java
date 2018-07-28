package intro_to_array_lists;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	GameObject object;
	Timer time;
	@Override
	

	public void paintComponent(Graphics g){
		object.draw(g);
	                

	        }


	
 public GamePanel() {
	 time = new Timer(1000/60, this);
	 object = new GameObject(10, 10, 100, 100);
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	public void startGame() {
		time.start();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("PRINT");
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("PRINT");
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("PRINT");
	}
	
}
