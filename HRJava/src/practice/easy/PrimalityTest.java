package practice.easy;

import java.math.BigInteger;

public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeCheck(10);
		primeCheck(11);
		primeCheck(7);
		primeCheck(22);
	}
	
	static void primeCheck(int n) {
		BigInteger bigInteger = BigInteger.valueOf(n);
		System.out.println(bigInteger.isProbablePrime(1));
	}

}
