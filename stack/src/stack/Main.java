package stack;

import java.util.Scanner;

public class Main {


	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Stack stack1=new Stack(1000);
		Stack stack2=new Stack(1000);
		Stack stack3=new Stack(1000);
		System.out.println("Enter the Paragraph...");
		String paragraph=scanner.nextLine();
		

		String [] str=paragraph.toLowerCase().split(" ");
		for(int i=0;i<str.length;i++) {
			
		}	

		for(int i=0;i<str.length;i++) {
			String word;
			word=str[i];
			int length=word.length()-1;
			if((word.charAt(0)=='a'|| word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u') && 
			((word.charAt(length)=='a'|| word.charAt(length)=='e'||word.charAt(length)=='i'||word.charAt(length)=='o'||word.charAt(length)=='u'))){
				stack3.push(word);
				System.out.println("stack3 : "+stack3.top());
				
				
			}else {
				if(word.charAt(0)=='a'|| word.charAt(0)=='e'||word.charAt(0)=='i'||word.charAt(0)=='o'||word.charAt(0)=='u'){
					stack1.push(word);
					System.out.println("stack1 : "+stack1.top());
					
					
					
				}
				else if(word.charAt(length)=='a'|| word.charAt(length)=='e'||word.charAt(length)=='i'||word.charAt(length)=='o'||word.charAt(length)=='u'){
					stack2.push(word);
					System.out.println("stack2 : "+stack2.top());
					
					
					
				}
				
			}
			
		
		}
		/*for(int i=0;i<10;i++) {
			System.out.println("stack 1:"+stack1.top()+"stack 2:"+stack2.top()+"stack 3:"+stack2.top());
			
			
		}*/
	}
}





