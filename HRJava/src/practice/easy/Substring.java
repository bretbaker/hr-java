package practice.easy;

public class Substring {

	public static void main(String[] args) {
		subString("onebigstring", 4, 7);
	}
	
	static void subString(String str, int s, int e) {
		System.out.println(str.substring(s, e));
	}

}
