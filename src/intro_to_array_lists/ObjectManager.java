package intro_to_array_lists;

import java.awt.*;

public class ObjectManager {
Rocketship rocket;

public ObjectManager(Rocketship rocket) {
	this.rocket = rocket;
}

public void update() {
	rocket.update();
}
public void draw(Graphics g) {
	rocket.draw(g);
}
}







// PART 10 STEP 8