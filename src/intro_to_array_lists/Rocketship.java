package intro_to_array_lists;

import java.awt.*;

public class Rocketship extends GameObject {
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;
	
	public boolean getUp() {
		return up;
	}
	public void setUp(boolean up) {
		this.up = up;
	}
	
	public boolean getDown() {
		return down;
	}
	public void setDown(boolean down) {
		this.down = down;
	}
	
	public boolean getRight() {
		return right;
	}
	public void setRight(boolean right) {
		this.right = right;
	}
	
	public boolean getLeft() {
		return left;
	}
	public void setLeft(boolean left) {
		this.left = left;
	}
	
	
	public void update() {
		if(up == true) {
			y--;
		}
		if(down == true) {
			y++;
		}
		if(right == true) {
			x++;
		}
		if(left == true) {
			x--;
		}
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLUE);

        g.fillRect(x, y, width, height);
	}

	public Rocketship(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	} 
	
}
