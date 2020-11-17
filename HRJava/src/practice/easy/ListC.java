package practice.easy;

import java.util.ArrayList;

public class ListC {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(12);
		intList.add(0);
		intList.add(1);
		intList.add(78);
		intList.add(12);
		System.out.println(intList.toString());
		int x = 5;
		int y = 23;
		intList.add(x, y);
		System.out.println(intList.toString());
		x = 0;
		intList.remove(x);
		System.out.println(intList.toString());
	}

}
