package Assignments;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		float num1;
		String word1;
		System.out.println("Enter a Number :");
		
		num1=input.nextFloat();
		System.out.println("Enter a word :");
		word1=input.next();
		System.out.println("Your inputs are ...");
		System.out.println("The numbers you have entered is :"+num1);
		System.out.println("The word you have entered is :"+word1);
		
	}

}
