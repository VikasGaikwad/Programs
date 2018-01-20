/*
	Write a program Distance.
		java that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the 			origin (0, 0). 	
		The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.

*/

import java.util.*;
public class Distance{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X origin :");
		int X =sc.nextInt();
		System.out.println("Enter Y origin :");
		int Y =sc.nextInt();
		
		double ans = Math.sqrt(Math.pow(X,2) + Math.pow(Y,2));
		System.out.println("Distance  is : "+ans);
	}
}
