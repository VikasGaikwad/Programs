/*
	Gambler
		Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach 				$goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, 				averages the results, and prints them out.
		I/P  -> $Stake, $Goal and Number of times.
		Logic-> Play till the gambler is broke or has won.
		O/P  -> Print Number of Wins and Percentage of Win and Loss.

*/
import java.util.*;
class Gambler
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your initial balance : ");
		float init_bal=sc.nextFloat();
		System.out.println("Enter your goal/target balance : ");
		float goal_bal=sc.nextFloat();
		System.out.println("How many times you want to play : ");
		int play=sc.nextInt();
	float win=0;
		for(int i=0;i<play;i++)
		{
		float cash=init_bal;
			while((cash>0) && (cash<goal_bal))
			{
			double ran=Math.random();
				if(ran>0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
		if(cash==goal_bal)
		{
			win++;
		}
		}
		System.out.println((int)win+" Win Out of "+play);
		System.out.println("winning of per game :"+(win/play)*100);	
	}	
}
