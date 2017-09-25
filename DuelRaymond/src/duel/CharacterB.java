package duel;

public class CharacterB implements Dueler {
	
	private String name;
	private int hp2;
	private int rounds2 = 0;

	
	public CharacterB(){
		
	}
	public void taunt() {
		String taunt =  ("Fight");
		System.out.println(taunt);
	}
	
	public String getName() {
		name = "Derek";
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
		if(rounds2 == 0) {
			rounds2++;
			return 0;
		} else {
			rounds2++;
			return (int)(Math.random()*3);
		}
	}
	public void hit(Object caller) {
		hp2 = hp2 - 10;
	}
}
