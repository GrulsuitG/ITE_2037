package homework5;

class Gun{
	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	public void shoot() {
		System.out.println("BBANG!");
		bullet--;
	}
}

public class Police {
	private int handcuffs;
	private Gun pistol;
	
	public Police(int bullet, int handcuffs) {
		this.handcuffs = handcuffs;
		if(bullet >0)
			pistol = new Gun(bullet);
	}
	public void putHandcuff() {
		System.out.println("SNAP!");
		handcuffs--;
	}
	public void shoot() {
		if(pistol == null)
			System.out.println("HUT BBANG!");
		else
			pistol.shoot();
	}
	public static void main(String[] args) {
		 Police p1= new Police(5,3);
		 p1.shoot();
		 p1.putHandcuff();
		 
		 Police p2 = new Police(0,3);
		 p2.shoot();
		 p2.putHandcuff();
	}
}
