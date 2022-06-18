package basicProgramms;

import java.util.Scanner;

public class Aramstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int n=sc.nextInt();
		int rem,arm=0,tem=n;
		while(n>0) {
			rem=n%10;
			n=n/10;
			arm=arm+(rem*rem*rem);
		}
		if(tem==arm) {
			System.out.println(tem+" is a armstrong number");
		}
		else {
			System.out.println(tem+" is not a armstrong number");
			sc.close();
		}
	}
}
