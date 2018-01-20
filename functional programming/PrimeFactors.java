/*	Prime Factors...
	Desc  -> Computes the prime factorization of N using brute force.
	I/P   -> Number to find the prime factors.
	Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
	O/P   -> Print the prime factors of number N.
*/
import java.util.*;
class PrimeFactors
{
	public static int isPrime(int number)
	{
		int i;
		for( i=2;i<number;i++)
		{
			if(number%i==0)
			{	
				number=number/i;
				System.out.print(i);
				System.out.println();
				i--;	
			}	
		}
		return i;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number which u want prime factors");
		int number=sc.nextInt();
		System.out.println(isPrime(number));

	}	
}
