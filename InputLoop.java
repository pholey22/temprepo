import java.io.*;
import java.util.*;

public class InputLoop
{
    public static void main(String[] args)
	{
	    Scanner s = new Scanner(System.in);
		System.out.println("loop how many times?");
		int g = s.nextInt();
	    for (int i = 0; i < g; i++)
	    System.out.println("Hello world");
	}
}