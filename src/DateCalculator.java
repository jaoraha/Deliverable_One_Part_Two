import java.util.Scanner; 
import java.time.Period;
import java.time.LocalDate;

public class DateCalculator {

	public static void main(String[] args) {

		//Utilize scanner to obtain input from user.
	    Scanner scnr = new Scanner(System.in);
	    	
	    //Prompt user to input start date.
	    System.out.print("To determine the difference between two dates, enter a start date in format YYYY-MM-DD: ");
	    String StartDate = scnr.nextLine();

	    //Parse the entered 'start date' string into a Date. 
	    LocalDate FirstDate = LocalDate.parse(StartDate);

	    //Prompt user to input end date.
	    System.out.print("Now enter an end date in format YYYY-MM-DD: ");
	    String EndDate = scnr.nextLine();
	        
	    //Parse the entered 'end date' string into a Date. 
	    LocalDate SecondDate = LocalDate.parse(EndDate);
	        
	        
	    //Determine the difference between the two entered dates. 
	    Period difference = FirstDate.until(SecondDate);

	    //Break down the difference between the two entered dates into days, months, and years. 
	    int years = difference.getYears();
	    int months = difference.getMonths();
	    int days = difference.getDays();
	        
	    //Output the duration between the two entered dates in years, months and days.
	    System.out.println("The difference between the two dates is: " + years + " years, " + months + " months, " + days + " days.");
	        
	    //Close scanner to avoid resource leak
	    scnr.close();
 }
}
