package Practice;
import java.util.Scanner;
public class MonthDaySwitch {
	public static void main(String[] args) {
	
		Scanner a= new Scanner(System.in);
		System.out.println("Enter which month u want details : ");
		int b=a.nextInt();
		
		
		switch (b) {
		case 1:
			System.out.println("The days in this January  month are  31 days " );
			break;
		case 2:
			System.out.println("The days in this February  month are  28 days ");
			break;
		case 3:
			System.out.println("The days in this March  month are  31 days ");
			break;
		case 4:
			System.out.println("The days in this April  month are  30 days ");
			break;
		case 5:
			System.out.println("The days in this May  month are  31 days ");
			break;
		case 6:
			System.out.println("The days in this June  month are  30 days ");
			break;
		case 7:
			System.out.println("The days in this July  month are  31 days ");
			break;
		case 8:
			System.out.println("The days in this August  month are  31 days ");
			break;
		case 9:
			System.out.println("The days in this Sptember  month are  30 days ");
			break;
		case 10:
			System.out.println("The days in this October  month are  31 days ");
			break;
		case 11:
			System.out.println("The days in this November  month are  30 days ");
			break;
		case 12:
			System.out.println("The days in this January  December are  31 days ");
			break;

		default:
			break;
		}
		
	}

	private static int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
