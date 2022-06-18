package Assignments;
import java.util.Calendar;
import java.util.Scanner;



public class Age {



public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter the month");
int birthMonth=sc.nextInt();
System.out.println("enter the year");
int birthYear=sc.nextInt();
double age=calculateAge(birthMonth,birthYear);
System.out.println("your age is:"+age);
sc.close();
}

public static double calculateAge(int birthMonth,int birthYear) {

double age;
Calendar cal = Calendar.getInstance();
double year=cal.get(Calendar.YEAR);
double month=cal.get(Calendar.MONTH);
if((birthMonth<0)||(birthYear<0)) { return -1;}
else if(birthYear>year) {return -2;}
else
age= ((year-(double)birthYear)+((month-(double)birthMonth)/12));
return age;

}



}
