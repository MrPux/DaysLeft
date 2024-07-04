public class Months
{	
	// List of Month names
	String[] monthNames = {"January", "February","March", "April", "Mayo", "June", "July", "August", "September", "October", "November", "December"};
	// List of Month Days
	int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// List of Month new Object Methods
	xMonth[] months = new xMonth[12];

	public void genMonths()
	{
		for(int i = 0; i < months.length; i++)
		{
			months[i] = new xMonth(monthNames[i], i+1, monthDays[i]); 
			// System.out.println(months);
		}
	}

	public xMonth getMonth(String name)
	{
		xMonth m = null;
		for(xMonth month : months)
		{
			if(!month.getMonthName().equals(name) )
			{
				continue;
			}else
			{
				m = month;
			}
		}
		return m;
	};

	public int getMonthIndex(xMonth month)
	{
		return month.getMonthNum() - 1;
	}
	

	public xMonth[] getMonths()
	{
		return this.months;
	}

	// public Month getMonth(String name)
	// {
	// 	Month m = null;
	// 	// System.out.println();
	// 	for(int i = 0; i < months.length; i++)
	// 		{  
	// 		if(months[i].getMonthName() != name)
	// 		{ 
	// 			continue;
	// 		}else
	// 		{
	// 			m = months[i];
	// 		}
	// 	} 
	// 	return m;  
	// }; 
 }