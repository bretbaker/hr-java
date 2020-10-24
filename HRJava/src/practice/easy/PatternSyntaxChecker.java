package practice.easy;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
	
	public static void main(String[] args) {
		String[] patterns = {"([A-Z])(.+)", "[AZ[a-z](a-z)", "batcatpat(nat"};
		regexPatternValidation(patterns);
	}
	
	static void regexPatternValidation(String[] patterns) throws PatternSyntaxException {
		for (String pattern : patterns) {
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (PatternSyntaxException pse) {
				System.out.println("Invalid");
			}
		}
	}

}
