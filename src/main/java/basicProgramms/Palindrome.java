package basicProgramms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number for palindrome");
		int n=sc.nextInt();
		int rem,reverse=0,temp=n;
		while(n>0){
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(temp==reverse) {
			System.out.println(temp+" is a polyndrome number: ");
		}
		else {
			System.out.println(temp+" is not a polyndrome number: ");
			sc.close();
		}
			

	}

}
