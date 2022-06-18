package core.java;

import java.util.Scanner;

public class SumofTwoNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
	float f =a/b;
//		System.out.println(a + "+" + b + "=" + (a+b));
//		System.out.println(a + "-" + b + "=" + (a-b));
//		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println( f);
		
		sc.close();
	}

}
