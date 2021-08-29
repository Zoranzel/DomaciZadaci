package pokemoni;

public class FirePokemon extends Pokemon{

	private static String type = "Fire";
	
//	public FirePokemon(String name, String type, int health) {
//		super(name, type, health);
//		
//	}


	public FirePokemon(String name, int health) {
		super(name, health);
		
	}
	
	@Override
	public String attack() {
		
		return "with Fire";
	}
	
	@Override
	public String defend() {
		
		return "with body";
	}
	
	@Override
	public String win() {
		
		return "Grass type";
	}
	
	@Override
	public String lose() {
		
		return "Water type";
	}
	
	
	@Override
	public String logAll() {
		
		return "Attack: " + attack() + "\n"
		+ "Defend: " + defend() + "\n"
		+ "Win: " + win() + "\n" 
		+ "Lose from: " + lose(); 
	}
	
	// Napada: Vatrom
    // Brani se: Telesno
    // Pobedjuje: Grass type
    // Gubi od: Water type

}
