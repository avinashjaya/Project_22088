package basicProgramms;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p,q,t;
		System.out.println("Enter the market price:");
		p=sc.nextDouble();
		System.out.println("Enter the interest:");
		q=sc.nextDouble();
		 t=100-q;

		double amount=(p*q)/100;
		 t=p-amount;

		System.out.println("The discounted amount of given market value is "+amount);
		System.out.println(t);
		sc.close();

	}

}
