package bg.tu_varna.cs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
	
	private ArrayList<Character> characters;
	
	public ArrayListExample() {
		this.characters = new ArrayList<Character>();
	}
	
	public ArrayList<Character> getCharacters() {
		return characters;
	}
	
	public void add(char ch) {
		this.characters.add(ch);
	}
	
	public void add(Collection<Character> ch) {
		this.characters.addAll(ch);
	}
	
	public int getItemCount() {
		return characters.size();
	}
	
	private char getItem(int i) {
		return this.characters.get(i);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(this.characters.toArray());
	}
	
	@Override
	public boolean equals(Object obj) {

		ArrayListExample arrayListExample = (ArrayListExample) obj;
		
		if(this.getItemCount() != arrayListExample.getItemCount())
			return false;
		
		for (int i = 0; i < this.getItemCount(); i++) {
			if(this.getItem(i) != arrayListExample.getItem(i)) {
				return false;
			}
		}
		
		return true;
	}
}
