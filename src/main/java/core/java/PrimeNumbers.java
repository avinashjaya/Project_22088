package core.java;

import java.util.Scanner;



	public class PrimeNumbers {
		public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start  number: ");
		int s1=sc.nextInt();	
		System.out.println("enter end  number: ");
		int s2=sc.nextInt();
		for(int i=s1;i<=s2;i++)
		{
			int cnt=0;
			for(int j=1;j<=s2;j++)
			{
				if(i%j==0)
				{
				cnt++;
			}
		}
		if(cnt==2)
			System.out.println("prime number is :"+i);
		sc.close();
		}
			
	}
	}