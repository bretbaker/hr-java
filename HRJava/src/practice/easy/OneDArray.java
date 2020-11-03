package practice.easy;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = new int[5];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i]= i;
		}
		for (int i : intArr) {
			System.out.println(i);
		}
	}

}
