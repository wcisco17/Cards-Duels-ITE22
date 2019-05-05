package game;

interface IPlayer {
	public boolean isPlayerAlive(int h);
	public String profile(String n);
}

public class Player implements IPlayer {
    public String name;
    public int health = 10;
    
    public Monster monster;

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

        monster = new Monster(helper.generate(helper.monsterNames), helper.generateNum(), helper.generateNum(), helper.generateNum());

        return "Name " + this.name + "\n" + "Health " + this.health + "\n" + "Players Card " + "\n" + monster.toString();
    }
    
    public Player(String n) {
        this.name = n;
    }

}
