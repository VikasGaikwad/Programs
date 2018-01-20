/*
	2D Array
		Desc   -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to 				standard output.
		I/P    -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
		Logic  -> create 2 dimensional array in memory to read in M rows and N cols 
		O/P    -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to 				the screen.
*/
import java.util.*;
class TwoDiamensionArray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. integer array   2. double array   3. boolean array ");
		System.out.println("select the choice : ");
		int choice=sc.nextInt();
		//int choice=3;
		String array_Type;
		switch(choice)
		{
			case 1:// array_Type="integer";
				System.out.println("enter the number of Rows : ");
				int rows=sc.nextInt();
				System.out.println("enter the number of columns : ");
				int cols=sc.nextInt();
				int arr[][]=new int[rows][cols];
				System.out.println("Enter the integer elements in array : ");
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<cols;j++)
					{
						arr[i][j]=sc.nextInt();//it will takes the n*m number of elements
					}
				}
				for(int i=0;i<rows;i++)
				{
					for(int j=0;j<cols;j++)
					{
						System.out.print(" "+arr[i][j]);
					}
				System.out.println();
				}


				break;




			case 2: //array_Type="double";
				System.out.println("enter the number of Rows : ");
				int col1 = sc.nextInt();
				System.out.println("enter the number of columns : ");
				int row1 = sc.nextInt();
				
				double arr1[][] =new double[row1][col1];
				System.out.println("Enter a Double elements in the array:");
				
				for(int i=0;i<row1;i++) {
					for(int j=0;j<col1;j++) {
						arr1[i][j] = sc.nextDouble();
					}
				}
			
				for(int i=0;i<row1;i++) {
					for(int j=0;j<col1;j++) {
						System.out.print(" "+arr1[i][j]);
					}
					System.out.println(" ");
				}
				break;
			case 3: //array_Type="boolean";
				System.out.println("enter the number of Rows : ");
				int col2 = sc.nextInt();
				System.out.println("enter the number of columns : ");
				int row2 = sc.nextInt();
				
				boolean arr2[][] =new boolean[row2][col2];
				System.out.println("Enter a Boolean elements in the array:");
				
				for(int i=0;i<row2;i++) {
					for(int j=0;j<col2;j++) {
						arr2[i][j] = sc.nextBoolean();
					}
				}
			
				for(int i=0;i<row2;i++) {

					for(int j=0;j<col2;j++) {
						System.out.print("|"+arr2[i][j]+"|");

					}
					System.out.println("");
					System.out.println("---------");
				}
			
				break;
			default: array_Type="invalid choice";
				System.out.println("wrong coice, try again..");
				break;
		}
		//System.out.println(array_Type);
	}
}
