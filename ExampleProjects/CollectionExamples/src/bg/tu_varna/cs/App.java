package bg.tu_varna.cs;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int op;
		do {
			System.out.println("Menu Collection Example");
			System.out.println("1. Array List Example");
			System.out.println("2. Map Example");
			System.out.println("3. Exit");
			
			op = scanner.nextInt();	
			
			switch (op) {
			case 1:
				ArrayListExample();
				break;
			case 2: 
				MapExample();
				break;
			case 3:
				return;
			}
			
		} while (op != 3);
	}

	private static void MapExample() {
		MapExample mapExample = new MapExample();
		
		mapExample.add("Rainbow Six Siege", 4);
		mapExample.add("Apex Legends", 2);
		mapExample.add("Overwatch", 1);
		mapExample.add("Fortnite Battle Royale", 2);
		mapExample.add("PlayerUnknown's Battlegrounds", 3);
		mapExample.add("Rocket League", 4);
		mapExample.add("Hearthstone", 1);
		mapExample.add("League of Legends", 5);
		mapExample.add("CS:GO", 6);
		
		System.out.println(mapExample);
		
		 SearchGame(mapExample);

		int value = mapExample.update("Overwatch", 2);
		
		System.out.println("Old value: " + value);
		
		SearchGame(mapExample);
		
	}

	private static void SearchGame(MapExample mapExample) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter game name: ");
		String game = scanner.nextLine();
		
		if(mapExample.haxExist(game)) {
			System.out.println("Game " + game + " is play by: " 
									+ mapExample.search(game));
		} else {
			System.out.println("The game missing");
		}
	}

	private static void ArrayListExample() {
		
		ArrayListExample arrayListExample = new ArrayListExample();
		
		arrayListExample.add('G');
		arrayListExample.add('o');
		arrayListExample.add('6');	
		arrayListExample.add('o');
		
		ArrayListExample arrayListExample1 = new ArrayListExample();
		
		arrayListExample1.add('L');
		arrayListExample1.add('i');
		arrayListExample1.add('l');	
		arrayListExample1.add('i');
		
		arrayListExample.add(arrayListExample1.getCharacters());
		
		System.out.println(arrayListExample);
		System.out.println(arrayListExample1);
		
		arrayListExample = arrayListExample1;
		
		System.out.println(arrayListExample);
		System.out.println(arrayListExample1);
		
		if(arrayListExample == arrayListExample1) {
			System.out.println(arrayListExample.getItemCount());
			System.out.println(arrayListExample1.getItemCount());
		}
		
		arrayListExample.add('!');
		System.out.println("arrayListExample1: " + arrayListExample1);
		
		arrayListExample1.add('?');
		System.out.println("arrayListExample: " + arrayListExample);
		
		
		ArrayListExample arrayListExample2 = new ArrayListExample();
		arrayListExample2.add('O');
		arrayListExample2.add('l');
		arrayListExample2.add('e');
		
		ArrayListExample arrayListExample3 = new ArrayListExample();
		arrayListExample3.add('O');
		arrayListExample3.add('l');
		arrayListExample3.add('e');
		
		if(arrayListExample3 == arrayListExample2) {
			System.out.println("==");
		} else if(arrayListExample3.equals(arrayListExample2)) {
			System.out.println("equals");
		} else {
			System.out.println("empty");
		}
	}
	
}
