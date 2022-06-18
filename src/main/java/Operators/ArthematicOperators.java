package Operators;

import java.util.Scanner;

public class ArthematicOperators {
	public static void main(String[] args) {
		  

		{  
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a");
           int a=sc.nextInt();
		 int x = a;  
		  System.out.println("Enter b");
           int b=sc.nextInt();
		   int y = b; 


		System.out.println("x = " + x + " y = " + y);  
		System.out.println("x is greater than y: " +(x>y));  
		System.out.println("x is less than y: " +(x<y));  
		System.out.println("x is less than equal to y: " +(x<=y));  
        System.out.println("x is equal to y: " +(x==y));
		System.out.println("x is not equal to y: " +(x!=y));
        System.out.println("(x+20 < y+10): " +(x+20 < y+10));  
        
        sc.close();
		 }  
		

		}
}