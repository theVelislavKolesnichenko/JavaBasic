package bg.tu_varna.cs.library;

public class LibraryBook implements ILibraryBook, Comparable<LibraryBook> {

	private Reader reader;
	private String name;
	private boolean state;
	
	public LibraryBook(String name) {
		this(name, true);
	}
	
	public LibraryBook(String name, boolean state) {
		this.name = name;
		this.state = state;
	}
	
	public Reader getReader() {
		return reader;
	}

	public void setReader(Reader reader) {
		this.reader = reader;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public boolean equals(Object obj) {
		LibraryBook book = (LibraryBook)obj;
		return this.getName().equals(book.getName());
	}

	@Override
	public String toString() {
		return "LibraryBook [ Reader: " + this.getReader() +
				" Name: " + this.getName() +
				" State: " + this.isState() +
				" ]\n";
	}

	@Override
	public int compareTo(LibraryBook o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public void get(Reader rdr) {
		this.setReader(rdr);
		this.setState(false);
	}

	@Override
	public void ret() {
		this.setReader(null);
		this.setState(true);
	}
}
