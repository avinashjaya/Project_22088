package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for end column");
		int n=sc.nextInt();
		int k=2;
		for(int i=1;i<=n;i++)
		 {
			 for (int j=1;j<=n;j++)
			 {
				 System.out.print(k+" ");
				 k +=2;
			 }
			 System.out.println("     ");
		 }sc.close();
	}

	}


