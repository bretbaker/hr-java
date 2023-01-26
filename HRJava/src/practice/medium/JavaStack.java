package practice.medium;

import java.util.ArrayList;
import java.util.Stack;

public class JavaStack {

	/*
	 * algorithm 
	 *  
	 * 1) iterate over each ArrayList one by one
	 * 2) read each element while iterating
	 * 3) we need to utilize two different data structures simultaneously, ArrayList for reading, and Stack for writing
	 * 4) if current element is an opening bracket we push it to stack
	 * 5) if current element is a closing bracket we read the last element pushed to stack, and if assumption holds true,
	 *    it should be a matching pair, which then we would remove the opening bracket from the stack, instead of pushing anything to stack
	 * 6) once done iterating, if this assumption holds true, this algorithm should return an empty stack if balanced
	 * 
	 */

	static ArrayList<String> arr0;
	static ArrayList<String> arr1;
	static Stack<String> st0;
	static int index = 0;

	public static void main(String[] args) {

//		this is our ArrayList holding the bracket pairs to be iterated over
		arr0 = new ArrayList<String>();
		arr0.add("{}()");
		arr0.add("({()})");
		arr0.add("{}(");
		arr0.add("[]");
		
//		this is for visual purposes
		System.out.println(arr0.toString());
		
//		here is our actual invocation of our solution implementation
		System.out.println(findBalance(arr0).toString());

	}

	static ArrayList<String> findBalance(ArrayList<String> ar0) {

//		convert each bracket pair group to an ArrayList of Strings for easy iteration/reading
		arr1 = new ArrayList<String>();
		
//		instantiate our Stack data structure
		st0 = new Stack<String>();
		
//		iterate over the ArrayLists of Strings and implement our algorithm
		for (int i = 0; i < ar0.size(); i++) {

			st0.clear();

			for (int j = 0; j < ar0.get(i).length(); j++) {

				String c = Character.toString(ar0.get(i).charAt(j));

				if (c.equals(")") && st0.empty() || c.equals("}") && st0.empty() || c.equals("]") && st0.empty()) {
					st0.push(c);
				} else if (c.equals("(") || c.equals("{") || c.equals("[")) {
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

		}

		return arr1;

	}

}
