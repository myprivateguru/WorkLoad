package Practice;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class PredictAge {
	public static void main(String[] args) {
		/*
		 * System.out.println("Enter a Birth Date :"); Scanner date = new
		 * Scanner(System.in); int day=date.nextInt(); int month=date.nextInt(); int
		 * year=date.nextInt();
		 * 
		 * System.out.println("Entered date is  "+day+month+year);
		 */
		   LocalDate date1 = LocalDate.now();
		      System.out.println(date1);  
		      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		      System.out.println(formatter.format(date1)); 
		
	}

}
