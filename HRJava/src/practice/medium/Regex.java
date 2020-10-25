package practice.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	
	static String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	public static String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
	
	public static void main(String[] args) {
		doRegex("000.12.12.034");
		doRegex("Hello.IP");
	}
	
	static void doRegex(String ip) {
		Pattern p = Pattern.compile(pattern);
		Matcher m  = p.matcher(ip);
		boolean match = m.matches();
		System.out.println(match);
	}

}
