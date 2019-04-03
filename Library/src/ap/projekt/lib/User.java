package ap.projekt.lib;

import java.util.List;

public class User {
	private String name;
	private int age;
	private String surname;
	private List<Book> books;
	public User(String name, String surname, int age) {
		this.name = name;
		this.age = age;
		this.surname  = surname;
	}

	@Override
	public String toString() {
		return name + "  " + surname + ",  " + age + "y.o.";
	}

}