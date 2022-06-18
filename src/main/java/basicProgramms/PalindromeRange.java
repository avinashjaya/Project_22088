package basicProgramms;

import java.util.Scanner;

public class PalindromeRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		int n=sc.nextInt();
		System.out.println("Enter end number");
		int m=sc.nextInt();
		System.out.println("The palindromes between "+n+" and "+m+" are :");
		for(int i=n;i<=m;i++) {
			int rem,revrse=0,tem=i,tem1=i;
			while(tem>0){
				rem=tem%10;
				revrse=revrse*10+rem;
				tem=tem/10;
			}
			if(tem1==revrse) {				
				if(tem1%2!=0) {
					System.out.println(tem1);
				}
			}
		}
		sc.close();		
	}

}