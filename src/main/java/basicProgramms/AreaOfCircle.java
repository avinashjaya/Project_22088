package basicProgramms;
/**
 * 
 * @author jp22088
 *Finding the area of circle.
 *
 */
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter raidus of circle");
		double radius=sc.nextDouble();
		double area=((22*radius*radius)/7);
		System.out.println("Area of a Circle is "+area);
		sc.close();	
	}

}
