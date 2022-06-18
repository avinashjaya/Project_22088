package Assignments;


import java.util.Scanner;



public class Assignments {

static int birthMonth, birthYear;

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Find your Age");
System.out.println("Enter your Birth Month");
birthMonth = sc.nextInt();
System.out.println("Enter your Birth Year");
birthYear = sc.nextInt();
if (birthMonth <= 1 || birthYear <= 1)
System.out.println("1.0 ");
else if (birthMonth >= 12 || birthYear >= 2022)
System.out.println("2.0");



else
System.out.println("Your age is=" + calculateAge(birthMonth, birthYear));
sc.close();
}



public static double calculateAge(double birthMonth, double birthYear) {
double a, b, c;
a = birthMonth / 12;
b = 2022 - birthYear;
c = b - a;
return c;
//sc.close();

	}

}
