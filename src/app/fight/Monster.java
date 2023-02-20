package app.fight;

import java.util.ArrayList;
import java.util.Random;

public class Monster {
	
	private int health;
	private int damage;
	private ArrayList<String> weapons = new ArrayList<String>();
	private String weapon;
	private Random random = new Random();
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public ArrayList<String> getWeapons() {
		return weapons;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public int randomAttack() {
		String attack = getWeapons().get(random.nextInt(getWeapons().size()));
		setDamage(attack.equals("Hit") ? 5 : attack.equals("Spits Fire") ? 20 : attack.equals("Bite") ? 8 : 0);
		setWeapon(attack);
		return getDamage();
	}
}
