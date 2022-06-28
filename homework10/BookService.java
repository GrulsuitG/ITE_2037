package Book;

public class BookService {
	private BookDAO dao = new BookDAO();
	
	public void regist(Book book) {
		dao.regist(book);
	}

	public void showList() {
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
}
