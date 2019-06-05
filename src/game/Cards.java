package game;

interface ICards {
    public void setHealth(int h);
    public void setDamage(int d);
    
    public int getHealth();
    public int getDefence();
    public int getDamage();
//    public int specialAttack();
    public String typeOFCard();
}

public class Cards implements ICards {    	
	protected int defence;
    protected String name;
    protected int health;
    protected int damage;
  
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
    
    public String typeOFCard() {
    	return "Creating Cards...";
    }
    

}
