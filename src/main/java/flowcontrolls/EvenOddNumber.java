package flowcontrolls;
	import java.util.Scanner;

	/**
	 * 
	 * @author jp22088
	 *Given Number is Even or Odd Number
	 */
	public class EvenOddNumber {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int number =sc.nextInt();
			if (number%2==0) {
				System.out.println("Given Number is Even Number");
			}
			else {
				System.out.println("Given Number is odd Number");
			}
		sc.close();
		}

	}
