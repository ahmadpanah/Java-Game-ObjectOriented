
public class Player2 extends Player1 {
	
	private int health;
	private boolean shield;
	
	public Player2(String name, String weapon, int health) {
		super(name, weapon, health);
		this.health = health;
		this.shield = shield;
	}
	
	@Override
	public void damageByGun1() {
		if(shield) {
			this.health -= 10;
			if(this.health <=0) this.health = 0;
			System.out.println("Shield is On! Got hit by Gun1.Health is reduced by 10. New Health is: " + this.health);
		} if (!shield)
	}
	
	
	
	
}
