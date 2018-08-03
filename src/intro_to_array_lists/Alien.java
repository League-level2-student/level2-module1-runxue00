package intro_to_array_lists;

import java.awt.*;

public class Alien extends GameObject{

	public Alien(int x, int y, int width, int height, int speed) {
		super(x, y, width, height, speed);
		// TODO Auto-generated constructor stub
	}
	
	public void update() {
		y+=speed;
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(x, y, width, height);
	}

}
