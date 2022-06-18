package core.java;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		//int d = 100;
		float d;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Price");
		int a = sc.nextInt();
		System.out.println("enter percentage");
		int b = sc.nextInt();
		 float c =a*b/100f;
		 d=a-c;
		 System.out.println("the discount price " + c);
		System.out.println("the final value " + d);
		sc.close();
	}

}
