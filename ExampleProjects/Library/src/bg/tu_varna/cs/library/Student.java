package bg.tu_varna.cs.library;

import java.util.GregorianCalendar;

public class Student extends Applicant implements Comparable<Student> {

	private String number;
	
	public Student(String name, String number) {
		this(null, name, 0, number);
	}
	
	public Student(GregorianCalendar birth, String name, double achievement, String number) {
		super(birth, name, achievement);
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Student [" + "Name: " + this.getName() +
				" Birth: " + this.getBirth() +
				" Achivment: " + this.getAchievement() +
				" Number: " + this.getNumber()
			+ "]\n";
	}

	//student1.equals(student2)
	@Override
	public boolean equals(Object obj) {
		Student st = (Student)obj;
		return st.getNumber().equals(this.getNumber());
	}

	//student1.compareTo(student2);
	@Override
	public int compareTo(Student o) {
		return this.getNumber().compareTo(o.getNumber());
	}
}
