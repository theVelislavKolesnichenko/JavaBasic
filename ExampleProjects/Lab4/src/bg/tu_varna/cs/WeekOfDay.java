package bg.tu_varna.cs;

public class WeekOfDay {

	private Day day;
	
	public WeekOfDay(Day day) {
		this.day = day;
	}
	
	public String itIs() {
		
		switch(day) {
			case MONDAY: case TUESDAY: case WEDNESDAY: case THURSDAY: case FRIDAY:
				return "working days";
			case SATURDAY: case SUNDAY:
			default:
				return "holidays";
		}
	}
}
