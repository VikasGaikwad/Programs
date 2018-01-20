/*
	Simulate Stopwatch Program
		Desc  -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
		I/P   -> Start the Stopwatch and End the Stopwatch
		Logic -> Measure the elapsed time between start and end
		O/P   -> Print the elapsed time.

*/

import java.util.*;
public class StopWatch
{

	public static void main(String []args) 
	{
		
		Scanner sc = new Scanner(System.in);			
		long Starttime = System.nanoTime();
		
		for(int i=0;i<1000000;i++) 
		{			
			Object obj = new Object();
		}
		
		long Endtime = System.nanoTime();
		long elapsedTime = Endtime - Starttime; 	
		System.out.println("Time require to create All obj in millis: "+elapsedTime);
		System.out.println("Time require to create each obj in millis: "+elapsedTime/1000000);		  
	    
	}
}

