package Book;

public class BookDAO {
	private Book[] arr = new Book[100];
	private int index = 0;
	public void regist(Book book) {
		if(index > arr.length-1) {
			System.out.println("배열이 가득 찼습니다.");
			return;
		}
		for(int i = 0; i< index; i++) {
			if(arr[i].getName().equals(book.getName())) {
				System.out.println("이미 책이 있습니다.");
				return;
			}
		}
		arr[index++] = book;
			
		
	}
	public void showList() {
		for(int i = 0; i< index; i++) {
			System.out.print(i+1 + ". ");
			System.out.println(arr[i]);
		}
		
	}
	public boolean findBook(String name) {
		for(int i = 0; i<index; i++) {
			if(arr[i].getName().equals(name))
				return true;
		}
		return false;
	}
	public Book getBook(String name) {
		for(int i = 0; i<index; i++) {
			if(arr[i].getName().equals(name))
				return arr[i];
		}
		return null;
	}
	
	
}
