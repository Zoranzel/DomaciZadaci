package pokemoni;

public class WaterPokemon extends Pokemon{

	private static String type = "Water";
	
//	public WaterPokemon(String name, String type, int health) {
//		super(name, type, health);
//		
//	}
	
	public WaterPokemon(String name, int health) {
		super(name, health);
		
	}
	
	
	@Override
    public String attack() {
		
		return "with Water";
	}
	
    @Override
	public String defend() {
		
		return "with Water";
	}
	
	@Override
	public String win() {
		
		return "Fire type";
	}
	
	@Override
	public String lose() {
		
		return "Grass type";
	}
	
	
	@Override
	public String logAll() {
		
		return  "Attack: " + attack() + "\n"
		+ "Defend: " + defend() + "\n"
		+ "Win: " + win() + "\n" 
		+ "Lose from: " + lose(); 
	}
	
	
	
	// Napada: Vodom
    // Brani se: Vodom
    // Pobedjuje: Fire type
    // Gubi od: Grass type

}
