package Book;

public class Book {
	private String name;
	private int price;
	private int stock;
	
	public Book() {}
	public Book(String name, int price) {
		this(name, price, 0);
	}

	public Book(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		if(price <= 0)
			System.out.println("잘못된 가격입니다.");
		else
			this.price = price;
	}
	public boolean setStock(int stock) {
		if(stock < 0) {
			System.out.println("재고가 부족합니다. 다시 입력해주세요.");
			return false;
		}
		else {
			this.stock = stock;
			return true;
		}
		
	}
	
	public String toString() {
		return "책 이름 : " + name + ", 가격 : " + price + ", 재고량 : " + stock;
	}
	
	
}
