import java.util.Scanner;
// import Months.java;

 public class DaysLeft {

	static Calculate calculate = new Calculate();
	static Scanner input = new Scanner(System.in);


 	public static void main(String[] args)
 	{
		Months months = new Months();

  		// Month June = new Month("June", 6, 30);
		months.genMonths(); 
		// Prompt a request of Initial Month 
		System.out.println("What is the beggining Month name: ");
		String firstMonth = input.nextLine();
		xMonth monthOne = months.getMonth(firstMonth);
		
		// Prompt a request of Ending MonthJu
		System.out.println("What is the ending Month name: ");
		String secondMonth = input.nextLine();
		xMonth monthTwo = months.getMonth(secondMonth); 
		// Prompt a request of Intial Day
		System.out.println("What is the beggining Day number: ");
		int begginingDay = input.nextInt();
		
		// Prompt a request of Ending Day
		System.out.println("What is the ending Day number: ");
		int endingDay = input.nextInt();

		// Output a print statment of the result
		System.out.println(calculate.DaysLeft(monthOne, monthTwo, begginingDay, endingDay));

	};
 
 };
 
//  Month June = months.getMonth("June"); 
//  Month August = months.getMonth("August");
//  Month July = months.getMonth("July");
//  June.monthDetails();
//  August.monthDetails();
 
//  int daysLeft = calculate.DaysLeft(June, August, 29, 26);
//  System.out.println("Days Left:" + daysLeft);
//  System.out.println("_-----------------------_---------------------------------_");
//  System.out.println(calculate.DaysLeft(June, July, 29, 20));
//  System.out.println(calculate.DaysLeft(June, June, 28, 30));