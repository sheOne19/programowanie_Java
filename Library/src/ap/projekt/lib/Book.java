package ap.projekt.lib;

public class Book {
	private String name;
	private int pageCount;
	private String author;
	
	public Book(String name, int pages, String authorName) {
		this.name = name;
		pageCount = pages;
		this.author = authorName;
	}
	
	public String GetName() {
		return name;
	}

	@Override
	public String toString() {
		return "*" + name + "*" + "  by " + author + ";   " + "<" + pageCount + " stroñ>";
	}

}
