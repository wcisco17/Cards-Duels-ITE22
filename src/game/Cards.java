package game;

interface ICards {
    public void setHealth(int h);
    public void setDamage(int d);
    
    public int getHealth();
    public int getDefence();
    public int getDamage();
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
    
    
    
}
