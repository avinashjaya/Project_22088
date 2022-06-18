package basicProgramms;
/**
 * 
 * @author jp22088
 *Finding the factorial of given number. 
 *
 */
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factorial");
        
		int n=sc.nextInt();
		int fact=1;
		for (int i=1;i<=n;i++)
		{
			fact =fact*i;
		}
		System.out.println("factorial of given number is "+fact);
sc.close();
	}

	

}
