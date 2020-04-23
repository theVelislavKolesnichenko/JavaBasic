package bg.ti_varna.bg.cs;

import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Boolean[] boolArray = new Boolean[] { true, false , true};
		byte[] byteArray = new byte[] { 1, 6, 3};
		char[] charArray = new char[] { 't', 'f', 'e'};
		short[] shortArray = new short[] { 5, 9 , 1};
		int[] intArray = new int[] { 8, 9, 10};
		long[] longArray = new long[] { 48, 47, 41};
		float[] floatArray = new float[] {8.8f, 1.0f , 9.5f};
		double[] doubleArray = new double[] { 9.5 , 7.8 , 7.7};
		String[] stringArray = new String[] { "true", "false" , "true"};
		
		PrimitiveArrays arr = new PrimitiveArrays(boolArray, byteArray, charArray, shortArray, intArray, longArray, floatArray, doubleArray, stringArray);
		
		arr.sort();
		System.out.println(arr);
			
		List list = new LinkedList();
		list.add(new Integer(1));  
		Integer i = (Integer) list.iterator().next(); //неможе да се опредили типа на обекта върнат от метода next()
	
		List<Integer> list1 = new LinkedList<Integer>();
		list1.add(new Integer(1));
		Integer i1 = list1.get(1);
		Integer i2 = list1.iterator().next();
	}

}
