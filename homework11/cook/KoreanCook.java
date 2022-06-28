package cook;

public class KoreanCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("한식 밥을 짓습니다.");
	}

	@Override
	public void makeSoup() {
		System.out.println("고기국물을 만듭니다.");
	}

	@Override
	public void makeSalad() {
		System.out.println("한식 무침을 만듭니다.");
	}

	@Override
	public void makeSource() {
		System.out.println("고추장 양념장을 만듭니다.");
	}
}
