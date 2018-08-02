package intro_to_array_lists;

import java.awt.*;

public class GameObject {
	 int x;
     int y;
     int width;
     int height;
     int speed;
     boolean isAlive = true;
     
     public GameObject(int x, int y, int width, int height, int speed) {
    	 this.x = x;
    	 this.y = y;
    	 this.width = width;
    	 this.height = height;
    	 speed = 5;
    	 this.speed = speed;
     }
     
     public void update() {
   
     }
     
     public void draw(Graphics g) {
    	 
     }
}
