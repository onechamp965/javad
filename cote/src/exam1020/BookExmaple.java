package exam1020;

public class BookExmaple {
	 public static void main(String []args ) {
		 Book[] books = new Book[3];
		 books[0] = new Book("java", "김강민", "123-333-112", 20000);
		 books[1] = new Book("c", "김강현", "123-334-567", 15000);
		 books[2] = new Book("python", "김기중", "123-335-222", 18000);
		 
//		for ( int i = 0; i < books.length; i++ ) {
//			System.out.println(books[i].getTitle());
//		}
		for ( Book book : books ) {
			System.out.println(book.getTitle());
			System.out.println(book.getAuthor());
			System.out.println(book.getIsbn());
			System.out.println(book.getPrice());
			System.out.println();
		}
		
	 }
}
