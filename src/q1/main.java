package q1;

import java.util.Scanner;


public class main {
	public static void main(String[] args) {
		
		StackX theStack = new StackX(20);
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Enter the Stirng");
		String userInput = scnObj.nextLine();
		
		String result = theStack.reverseString(userInput);
		System.out.println("Reverserd input : " + result);
		
	}

}
