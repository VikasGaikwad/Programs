/*	Power of 2 ...
	Desc  -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
	I/P   -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int.
	Logic -> repeat until i equals N.
*/
import java.util.*;
class Power
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int value=sc.nextInt();
		System.out.println("the power of 2^"+value+" is "+(Math.pow(2,value)));
		
	
		for(int i=1;i<=value;i++)
		{
			System.out.println("power of 2^"+i+ " is " +(Math.pow(2,i )));	
		}
	}
}
