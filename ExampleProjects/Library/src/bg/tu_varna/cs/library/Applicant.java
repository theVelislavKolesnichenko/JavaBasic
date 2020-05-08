package bg.tu_varna.cs.library;

import java.util.GregorianCalendar;

public class Applicant {
	private String name;
	private GregorianCalendar birth;
	private double achievement;
	
	public Applicant(GregorianCalendar birth, String name, double achievement) {
		this.name = name;
		this.birth = birth;
		this.achievement = achievement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GregorianCalendar getBirth() {
		return birth;
	}

	public void setBirth(GregorianCalendar birth) {
		this.birth = birth;
	}

	public double getAchievement() {
		return achievement;
	}

	public void setAchievement(double achievement) {
		this.achievement = achievement;
	}

	@Override
	public String toString() {
		return "Applicant [" + "Name: " + this.getName() +
			"Birth: " + this.getBirth() +
			"Achivment: " + this.getAchievement()
		+ "]\n";
	}
	
	
}
