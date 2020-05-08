package bg.tu_varna.cs.library;

import java.util.GregorianCalendar;

public class Reader extends Student implements IReader, Comparable<Student> {

	public Reader(String name,String number) {
		this(null, name, 0, number);
	}
	
	public Reader(GregorianCalendar birth, String name, double achievement, String number) {
		super(birth, name, achievement, number);
	}

	@Override
	public void get() {
		// TODO Auto-generated method stub
	}

	@Override
	public void ret(Reader rdr) {
		// TODO Auto-generated method stub
	}
	
}
