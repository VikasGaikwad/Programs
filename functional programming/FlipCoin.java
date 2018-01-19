/*	Flip Coin and print percentage of Heads and Tails.
	I/P -> The number of times to Flip Coin. Ensure it is positive integer.
	Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads.
	O/P -> Percentage of Head vs Tails.
*/
import java.util.*;
class FlipCoin
{
	public static void main(String [] args)
	{
	float head=0,tail=0;
		
		for(int i=0;i<100;i++)
		{
			if(Math.random()<0.5)
			{
				head++;
			
			}
			else
			{
				tail++;
			}
		
		
		}
		System.out.println("total number of heads out of is "+head+ " , and tail is "+tail);
		float percentage,percentage1;
		percentage=(head*100)/100;
		System.out.println("percentage of heads "+percentage);
		percentage1=(tail*100)/100;
		System.out.println("percentage of heads "+percentage1);
	}
}
