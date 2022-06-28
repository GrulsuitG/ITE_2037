package cook2;

public class CookTest {
	public static void main(String[] args) {
		ICook cook = new KoreanCook();
		CookManager manager = new CookManager(cook);
		manager.orderRice();
		manager.orderSoup();
		
		ICook cook1 = new ChineseCook();
		manager.setCook(cook1);
		manager.orderRice();
		manager.orderSoup();
	}
}
