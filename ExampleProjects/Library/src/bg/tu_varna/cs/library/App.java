package bg.tu_varna.cs.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) throws IOException {
		ArrayList<LibraryBook> libraryBooks = new ArrayList<LibraryBook>();
		
		FileReader fileReader = new FileReader("F:\\DevRepository\\JavaBasics\\ExampleProjects\\Library\\src\\bg\\tu_varna\\cs\\library\\Books.txt");
		BufferedReader reader = new BufferedReader(fileReader);
		String line;
		while((line = reader.readLine()) != null) {
			LibraryBook book = new LibraryBook(line);
			libraryBooks.add(book);
		}
		reader.close();
		
		Reader reader1 = new Reader("Student 1", "123456789");
		libraryBooks.get(1).get(reader1);
		System.out.println(libraryBooks.get(1));
		
		libraryBooks.get(2).get(reader1);
		System.out.println(libraryBooks.get(2));
		
		Collections.sort(libraryBooks);
		
		System.out.println(libraryBooks);
	}
}
