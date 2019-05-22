package game;

public class Player {
    public String name;
    public int health = 10;
    
    public Monster monster;
    public Magician magician;
    public Traps traps;

    Helper helper = new Helper();
    
    public String[] bots_name = { "BOT_1", "MR_DANGER", "SOUL_MUNCHER", "KING DENICE", "CHALLENGER", "CORRUPT",
            "PRINCESS", "CONFUSED TOAD", "ANGRY MUNCHER", "SUPPRESSED KING" };

    public boolean isPlayerAlive(int h) {
        this.health = h;
        return h < 0;
    }
   

    @SuppressWarnings("static-access")
	public String profile(String n) {
        this.name = n;

        monster = new Monster(helper.generate(helper.monsterNames), helper.generateNum() + 4, 
        		helper.generateNum() + 10, helper.generateNum() + 7);
        
        magician = new Magician(helper.generate(helper.magicianNames), helper.generateNum() + 4, 
        		helper.generateNum() + 10, helper.generateNum() + 7);
        
        traps = new Traps(helper.generate(helper.trapCardsNames), helper.generateNum() + 4, 
        		helper.generateNum() + 10, helper.generateNum() + 7);
        
        
        return "Name " + this.name + "\n" + "Health " + this.health + "\n" + "Players Card " + 
        "\n" +  "\n"  + "****************************"
        + "\n" + monster.toString() + "\n" 
        +	"****************************" 
        + "\n" + magician.toString() + "\n"
        +	"****************************"
        + "\n" + traps.toString() + "\n"
        ;
    }
    
    public Player(String n) {
        this.name = n;
    }

}
