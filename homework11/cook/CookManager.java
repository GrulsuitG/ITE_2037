package cook;
//첫번째 방식
public class CookManager {
	private ICook cook = new KoreanCook();
	
	public void orderRice() {
		cook.makeRice();
	}
	
	public void orderSoup() {
		cook.makeSoup();
	}
}
