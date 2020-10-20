package practice.easy;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparison {

	public static void main(String[] args) {
		substringCompare("aardvark", 5);
	}
	
	static void substringCompare(String s, int k) {
		SortedSet<String> strSet = new TreeSet<String>();
		for (int i = 0; i <= s.length() - k ; i++) {
//			System.out.println(s.substring(i, i + k));
			strSet.add(s.substring(i, i + k));
		}
		System.out.println(strSet.first());
		System.out.println(strSet.last());
	}

}
