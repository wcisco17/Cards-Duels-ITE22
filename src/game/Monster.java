package game;

public class Monster extends Cards {

	public Monster(String name, int damage, int health, int defence) {
		super(name, damage,health,defence);        
	}

    @Override
    public String toString() {
        return 
                "Card Name: " + this.name + "\n" +
                "Card Attack Power: " + this.attack + "\n" 
            + "Card Defence: " + this.defence + "\n" +
                "\n****************************\n";
    }
}
