package practice.easy;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] twoDIntArr = new int[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				twoDIntArr[i][j] = i; 
			}
		}
		for (int i = 0; i < 6; i++) {
			int[] oneDIntArr = new int[6];
			for (int j = 0; j < 6; j++) {
				oneDIntArr[j] = twoDIntArr[i][j];
			}
			System.out.println(Arrays.toString(oneDIntArr));
		}
	}

}
