package duel;

public class CharacterB implements Dueler {
	
	private String name;
	private int hp;
	
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
		System.out.println(hp);
	}
	
	public int getHP() {
		
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int target) {
		
		return true;
	}
	
}
