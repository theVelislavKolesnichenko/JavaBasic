package bg.tu_varna.cs.publisher;

public interface BookEditor {
	void genereteBook(String title, int numberPages );
	void swapPages(int firstPN, int secondPN) throws Exception;
}
