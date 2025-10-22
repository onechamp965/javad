package exam1020;

public class Book {
	private String title;
	private int price;
	private String isbn;
	private String author;
	
	public Book( String title, String author, String isbn) {
		this(title, author, isbn, 0);
	
	
	}

	public Book(String title, String author, String isbn, int price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}