package main;

import java.util.HashMap;

public class Times {
	
	private static final String[] DAYS = {
			"Mon",
			"Tues",
			"Wed",
			"Thu",
			"Fri",
			"Sat",
			"Sun"
	};
	
	private static final HashMap<String, Integer> MONTHS = new HashMap<String, Integer>() {
		{
			put("Jan", 31);
			put("Feb", 28);
			put("Mar", 31);
			put("Apr", 30);
			put("May", 31);
			put("Jun", 30);
			put("Jul", 31);
			put("Aug", 31);
			put("Sep", 30);
			put("Oct", 31);
			put("Nov", 30);
			put("Dec", 31);
		}
	};

	public static String[] getDays() { return DAYS; }
	
	public static int getDayIndex(String day) {
		
		for (int i = 0; i < DAYS.length; i++) {
			if (DAYS[i].equals(day)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static HashMap<String, Integer> getMonths() { return MONTHS; }
}
