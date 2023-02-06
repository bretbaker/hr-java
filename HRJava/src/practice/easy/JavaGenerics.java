package practice.easy;

public class JavaGenerics {
	
	/*
	 * it is very important to note that generics do not work with primitives
	 * if you want an generic method to work on a primitive, you need to use an object representation of that data
	 * aka a wrapper class as we use for the integer array below
	 */
	
	static Integer[] intArr;
	static String[] stringArr;

	public static void main(String[] args) {
		
		intArr = new Integer[] {1,2,3};
		stringArr = new String[] {"Hello","World"};
		printArray(intArr);
		printArray(stringArr);

	}
	
	static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			String s = String.valueOf(element);
			System.out.println(s);
		}
	}

}
