package practice.challenges;

public class StaticInitializerBlock {
	
	static boolean flag;
	static boolean flag2;
	static int B = 5;
	static int H = 5;
	static int B2 = -5;
	static int H2 = 5;
	
	static {
		if (B <= 0 || H <= 0) {
		      flag = false;
		    } else {
		      flag = true;
		    }
		if (B2 <= 0 || H2 <= 0) {
		      flag2 = false;
		    } else {
		      flag2 = true;
		    }
	}

	public static void main(String[] args) throws Exception {
		if(flag){
			int area=B*H;
			System.out.print(area + "\n");
		} else {
			throw new Exception("Breadth and height must be positive");
		}
		if(flag2){
			int area2=B2*H2;
			System.out.print(area2 + "\n");
		} else {
			throw new Exception("Breadth and height must be positive");
		}
	}

}
