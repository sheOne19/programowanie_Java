package ap.projekt.lib;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka{
	private List<User> users; 
	private List<Book> books;

	public Biblioteka() {
		users = new ArrayList();
		books = new ArrayList();
	}
	
	public String AddBook() {
		books.add(new Book());
		return "Dodano";
	}
	public int BookCount() {
		return books.size();
	}
}
