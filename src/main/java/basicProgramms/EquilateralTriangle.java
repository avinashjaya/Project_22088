package basicProgramms;
/**
 * 
 * @author jp22088
 *Finding area of a equilateral triangle..?
 */

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the area of triangle:");
		double a=sc.nextDouble();
		double area=(Math.sqrt(3)/4)*(a*a);
		System.out.println("area of the triangle is :"+area);
	sc.close();

	}

}
