package core.java;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		double p,q;
		System.out.println("Enter the market price:");
		p=sc.nextDouble();
		System.out.println("Enter the interest:");
		q=sc.nextDouble();
	//	System.out.println("Enter the time");
	//	t=sc.nextDouble();


		double amount=(p*q)/100;

		System.out.println(amount);
		sc.close();

	}
}
