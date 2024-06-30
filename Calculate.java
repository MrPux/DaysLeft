public class Calculate 
{ 
	public int DaysLeft(Month monthOne, Month monthTwo, int starting, int ending)
	{  
		int totalDays = 0;
		
		Months months = new Months(); 
		int startingMonthIndex = months.getMonthIndex(monthOne);
		int endingMonthIndex = months.getMonthIndex(monthTwo);
 
		for(int i = startingMonthIndex; i <= endingMonthIndex; i++)
		{  
			if(i == startingMonthIndex){
				totalDays += monthOne.getMonthDays() % starting; 
				System.out.println("First Month: " + totalDays); 
			}else if (i == endingMonthIndex)
			{
				totalDays += ending;
				System.out.println("Ending Month: " + totalDays);
			} 
			else
			{
				totalDays += months.monthDays[i];
				System.out.println("In between Months: " + totalDays);
			}
		} 
 
		return totalDays;

	} 
}