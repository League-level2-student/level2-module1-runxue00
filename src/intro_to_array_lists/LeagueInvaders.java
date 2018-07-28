package intro_to_array_lists;

import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	static JFrame window;
	GamePanel game;
public static void main(String[] args) {
    window = new JFrame();
	window.setSize(500, 800);
	window.setVisible(true);
	LeagueInvaders League = new LeagueInvaders();
	League.setup();
	window.addKeyListener(League.game);
}
  public LeagueInvaders() {
	  game = new GamePanel();
  }
public void setup() {
	window.add(game);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	window.getContentPane().setPreferredSize(new Dimension(500, 800));
    window.pack();
    game.startGame();
}
}


// LEAGUE INVADERS PART 4 INSTRUCTION 4
