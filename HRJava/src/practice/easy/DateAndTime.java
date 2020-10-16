package practice.easy;

import java.time.LocalDate;

public class DateAndTime {

	public static void main(String[] args) {
		findDay(8, 8, 1992);
	}
	
	public static String findDay(int month, int day, int year) {
		System.out.println(LocalDate.of(year, month, day).getDayOfWeek().name());
		return LocalDate.of(year, month, day).getDayOfWeek().name();
    }

}
