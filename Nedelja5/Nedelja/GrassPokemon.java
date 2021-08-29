package pokemoni;

public class GrassPokemon extends Pokemon{
	
	private static String type = "Grass";
	
//	public GrassPokemon(String name, String type, int health) {
//		super(name, type, health);
//		
//	}

	public GrassPokemon(String name, int health) {
		super(name, health);
		
	}

	
	
	@Override
    public String attack() {
		
		return "with Grass";
	}
	
    @Override
	public String defend() {
		
		return "with avoids";
	}
	
	@Override
	public String win() {
		
		return "Water type";
	}
	
	@Override
	public String lose() {
		
		return "Fire type";
	}
	
	@Override
	public String logAll() {
		
		return "Attack: " + attack() + "\n"
		+ "Defend: " + defend() + "\n"
		+ "Win: " + win() + "\n" 
		+ "Lose from: " + lose(); 
	}
	
	
	
	  // Napada: Travom
    // Brani se: Izbegava
    // Pobedjuje: Water type
    // Gubi od: Fire type

}
