package Assignments;

import java.util.Scanner;

public class Assignment2 {

	String dayName;
	String week[]= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	public void setDayName(String dayName) {
	this.dayName = dayName;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the choice");
	String choice = s.next();
	String name = choice.toUpperCase();
	String name1 = name.substring(0, 3);
	switch (name1) {
	case "SUN":
	System.out.println(this.dayName = "SUN");
	break;
	case "MON":
	System.out.println(this.dayName = "MON");
	break;
	case "TUE":
	System.out.println(this.dayName = "TUE");
	break;
	case "WED":
	System.out.println(this.dayName = "WED");
	break;
	case "THU":
	System.out.println(this.dayName = "THU");
	break;
	case "FRI":
	System.out.println(this.dayName = "FRI");
	break;
	case "SAT":
	System.out.println(this.dayName = "SAT");
	break;
	default:
	System.out.println("the value in dayName :" + (this.dayName = null));
	}
	}



	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();

	obj.setDayName(obj.dayName);
	obj.getNextDay();
	obj.getPreviousDay();
	//Scanner s = new Scanner(System.in);
	//System.out.println("enter the number ");
	//int number = s.nextInt();
	//obj.addToCurrentDay(number);
	}



	public void getNextDay() {
	String name = this.dayName;
	for (int i = 0; i < week.length; i++) {
	if (week[i] == name) {
	if (i < 6) {
	System.out.println("next dayname:" + week[i + 1]);
	} else {
	i = 0;
	System.out.println("next dayname:" + week[i]);
	break;
	}}}}
	
	public void getPreviousDay() {
		String name1 = this.dayName;
		for (int i = 0; i < week.length; i++) {
		if (week[i] == name1) {
		if (i != 0) {
		System.out.println("previous dayname:" + week[i - 1]);
		} else {
		i = (week.length - 1);
		System.out.println("previous dayname:" + week[i]);
		}
		}
		}




	}

	}
	
