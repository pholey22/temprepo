public class SleepIn
{
    static boolean weekday = false;
	static boolean vacation = true;
    public static void main(String[] args)
	{
	    sleepIn(weekday, vacation);
	}
	public static boolean sleepIn(boolean weekday, boolean vacation) 
	{

		if (!weekday || vacation) 
		return true;
		return false;  
	}

}