package basicProgramms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= num; i++)
		{
			if (num % i == 0)
			{
				cnt++;
			}
		}
		if (cnt == 2)
			System.out.println("Given number "+num+"  is prime");
		else
			System.out.println("Given number "+num+"  number is not prime");

		sc.close();
	}
}
		

