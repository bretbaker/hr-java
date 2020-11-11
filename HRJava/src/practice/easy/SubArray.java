package practice.easy;

import java.util.Arrays;

public class SubArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		sumNegSubArrays(arr);
	}
	
	static void sumNegSubArrays(int[] arr) {
		int size = 1;
		while (size < arr.length + 1) {
			int start = 0;
			for(int i = start; i < size; i++) {
				if (subArray(arr, i, size).length < arr.length) {
					System.out.println(Arrays.toString(subArray(arr, i, size)));
				}
			}
			size++;
		}
	}
	
	static int[] subArray(int[] arr, int s, int e) {
		return Arrays.copyOfRange(arr, s, e);
	}

}
