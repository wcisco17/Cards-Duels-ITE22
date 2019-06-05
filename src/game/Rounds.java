package game;

public class Rounds {
	Helper h = new Helper();
	Player you;
	Player enemy;
	private int yourScore;
	private int enemyScore;
	
	public Rounds(Player you, Player enemy) {
		this.you = you;
		this.enemy = enemy;
	}

	private int firstRound() {
		 Helper.out(
 				"---------------------------------------" + "\n" +
					 	"***** First Round *****" + "\n" + 
					 	you.monster.name + " Vs. " + enemy.monster.name
				   );
		 
	        while (you.health >= 5 || enemy.health >= 5) {
	        	if (h.generateAttack(you.monster, enemy.monster)) {
	        		you.health -= 1;
	        		enemy.health -= 2;
	        		Helper.out(
	        				"Player 1 HEALTH: " + you.health + "\n" + 
	        				"BOT HEALTH: " + enemy.health + "\n" 
	        			);
	        		return  1;
	        	} else if (h.generateAttack(enemy.monster, you.monster)) {
	        		you.health -= 2;
	        		enemy.health -= 1;
	        		Helper.out(
	        				"Player 1 HEALTH: " + you.health + "\n" +
	        				"BOT HEALTH: " + enemy.health + "\n" +
	        				"---------------------------------------" 
	        			);
	        		return 2;
		        } 
	        }
	        return 3;	
	}
	
	public int secondRound() {
		 Helper.out(
				 	"***** Second Round *****" + "\n" + 
				 	you.magician.name + enemy.magician.name
			   );
		 
        while (you.health >= 5 || enemy.health >= 5) {
        	if (h.generateAttack(you.magician, enemy.magician)) {
        		you.health -= 1;
        		enemy.health -= 2;
        		Helper.out(
        				"Player 1 HEALTH: " + you.health + "\n" + 
        				"BOT HEALTH: " + enemy.health + "\n" 
        			);
        		return  1;
        	} else if (h.generateAttack(enemy.magician, you.magician)) {
        		you.health -= 2;
        		enemy.health -= 1;
        		Helper.out(
        				"Player 1 HEALTH: " + you.health + "\n" +
        				"BOT HEALTH: " + enemy.health + "\n" +
        				"---------------------------------------" 
        			);
        		return 2;
	        } 
        }
        return 3;
	}
	
	public int finalRound() {
		 Helper.out(
				 	"***** Final Round *****" + "\n" + 
				 	you.traps.name + enemy.traps.name
			   );
		 
        while (you.health >= 5 || enemy.health >= 5) {
        	if (h.generateAttack(you.traps, enemy.traps)) {
        		you.health -= 1;
        		enemy.health -= 2;
        		Helper.out(
        				"Player 1 HEALTH: " + you.health + "\n" + 
        				"BOT HEALTH: " + enemy.health + "\n" 
        			);
        		return  1;
        	} else if (h.generateAttack(enemy.traps, you.traps)) {
        		you.health -= 2;
        		enemy.health -= 1;
        		Helper.out(
        				"Player 1 HEALTH: " + you.health + "\n" +
        				"BOT HEALTH: " + enemy.health + "\n" +
        				"---------------------------------------" 
        			);
        		return 2;
	        } 
        }
        return 3;
	}
	
	
	public String finalResult() {
		int total;
		
		 if (h.checkStatement(this.firstRound()) == 1) {
			 yourScore =+ 1;
		 } else if (h.checkStatement(this.firstRound()) == 2) {
			 enemyScore =+ 1;
		 }
		 
		 
		 if (h.checkStatement(this.secondRound()) == 1) {
			 yourScore =+ 1;
		 } else if (h.checkStatement(this.secondRound()) == 2) {
			 enemyScore=+ 1;
		 }
		 
		 
		 if (h.checkStatement(this.finalRound()) == 1) {
			 yourScore =+1;
		 } else if (h.checkStatement(this.finalRound()) == 2) {
			 enemyScore =+ 1;
		 }
		 
		 
		 if (yourScore > enemyScore) {
			 return "Winnner is " + you.name;
		 } 
		 
		 return "You lost Winner is " + enemy.name;
		 
		 
//		 h.checkStatement(
//					this.secondRound(),
//					"Winner For the First Round is " + you.name + " *** Congrats *** ",
//					 "Winner For the First Round is " + enemy.name + " *** You lost : ( ***",
//					 "Tied! " + " *** REPLAY No Winner *** ");

				
	}

    
}
