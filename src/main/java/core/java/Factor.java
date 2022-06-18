package core.java;

public class Factor {

	public static void main(String[] args) {
        long n;
  			n=Long.parseLong("30");
	
	int result=fact(n);
		System.out.println(result);
}
	static int fact(long n)
	{
		int fact=1,i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		
	}
	return fact;

}

}
