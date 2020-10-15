package practice.easy;

public class IntToString {

	public static void main(String[] args) {
		
		int n = 5;
		
		try {
			String s = Integer.toString(n);
			System.out.println("Good job");
		} catch (Exception e) {
			System.out.println("Unsuccessful");
		}
	}

}
