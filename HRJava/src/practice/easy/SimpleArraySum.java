package practice.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleArraySum {
	
	public static ArrayList<Integer> arr;
	public static Integer sum;

	public static void main(String[] args) {
		arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,10,11));
		System.out.println(simpleArraySum(arr));
	}
	
    public static Integer simpleArraySum(ArrayList<Integer> ar) {
		sum = new Integer(0);
    	for (Integer i : ar) {
			sum+=i;
		}
    	return sum;
    }

}
