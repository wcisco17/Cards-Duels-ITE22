package game;

public class Duel {
    private int skip;
    private String name;
    private String bot;
    
    private Monster play;
    private Rounds rounds;
    private Player PLAYER_1; 
    private Player BOT;
    private Helper h;
    
    public Duel() {
    	PLAYER_1 = new Player(name);
    	BOT = new Player(bot);
    	h = new Helper();
    }

	public void startGame() {
        Helper.out("******** Welcome To " + h.programName + "********" + " \n");

        Helper.out("Let's get started... " + "\n" + "Would you like to skip the instuction?");

        do {
            Helper.out("Type (1) for yes and (2) for no");

            while (!h.console.hasNextInt()) {
                Helper.out("Type (1) for yes and (2) for no");
                h.console.next();
            }
            skip = h.console.nextInt();

        } while (skip < 1 || skip > 2);

        if (skip == 1) {
            Helper.out("Instruction skipped!");
            this.choosePlayer();
        } else if (skip == 2) {
            Helper.out(h.instruction());
            this.choosePlayer();
        }
    }

    private void choosePlayer() {

        Helper.out("Choose any name you want... ");

        PLAYER_1.name = h.console.next();

        name = PLAYER_1.name;

        Helper.out("Thank you " + name + " Here is your Profile Cards and health Good Luck.. " + "\n"
                + "---------------------------------------------" + "\n" + PLAYER_1.profile(name) + "\n"
                + "---------------------------------------------");

        bot = h.generate(BOT.bots_name);

        Helper.out("Challenger name is " + bot + "\n" + "Profile: " + "\n" + BOT.profile(bot));

        Helper.out("Would You like to proceed and Attack or go back to menu?");

        do {
        	Helper.out("Type (1) for yes and (2) for no");
            while (!h.console.hasNextInt()) {
                Helper.out("Type (1) for yes and (2) for no");
                h.console.next();
            }
            skip = h.console.nextInt();

        } while (skip < 1 || skip > 2);

        if (skip == 1) {
        	rounds = new Rounds(PLAYER_1, BOT);
        	Helper.out(rounds.finalResult());
        	
        } else if (skip == 2) {
            Helper.out("Going back to the menu.. ");
            this.startGame();
        } else {
        	Helper.out("Type (1) for yes and (2) for no");
        }
        
    }
}
