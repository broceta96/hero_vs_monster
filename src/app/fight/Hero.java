package app.fight;

import java.util.ArrayList;
import java.util.Random;

public class Hero {
	
	private int health;
	private ArrayList<String> weapons;
	private String weapon;
	private String droppedWeapon;
	private int damage;
	private Random random = new Random();

	public int getHealth() {
		return health;
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
	
	public String getDroppedWeapon() {
		return droppedWeapon;
	}
	
	public void setDroppedWeapon(String droppedWeapon) {
		this.droppedWeapon = droppedWeapon;
	}
	
	public int getDamage() {
		return damage;
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void addWeapons(String weapon) throws Exception {
		if(checkWeapon(weapon))
			if(getWeapons().size() == 2)
				throw new Exception("Hero weapon limit is 2.");
			else {
				getWeapons().add(weapon);
				setWeapon(weapon);
				System.out.println("Weapon added " + weapon);
			}
		else
			throw new Exception("Please enter valid weapon for hero." + "\n" + "Valid weapons for Swordsman are: (Sword, Spear)" + "\n" + "Valid weapons for Wizard are: (Fire Spell, Ice Spell)");
	}
	
	public boolean checkWeapon(String weapon) {
		return false;
	}
	
	public void isEmpty() throws Exception {
		if(getWeapons().isEmpty())
			throw new Exception("Backpack is empty. Please buy weapon.");
	}
	
	public void dropWeapon() throws Exception{
		isEmpty();
		setDroppedWeapon(getWeapons().remove(getWeapons().indexOf(getWeapon())));
		System.out.println("This is dropded weapon " + getDroppedWeapon());
		changeWeapon();
	}
	
	public void changeWeapon() throws Exception{
		isEmpty();
		if(getWeapons().size() == 1) {
			setWeapon(getWeapons().get(0));
		}else {
			if(getWeapon().equals(getWeapons().get(0))) {
				setWeapon(getWeapons().get(1));
			}else {
				setWeapon(getWeapons().get(0));
			}
		}
		
		System.out.println("Current weapon: " + getWeapon());
	}
	
	public void weaponFits(Hero hero) throws Exception {
		this.addWeapons(hero.getDroppedWeapon());
	}
	
	public void backPack() throws Exception{
		isEmpty();
		for(String w : getWeapons())
			System.out.println("Weapons in backpack: " + w);
	}
	
	public int attack() throws Exception {
		isEmpty();
		setDamage((getWeapon().equals("Sword") ? 10 : getWeapon().equals("Spear") ? 15 : getWeapon().equals("Fire Spell") || getWeapon().equals("Ice Spell") ? 25 : 0));
		return getDamage();
	}
	
	public void fight(Hero hero, Monster monster) throws Exception{
		int rn;
		int heroHealth = hero.getHealth();
		int monsterHealth = monster.getHealth();
		
		while(heroHealth > 0 || monsterHealth > 0) {
			rn = random.nextInt(100);
			if(rn < 50) {
				monsterHealth -= hero.attack();
				System.out.println(hero.getClass().getSimpleName() + " attack monster with: '" + hero.getWeapon() + "' and damage is: " + hero.getDamage());
			}else {
				heroHealth -= monster.randomAttack();
				System.out.println(monster.getClass().getSimpleName() + " attack hero with: '" + monster.getWeapon() + "' and damage is: " + monster.getDamage());
			}
		}
		
		if(heroHealth > monsterHealth)
			System.out.println("HERO WON!!!");
		else
			System.out.println("MONSTER WON!!!");
	}
}

