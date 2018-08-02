package intro_to_array_lists;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener{
	//GameObject object;
	Timer time;
	final int MENU_STATE = 0;

	final int GAME_STATE = 1;

	final int END_STATE = 2;
	
	int currentState = MENU_STATE;
	
	Font titleFont;
	
	Font buttonFont;
	
	int x;
	
    int y;
    
    Rocketship ship = new Rocketship(250, 700, 50, 50, 5);
    
    ObjectManager manager = new ObjectManager(ship);
	
	public void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setColor(Color.cyan);
		g.setFont(titleFont);
		g.drawString("LEAGUE INVADERS", 80, 100);
		g.setFont(buttonFont);
		g.drawString("Press ENTER to start", 120, 300);
		g.drawString("Press SPACE for instructions", 80, 600);
		
	}
	
public void drawGameState(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	manager.draw(g);
    
	}

public void drawEndState(Graphics g) {
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	g.setColor(Color.black);
	g.setFont(titleFont);
	g.drawString("GAME OVER", 120, 100);
	g.setFont(buttonFont);
	g.drawString("You killed 0 enemies", 130, 300);
	g.drawString("Press ENTER to restart", 120, 600);
}

	public void paintComponent(Graphics g){
		//object.draw(g);
		if(currentState == MENU_STATE){

            drawMenuState(g);

    }else if(currentState == GAME_STATE){

            drawGameState(g);

    }else if(currentState == END_STATE){

            drawEndState(g);

    }

	        }
	
public void updateMenuState() {
	
}

public void updateGameState() {
	manager.update();
	
}

public void updateEndState() {
	
}

	
 public GamePanel() {
	 this.x = x;
	 this.y = y;
	 time = new Timer(1000/60, this);
	 titleFont = new Font("Arial", Font.PLAIN, 38);
	 buttonFont = new Font("Arial", Font.PLAIN, 23);
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		//object.update();
		repaint();
		if(currentState == MENU_STATE){

            updateMenuState();

    }else if(currentState == GAME_STATE){

            updateGameState();

    }else if(currentState == END_STATE){

            updateEndState();

    }
	}
	

	public void startGame() {
		time.start();
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
		currentState++;
		}
		if(currentState > END_STATE){

            currentState = MENU_STATE;
    }
		if(e.getKeyCode() == KeyEvent.VK_UP) {
	    	 ship.setUp(true);
	     }
	     if(e.getKeyCode() == KeyEvent.VK_DOWN) {
	    	 ship.setDown(true);
	     }
	     if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
	    	 ship.setRight(true);
	     }
	     if(e.getKeyCode() == KeyEvent.VK_LEFT) {
	    	 ship.setLeft(true);
	     }
		
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_UP) {
	    	 ship.setUp(false);
	     }
	     if(e.getKeyCode() == KeyEvent.VK_DOWN) {
	    	 ship.setDown(false);
	     }
	     if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
	    	 ship.setRight(false);
	     }
	     if(e.getKeyCode() == KeyEvent.VK_LEFT) {
	    	 ship.setLeft(false);
	     }
	}
	
}









