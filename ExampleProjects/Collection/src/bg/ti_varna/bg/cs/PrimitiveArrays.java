package bg.ti_varna.bg.cs;

import java.util.Arrays;

public class PrimitiveArrays {

	private Boolean[] boolArray;
	private byte[] byteArray;
	private char[] charArray;
	private short[] shortArray;
	private int[] intArray;
	private long[] longArray;
	private float[] floatArray;
	private double[] doubleArray;
	private String[] stringArray;
	
	public PrimitiveArrays(boolean boolArray, byte byteArray, char charArray, short shortArray, int intArray,
			long longArray, float floatArray, double doubleArray, String stringArray) {
		Arrays.fill(this.boolArray, boolArray);
		Arrays.fill(this.byteArray, byteArray);
		Arrays.fill(this.charArray, charArray);
		Arrays.fill(this.shortArray, shortArray);
		Arrays.fill(this.intArray, intArray);
		Arrays.fill(this.longArray, longArray);
		Arrays.fill(this.floatArray, floatArray);
		Arrays.fill(this.doubleArray, doubleArray);
		Arrays.fill(this.stringArray, stringArray);
	}
	
	public PrimitiveArrays(Boolean[] boolArray, byte[] byteArray, char[] charArray, short[] shortArray, int[] intArray,
			long[] longArray, float[] floatArray, double[] doubleArray, String[] stringArray) {
		super();
		this.boolArray = boolArray;
		this.byteArray = byteArray;
		this.charArray = charArray;
		this.shortArray = shortArray;
		this.intArray = intArray;
		this.longArray = longArray;
		this.floatArray = floatArray;
		this.doubleArray = doubleArray;
		this.stringArray = stringArray;
	}
	
	public void sort() {
		Arrays.sort(this.boolArray);
		Arrays.sort(this.byteArray);
		Arrays.sort(this.charArray);
		Arrays.sort(this.shortArray);
		Arrays.sort(this.intArray);
		Arrays.sort(this.longArray);
		Arrays.sort(this.floatArray);
		Arrays.sort(this.doubleArray);
		Arrays.sort(this.stringArray);
	}

	@Override
	public String toString() {
		return Arrays.toString(this.boolArray) + "\n" + 
		Arrays.toString(this.byteArray) + "\n" +
		Arrays.toString(this.charArray) + "\n" +
		Arrays.toString(this.shortArray) + "\n" +
		Arrays.toString(this.intArray) + "\n" +
		Arrays.toString(this.longArray) + "\n" +
		Arrays.toString(this.floatArray) + "\n" +
		Arrays.toString(this.doubleArray) + "\n" +
		Arrays.toString(this.stringArray);
	}
	
	
	
}
