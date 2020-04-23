package bg.tu_varna.cs.publisher;

public class App {

	public static void main(String[] args) {
		Book book = new Book(5, "Kiki");
		
		System.out.println(book);
		
		book.addPage(new Page(6, "Koko"));
		System.out.println(book);
		
		book.removePage1(2);
		System.out.println(book);
		
		try {
			book.swapPages(1, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(book);
		
	}
}
