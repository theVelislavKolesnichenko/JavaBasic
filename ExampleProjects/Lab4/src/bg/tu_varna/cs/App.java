package bg.tu_varna.cs;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] animals = new Animal[4];
		
		animals[0] = new DomesticCat();
		animals[1] = new Leopard();
		animals[2] = new Human("Ivan");
		animals[3] = new Fish();		
		
		for(Animal animal : animals) {
			animal.move();
			animal.communicate();
		}
		
		WeekOfDay[] weekOfDays = new WeekOfDay[7];
		
		Day[] days = Day.values();
		
		for(int i = 0; i < 7; i++) {
			weekOfDays[i] = new WeekOfDay(days[i]);
		}
		
		for(WeekOfDay weekOfDay : weekOfDays) {
			System.out.println(weekOfDay.itIs());
		}
	}
}
