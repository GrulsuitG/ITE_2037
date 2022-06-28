package Book;

class ArrayOverIndexException extends Exception{
	public ArrayOverIndexException() {
		super("공간이 부족합니다.");
	}
}

class DuplicatedRegist extends Exception{
	public DuplicatedRegist(String name) {
		super(name +"는 이미 등록된 책입니다.");
	}
}

class OutStock extends Exception{
	public OutStock(String name, int stock) {
		super(name + "책이 "+stock + "권 부족합니다.");
	}
}

class NoBook extends Exception{
	public NoBook() {
		super("등록된 책이 없습니다.");
	}
}

public class BookService {
	private BookDAO dao = new BookDAO();
	
	public void regist(Book book) {
		try{
			dao.regist(book);
		}catch(ArrayOverIndexException ao) {
			System.out.println(ao.getMessage());
		} catch(DuplicatedRegist dr) {
			System.out.println(dr.getMessage());
		}
	}
 
	public void showList() throws NoBook {
		dao.showList();
	}

	public Book getBook(String name) {
		boolean ok = dao.findBook(name);
		if(ok)
			return dao.getBook(name);
		else
			return null;
		
	}

	public void showBook(String name) {
		boolean ok = dao.findBook(name);
		if(ok)
			System.out.println(dao.getBook(name));
		else
			System.out.println("해당하는 책이 없습니다.");
		
	}
	
	public void soldBook(Book book, int stock) {
		try{
			dao.soldBook(book, stock);
			System.out.println(book.getName() + "책이 " + stock + "권 판매 되었습니다.");
		} catch (OutStock os) {
			System.out.println(os.getMessage());
		}
	}
}
