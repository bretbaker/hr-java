package practice.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayListC {

	public static void main(String[] args) {
		findInts(new Integer[] { 41, 77, 74, 22, 44 }, new Integer[] { 12 }, new Integer[] { 37, 34, 36, 52 },
				new Integer[] {}, new Integer[] { 20, 22, 33 }, new Integer[] { 1, 3 }, new Integer[] { 3, 4 },
				new Integer[] { 3, 1 }, new Integer[] { 4, 3 }, new Integer[] { 5, 5 });
	}

	static void findInts(Integer[] a, Integer[] b, Integer[] c, Integer[] d, Integer[] e, Integer[] f, Integer[] g,
			Integer[] h, Integer[] i, Integer[] j) {
		List<Integer[]> intArrsList = new ArrayList<Integer[]>();
		intArrsList.add(a);
		intArrsList.add(b);
		intArrsList.add(c);
		intArrsList.add(d);
		intArrsList.add(e);
		List<Integer[]> qArrsList = new ArrayList<Integer[]>();
		qArrsList.add(f);
		qArrsList.add(g);
		qArrsList.add(h);
		qArrsList.add(i);
		qArrsList.add(j);
		for (int x = 0; x < 5; x++) {
			int y = qArrsList.get(x)[0] - 1;
			int z = qArrsList.get(x)[1] - 1;
			try {
				System.out.println(intArrsList.get(y)[z]);
			} catch (ArrayIndexOutOfBoundsException err) {
				System.out.println("ERROR!");
			}
		}
	}

}
