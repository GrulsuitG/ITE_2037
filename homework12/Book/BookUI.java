package Book;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BookUI {
	private Scanner scanner = new Scanner(System.in);
	private BookService service = new BookService();
	
	public void registBookSelect() {
		System.out.println("어떤 책을 구매하시겠습니까?");
		System.out.println("1. 새책 2. 중고책");
		int num = 0;
		try {
			while(num !=1 || num !=2){
			
				num = scanner.nextInt();
				scanner.nextLine();
				
				if(num == 1) {
					registNewBook();
					return;
				}
				else if (num ==2) {
					registUsedBook();
					return;
				}
				else 
					System.out.println("1 또는 2 를 입력해주세요");
			}
		} catch(InputMismatchException im) {
			System.out.println("숫자를 입력해주세요.");
		}
	}
	
	public void registNewBook() {
		System.out.println("새로운 책을 등록합니다.");
		System.out.println("새로운 책의 이름을 입력해주세요.");
		String name = scanner.nextLine();
		while(name.isBlank()) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			name = scanner.nextLine();
		}
		
		System.out.println("새로운 책의 가격을 입력해주세요.");
		int price = scanner.nextInt();
		while(price <= 0) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			price = scanner.nextInt();
		}
		
		System.out.println("몇권을 구입하시겠습니까?");
		int stock = scanner.nextInt();
		while(stock<=0) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			stock = scanner.nextInt();
		}
		Book book = new Book(name, price, stock);
		service.regist(book);
		scanner.nextLine();
	}
	
	public void registUsedBook() {
		System.out.println("중고 책을 등록합니다.");
		System.out.println("중고 책의 이름을 입력해주세요.");
		String name = scanner.nextLine();
		while(name.isBlank()) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			name = scanner.nextLine();
		}
		
		System.out.println("중고 책의 가격을 입력해주세요.");
		int price = scanner.nextInt();
		while(price <= 0) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			price = scanner.nextInt();
		}
		
		System.out.println("몇권을 구입하시겠습니까?");
		int stock = scanner.nextInt();
		while(stock<=0) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			stock = scanner.nextInt();
		}
		
		System.out.println("몇% 할인 하시겠습니까?(1-100)");
		double rate = (scanner.nextDouble()/100);
		while(rate <0 || rate >1){
			System.out.println("잘못된 입력입니다. 다시 입력해주세요. ");
			rate = (scanner.nextDouble()/100);
		}
		Book book = new UsedBook(name, price, stock, rate);
		service.regist(book);
		scanner.nextLine();
	}
	
	public void add() {
		System.out.println("기존의 책 재고량을 늘립니다.");
		
		boolean result = true;
		try {
			while(result) {
				
				service.showList();
				System.out.println("어떤 책을 구매하시겠습니까?");
				
				String name = scanner.nextLine();
				Book book = service.getBook(name);
				if(book != null) {
					System.out.println("몇권 구매하시겠습니까?");
					int stock = scanner.nextInt();
					while(stock <= 0) {
						System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
						stock = scanner.nextInt();
					}
					book.setStock(book.getStock() + stock);
					System.out.println(book.getName() +"책이 " +book.getStock() + "권이 되었습니다.");
					result = false;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 책 이름을 확인해주세요.");
					break;
				}
			}
			scanner.nextLine();
		} catch(NoBook nb) {
			System.out.println(nb.getMessage());
		}
	}
	
	public void sold() {
		System.out.println("책을 판매합니다.");
		
		boolean result = true;
		try {
			while(result) {
				service.showList();
				System.out.println("어떤 책을 판매 하시겠습니까?");
				String name = scanner.nextLine();
				Book book = service.getBook(name);
				if(book != null) {
					System.out.println("몇권 판매하시겠습니까?");
					int stock = scanner.nextInt();
					while(stock <=0) {
						System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
						stock = scanner.nextInt();
					}
					service.soldBook(book, stock);
					result = false;
				}
				else {
					System.out.println("잘못 입력하셨습니다. 책 이름을 확인해주세요.");
					break;
				}
			}
			scanner.nextLine();
		} catch(NoBook nb) {
			System.out.println(nb.getMessage());
		}
		
		
	}
	
	public void showBook() {
		System.out.println("책을 조회합니다.");
		System.out.println("어떤 책을 조회 하시겠습니까?");
		boolean result = true;
		while(result) {
			String name = scanner.nextLine();
			Book book = service.getBook(name);
			if(book != null) {
				service.showBook(name);
				result = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 책 이름을 확인해주세요.");
				break;
			}
		}
	}
	public void showList() {
		try {
			service.showList();
		} catch(NoBook nb) {
			System.out.println(nb.getMessage());
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookUI ui = new BookUI();
		boolean excute = true;
		int num ;
			while(excute) {
				System.out.println("작업할 내용을 선택하세요.");
				System.out.println("1. 새 책 입고");
				System.out.println("2. 책 재고량 증가");
				System.out.println("3. 책 판매");
				System.out.println("4. 책 조회");
				System.out.println("5. 책 전체보기");
				System.out.println("6. 종료");
				num = scan.nextInt();
				scan.nextLine();
				
				switch(num) {
					case 1:
						ui.registBookSelect();
						break;
					case 2:
						ui.add();
						break;
					case 3:
						ui.sold();
						break;
					case 4:
						ui.showBook();
					break;
					case 5:
						ui.showList();
						break;
					case 6:
						excute = false;
						break;
					default:
						System.out.println("잘못 입력하셨습니다.");
				}
			}
	}
}

