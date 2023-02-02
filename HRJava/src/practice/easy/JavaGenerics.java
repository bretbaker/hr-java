package practice.easy;

public class JavaGenerics {

	public static void main(String[] args) {
		
		

	}
	
	static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			String s = String.valueOf(element);
			System.out.println(s);
		}
	}

}
