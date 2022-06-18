package basicProgramms;

import java.util.Scanner;

public class SumOFFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();
		System.out.println("The factors of " + n + " is :");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of the factors is " + sum);
		sc.close();
	}

}
