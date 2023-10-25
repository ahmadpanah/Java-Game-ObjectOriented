
public class Main {
	public static void main (String[] args) {
		Player1 player = new Player1("Hossein" , "AK47" , 100);
		player.damageByGun1();
		player.damageByGun2();
		player.heal();
		
		
		Player2 better = new Player2("Hossein" , "RPG" , 80 , false);
		better.damageByGun1();
		better.heal();


		
		
	}
	
	

}
