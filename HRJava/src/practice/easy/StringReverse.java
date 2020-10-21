package practice.easy;

public class StringReverse {

	public static void main(String[] args) {
		palindrome("racecar");
	}
	
	static StringBuilder palindrome(String str) {
		System.out.println(str);
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i > -1; i--) {
			sb.append(str.charAt(i));
			System.out.println(str.charAt(i));
		}
		System.out.println(sb);
		if (str.contentEquals(sb)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		return sb;
	}

}
