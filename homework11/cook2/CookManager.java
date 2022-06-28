package cook2;
//두번째 방식

public class CookManager {
	private ICook cook;
	
	public CookManager(ICook cook) {
		this.cook=cook;
	}
	public void setCook(ICook cook) {
		this.cook =cook;
	}
	
	public void orderRice() {
		cook.makeRice();
	}
	
	public void orderSoup() {
		cook.makeSoup();
	}
}
