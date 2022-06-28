package Book;

public class UsedBook extends Book {
	private double rate;
	
	public UsedBook() {}
	
	public UsedBook(String name, int price, int stock , double rate) {
		super(name,price,stock);
		this.rate = rate;
	}
	
	public void setRate(double rate) {
		if(rate < 0 || rate >1) {
			System.out.println("잘못된 입력입니다. 0과 1 사이를 입력해주세요.");
			return;
		}
		this.rate = rate;
	}
	
	public double getRate() {
		return rate;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", 할인율 : " + rate*100 + "%, 할인된 가격 : " + getPrice()*(1-rate);
	}
}
