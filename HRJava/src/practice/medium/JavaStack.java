package practice.medium;

import java.util.ArrayList;
import java.util.Stack;

public class JavaStack {

	static ArrayList<String> arr0;
	static ArrayList<String> arr1;
//	static ArrayList<String> arr2;
	static Stack<String> st0;
	static int index = 0;
//	static boolean balanced = false;

	public static void main(String[] args) {

		arr0 = new ArrayList<String>();
		arr0.add("{}()");
		arr0.add("({()})");
		arr0.add("{}(");
		arr0.add("[]");
		System.out.println(arr0.toString());
		System.out.println(findBalance(arr0).toString());

	}

	static ArrayList<String> findBalance(ArrayList<String> ar0) {

		arr1 = new ArrayList<String>();
//		arr2 = new ArrayList<String>();
		st0 = new Stack<String>();
		for (int i = 0; i < ar0.size(); i++) {

//			arr1.clear();
			st0.clear();

			for (int j = 0; j < ar0.get(i).length(); j++) {
				String c = Character.toString(ar0.get(i).charAt(j));
//				arr1.add(c);
				if (c.equals("(") || c.equals("{") || c.equals("[")) {
					st0.push(c);
				} else if ((c.equals(")") && st0.peek().equals("(")) || (c.equals("}") && st0.peek().equals("{"))
						|| (c.equals("]") && st0.peek().equals("["))) {
					st0.pop();
				} else {
					st0.push(c);
				}
			}

			if (st0.empty()) {
				arr1.add("true");
			} else {
				arr1.add("false");
			}
//			System.out.println(arr1.toString());

		}

		return arr1;

	}

}
