package flowcontrolls;

import java.util.Scanner;

/**
 * 
 * @author jp22088
 *Choosing  which operation to done
 */
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition \n2.Subtraction \n3.Multipilication \n4.Division");
		System.out.println("Enter your Choise");
		int choice=sc.nextInt();
		System.out.println("Enter your first number");
		
		int firstnumber=sc.nextInt();
		System.out.println("Enter your second number");
		int secondnumber=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Result ="+(firstnumber+secondnumber));
		break;
		case 2:System.out.println("Result ="+(firstnumber-secondnumber));
		break;
		case 3:System.out.println("Result ="+(firstnumber*secondnumber));
		break;
		case 4:System.out.println("Result ="+(firstnumber/secondnumber));
		break;
		default : System.out.println("Enter your choice in 1-4 range only");
		}
		sc.close();

	}

}
