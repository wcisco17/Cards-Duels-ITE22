package game;

public class Player {
    public String name;
    protected int health = 10;
    
    protected Monster monster;
    protected Magician magician;
    protected Traps traps;

    Helper helper = new Helper();
    
    protected String[] bots_name = { "BOT_1", "MR_DANGER", "SOUL_MUNCHER", "KING DENICE", "CHALLENGER", "CORRUPT",
            "PRINCESS", "CONFUSED TOAD", "ANGRY MUNCHER", "SUPPRESSED KING" };
   

    public String profile(String n) {
        this.name = n;
       
        return "Name " + this.name + "\n" + "Health " + this.health + "\n" + "Players Card " + 
        "\n" +  "\n"  + "****************************"
        + "\n" + monster.typeOFCard() + "\n" 
        +	"****************************" 
        + "\n" + magician.typeOFCard() + "\n"
        +	"****************************"
        + "\n" + traps.typeOFCard() + "\n"
        ;
    }
    
    public Player(String n) {
        this.name = n;
        monster = new Monster(helper.generate(Helper.monsterNames), helper.generateNum() + 4, 
        		helper.generateNum() + 10, helper.generateNum() + 7);
        
        magician = new Magician(helper.generate(Helper.magicianNames), helper.generateNum() + 4, 
        		helper.generateNum() + 10, helper.generateNum() + 7);
        
        traps = new Traps(helper.generate(Helper.trapCardsNames), helper.generateNum() + 4, 
        		helper.generateNum() + 10, helper.generateNum() + 7);
    }
 

}
