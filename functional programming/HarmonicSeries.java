/* 
	Harmonic Number 

	Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N .
		I/P   -> The Harmonic Value N. Ensure N != 0.
		Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N.
		O/P   -> Print the Nth Harmonic Value.

*/

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
