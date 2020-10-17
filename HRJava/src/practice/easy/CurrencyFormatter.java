package practice.easy;

import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Currency;
import java.util.Locale;

public abstract class CurrencyFormatter extends NumberFormat {
	
	public static void main(String[] args) {
		currencyFormatter(5000);
	}
	
	static void currencyFormatter(double payment) {
//		US
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		String us = nf.format(payment);
		System.out.println("US: " + us);
//		India
		nf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String india = nf.format(payment);
		System.out.println("India: " + india);
//		China
		nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = nf.format(payment);
		System.out.println("China: " + china);
//		France
		nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = nf.format(payment);
		System.out.println("France: " + france);
		
	}
}
