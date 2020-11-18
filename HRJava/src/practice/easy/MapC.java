package practice.easy;

import java.util.HashMap;

public class MapC {

	public static void main(String[] args) {
		HashMap<String, Integer> phonebook = new HashMap<String, Integer>();
		phonebook.put("uncle sam", 99912222);
		phonebook.put("tom", 11122222);
		phonebook.put("harry", 12299933);
		System.out.println(phonebook.get("uncle sam"));
		System.out.println(phonebook.get("uncle tom"));
		System.out.println(phonebook.get("harry"));
	}
	
}
