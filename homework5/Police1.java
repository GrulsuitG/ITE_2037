package homework5;

class Gun1{
	private int bullet;
	
	public Gun1(int bullet) {
		this.bullet = bullet;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}

public class Police1 {
	private int handcuffs;
	
	
	public Police1(int handcuffs) {
		this.handcuffs = handcuffs;
		
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	public void shoot(Gun1 pistol) {
		if(pistol == null)
			System.out.println("HUT BBANG!");
		else
			pistol.shoot();
	}
	public static void main(String[] args) {
		 Police1 p1= new Police1(3);
		 Gun1 pistol = new Gun1(3);
		 p1.shoot(pistol);
		 p1.putHandcuff();
		 
		 Police1 p2 = new Police1(3);
		 Gun1 pistol1 =null;
		 p2.shoot(pistol1);
		 p2.putHandcuff();
	}
}
