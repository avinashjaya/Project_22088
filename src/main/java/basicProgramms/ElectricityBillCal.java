package basicProgramms;

import java.util.Scanner;

public class ElectricityBillCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your units : ");
		double d = sc.nextDouble();
		double billpay = 0;
		if (d <= 100) {
			billpay = d * 1.5;

		} else if (d < 300) {
			billpay = 100 * 1.5 + (d - 100) * 2;
		} else if (d >= 300) {
			billpay = 100 * 1.5 + 200 * 2 + (d - 300) * 3;
		}
		System.out.println("electricity bill to be paid is :" + billpay);
		sc.close();
	}

}
