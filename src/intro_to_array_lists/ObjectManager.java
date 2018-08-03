package intro_to_array_lists;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ObjectManager {
Rocketship rocket;
ArrayList<Projectile> projectiles= new ArrayList<Projectile>();
ArrayList<Alien> aliens= new ArrayList<Alien>();
long enemyTimer = 0;
int enemySpawnTime = 3000;

public ObjectManager(Rocketship rocket) {
	this.rocket = rocket;
}

public void addProjectile(Projectile object) {
	projectiles.add(object);
}

public void addAlien(Alien a) {
	aliens.add(a);
}

public void update() {
	rocket.update();
	for (int i = 0; i < projectiles.size(); i++) {
		Projectile p = projectiles.get(i);
		p.update();
	}
	for (int i = 0; i < aliens.size(); i++) {
	    Alien a = aliens.get(i);
		a.update();
	}
	
}

public void draw(Graphics g) {
	rocket.draw(g);
	for (int i = 0; i < projectiles.size(); i++) {
		Projectile p = projectiles.get(i);
		p.draw(g);
	}
	for (int i = 0; i < aliens.size(); i++) {
	    Alien a = aliens.get(i);
		a.draw(g);
	}
}

public void manageEnemies(){
    if(System.currentTimeMillis() - enemyTimer >= enemySpawnTime){
            addAlien(new Alien(new Random().nextInt(LeagueInvaders.WIDTH), 0, 50, 50, 50));
            enemySpawnTime = new Random().nextInt(3000);
enemyTimer = System.currentTimeMillis();
    }
}

public void purgeObjects() {
	for (int i = 0; i < projectiles.size(); i++) {
		Projectile p = projectiles.get(i);
		if(p.isAlive == false) {
			projectiles.remove(i);
		}
	}
	for (int i = 0; i < aliens.size(); i++) {
	    Alien a = aliens.get(i);
		if(a.isAlive == false) {
			aliens.remove(i);
		}
	}
	
}
}







