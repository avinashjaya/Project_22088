package basicProgramms;

import java.util.Scanner;

public class FactorialsOfNumber {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number for factorials");
	int n=sc.nextInt();
	System.out.println("Factorials of given "+n+" number is : ");
	for(int i=1;i<=n;i++) {
		
		int fact=1;
		for(int j=1;j<=i;j++) {
			fact*=j;
		}
		System.out.println(fact);
		sc.close();
	}	
}

}

