 public class Calculate 
{ 
	public int DaysLeft(xMonth monthOne, xMonth monthTwo, int starting, int ending)
	{  
		int totalDays = 0;
		
	 	Months months = new Months(); 
		int startingMonthIndex = months.getMonthIndex(monthOne);
		int endingMonthIndex = months.getMonthIndex(monthTwo);
 
		for(int i = startingMonthIndex; i <= endingMonthIndex; i++)
		{  
			if(i == startingMonthIndex){
				if(startingMonthIndex <= 15){
					if(monthOne.equals(monthTwo))
					{
						totalDays += (ending - starting);
						System.out.println("First Month: " + totalDays);
						continue;
					}
					else
					{
						totalDays += ((monthOne.getMonthDays()) - starting);
						System.out.println("First Month: " + totalDays);
						continue;
					}
				}else{
					totalDays += monthOne.getMonthDays() % starting; 
					System.out.println("First Month: " + totalDays); 
					continue;
				}
			}else if (i == endingMonthIndex)
			{
				totalDays += ending;
				System.out.println("Ending Month: " + totalDays);
				continue;
			} 
			else
			{
				totalDays += months.monthDays[i];
				System.out.println("In between Months: " + totalDays);
				continue;
			}
		} 
 
		return totalDays;

	} 
}