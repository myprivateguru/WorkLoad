package Practice;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		System.out.println(" Enter a Year : ");
		int i = b.nextInt();

		if(i%400==0 || i%4==0 && i%100!=0) 
		    {
			System.out.println(i+" is Leap Yaer");
			}
			else 
			{
				System.out.println(i +" is not a leap year");
			}
		

	}
	
}
