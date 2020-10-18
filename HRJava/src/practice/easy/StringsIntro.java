package practice.easy;

public class StringsIntro {

	public static void main(String[] args) {
		stringsIntro("hello", "world");
	}
	
	static void stringsIntro(String a, String b) {
		System.out.println(a.length() + b.length());
		if (a.compareTo(b) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		String strA = a.substring(0, 1).toUpperCase() + a.substring(1);
		String strB = b.substring(0, 1).toUpperCase() + b.substring(1);
		System.out.println(strA + " " + strB);
	}

}
