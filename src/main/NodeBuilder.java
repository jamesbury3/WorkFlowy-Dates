package main;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import main.Times;

public class NodeBuilder {
	
	private static final String[] DAYS = Times.getDays();
	private static final HashMap<String, Integer> MONTHS = Times.getMonths();
	private int year;
	private String first_day;
	private String month;
	private ArrayList<String> additions;

	public NodeBuilder(int year, String first_day, String month) {
		super();
		this.year = year;
		this.first_day = first_day;
		this.month = month;
		this.additions = new ArrayList<String>();
		readAdditions();
	}

	public void createMonth() {
		
		int first_day_index = Times.getDayIndex(first_day);
		
		for (int i = 0; i < MONTHS.get(month); i++) {
			
			System.out.println(DAYS[(first_day_index + i) % 7] + ", " + month + " " + (i + 1) +
					", " + year);
			
			if (additions != null) {
				for (String a : additions) {
					System.out.println("\t" + a.toString());
				}
			}
		}
	}
	
	public void readAdditions() {
		try {
			File file = new File("config.txt");
			Scanner s = new Scanner(file);
			while (s.hasNextLine()) {
				additions.add(s.nextLine());
			}
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
