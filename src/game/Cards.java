package game;

interface ICards {
    public void setHealth(int h);
    public void setDamage(int d);
    
    public int getHealth();
    public int getDefence();
    public int getDamage();
    public boolean generateAttack(Cards card_1, Cards card_2);
}

public class Cards implements ICards {    
    public int attack;
    public int defence;
    public String name;
    
    public int health;
    public int damage;
  
    public Cards(
      String name,
      int damage,
      int health,
      int defence
    ) {
      this.name = name;
      this.damage = damage;
      this.health = health;
      this.defence = defence;
    }
    
    public void setHealth(int health) {
    	this.health = health;
    }
    
    public int getHealth() {
    	return health;
    }
    
    public void setDamage(int d) {
    	this.damage = d;
    }
    
    public int getDefence() {
    	return defence;
    }
    
    public int getDamage() {
    	return damage;
    }
    
    public boolean generateAttack(Cards card_1, Cards card_2) {
    	card_1.setHealth(card_2.getHealth() - (card_1.getDamage() - card_2.getDefence()));
    	
    	if (card_2.health <= 0) {
    		return true;
    	}
    	return false;
    }
    
    
}
