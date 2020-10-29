package practice.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
	
	public static void main(String[] args) {
		tagContentExtractor("<h1>Nayeem loves counseling</h1>");
		tagContentExtractor("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
		tagContentExtractor("<Amee>safat codes like a ninja</amee>");
		tagContentExtractor("<SA premium>Imtiaz has a secret crush</SA premium>");
	}
	
	static void tagContentExtractor(String tagString) {
		boolean matchFound = false;
        Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = r.matcher(tagString);

        while (m.find()) {
            System.out.println(m.group(2));
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("None");
        }
	}

}
