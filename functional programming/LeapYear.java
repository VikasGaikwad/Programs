/*
	Leap Year
		I/P   -> Year, ensure it is a 4 digit number.
		Logic -> Determine if it is a Leap Year.
		O/P   -> Print the year is a Leap Year or not.

*/
import java.util.Scanner;
public class LeapYear
{
	
	public static void main(String [] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year : ");
		int year=sc.nextInt();
		
		if((year%4==0) && (year%100!=0) || (year%400==0))
		{						
		System.out.println(year+" is leap year ");
		}
		
		
		else
		{
			System.out .println("this is not leap year");
		}
	}	
}
