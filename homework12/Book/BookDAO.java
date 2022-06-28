package Book;



public class BookDAO {
	private Book[] arr = new Book[3];
	private int index = 0; 
	public void regist(Book book) throws ArrayOverIndexException, DuplicatedRegist{
		if(index > arr.length-1) {
			throw new ArrayOverIndexException();
		}
		for(int i = 0; i< index; i++) {
			if(arr[i].getName().equals(book.getName())) {
				throw new DuplicatedRegist(book.getName());
			}
		}
		arr[index++] = book;
	}
	
	
	
	public void showList() throws NoBook{
		if(index == 0) throw new NoBook();
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
	
	public boolean soldBook(Book book, int stock) throws OutStock{
		if(book.getStock() > stock) {
			book.setStock(book.getStock() - stock);
			return true;
		}
		else {
			throw new OutStock(book.getName(), stock - book.getStock());
		}
	}
	
}
