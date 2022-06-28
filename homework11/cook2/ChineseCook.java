package cook2;

public class ChineseCook implements ICook {

	@Override
	public void makeRice() {
		System.out.println("중식 밥을 짓습니다.");
	}

	@Override
	public void makeSoup() {
		System.out.println("중식국물을 만듭니다.");
	}

	@Override
	public void makeSalad() {
		System.out.println("중식 무침을 만듭니다.");
	}

	@Override
	public void makeSource() {
		System.out.println("중식 양념장을 만듭니다.");
	}

}
