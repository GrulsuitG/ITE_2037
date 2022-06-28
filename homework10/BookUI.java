package Book;

import java.util.Scanner;

public class BookUI {
	private Scanner scanner = new Scanner(System.in);
	private BookService service = new BookService();
	
	public void regist() {
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
	
	public void add() {
		System.out.println("기존의 책 재고량을 늘립니다.");
		System.out.println("어떤 책을 구매하시겠습니까?");
		boolean result = true;
		while(result) {
			service.showList();
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
				System.out.println("다시 입력하시겠습니까?(Y/N)");
				if(scanner.next().equalsIgnoreCase("Y"))
					result = true;
				else
					result = false;
			}
		}
		scanner.nextLine();
	}
	
	public void sold() {
		System.out.println("책을 판매합니다.");
		System.out.println("어떤 책을 판매 하시겠습니까?");
		boolean result = true;
		while(result) {
			service.showList();
			String name = scanner.nextLine();
			Book book = service.getBook(name);
			if(book != null) {
				System.out.println("몇권 판매하시겠습니까?");
				int stock = scanner.nextInt();
				while(stock <=0) {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					stock = scanner.nextInt();
				}
				while(!book.setStock(book.getStock()-stock)) {
					stock = scanner.nextInt();
					while(stock <=0) {
						System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
						stock = scanner.nextInt();
					}
				}
				System.out.println(book.getName() +"책이 "+stock +"권 판매 되었습니다.");
				result = false;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 책 이름을 확인해주세요.");
				System.out.println("다시 입력하시겠습니까?(Y/N)");
				if(scanner.next().equalsIgnoreCase("Y"))
					result = true;
				else
					result = false;
			}
		}
		scanner.nextLine();
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
				System.out.println("다시 입력하시겠습니까?(Y/N)");
				if(scanner.next().equalsIgnoreCase("Y"))
					result = true;
				else
					result = false;
			}
		}
	}
	public void showList() {
		service.showList();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BookUI ui = new BookUI();
		boolean excute = true;
		while(excute) {
			System.out.println("작업할 내용을 선택하세요.");
			System.out.println("1. 새 책 입고");
			System.out.println("2. 책 재고량 증가");
			System.out.println("3. 책 판매");
			System.out.println("4. 책 조회");
			System.out.println("5. 책 전체보기");
			System.out.println("6. 종료");
			int num = scan.nextInt();
			
			switch(num) {
			case 1:
				ui.regist();
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
