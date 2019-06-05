package game;

public class Magician extends Cards {
	protected Helper h;
	protected String CARD_TYPE = "MAGICIAN";
	
	public Magician(String name, int damage, int health, int defence) {
		super(name, damage,health,defence);        
	}
	
	protected boolean generateAttack(Magician card_1, Magician card_2) {
    	card_1.setHealth(card_2.getHealth() - (card_1.getDamage() - card_2.getDefence()));
    	
    	if (card_2.health <= 0) {
    		return true;
    	}
    	return false;
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
