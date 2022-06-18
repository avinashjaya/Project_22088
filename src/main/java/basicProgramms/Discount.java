package basicProgramms;
/**
 * 
 * @author jp22088
 *Finding the Discounted price and remaining price..?
 *
 */
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double p,q,t;
		System.out.println("Enter the market price:");
		p=sc.nextDouble();
		System.out.println("Enter the interest:");
		q=sc.nextDouble();
             
		double amount=(p*q)/100;
       System.out.println("Discount amount  is "+amount);
       t=p-amount;
       System.out.println("After discount the price is "+t);
		sc.close();

	}
}
