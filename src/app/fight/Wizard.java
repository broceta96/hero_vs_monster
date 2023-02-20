package app.fight;

import java.util.ArrayList;

public class Wizard extends Hero{
	
	private int health;
	private ArrayList<String> weapons = new ArrayList<String>();
	private String weapon;
	private String droppedWeapon;
	private int damage;
	
	public Wizard() {
		this.health = 100;
	}
	
	@Override
	public int getHealth() {
		return health;
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
	
	@Override
	public String getDroppedWeapon() {
		return droppedWeapon;
	}
	
	@Override
	public void setDroppedWeapon(String droppedWeapon) {
		this.droppedWeapon = droppedWeapon;
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
	public boolean checkWeapon(String weapon) {
		return weapon.equals("Fire Spell") || weapon.equals("Ice Spell");
	}
}
