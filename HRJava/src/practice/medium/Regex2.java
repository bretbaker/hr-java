package practice.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {

		String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		String input = "I wish wish I could could could fly FLY FLY!!!";
		Matcher m = p.matcher(input);
		while (m.find()) {
			input = input.replaceAll(m.group(), m.group(1));
		}
		System.out.println(input);
		
	}

}
