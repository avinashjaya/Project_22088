package Operators;

public class IncrementDecrement {

	public static void main(String[] args) { // Pre Increment
		
		int a=20;
		int b=++a;
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		int c=40;                                // Post Increment
		int d=c++;
		System.out.println("C= "+c);
		System.out.println("D= "+d);
		
		int e=60;                                 // Pre Decrement
		int f=--e;
		System.out.println("E= "+e);
		System.out.println("F= "+f);
		                    
		int i=80;                                // Post Decrement
		int j=i--;
		System.out.println("J= "+j);
		System.out.println("I= "+i);
	}

}