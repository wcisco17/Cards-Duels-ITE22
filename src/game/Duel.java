package game;

public class Duel extends Helper {
    private int skip;
    private String name;
    private String bot;
    Monster play;
    Player PLAYER_1; 
    Player BOT;
    
    public Duel() {
    	PLAYER_1 = new Player(name);
    	BOT = new Player(bot);
    }

    public void startGame() {
        out("******** Welcome To " + programName + "********" + " \n");

        out("Let's get started... " + "\n" + "Would you like to skip the instuction?");

        do {
            out("Type (1) for yes and (2) for no");

            while (!console.hasNextInt()) {
                out("Type (1) for yes and (2) for no");
                console.next();
            }
            skip = console.nextInt();

        } while (skip < 1 || skip > 2);

        if (skip == 1) {
            out("Instruction skipped!");
            this.choosePlayer();
        } else if (skip == 2) {
            out(this.instruction());
            this.choosePlayer();
        }
    }

    private void choosePlayer() {

        out("Choose any name you want... ");

        PLAYER_1.name = console.next();

        name = PLAYER_1.name;

        out("Thank you " + name + " Here is your Profile Cards and health Good Luck.. " + "\n"
                + "---------------------------------------------" + "\n" + PLAYER_1.profile(name) + "\n"
                + "---------------------------------------------");

        bot = this.generate(BOT.bots_name);

        out("Challenger name is " + bot + "\n" + "Profile: " + "\n" + BOT.profile(bot));

        out("Would You like to proceed and Attack or go back to menu?");

        do {
            while (!console.hasNextInt()) {
                out("Type (1) for yes and (2) for no");
                console.next();
            }
            skip = console.nextInt();

        } while (skip < 1 || skip > 2);

        if (skip == 1) {
        	
        	if (this.duel() == 1)
        		out("Player one Wins");
        		else if (this.duel() == 2)
        		out("Bot one Wins");
        	
        } else if (skip == 2) {
            out("Going back to the menu.. ");
            this.startGame();
        } else {
        	out("Type (1) for yes and (2) for no");
        }
        
 
    }
  

    public int duel() {
    	
    		out(
    			"Preparing For Duel! " + PLAYER_1.monster.name + " VS." + BOT.monster.name
    		);
    			
	        while (true) {
	        	if (play.generateAttack(PLAYER_1.monster, BOT.monster)) {
	        		PLAYER_1.health -= 1;
	        		BOT.health -= 2;
	        		out(
	        				"Player 1 HEALTH: " + PLAYER_1.health + "\n" + 
	        				"BOT HEALTH: " + BOT.health
	        			);
	        		return  1;
	        	} else if (play.generateAttack(BOT.monster, PLAYER_1.monster)) {
	        		PLAYER_1.health -= 2;
	        		BOT.health -= 1;
	        		out(
	        				"Player 1 HEALTH: " + PLAYER_1.health + "\n" +
	        				"BOT HEALTH: " + BOT.health
	        			);
	        		return 2;
		        }
	        }
	        
    }
    
    

}
