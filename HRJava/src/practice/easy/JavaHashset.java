package practice.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaHashset {
	
	/*
	 * CONSTRAINTS
	 * 1) number of pairs will be greater than or equal to 1 and less than or equal to 100,000
	 * 2) length of string in each pair will be greater than 0 and less than or equal to 5
	 * 3) lowercase letters only
	 * 
	 * ALGORITHM
	 * 1) iterate through the ArrayLists simultaneously and create string pairs with each string element
	 * 2) also simultaneous to this, push the string pair to the hashset if it is unique aka not already contained in the hashset
	 * 3) print the size of the hashset to the console to represent the amount or unique string pairs in the hashset
	 * 
	 */
	
	static HashSet<String> hs0;
	static ArrayList<String> al0;
	static ArrayList<String> al1;
	static String tempString;
	

	public static void main(String[] args) {
		
		al0 = new ArrayList<String>();
		al1 = new ArrayList<String>();
		
		al0.add("john");
		al0.add("john");
		al0.add("john");
		al0.add("mary");
		al0.add("mary");
		al1.add("tom");
		al1.add("mary");
		al1.add("tom");
		al1.add("anna");
		al1.add("anna");
		
		System.out.println(al0.toString());
		System.out.println(al1.toString());
		
		hs0 = new HashSet<String>();
		
		for (int i = 0; i < al0.size(); i++) {
			
			tempString = al0.get(i) + " " + al1.get(i);
			
			if (hs0.size() == 0) {
				
				hs0.add(tempString);
				System.out.println(hs0.size());
				
			} else if (hs0.size() != 0 && !hs0.contains(tempString)) {
				
				hs0.add(tempString);
				System.out.println(hs0.size());
				
			} else {
				
				System.out.println(hs0.size());
				
			}
		}

	}
	


}
