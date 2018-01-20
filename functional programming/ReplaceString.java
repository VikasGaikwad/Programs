/*
	User Input and Replace String Template “Hello <<UserName>>, How are you?” 
		I/P   -> Take User Name as Input. Ensure UserName has min 3 char.
		Logic -> Replace <<UserName>> with the proper name.
		O/P   -> Print the String with User Name. 	
*/
import java.util.*;
public class ReplaceString{

	
	public static void replace(String str) {
		
		System.out.println("Hello "+str+", How are you?");
	}
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Name");
		String name = sc.nextLine();
		
		if(name.length()<3) {
			
			System.out.println("Name should have min 3 char");
		}else {
			
			ReplaceString.replace(name);
		}
	}
}

