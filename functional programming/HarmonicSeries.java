/* java program for print Harmonic series till nth value*/

import java.util.Scanner;
class HarmonicSeries
{
	public static void main(String []args)
	{
	float  sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	float number=sc.nextFloat();
	while(number>0)
		{
		sum=sum+(1/number);
		number--;
		System.out.println("1 / "+number);
		}
	System.out.println("answer: " + sum);
	}
}
