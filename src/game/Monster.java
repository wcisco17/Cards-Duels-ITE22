package game;

public class Monster extends Cards {
	public Helper h;
	private String CARD_TYPE = "MONSTER";
	
	public Monster(String name, int damage, int health, int defence) {
		super(name, damage,health,defence);
	}
	
	
    @Override
    public String typeOFCard() {
        return 	CARD_TYPE + "\n" +
                "Card Name: " + this.name + "\n" +
                "Card Attack Power: " + this.damage + "\n" 
            + "Card Defence: " + this.defence + "\n" +
               "Card Health: " + this.defence +
                "\n****************************\n";
    }
}
