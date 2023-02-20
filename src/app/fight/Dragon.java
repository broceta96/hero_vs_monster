package app.fight;

import java.util.ArrayList;


public class Dragon extends Monster{
	
	private int health;
	private int damage;
	private ArrayList<String> weapons = new ArrayList<String>();
	private String weapon;
	
	public Dragon() {
		this.health = 200;
		weapons.add("Hit");
		weapons.add("Spits Fire");
	}
	
	@Override
	public int getHealth() {
		return health;
	}
	
	@Override
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}
	
	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	@Override
	public ArrayList<String> getWeapons() {
		return weapons;
	}
	
	@Override
	public String getWeapon() {
		return weapon;
	}
	
	@Override
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}	
}
