package practice.medium;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BigDecimalC {
	
	public static void main(String[] args) {
		sortNumbers(new String[] {"9","-100","50","0","56.6","90","0.12","02.34","000.000"});		
	}
	
	static void sortNumbers(String[] numbers) {
		List<BigDecimal> bdArr = new ArrayList<BigDecimal>();
		HashMap<BigDecimal, String> hm = new HashMap<BigDecimal, String>();
		for (String number : numbers) {
			BigDecimal n = new BigDecimal(number);
			bdArr.add(n);
			hm.put(n, number);
		}
		System.out.println(bdArr.toString());
		System.out.println(hm.toString());
		
		Collections.sort(bdArr, Collections.reverseOrder());
		System.out.println(bdArr.toString());
		for (BigDecimal number : bdArr) {
			System.out.println(hm.get(number));
		}
	}

}
