
public class Player2 extends Player1 {
	
	private int health;
	private boolean shield;
	
	public Player2(String name, String weapon, int health, boolean shield) {
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
		} if (!shield) {
			this.health -= 30;
			if(this.health <=0) this.health = 0;
			System.out.println("Shield is OFF! Got hit by Gun1.Health is reduced by 30. New Health is: " + this.health);
		}
		if (this.health == 0) {
			System.out.println(getName() + " is dead!");
		}
	}

	@Override
	public void damageByGun2() {
		
		if(shield) {
			this.health -= 25;
			if(this.health <=0) this.health = 0;
			System.out.println("Shield is On! Got hit by Gun2.Health is reduced by 25. New Health is: " + this.health);
		} if (!shield) {
			this.health -= 50;
			if(this.health <=0) this.health = 0;
			System.out.println("Shield is OFF! Got hit by Gun2.Health is reduced by 50. New Health is: " + this.health);
		}
		if (this.health == 0) {
			System.out.println(getName() + " is dead!");
		}
	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		super.heal();
	}
	
	

	}
	

