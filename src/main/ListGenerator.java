package main;

import java.util.Arrays;
import main.Times;

public class ListGenerator {

	public static void main(String[] args) {
		
		String help_text = "Usage: Prints monthly to-do list\n" + 
				"ListGenerator [YEAR] [FIRST DAY OF MONTH] [MONTH ABREVIATION]\n" + 
				"";
		
		try {
			if (!checkArgs(args)) {
				System.out.println(help_text);
			} else {
				NodeBuilder nd = new NodeBuilder(Integer.parseInt(args[0]), args[1], args[2]);
				nd.createMonth();
			}
		} catch(Exception e) {
			System.out.println(e.toString());
			System.out.println(help_text);
		}
	}
	
	public static boolean checkArgs(String[] args) {
		
		return args.length == 3 && 
				!Arrays.asList(args).contains("--help") &&
				Arrays.asList(Times.getDays()).contains(args[1]) &&
				Times.getMonths().keySet().contains(args[2]);
	}
}
