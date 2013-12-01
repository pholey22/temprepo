public class StartHi
{
    static String hi = "Hi";
    public static void main(String[] args)
	{
	    startHi(hi);
	}
	public static boolean startHi(String hi) 
	{
		if (hi.startsWith("Hi")) return true;
		return false;		
	}

}