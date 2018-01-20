/*
	Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c. Since the equation is x*x, hence there are 2 roots. 		The 2 roots of the equation can be found using a formula 
		delta = b*b - 4*a*c
		Root 1 of x = (-b + sqrt(delta))/(2*a)
		Root 2 of x = (-b - sqrt(delta))/(2*a)
	Take a, b and c as input values to find the roots of x.

*/
import java.util.*;
public class Quadratic{

	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value of a :");
		double a = sc.nextDouble();
		System.out.println("Enter value of b :");
		double b = sc.nextDouble();
		System.out.println("Enter value of c :");
		double c = sc.nextDouble();
		
		double delta = (b*b)-(4*a*c);
		System.out.println(delta);
		double X1 = (-b+Math.sqrt(delta)/(2*a));
		double X2 = (-b-Math.sqrt(delta)/(2*a));
		
		System.out.println("Root 1 of X :"+X1);
		System.out.println("Root 2 of X :"+X2);
	}
}
