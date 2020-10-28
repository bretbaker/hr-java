package practice.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegex {
	
	public static void main(String[] args) {
		validUsername("8");
		validUsername("Julia");
		validUsername("Samantha");
		validUsername("Samantha_21");
		validUsername("1Samantha");
		validUsername("Samantha?10_2A");
		validUsername("JuliaZ007");
		validUsername("Julia@007");
		validUsername("_Julia007");
	}
	
	static void validUsername(String username) {
		Pattern p = Pattern.compile("^[[A-Z]|[a-z]][[A-Z]|[a-z]|\\d|[_]]{7,29}$");
		Matcher m = p.matcher(username);
		if (m.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
