package practice.easy;

import java.util.Arrays;

public class StringTokens {
	
	public static void main(String[] args) throws Exception {
		stringTokens("This is an example string, right?  Yes!");
	}
	
	static void stringTokens(String s) throws Exception {
		if (s.length() < 1 || s.length() > (4 * Math.pow(10, 5))) {
			throw new Exception("string length out of bounds");
		}
		String delims = "[ !,?._'@]+";
		String[] token = s.split(delims);
		System.out.println(Arrays.toString(token));
		System.out.println(token.length);
		for (String t : token) {
			System.out.println(t);
		}
	}

}
