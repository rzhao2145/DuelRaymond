package duel;

public class CharacterA implements Dueler {
	
	private String name;
	private int hp2;
	private boolean isLoaded;
	public CharacterA(){
		isLoaded = false;
	}
	public void taunt() {
		String taunt =  ("You can't beat me");
		System.out.println(taunt);
	}
	
	public String getName() {
		name = "Raymond";
		return name;
	}
	
	public void setStartingHP(int hp) {
		hp2 = hp;
		System.out.println(hp);
	}
	
	public int getHP() {
		
		return hp2;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		if(d.getHP() == target) {
			return true;
		} else {
			return false;
		}
		
	}
	public int getAction(Object caller) {
		if(caller instanceof Duel) {
			if(!isLoaded) {
				if(Math.random() > .5) {
					isLoaded = true;
					return 0; //LOADED
				} 
				else {
					return 2; //GUARDING
				}
			} 
			else {
				if(Math.random() > .5) {
					isLoaded = false;
					return 1; //SHOOTING
				} 
				else {
					return 2; //GUARDING
				}
			}
		}
		else {
			return 3;
		}
	}
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			hp2 = hp2 - 10;
		}
	}
	
}
