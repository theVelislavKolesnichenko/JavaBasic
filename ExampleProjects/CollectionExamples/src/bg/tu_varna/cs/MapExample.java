package bg.tu_varna.cs;

import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	
	private Map<String, Integer> map;
	
	public MapExample() {
		this.map = new TreeMap<String, Integer>();
	}
	
	public void add(String key, int value) {
		map.put(key, value);
	}
	
	public void add(Map<String, Integer> map) {
		this.map.putAll(map);
	}
	
	public Map<String, Integer> getMap() {
		return map;
	}
	
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	public Integer search(String key) {
		return map.get(key);
	}
	
	public boolean haxExist(String key) {
		return map.containsKey(key);
	}
	
	public Integer update(String key, int value) {
		return map.put(key, value);
	}
	
	@Override
	public String toString() {
		return toString3();
	}
	
	private String toString3() {
		StringBuilder result = new StringBuilder();
		
		for (Map.Entry<String, Integer> element : map.entrySet()) {
			result.append("Game: ");
			result.append(element.getKey());
			result.append(": pleyers: ");
			result.append(element.getValue());
			result.append("\n");
		}
		
		return result.toString();
	}
	
	private String toString2() {
		String result = "";
		
		for (Map.Entry<String, Integer> element : map.entrySet()) {
			result += "\nGame: " + element.getKey() + ": players: " + element.getValue();
		}
		
		return result;
	}
	
	private String toString1() {
		return map.toString();
	}

}
