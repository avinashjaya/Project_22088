package patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for end column");
		int n=sc.nextInt();
		int k;
		for(int i=1;i<=n;i++)
		 {
			k=i;
			 for (int j=1;j<=n;j++)
			 {
				 System.out.printf("%5d",k);
				 k +=n;
			 }
			 System.out.println("     ");
		 }sc.close();
	}


}
