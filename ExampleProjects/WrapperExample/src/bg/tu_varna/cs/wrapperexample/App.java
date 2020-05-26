package bg.tu_varna.cs.wrapperexample;

public class App {

	public static void main(String[] args) {

		byte b = 1;				Byte bb = 1;
		short s = 1;			Short ss = 1;
		int i = 1;				Integer ii = 1;
		long l = 1;				Long ll = 1l;
		float f = 1.5f;			Float ff = 5.4f;
		double d = 1.5;			Double dd = 4158.5;
		boolean bool = true;	Boolean bbool = false;
		char c = 'a'; 			Character ch = 'a';
		
		System.out.println(Boolean.FALSE);
		System.out.println(Long.SIZE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.BYTES);
		System.out.println(Short.MIN_VALUE);
		
		parse();
		
		System.out.println("Byte : " + bb);
		System.out.println("Short : " + ss);
		System.out.println("Integer : " + ii);
		System.out.println("Long : " + ll);
		System.out.println("Float value : " + ff);
		System.out.println("Float int value : " + ff.intValue());
		System.out.println("Double value : " + dd);
		System.out.println("Double byte value : " + dd.byteValue());
		System.out.println("Boolean : " + bbool);
		System.out.println("Character : " + ch);
	}

	private static void parse() {
		String str1 = "pets";
		String str2 = "5.124576";
		String str3 = "5,124576";
		String str4 = "5.124.576";
		String str5 = "5,124.576";
		String str6 = "5,124,576";
		
		try {
			boolean a0 = Boolean.parseBoolean(str1);
			System.out.println(a0);
		} catch (Exception e) {
			System.out.println("String value is : " + str1);
		}
		
		try {
			double a1 = Double.parseDouble(str2);
			System.out.println("Double value is : " + a1);
		} catch (Exception e) {
			System.out.println("String value is : " + str2);
		}
		
		try {
			double a2 = Double.parseDouble(str3);
			System.out.println(a2);
		} catch (Exception e) {
			System.out.println("String value is : " + str3);
		}
		
		try {
			double a3 = Double.parseDouble(str4);
			System.out.println(a3);
		} catch (Exception e) {
			System.out.println("String value is : " + str4);
		}
		
		try {
			double a4 = Double.parseDouble(str5);
			System.out.println(a4);
		} catch (Exception e) {
			System.out.println("String value is : " + str5);
		}
		
		try {
			double a5 = Double.parseDouble(str6);
			System.out.println(a5);
		} catch (Exception e) {
			System.out.println("String value is : " + str6);
		}
	}

}
