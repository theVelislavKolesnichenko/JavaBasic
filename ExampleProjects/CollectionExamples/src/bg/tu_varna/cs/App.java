package bg.tu_varna.cs;

public class App {

	public static void main(String[] args) {

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
