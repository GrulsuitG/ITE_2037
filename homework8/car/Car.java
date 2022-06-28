package car;

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~~");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}
/*
class CastingTest1{
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water();
		fe2 = (FireEngine)car;
		fe2.water();
	}
}
*/
class CastingTest2{
	public static void main(String args[]) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
