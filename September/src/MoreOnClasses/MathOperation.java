package MoreOnClasses;
import java.util.*;
import java.util.Scanner;
public class MathOperation{
	int a=10,b=8;
	static int sum;

	MathOperation()
	{
		sum=a+b;
		
		
	}
	class MathAddition{
	MathAddition(int a1,int b1){
		sum=a1+b1;
	}
	}
	public static void main(String[] args){
		System.out.println("Sum of Given Numbers are :" + sum);
		
	}

}
