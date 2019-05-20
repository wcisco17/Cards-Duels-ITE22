package game;

public class Traps extends Cards {

	public Traps(String name, int damage, int health, int defence) {
		super(name, damage,health,defence);        
	}
	
    public boolean generateAttack(Traps card_1, Traps card_2) {
    	card_1.setHealth(card_2.getHealth() - (card_1.getDamage() - card_2.getDefence()));
    	
    	if (card_2.health <= 0) {
    		return true;
    	}
    	return false;
    }

    @Override
    public String toString() {
        return 	"Trap Card" + "\n" +
                "Card Name: " + this.name + "\n" +
                "Card Attack Power: " + this.damage + "\n" 
            + "Card Defence: " + this.defence + "\n" +
               "Card Health: " + this.defence +
                "\n****************************\n";
    }
}
