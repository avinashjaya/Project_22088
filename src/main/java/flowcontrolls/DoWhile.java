package flowcontrolls;

/**
 * 
 * @author jp22088
 *Printing from 1.....10 
 */
public class DoWhile {

	public static void main(String[] args) {
		int i=1,sum=0;
		do {
			System.out.println(i);
			sum =sum+i;
			++i;
			
		}
		while(i<=10);
		System.out.println(sum);
	}
}