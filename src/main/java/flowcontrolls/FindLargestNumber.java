package flowcontrolls;

import java.util.Scanner;
/**
 * 
 * @author jp22088
 *Finding the largest number
 */

public class FindLargestNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter first number,second number,third number ");
		int firstnumber =sc.nextInt();
		int secondnumber =sc.nextInt();
		int thirdnumber =sc.nextInt();
		if (firstnumber>secondnumber && firstnumber>thirdnumber)
		{
			System.out.println("Given First number is Largest");
		}
		else if(secondnumber>firstnumber && secondnumber>thirdnumber)
		{
			System.out.println("Given Second number is Largest");
		}
		else if(thirdnumber>firstnumber && thirdnumber>secondnumber)
		{
			System.out.println("Given Third number is Largest");
		}
		else 
		{
			System.out.println("Given two or more numbers are equals");
		}
		sc.close();
	}

}
