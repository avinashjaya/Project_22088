package core.java;

import java.util.Scanner;

public class PromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int a = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= a; i++)
		{
			if (a % i == 0)
			{
				cnt++;
			}
		}
		if (cnt == 2)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");

		sc.close();
	}
}
		
