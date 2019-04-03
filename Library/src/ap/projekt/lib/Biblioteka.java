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
	
	public void AddBook(String name, int pages, String authorName) {
		Book book =new Book(name, pages, authorName);
		books.add(book);
				
	}
	public void GetBooks() {

		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
	public void AddUser(String name, String surname, int age) {
		User user = new User(name, surname, age);
		users.add(user);	
	}
	public void GetUsers() {
		for (User user : users) {
			System.out.println(user.toString());
		}
	}

}
