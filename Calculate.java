 public class Calculate 
{ 
	public int DaysLeft(XMonth monthOne, XMonth monthTwo, int starting, int ending)
	{  
		int totalDays = 0;
		
		XMonths months = new XMonths(); 
		int startingMonthIndex = months.getMonthIndex(monthOne);
		int endingMonthIndex = months.getMonthIndex(monthTwo);
 
		for(int i = startingMonthIndex; i <= endingMonthIndex; i++)
		{  
			if(i == startingMonthIndex){
				// if(startingMonthIndex <= 15){
				// 	totalDays += monthOne.getMonthDays() - startingMonthIndex;
				// 	System.out.println("First Month: " + totalDays);
				// }else{
					totalDays += monthOne.getMonthDays() % starting; 
					System.out.println("First Month: " + totalDays); 
				// }
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