package app.fight;


public class FightTest {
	
	
	public static void main(String[] args) throws Exception {
		Hero hero = new Wizard();
		Monster monster = new Dragon();
		
		hero.addWeapons("Fire Spell");
		
		hero.fight(hero, monster);
	}
}
