public class Month
{
	String name;
	int monthNum;
	int monthDays;

	public Month(String name, int monthNum, int monthDays){
		this.name = name;
		this.monthNum = monthNum;
		this.monthDays = monthDays;
	};

	public String getMonthName()
	{
		return name;
	}

	public int getMonthNum(){
		return monthNum;
	}

	public int getMonthDays()
	{
		return monthDays;
	}
	
	public void monthDetails()
	{
		System.out.println("Month: " + name + ", " + name + " number: " + monthNum + ", Days in " + name + ": " + monthDays);
	}

	public String toString()
	{
		return "Month: " + name + ", " + name + " number: " + monthNum + ", Days in " + name + ": " + monthDays; 
	}

};